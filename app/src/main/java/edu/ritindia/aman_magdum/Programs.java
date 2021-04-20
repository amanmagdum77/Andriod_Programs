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

public class Programs extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {"1. Array","2. Number System ","3. OOPS","4. Searching and Sorting",
            "5. Strings","6. Logic","7. Exception and File Handling"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        ml = (ListView)findViewById(R.id.PrgList);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(Programs.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(Programs.this, Programs1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(Programs.this, Programs2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(Programs.this, Programs3.class);
                    startActivityForResult(intent,0);
                }

                if( i == 3){
                    Intent intent = new Intent(Programs.this, Programs4.class);
                    startActivityForResult(intent,0);
                }if( i == 4){
                    Intent intent = new Intent(Programs.this, Programs5.class);
                    startActivityForResult(intent,0);
                }if( i == 5){
                    Intent intent = new Intent(Programs.this, Programs6.class);
                    startActivityForResult(intent,0);
                }if( i == 6){
                    Intent intent = new Intent(Programs.this, Advance1.class);
                    startActivityForResult(intent,0);
                }if( i == 7){
                    Intent intent = new Intent(Programs.this, Advance1.class);
                    startActivityForResult(intent,0);
                }


            }
        });










    }
}