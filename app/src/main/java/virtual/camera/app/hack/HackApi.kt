package virtual.camera.app.hack

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager

object HackApi {
    fun getInstalledPackages(context: Context): List<PackageInfo> {
        return context.packageManager.getInstalledPackages(PackageManager.GET_META_DATA)
    }
    
    fun getPackageInfo(context: Context, packageName: String): PackageInfo? {
        return try {
            context.packageManager.getPackageInfo(packageName, PackageManager.GET_META_DATA)
        } catch (e: Exception) {
            null
        }
    }
    
    fun isPackageInstalled(context: Context, packageName: String): Boolean {
        return try {
            context.packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: Exception) {
            false
        }
    }
}