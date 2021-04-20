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

public class OS extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {
            "1. Introduction","2. Threads","3. Process Scheduling",
            "4. Critical Section","5. Deadlock","6. Memory Management 1","7. Memory Management 2", "8. File Allocation Method",
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_s);

        ml = (ListView)findViewById(R.id.osList);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(OS.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(OS.this, OS1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(OS.this, OS2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(OS.this, OS3.class);
                    startActivityForResult(intent,0);
                }
                if( i == 3){
                    Intent intent = new Intent(OS.this, OS4.class);
                    startActivityForResult(intent,0);
                }
                if( i == 4){
                    Intent intent = new Intent(OS.this, OS5.class);
                    startActivityForResult(intent,0);
                }
                if( i == 5){
                    Intent intent = new Intent(OS.this, OS6.class);
                    startActivityForResult(intent,0);
                }
                if( i == 6){
                    Intent intent = new Intent(OS.this, OS7.class);
                    startActivityForResult(intent,0);
                }
                if( i == 7){
                    Intent intent = new Intent(OS.this, OS8.class);
                    startActivityForResult(intent,0);
                }
                


            }
        });





    }
}