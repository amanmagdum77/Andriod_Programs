package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.java.R;

public class Python extends AppCompatActivity implements View.OnClickListener  {
    public CardView card1,card2,card3,card4,card5,card6;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        card1=(CardView)findViewById(R.id.bb1);
        card2=(CardView)findViewById(R.id.bb2);
        card3=(CardView)findViewById(R.id.bb3);
        card4=(CardView)findViewById(R.id.bb4);
        card5=(CardView)findViewById(R.id.bb5);
        card6=(CardView)findViewById(R.id.bb6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.bb1:
                i = new Intent(this, Basic.class);
                startActivity(i);
                break;
            case R.id.bb2:
                i = new Intent(this, Advance.class);
                startActivity(i);
                break;
            case R.id.bb3:
                i = new Intent(this, OOPS.class);
                startActivity(i);
                break;
            case R.id.bb4:
                i = new Intent(this, Videos3.class);
                startActivity(i);
                break;
            case R.id.bb5:
                i = new Intent(this, Programs.class);
                startActivity(i);
                break;
            case R.id.bb6:
                i = new Intent(this, PythonIDE.class);
                startActivity(i);
                break;
        }
    }
}