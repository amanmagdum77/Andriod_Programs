package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.java.R;

public class OOPS8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_o_p_s8);
        WebView myWebView = (WebView)findViewById(R.id.oops8);

        WebSettings webSettings= myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/oops8.html");

    }
}