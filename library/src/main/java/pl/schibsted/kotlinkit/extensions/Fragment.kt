package pl.schibsted.kotlinkit.extensions

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Created by Jacek Kwiecień on 01.04.15.
 */

fun <T : Activity> Fragment.startActivity(activityToStart: Class<T>) {
    val intent = Intent(getActivity(), activityToStart)
    startActivity(intent)
}

fun <T : Activity> Fragment.startActivityForResult(activityToStart: Class<T>, requestCode: Int) {
    val intent = Intent(getActivity(), activityToStart)
    startActivityForResult(intent, requestCode)
}

fun <T : Activity> Fragment.startActivity(activityToStart: Class<T>, extras: Bundle) {
    val intent = Intent(getActivity(), activityToStart)
    intent.putExtras(extras)
    startActivity(intent)
}

fun <T : Activity> Fragment.startActivityForResult(activityToStart: Class<T>, extras: Bundle, requestCode: Int) {
    val intent = Intent(getActivity(), activityToStart)
    intent.putExtras(extras)
    startActivityForResult(intent, requestCode)
}