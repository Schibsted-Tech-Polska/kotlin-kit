package pl.schibsted.core.extensions

import android.support.annotation.DimenRes
import android.view.View
import pl.schibsted.kotlinkit.core.hasLollipop

/**
 * Created by Jacek Kwiecień on 30.03.15.
 */

/**
 * Sets visibility to VISIBLE
 * @author Jacek Kwiecień
 */
fun View.visible() {
    this.setVisibility(View.VISIBLE)
}

/**
 * Sets visibility to GONE
 * @author Jacek Kwiecień
 */
fun View.gone() {
    this.setVisibility(View.GONE)
}

/**
 * Sets visibility to INVISIBLE
 * @author Jacek Kwiecień
 */
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

/**
 * Checks wheter view is visible
 * @author Jacek Kwiecień
 */
fun View.isVisible(): Boolean {
    return this.getVisibility() == View.VISIBLE;
}

/**
 * Checks wheter view is visible
 * @author Jacek Kwiecień
 */
fun View.isInvisible(): Boolean {
    return this.getVisibility() == View.INVISIBLE;
}

/**
 * Checks wheter view is visible
 * @author Jacek Kwiecień
 */
fun View.isGOne(): Boolean {
    return this.getVisibility() == View.GONE;
}