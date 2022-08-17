package com.example.tsfm_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity(){

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        settingWebViewClient()

        webView.loadUrl("https://temperaturesenseforecastmap.herokuapp.com/")

    }

    /**
     * settingWebViewClient
     * webViewのローディングイベント設定
     */
    fun settingWebViewClient() {

        webView.webViewClient = object: WebViewClient() {
            /**
             * shouldOverrideUrlLoading
             * WebViewにロードされようとしているときに呼ばれる
             * @param view
             * @param request
             * @return trueは外部ブラウザ起動 or falseはWebView内に表示する
             */
            override fun shouldOverrideUrlLoading(view: WebView?,request: WebResourceRequest): Boolean {
                // falseを返すとWebView内に表示する
                return false
            }
        }
    }

}