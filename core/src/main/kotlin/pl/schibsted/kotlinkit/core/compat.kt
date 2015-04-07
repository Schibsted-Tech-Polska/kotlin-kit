package pl.schibsted.kotlinkit.core

import android.os.Build

/**
 * Check if Lollipop or higher is available.
 * @author Damian Petla
 * @return returns true if Lollipop or higher, otherwise false
 */
fun hasLollipop(): Boolean {
    return Build.VERSION.SDK_INT >= 21
}

/**
 * Check if KitKat or higher is available.
 * @author Damian Petla
 * @return returns true if KitKat or higher, otherwise false
 */
fun hasKitKat(): Boolean {
    return Build.VERSION.SDK_INT >= 19
}

/**
 * Check if Jelly Bean is available.
 * @author Damian Petla
 * @return returns true if Jelly Bean or higher, otherwise false
 */
fun hasJellyBean(): Boolean {
    return Build.VERSION.SDK_INT >= 16
}

/**
 * Check if Ice Cream Sandwich is available.
 * @author Damian Petla
 * @return returns true if Ice Cream Sandwich or higher, otherwise false
 */
fun hasICS(): Boolean {
    return Build.VERSION.SDK_INT >= 14
}

/**
 * Check if provided version or higher is available.
 * @author Damian Petla
 * @param api API version to check
 * @return returns true if provided API or higher, otherwise false
 */
fun hasAPI(api: Int): Boolean {
    return Build.VERSION.SDK_INT >= api
}