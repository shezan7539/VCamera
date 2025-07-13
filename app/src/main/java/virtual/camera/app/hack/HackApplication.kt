package virtual.camera.app.hack

import android.app.Application
import android.content.Context

open class HackApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}