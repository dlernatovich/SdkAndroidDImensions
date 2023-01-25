package com.artlite.sdk.dimensional.playground.ui.abs

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Base class for the [AppCompatActivity].
 */
abstract class BaseActivity(@LayoutRes private val layout: Int) : AppCompatActivity() {

    /**
     * Instance of the handler.
     */
    private val handler: Handler = Handler(Looper.getMainLooper())

    /**
     * Method which provide the create functionality.
     * @param bundle Bundle? instance.
     */
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        this.setContentView(layout)
        this.handler.post { onActivityCreated() }
    }

    /**
     * Method which provide the action when activity was created.
     */
    abstract fun onActivityCreated()

}