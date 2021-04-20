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

public class Basic extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {
            "1. Hello World!","2. Python Variables","3. Python Keywords",
            "4. Python Identifiers","5. Python Literals","6. Operators in Python","7. Python comments", "8. Python if Statements",
            "9. For loops in Python","10. Python do-while loop","11. Python break statement","12. Python continue Statement","13. Python Pass"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        ml = (ListView)findViewById(R.id.userList);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(Basic.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent intent = new Intent(Basic.this, Basic1.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(Basic.this, Basic2.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(Basic.this, Basic3.class);
                    startActivityForResult(intent,0);
                }
                if( i == 3){
                    Intent intent = new Intent(Basic.this, Basic4.class);
                    startActivityForResult(intent,0);
                }
                if( i == 4){
                    Intent intent = new Intent(Basic.this, Basic5.class);
                    startActivityForResult(intent,0);
                }
                if( i == 5){
                    Intent intent = new Intent(Basic.this, Basic6.class);
                    startActivityForResult(intent,0);
                }
                if( i == 6){
                    Intent intent = new Intent(Basic.this, Basic7.class);
                    startActivityForResult(intent,0);
                }
                if( i == 7){
                    Intent intent = new Intent(Basic.this, Basic8.class);
                    startActivityForResult(intent,0);
                }
                if( i == 8){
                    Intent intent = new Intent(Basic.this, Basic9.class);
                    startActivityForResult(intent,0);
                }
                if( i == 9){
                    Intent intent = new Intent(Basic.this, Basic10.class);
                    startActivityForResult(intent,0);
                }
                if( i == 10){
                    Intent intent = new Intent(Basic.this, Basic11.class);
                    startActivityForResult(intent,0);
                }
                if( i == 11){
                    Intent intent = new Intent(Basic.this, Basic12.class);
                    startActivityForResult(intent,0);
                }
                if( i == 12){
                    Intent intent = new Intent(Basic.this, Basic13.class);
                    startActivityForResult(intent,0);
                }


            }
        });



    }
}