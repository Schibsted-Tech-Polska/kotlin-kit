package pl.schibsted.kotlinkit.extensions

import android.support.v7.widget.RecyclerView

/**
 * Listen for click events on this view holder's main view
 * @param event callback event returning adapter's item position and adapter's item type
 * @return returns itself for convenient chain calls
 */
fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int, type: Int) -> Unit): T {
    itemView.setOnClickListener {
        event.invoke(getAdapterPosition(), getItemViewType())
    }
    return this
}