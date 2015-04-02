package pl.schibsted.kotlinkit.extensions

import android.content.Context

/**
 * Created by Jacek Kwiecień on 02.03.15.
 */

fun Int.toPx(context: Context): Int {
    val displayMetrics = context.getResources().getDisplayMetrics()
    return (this.toFloat() * displayMetrics.density + 0.5f).toInt()
}

fun Int.toDp(context: Context): Int {
    val displayMetrics = context.getResources().getDisplayMetrics()
    return (this.toFloat() / displayMetrics.density + 0.5f).toInt()
}

