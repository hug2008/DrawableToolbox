package top.defaults.drawabletoolboxapp

import android.animation.ValueAnimator
import android.graphics.drawable.Drawable

class DrawableSpec(var name: String, private val factory: DrawableFactory, var type: Int = TYPE_IMAGE_VIEW_SOURCE) {

    var isDarkBackground: Boolean = false
    var animationRepeatMode: Int = -1

    companion object {
        const val TYPE_IMAGE_VIEW_SOURCE = 0
        const val TYPE_TEXT_VIEW_BACKGROUND = 1
    }

    fun build(): Drawable {
        return factory.build()
    }

    fun forTextView() = apply { type = TYPE_TEXT_VIEW_BACKGROUND }
    fun isDarkBackground(boolean: Boolean = true) = apply { isDarkBackground = boolean }
    fun animateRestart() = apply { animationRepeatMode = ValueAnimator.RESTART }
    fun animateReverse() = apply { animationRepeatMode = ValueAnimator.REVERSE }
}