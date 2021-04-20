package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.java.R;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_OUT_TIME = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity2.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_OUT_TIME);
    }
}