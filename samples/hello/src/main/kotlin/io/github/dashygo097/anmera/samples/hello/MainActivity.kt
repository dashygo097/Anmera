package io.github.dashygo097.anmera.samples.hello

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(TextView(this).apply {
            text = "Hello, Anmera!"
            textSize = 24f
            gravity = Gravity.CENTER
        })
    }
}
