package pl.schibsted.core.extensions

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by Jacek Kwiecień on 01.04.15.
 */

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param extras optional extras provided to started activity
 */
inline fun Fragment.launchActivity<reified T : Activity>(extras: Bundle? = null) {
    val intent = Intent(getActivity(), javaClass<T>())
    intent.putExtras(extras)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Jacek Kwiecień
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun Fragment.launchActivityForResult<reified T : Activity>(requestCode: Int, extras: Bundle? = null) {
    val intent = Intent(getActivity(), javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivityForResult(intent, requestCode)
}

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param extras optional extras provided to started activity
 */
inline fun android.app.Fragment.launchActivity<reified T : Activity>(extras: Bundle? = null) {
    val intent = Intent(getActivity(), javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivity(intent)
}

/**
 * Start [Activity] for result with optional extras.
 * @author Jacek Kwiecień
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 */
inline fun android.app.Fragment.launchActivityForResult<reified T : Activity>(requestCode: Int, extras: Bundle? = null) {
    val intent = Intent(getActivity(), javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivityForResult(intent, requestCode)
}