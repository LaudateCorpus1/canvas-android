/*
 * Copyright (C) 2021 - present Instructure, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.instructure.student.features.elementary.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayout
import com.instructure.canvasapi2.models.CanvasContext
import com.instructure.canvasapi2.models.Course
import com.instructure.interactions.router.Route
import com.instructure.pandautils.utils.*
import com.instructure.student.databinding.FragmentElementaryCourseBinding
import com.instructure.student.fragment.InternalWebviewFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_elementary_course.*

@AndroidEntryPoint
class ElementaryCourseFragment : Fragment() {

    private var canvasContext: CanvasContext by ParcelableArg(key = Const.CANVAS_CONTEXT)

    private val viewModel: ElementaryCourseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentElementaryCourseBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        if (canvasContext.isCourse) {
            binding.course = canvasContext as Course
        }

        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        applyTheme()
        viewModel.getData(canvasContext)

        courseTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) = Unit

            override fun onTabUnselected(tab: TabLayout.Tab?) = Unit

            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    courseTabPager.setCurrentItem(it.position, !isTablet)
                }
            }
        })

        viewModel.data.observe(viewLifecycleOwner, { data ->
            data?.let {
                val webViews = it.tabs.map {
                    InternalWebviewFragment.newInstance(
                        InternalWebviewFragment.makeRoute(
                            canvasContext = canvasContext,
                            url = it.url!!,
                            authenticate = true,
                            hideToolbar = true,
                            allowEmbedRouting = false,
                            allowRoutingTheSameUrlInternally = false,
                            isUnsupportedFeature = false,
                            shouldRouteToLogin = false
                        )
                    )
                }
                courseTabPager.offscreenPageLimit = it.tabs.size
                courseTabPager.adapter = ElementaryCoursePagerAdapter(webViews, childFragmentManager)
            }
        })
    }

    private fun applyTheme() {
        toolbar.title = canvasContext.name
        toolbar.setupAsBackButton(this)
        ViewStyler.themeToolbar(requireActivity(), toolbar, canvasContext)
    }

    companion object {
        fun newInstance(route: Route) =
            if (validateRoute(route)) ElementaryCourseFragment().apply {
                arguments = route.canvasContext!!.makeBundle(route.arguments)
            } else null

        private fun validateRoute(route: Route) = route.canvasContext != null

        fun makeRoute(canvasContext: CanvasContext?) = Route(ElementaryCourseFragment::class.java, canvasContext)
    }
}