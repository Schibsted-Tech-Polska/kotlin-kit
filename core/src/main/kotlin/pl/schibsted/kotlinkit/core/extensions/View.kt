package pl.schibsted.core.extensions

import android.support.annotation.DimenRes
import android.view.View
import pl.schibsted.kotlinkit.core.hasLollipop

/**
 * Created by Jacek Kwiecień on 30.03.15.
 */

fun View.visible() {
    this.setVisibility(View.VISIBLE)
}

fun View.gone() {
    this.setVisibility(View.GONE)
}

fun View.invisible() {
    this.setVisibility(View.INVISIBLE)
}

/**
 * Set [View] elevation only for Lollipop and higher.
 * @author Damian Petla
 * @param resId ID pointing to dimension resource
 */
fun View.setElevationCompat([DimenRes] resId: Int) {
    if (hasLollipop()) {
        setElevation(getResources().getDimension(resId))
    }
}

/**
 * Set [View] elevation only for Lollipop and higher.
 * @author Damian Petla
 * @param elevation elevation in pixels
 */
fun View.setElevationCompat(elevation: Float) {
    if (hasLollipop()) {
        setElevation(elevation)
    }
}

/**
 * Get [View] elevation.
 * @author Damian Petla
 * @return returns elevation if Lollipop or higher, otherwise 0
 */
fun View.getEleveationCompat(): Float {
    return if (hasLollipop()) {
        getElevation()
    } else {
        0f
    }
}