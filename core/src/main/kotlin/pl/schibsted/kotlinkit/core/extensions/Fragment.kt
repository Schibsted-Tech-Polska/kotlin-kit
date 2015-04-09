package pl.schibsted.core.extensions

import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import pl.schibsted.kotlinkit.core.extensions.writeExtras

/**
 * Created by Jacek Kwiecień on 01.04.15.
 */

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param extras optional extras provided to started activity
 */
inline fun Fragment.startActivity<reified T : Activity>(params: Array<out Pair<String, Any>>) {
    val intent = Intent(getActivity(), javaClass<T>())
    intent.writeExtras(params)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Jacek Kwiecień
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun Fragment.startActivityForResult<reified T : Activity>(requestCode: Int, params: Array<out Pair<String, Any>>) {
    val intent = Intent(getActivity(), javaClass<T>())
    intent.writeExtras(params)
    startActivityForResult(intent, requestCode)
}

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param extras optional extras provided to started activity
 */
inline fun android.app.Fragment.startActivity<reified T : Activity>(params: Array<out Pair<String, Any>>) {
    val intent = Intent(getActivity(), javaClass<T>())
    intent.writeExtras(params)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Jacek Kwiecień
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun android.app.Fragment.startActivityForResult<reified T : Activity>(requestCode: Int, params: Array<out Pair<String, Any>>) {
    val intent = Intent(getActivity(), javaClass<T>())
    intent.writeExtras(params)
    startActivityForResult(intent, requestCode)
}