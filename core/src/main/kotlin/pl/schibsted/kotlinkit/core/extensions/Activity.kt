package pl.schibsted.core.extensions

import android.app.Activity
import android.content.Intent
import pl.schibsted.kotlinkit.core.extensions.writeExtras

/**
 * Start [Activity] with optional extras.
 * @author Damian Petla
 * @param extras optional extras provided to started activity
 */
inline fun Activity.startActivity<reified T : Activity>(params: Array<out Pair<String, Any>>) {
    val intent = Intent(this, javaClass<T>())
    intent.writeExtras(params)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Damian Petla
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun Activity.startActivityForResult<reified T : Activity>(requestCode: Int, params: Array<out Pair<String, Any>>) {
    val intent = Intent(this, javaClass<T>())
    intent.writeExtras(params)
    startActivityForResult(intent, requestCode)
}