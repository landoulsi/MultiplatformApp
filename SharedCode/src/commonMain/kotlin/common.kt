package org.kotlin.mpp.mobile

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    GlobalScope.launch {
    }
    return "Kotlin Rocks on ${platformName()}"
}