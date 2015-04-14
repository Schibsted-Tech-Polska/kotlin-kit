package pl.schibsted.core.extensions

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat

/**
 * Start [Activity] with optional extras.
 * @author Damian Petla
 * @param extras optional extras provided to started activity
 */
inline fun Activity.launchActivity<reified T : Activity>(extras: Bundle? = null) {
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
inline fun Activity.launchActivityForResult<reified T : Activity>(requestCode: Int, extras: Bundle? = null) {
    val intent = Intent(this, javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    startActivityForResult(intent, requestCode)
}

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param extras optional extras provided to started activity
 * @param activityOptions activityOptions, used in Lolipop transitions
 */
inline fun Activity.launchActivity<reified T : Activity>(extras: Bundle? = null, activityOptions: ActivityOptionsCompat) {
    val intent = Intent(this, javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    ActivityCompat.startActivity(this, intent, activityOptions.toBundle())
}

/**
 * Start [Activity] with optional extras.
 * @author Jacek Kwiecień
 * @param requestCode code returned [Activity.onActivityResult]
 * @param extras optional extras provided to started activity
 * @param activityOptions activityOptions, used in Lolipop transitions
 */
inline fun Activity.launchActivityForResult<reified T : Activity>(requestCode: Int, extras: Bundle? = null, activityOptions: ActivityOptionsCompat) {
    val intent = Intent(this, javaClass<T>())
    if (extras != null) intent.putExtras(extras)
    ActivityCompat.startActivityForResult(this, intent, requestCode, activityOptions.toBundle())
}