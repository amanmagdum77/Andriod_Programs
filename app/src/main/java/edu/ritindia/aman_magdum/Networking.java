package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.java.R;

public class Networking extends AppCompatActivity {
    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {
            "1. Introduction","2. Physical Layer","3. Data Link Layer",
            "4. Network Layer","5.Transport Layer ","6. Network Security"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking);

        ml = (ListView)findViewById(R.id.netList);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(Networking.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(Networking.this, Networking1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(Networking.this, Networking2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(Networking.this, Networking3.class);
                    startActivityForResult(intent,0);
                }
                if( i == 3){
                    Intent intent = new Intent(Networking.this, Networking4.class);
                    startActivityForResult(intent,0);
                }
                if( i == 4){
                    Intent intent = new Intent(Networking.this, Networking5.class);
                    startActivityForResult(intent,0);
                }
                if( i == 5){
                    Intent intent = new Intent(Networking.this, Networking6.class);
                    startActivityForResult(intent,0);
                }




            }
        });









    }
}