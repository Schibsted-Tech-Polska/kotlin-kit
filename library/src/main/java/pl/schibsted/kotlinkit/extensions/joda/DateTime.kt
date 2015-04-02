package pl.schibsted.kotlinkit.extensions.joda

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

/**
 * Created by Jacek Kwiecień on 04.03.15.
 */

fun DateTime.print(pattern: String): String {
    var df = DateTimeFormat.forPattern(pattern)
    return df.print(this)
}