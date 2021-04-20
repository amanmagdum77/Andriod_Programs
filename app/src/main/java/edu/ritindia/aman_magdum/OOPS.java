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

public class OOPS extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;

    private String [] users = {
            "1. Python OOPS concept","2. Python Object","3. Python Constructor",
            "4. Python Inheritance","5. Python Multilevel Inheritance","6. Multiple Inheritance","7. Python Polymorphism", "8. Python Exception Handling"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_o_p_s);

        ml = (ListView)findViewById(R.id.userList3);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(OOPS.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(OOPS.this, OOPS1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(OOPS.this, OOPS2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(OOPS.this, OOPS3.class);
                    startActivityForResult(intent,0);
                }
                if( i == 3){
                    Intent intent = new Intent(OOPS.this, OOPS4.class);
                    startActivityForResult(intent,0);
                }
                if( i == 4){
                    Intent intent = new Intent(OOPS.this, OOPS5.class);
                    startActivityForResult(intent,0);
                }
                if( i == 5){
                    Intent intent = new Intent(OOPS.this, OOPS6.class);
                    startActivityForResult(intent,0);
                }
                if( i == 6){
                    Intent intent = new Intent(OOPS.this, OOPS7.class);
                    startActivityForResult(intent,0);
                }
                if( i == 7){
                    Intent intent = new Intent(OOPS.this, OOPS8.class);
                    startActivityForResult(intent,0);
                }



            }
        });

    }
}