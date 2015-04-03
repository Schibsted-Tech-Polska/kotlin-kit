package pl.schibsted.kotlinkit.extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

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

/**
 * Show short toast message.
 * @author Damian Petla
 * @param message message to be displayed
 */
fun Context.showShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/**
 * Show short toast message.
 * @author Damian Petla
 * @param message resource identifier of the message
 */
fun Context.showShortToast(message: Int) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/**
 * Show long toast message.
 * @author Damian Petla
 * @param message message to be displayed
 */
fun Context.showLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

/**
 * Show long toast message.
 * @author Damian Petla
 * @param message resource identifier of the message
 */
fun Context.showLongToast(message: Int) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
