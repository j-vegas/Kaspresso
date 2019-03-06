package com.kaspersky.uitest_framework.kakaoext

import android.support.test.espresso.Espresso
import android.support.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.ScreenMarker
import com.kaspersky.uitest_framework.kakao.ScreenActions
import com.kaspersky.uitest_framework.kakao.dispatchers.ViewDispatcher

/**
 * Created by egor.kurnikov on 01.03.2019
 */

@Suppress("UNCHECKED_CAST")
@ScreenMarker
abstract class KLScreen<out T: KLScreen<T>>: ScreenActions {

    abstract val layoutId: Int?

    override val view: ViewDispatcher = ViewDispatcher(Espresso.onView(ViewMatchers.isRoot()))

    operator fun invoke(function: T.() -> Unit) = function.invoke(this as T)
}