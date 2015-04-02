package pl.schibsted.kotlinkit.extensions.joda

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

/**
 * Created by Jacek Kwiecień on 04.03.15.
 */

fun String.parseDate(pattern: String): DateTime {
    var df = DateTimeFormat.forPattern(pattern)
    return df.parseDateTime(this)
}
