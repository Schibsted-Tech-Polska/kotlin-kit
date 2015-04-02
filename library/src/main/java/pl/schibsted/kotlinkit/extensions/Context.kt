package pl.schibsted.kotlinkit.extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Created by Jacek Kwiecień on 25.03.15.
 */

fun Context.hideKeyboard(caller: View) {
    caller.postDelayed(object : Runnable {
        override fun run() {
            try {
                val imm = caller.getContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(caller.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS)
            } catch (e: Exception) {
                Log.w(javaClass.getSimpleName(), "Could not hide keyboard. " + e.getMessage())
            }

        }
    }, 300)
}

fun Context.showKeyboard(caller: View) {
    caller.postDelayed(object : Runnable {
        override fun run() {
            val imm = caller.getContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(caller, InputMethodManager.SHOW_IMPLICIT)
        }
    }, 100)
}
