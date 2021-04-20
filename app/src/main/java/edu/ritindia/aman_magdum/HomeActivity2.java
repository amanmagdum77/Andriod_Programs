package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.java.R;

public class HomeActivity2 extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2,card3,card4;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.abtUs){
            Intent i6 = new Intent(HomeActivity2.this, AboutUS.class);
            startActivity(i6);


            return false;
        }

        if(item.getItemId()==R.id.contUS){

            Intent testIntent = new Intent(Intent.ACTION_VIEW);
            Uri data = Uri.parse("mailto:?subject=" + "Enter your reason for contacting" + "&body=" + "Please write your queries here and if possible please give attachments" + "&to=" + "pratikshagambhire20@gmail.com");
            testIntent.setData(data);
            startActivity(testIntent);

//            Intent i5 = new Intent(Intent.ACTION_SEND);
//            i5.setType("message/rfc822");
//            i5.putExtra(Intent.EXTRA_EMAIL,new String[]{"pratikshagambhire20@gmail.com"});
//            i5.putExtra(Intent.EXTRA_SUBJECT,"Enter your reason for contacting ");
//            i5.putExtra(Intent.EXTRA_TEXT,"Please write your queries here and if possible please give attachments");
//            startActivity(Intent.createChooser(i5,"Choose Email App"));
            return false;



        }

        if(item.getItemId()==R.id.rate)
        {
            try{
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+getPackageName())));
            }catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id="+getPackageName())));
            }
        }

        if(item.getItemId()==R.id.share)
        {


            Intent i=new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT,"Last Minute Notes ");
            i.putExtra(Intent.EXTRA_TEXT,"Download from link //www.google.com");
            Intent i1=Intent.createChooser(i,"Share Via");
            startActivity(i1);
            return true;
        }
//        Toast.makeText(getApplicationContext(), "You click on menu share", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        card1=(CardView)findViewById(R.id.c1);
        card2=(CardView)findViewById(R.id.c2);
        card3=(CardView)findViewById(R.id.c3);
        card4=(CardView)findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.c1:
                i = new Intent(this, Python.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent(this, DataStructures.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this, OS.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this, Networking.class);
                startActivity(i);
                break;
        }
    }
}