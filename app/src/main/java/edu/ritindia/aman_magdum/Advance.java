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

public class Advance extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {"1. String","2. String Function and Method","3. Python List","4. Python Tuple",
            "5. Python Dictionary Functions","6. Python Input and Output","7. Python Module"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        ml = (ListView)findViewById(R.id.userList2);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(Advance.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(Advance.this, Advance1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(Advance.this, Advance2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(Advance.this, Advance3.class);
                    startActivityForResult(intent,0);
                }
                if( i == 3){
                    Intent intent = new Intent(Advance.this, Advance4.class);
                    startActivityForResult(intent,0);
                }
                if( i == 4){
                    Intent intent = new Intent(Advance.this, Advance5.class);
                    startActivityForResult(intent,0);
                }
                if( i == 5){
                    Intent intent = new Intent(Advance.this, Advance6.class);
                    startActivityForResult(intent,0);
                }
                if( i == 6){
                    Intent intent = new Intent(Advance.this, Advance7.class);
                    startActivityForResult(intent,0);
                }





            }
        });


















    }
}