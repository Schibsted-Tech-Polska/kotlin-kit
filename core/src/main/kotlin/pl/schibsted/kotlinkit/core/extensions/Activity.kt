package pl.schibsted.core.extensions

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * Start [Activity] with optional extras.
 * @author Damian Petla
 * @param extras optional extras provided to started activity
 */
inline fun Activity.startActivity<reified T : Activity>(extras: Bundle? = null) {
    val intent = Intent(this, javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Damian Petla
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun Activity.startActivityForResult<reified T : Activity>(requestCode: Int, extras: Bundle? = null) {
    val intent = Intent(this, javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivityForResult(intent, requestCode)
}