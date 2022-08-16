package com.example.tsfm_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.webkit.WebView



class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://temperaturesenseforecastmap.herokuapp.com/")

    }

}