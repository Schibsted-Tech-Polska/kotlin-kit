package se.klart.extensions

import android.app.Activity
import android.support.v4.app.Fragment
import android.view.View
import kotlin.properties.ReadOnlyProperty

private fun viewById<T : View>(thisRef: Any, id: Int): T? {
    [suppress("UNCHECKED_CAST")]
    return when (thisRef) {
        is Activity -> thisRef.findViewById(id)
        is Fragment -> thisRef.getView().findViewById(id)
        is View -> thisRef.findViewById(id)
        else -> throw IllegalStateException("Unable to find views on type.")
    } as T?
}

public class LazyView<T : View>(private val thisRef: Any, private val id: Int) : ReadOnlyProperty<Any, T> {

    private var value: View? = null

    override fun get(thisRef: Any, desc: PropertyMetadata): T {
        return viewById<T>(thisRef, id) ?: throw IllegalStateException("View ID $id for '${desc.name}' not found.")
    }
}

public fun Activity.lazyView<T : View>(id: Int): LazyView<T> = LazyView(this, id)

public fun Fragment.lazyView<T : View>(id: Int): LazyView<T> = LazyView(this, id)

public fun View.lazyView<T : View>(id: Int): LazyView<T> = LazyView(this, id)