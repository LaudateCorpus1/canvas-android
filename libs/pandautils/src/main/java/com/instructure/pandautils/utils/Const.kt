/*
 * Copyright (C) 2017 - present Instructure, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.instructure.pandautils.utils

object Const {
    const val PANDA_UTILS_FILE_UPLOAD_UTILS_LOG = "file_upload_utils"
    const val OPEN_MEDIA_ASYNC_TASK_LOADER_LOG = "OpenMediaAsyncTaskLoad"
    const val PANDA_AVATAR_RESULT_CODE = 15964

    //////////////////////////////////////////////////////////
    // Intent Strings
    //////////////////////////////////////////////////////////
    const val ACTION = "action"
    const val ACTION_BAR_TITLE = "actionBarTitle"
    const val API_URL = "apiURL"
    const val ATTACHMENT = "attachment"
    const val ATTACHMENTS = "attachments"
    const val ASSIGNMENT = "assignment"
    const val ASSIGNMENT_ID = "assignmentId"
    const val ASSIGNMENT_NAME = "assignmentName"
    const val ASSIGNMENT_SET = "assignment_set"
    const val AUTHENTICATE = "authenticate"
    const val CANVAS_CONTEXT = "canvasContext"
    const val CANVAS_LOGIN = "canvas_login"
    const val COMPOSE_FRAGMENT = "composeFragment"
    const val CONFERENCE = "conference"
    const val COURSE = "course"
    const val DISCUSSION_ENTRY = "discussion_entry"
    const val DISCUSSION_HEADER = "discussion_header"
    const val DISCUSSION_TOPIC = "discussion_topic"
    const val DISCUSSION_ID = "discussion_id"
    const val FEATURE_NAME = "featureName"
    const val FILE_URL = "fileUrl"
    const val FILE_DOWNLOADED = "fileDownloaded"
    const val FOLDER = "folder"
    const val FOLDER_ID = "folderId"
    const val HTML = "html"
    const val ID = "id"
    const val INTERNAL_URL = "internalURL"
    const val IS_STUDIO_ENABLED = "isStudioEnabled"
    const val IS_MEDIA_TYPE = "isMediaType"
    const val IS_OVERRIDDEN = "isOverridden"
    const val IS_GROUP = "isGroup"
    const val IS_UNSUPPORTED_FEATURE = "isUnsupportedFeature"
    const val IS_OBSERVER = "isObserver"
    const val ALLOW_UNSUPPORTED_ROUTING = "allowUnsupportedRouting"
    const val LAYOUT_ID = "layout_id"
    const val MASTERY_PATH = "mastery_path"
    const val MEDIA_RECORDING = "media_recording"
    const val MESSAGE = "message"
    const val MIME = "mime"
    const val MESSAGE_TO_USER = "messageToUser"
    const val MESSAGE_TYPE = "messageType"
    const val MODULE_ID = "moduleId"
    const val MODULE_ITEM = "moduleItems"
    const val MODULE_ITEM_ID = "moduleItemId"
    const val MODULE_OBJECT = "moduleObject"
    const val NAME = "name"
    const val PAGE = "page"
    const val PARENT_FOLDER_ID = "parentFolderID"
    const val PASSED_URI = "passedURI"
    const val PENDING_REVIEW = "pending_review"
    const val QUIZ = "quiz"
    const val SCOPE = "scope"
    const val SELECTED_ITEM = "selectedItem"
    const val SHOW_FRONT_PAGE = "isShowFrontPage"
    const val STREAM_ITEM = "streamItem"
    const val SUBJECT = "subject"
    const val TAB = "tab"
    const val TAB_ID = "tabId"
    const val TEXT = "text"
    const val UNREAD = "unread"
    const val UPLOAD_TYPE = "uploadType"
    const val URI = "uri"
    const val URL = "url"
    const val USER = "user"
    const val USER_ID = "userId"
    const val USER_IDS = "userIds"
    const val __CURRENT = "__current"
    const val __PREVIOUS = "__previous"
    const val COURSE_URL = "/courses/"
    const val GRADE_URL = "/grades"
    const val SESSIONLESS_LAUNCH = "sessionlessLaunch"
    const val ASSIGNMENT_LTI = "assignmentLti"
    const val LTI_TOOL = "ltiTool"
    const val SUBMISSION_COMMENT_SUBMITTED = "submission-comment-submitted"
    const val SUBMISSION = "submission"
    const val SUBMISSION_ID = "submission_id"
    const val SUBMISSION_TARGET = "submission_target"
    const val DISCUSSION_REPLY_SUBMITTED = "discussion_reply_submitted"
    const val TITLE = "title"
    const val BODY = "body"
    const val PROFILE_URL = "canvas.instructure.com"
    const val CONVERSATION = "conversations"
    const val COURSES = "courses"
    const val GROUPS = "groups"
    const val FILES = "files"
    const val EXTRAS = "bundledExtras"
    const val CONTEXT_ID = "contextId"
    const val CONTENT_TYPE = "contentType"
    const val PATH = "path"
    const val SIZE = "size"
    const val DELETE = "delete"
    const val LOADER_BUNDLE = "loaderBundle"
    const val OPEN_MEDIA_LOADER_BUNDLE = "openMediaLoaderBundle"
    const val NONE = "none"
    const val DOMAIN = "domain"
    const val PARSE = "parse"
    const val ITEM_ID = "genericItemId"
    const val COURSE_FAVORITES = "courseFavorites"
    const val UPLOAD_STARTED = "uploadStarted"
    const val UPLOAD_SUCCESS = "uploadSuccess"
    const val ACTION_MEDIA_UPLOAD_SUCCESS = "com.instructure.speedgrader.SPEED_GRADER_MEDIA_COMMENT_UPDATE"
    const val STUDENT_ID = "student_id"
    const val CONVERSATION_ID = "conversation_id"
    const val POSITION = "position"
    const val QUIZ_ANSWER_ID = "answer_id"

    // Shared File
    const val FILENAME = "fileName"
    const val COURSE_ID = "courseId"
    const val COURSE_THING_CHANGED = "courseTHINGChangedBroadcast"
    const val BOOKMARK = "bookmark"
    const val ITEM = "item"
    const val OPEN_OUTSIDE = "isOpenOutside"
    const val IS_EXTERNAL_TOOL = "isExternalTool"
    const val FILE_PROVIDER_AUTHORITY = ".provider"
    const val POINTS = "points"
    const val OPTIONS = "options"
    const val MEDIA_FILE_PATH = "media_file_path"
    const val SUBMISSION_COMMENT_LIST = "submission_comment_list"
    const val PAGE_ID = "PAGE_ID"
    const val ACTION_MEDIA_UPLOAD_FAIL = "com.instructure.action.NOTORIOUS_UPLOAD_ERROR"
    const val ERROR = "UPLOAD_ERROR"
    const val IS_SUBMISSION = "isSubmission"
    const val IS_FAILURE = "isFailure"

    // Language intent strings used for checking the incoming pending intent for a push notification
    const val LOCAL_NOTIFICATION = "localNotification"
    const val STUDIO_LTI_TOOL = "studioLTITool"
    const val STUDENT_USER_AGENT = "candroid"
    const val TEACHER_USER_AGENT = "androidTeacher"

    // Intent String for QR Code Masquerading
    const val QR_CODE_MASQUERADE_ID = "qrCodeMasqueradeId"
    const val MARKET_URI_PREFIX = "market://details?id="
    const val CANVAS_STUDENT_ID = "com.instructure.candroid"
    const val TOKEN = "token"

    // This is tied directly to an intent filter in the Student app AndroidManifest - if either one changes, make sure they stay in sync
    const val INTENT_ACTION_STUDENT_VIEW = "com.instructure.student.STUDENT_VIEW"
    const val CLIENT_ID = "clientId"
    const val CLIENT_SECRET = "clientSecret"
}