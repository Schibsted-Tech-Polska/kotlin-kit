package pl.schibsted.kotlinkit.core.extensions

/**
 * Created by Jacek Kwiecień on 14.04.15.
 */

/**
 * Formats [Double] to string
 * @author Jacek Kwiecień
 * @param digits number of digits after the separator
 */
fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

/**
 * Formats [Float] to string
 * @author Jacek Kwiecień
 * @param digits number of digits after the separator
 */
fun Float.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
