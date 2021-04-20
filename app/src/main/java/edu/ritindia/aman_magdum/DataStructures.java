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

public class DataStructures extends AppCompatActivity {



        ListView ml;  // ml reference variable for ListView
        ArrayAdapter<String> aAdapter;
        final String [] users = {
                "1. Introduction","2. Stack","3. Queue",
                "4. Linkedlist","5. Tree","6. Search ","7. Hash ", "8. Sort","9. Graph"
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

            ml = (ListView)findViewById(R.id.dsList);
            aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
            ml.setAdapter(aAdapter);
            ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                    Toast.makeText(DataStructures.this,users[i], Toast.LENGTH_SHORT).show();
                    if( i == 0){
                        Intent intent = new Intent(DataStructures.this, DS1.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 1){
                        Intent intent = new Intent(DataStructures.this, DS2.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 2){
                        Intent intent = new Intent(DataStructures.this, DS3.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 3){
                        Intent intent = new Intent(DataStructures.this,DS4.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 4){
                        Intent intent = new Intent(DataStructures.this, DS5.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 5){
                        Intent intent = new Intent(DataStructures.this, DS6.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 6){
                        Intent intent = new Intent(DataStructures.this, DS7.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 7){
                        Intent intent = new Intent(DataStructures.this,DS8.class);
                        startActivityForResult(intent,0);
                    }
                    if( i == 8){
                        Intent intent = new Intent(DataStructures.this, DS9.class);
                        startActivityForResult(intent,0);
                    }




                }
            });






    }
}