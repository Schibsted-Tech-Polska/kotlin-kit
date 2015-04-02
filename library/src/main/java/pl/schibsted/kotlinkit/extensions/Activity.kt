import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * Created by Jacek Kwiecień on 01.04.15.
 */

fun <T : Activity> Activity.startActivity(activityToStart: Class<T>) {
    val intent = Intent(this, activityToStart)
    startActivity(intent)
}

fun <T : Activity> Activity.startActivityForResult(activityToStart: Class<T>, requestCode: Int) {
    val intent = Intent(this, activityToStart)
    startActivityForResult(intent, requestCode)
}

fun <T : Activity> Activity.startActivity(activityToStart: Class<T>, extras: Bundle) {
    val intent = Intent(this, activityToStart)
    startActivity(intent, extras)
}

fun <T : Activity> Activity.startActivityForResult(activityToStart: Class<T>, extras: Bundle, requestCode: Int) {
    val intent = Intent(this, activityToStart)
    startActivityForResult(intent, requestCode, extras)
}