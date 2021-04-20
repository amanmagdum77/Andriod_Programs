package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.java.R;

public class PythonIDE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_i_d_e);


        WebView myWebView = (WebView)findViewById(R.id.ide);
       myWebView.getSettings().setLoadsImagesAutomatically(true);
       myWebView.getSettings().setJavaScriptEnabled(true);
       myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
       myWebView.setWebViewClient(new WebViewClient());
       myWebView.loadUrl("https://www.programiz.com/python-programming/online-compiler/");
    }
}