package com.xi_zz.simplestdaggerandroidexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.textView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var textService: TextService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = textService.repeat3Times(R.string.app_name) // Should display the app name three times
    }
}
