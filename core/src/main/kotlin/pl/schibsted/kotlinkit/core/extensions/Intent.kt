package pl.schibsted.kotlinkit.core.extensions

import android.content.Intent
import android.os.Bundle
import pl.schibsted.kotlinkit.core.KotlinKitException
import java.io.Serializable

/**
 * Created by Jacek Kwiecień on 09.04.15.
 */

fun Intent.writeExtras(params: Array<out Pair<String, Any>>) {
    params.forEach {
        when (it.second) {
            is Int -> this.putExtra(it.first, it.second as Int)
            is Long -> this.putExtra(it.first, it.second as Long)
            is CharSequence -> this.putExtra(it.first, it.second as CharSequence)
            is String -> this.putExtra(it.first, it.second as String)
            is Float -> this.putExtra(it.first, it.second as Float)
            is Double -> this.putExtra(it.first, it.second as Double)
            is Char -> this.putExtra(it.first, it.second as Char)
            is Short -> this.putExtra(it.first, it.second as Short)
            is Boolean -> this.putExtra(it.first, it.second as Boolean)
            is Long -> this.putExtra(it.first, it.second as Long)
            is Serializable -> this.putExtra(it.first, it.second as Serializable)
            is Bundle -> this.putExtra(it.first, it.second as Bundle)
            else -> throw KotlinKitException("this extra ${it.first} has wrong type ${it.second.javaClass.getName()}")
        }
    }
}