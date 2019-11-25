package com.kaspersky.kaspresso.interceptors.watcher.testcase

import com.kaspersky.kaspresso.testcases.core.testcontext.BaseTestContext

/**
 * Requestor of BaseTestContext
 */
interface TestContextRequestor {

    fun requestBaseTestContext(context: BaseTestContext) = Unit
}