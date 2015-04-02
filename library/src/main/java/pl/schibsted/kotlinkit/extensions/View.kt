import android.view.View

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