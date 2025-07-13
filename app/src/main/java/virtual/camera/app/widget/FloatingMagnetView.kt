package virtual.camera.app.widget

import android.content.Context
import android.view.View
import android.widget.FrameLayout

open class FloatingMagnetView(context: Context) : FrameLayout(context) {
    override fun onTouchEvent(event: android.view.MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }
}