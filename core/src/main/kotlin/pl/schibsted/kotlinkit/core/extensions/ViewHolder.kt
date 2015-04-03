package pl.schibsted.kotlinkit.core.extensions

import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.view.View

/**
 * Register [OnClickListener] on ViewHolder root view
 * @author Damian Petla
 * @param event callback function receiving root view, item position and type
 * @return returns this view holder
 */
fun <T : RecyclerView.ViewHolder> T.onClick(event: (view: View, position: Int, type: Int) -> Unit): T {
    itemView.setOnClickListener {
        event.invoke(it, getAdapterPosition(), getItemViewType())
    }
    return this
}

/**
 * Register [OnLongClickListener] on ViewHolder root view
 * @author Damian Petla
 * @param event callback function receiving root view, item position and type
 * @return returns this view holder
 */
fun <T : RecyclerView.ViewHolder> T.onLongClick(event: (view: View, position: Int, type: Int) -> Boolean): T {
    itemView.setOnLongClickListener() {
        event.invoke(it, getAdapterPosition(), getItemViewType())
    }
    return this
}

/**
 * Register [OnTouchListener] on ViewHolder root view
 * @author Damian Petla
 * @param event callback function receiving root view, motion event, item position and type
 * @return returns this view holder
 */
fun <T : RecyclerView.ViewHolder> T.onTouch(event: (view: View, motionEvent: MotionEvent, position: Int, type: Int) -> Boolean): T {
    itemView.setOnTouchListener { v, e ->
        event.invoke(v, e, getAdapterPosition(), getItemViewType())
    }
    return this
}