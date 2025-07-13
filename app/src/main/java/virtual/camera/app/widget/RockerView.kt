package virtual.camera.app.widget

import android.content.Context
import android.view.View
import android.widget.FrameLayout

class RockerView(context: Context) : FrameLayout(context) {
    companion object {
        const val EVENT_CLOCK = 1
    }
    
    fun setListener(listener: (type: Int, angle: Float, distance: Float) -> Unit) {
        // Placeholder implementation
    }
    
    fun setCanMove(canMove: Boolean) {
        // Placeholder implementation
    }
}