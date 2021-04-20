package edu.ritindia.aman_magdum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.java.R;

public class Videos3 extends AppCompatActivity {
    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {
            "0. Python Programming tutorials for beginners",
            "1. Introduction to Python",
            "2. Python Installation | Pycharm",
            "3. Getting started with Python",
            "4. Variables in Python",
            "5. List in Python",
            "6. Tuple | Set in Python",
            "-   Dictionary in Python",
            "7. Python Set Path in Windows",
            "8. Python Editor | Sublime Text",
            "9. More on variables in Python",
            "10. Data types in Python",
            "11. Operators in Python",
            "12. Number System conversion",
            "13. Swap two variables in Python",
            "14. IDLE Previous command | Clear screen",
            "15. Python Bitwise operators",
            "16. Import Math function in Python",
            "17. Working with Pycharm | Run | Debug | Trace",
            "18. User Input in Python | Command Line Input",
            "19. If Elif Else statement in Python",
            "20. While Loop in Python",
            "21. For Loop in Python",
            "21.1. Break, Continue, Pass in Python",
            "22. Break vs Continue vs Pass in Python",
            "23. Printing Patterns in Python",
            "24. For Else in Python",
            "25. Prime number in Python",
            "26. Array in Python",
            "27. Array Values from User in Python",
            "28. Why Numpy? Installing Numpy in Pycharm",
            "29. Ways of creating Array",
            "30. Copying Array in Python",
            "31. Working with Matrix in Python",
            "32. Function in Python",
            "33. Function Arguments in Python",
            "34. Types of Arguments in Python",
            "35. Keyworded Variable Length Arguments in Python",
            "36. Global Keyword in Python | Global vs Local",
            "37. Pass list to a function in Python",
            "38. Fibonacci series",
            "39. Factorial",
            "40. Recursion",
            "41. Factorial using Recursion",
            "42. Anonymous Functions Lambda",
            "43. Filter Map Reduce",
            "44. Decorators",
            "45. Modules",
            "46. Special variable __name__"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos3);

        ml = (ListView)findViewById(R.id.VidList3);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(Videos3.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 0){
                    Intent i0 = new Intent(Intent.ACTION_VIEW);
                    i0.setData(Uri.parse("https://www.youtube.com/watch?v=QXeEoD0pB3E&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=1"));
                    startActivity(i0);
                }
                if( i == 1){
                    Intent i1 = new Intent(Intent.ACTION_VIEW);
                    i1.setData(Uri.parse("https://www.youtube.com/watch?v=hEgO047GxaQ&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=2"));
                    startActivity(i1);
                }
                if( i == 2){
                    Intent i2 = new Intent(Intent.ACTION_VIEW);
                    i2.setData(Uri.parse("https://www.youtube.com/watch?v=mbryl4MZJms&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=3"));
                    startActivity(i2);
                }
                if( i == 3){
                    Intent i3 = new Intent(Intent.ACTION_VIEW);
                    i3.setData(Uri.parse("https://www.youtube.com/watch?v=DWgzHbglNIo&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=4"));
                    startActivity(i3);
                }
                if( i == 4){
                    Intent i4 = new Intent(Intent.ACTION_VIEW);
                    i4.setData(Uri.parse("https://www.youtube.com/watch?v=TqPzwenhMj0&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=5"));
                    startActivity(i4);
                }
                if( i == 5) {
                    Intent i5 = new Intent(Intent.ACTION_VIEW);
                    i5.setData(Uri.parse("https://www.youtube.com/watch?v=Eaz5e6M8tL4&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=6"));
                    startActivity(i5);
                }
                //Lecture 6
                if( i == 6){
                    Intent i6 = new Intent(Intent.ACTION_VIEW);
                    i6.setData(Uri.parse("https://www.youtube.com/watch?v=Mf7eFtbVxFM&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=7"));
                    startActivity(i6);
                }
                // Dictionary
                if( i == 7){
                    Intent i7 = new Intent(Intent.ACTION_VIEW);
                    i7.setData(Uri.parse("https://www.youtube.com/watch?v=2IsF7DEtVjg&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=8"));
                    startActivity(i7);
                }
                //set path
                if( i == 8){
                    Intent i8 = new Intent(Intent.ACTION_VIEW);
                    i8.setData(Uri.parse("https://www.youtube.com/watch?v=4V14G5_CNGg&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=9"));
                    startActivity(i8);
                }
                //editor | sublime text
                if( i == 9){
                    Intent i9 = new Intent(Intent.ACTION_VIEW);
                    i9.setData(Uri.parse("https://www.youtube.com/watch?v=1U8TI16AR4s&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=10"));
                    startActivity(i9);
                }
                //more on variables
                if( i == 10){
                    Intent i10 = new Intent(Intent.ACTION_VIEW);
                    i10.setData(Uri.parse("https://www.youtube.com/watch?v=_OZIAHg5i7M&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=11"));
                    startActivity(i10);
                }
                // data types
                if( i == 11){
                    Intent i11 = new Intent(Intent.ACTION_VIEW);
                    i11.setData(Uri.parse("https://www.youtube.com/watch?v=gCCVsvgR2KU&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=12"));
                    startActivity(i11);
                }
                //operators
                if( i == 12){
                    Intent i12 = new Intent(Intent.ACTION_VIEW);
                    i12.setData(Uri.parse("https://www.youtube.com/watch?v=v5MR5JnKcZI&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=13"));
                    startActivity(i12);
                }
                // number system
                if( i == 13){
                    Intent i13 = new Intent(Intent.ACTION_VIEW);
                    i13.setData(Uri.parse("https://www.youtube.com/watch?v=AWAjbtWBzGs&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=14"));
                    startActivity(i13);
                }
                // Swap 2 no.s
                if( i == 14){
                    Intent i14 = new Intent(Intent.ACTION_VIEW);
                    i14.setData(Uri.parse("https://www.youtube.com/watch?v=3dpJrMtxYeo&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=15"));
                    startActivity(i14);
                }

                // IDLE previous command
                if( i == 15){
                    Intent i15 = new Intent(Intent.ACTION_VIEW);
                    i15.setData(Uri.parse("https://www.youtube.com/watch?v=UAMMEmga0WI&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=17"));
                    startActivity(i15);
                }
                // Bitwise
                if( i == 16){
                    Intent i16 = new Intent(Intent.ACTION_VIEW);
                    i16.setData(Uri.parse("https://www.youtube.com/watch?v=PyfKCvHALj8&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=18"));
                    startActivity(i16);
                }
                // Import Math
                if( i == 17){
                    Intent i17 = new Intent(Intent.ACTION_VIEW);
                    i17.setData(Uri.parse("https://www.youtube.com/watch?v=EkYrfV7M1ks&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=19"));
                    startActivity(i17);
                }
                //Working with Pycharm
                if( i == 18){
                    Intent i18 = new Intent(Intent.ACTION_VIEW);
                    i18.setData(Uri.parse("https://www.youtube.com/watch?v=akcEaEH91gI&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=20"));
                    startActivity(i18);
                }
                // USer input in Python
                if( i == 19){
                    Intent i19 = new Intent(Intent.ACTION_VIEW);
                    i19.setData(Uri.parse("https://www.youtube.com/watch?v=4OX49nLNPEE&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=21"));
                    startActivity(i19);
                }
                // If ELif Else
                if( i == 20){
                    Intent i20 = new Intent(Intent.ACTION_VIEW);
                    i20.setData(Uri.parse("https://www.youtube.com/watch?v=PqFKRqpHrjw&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=22"));
                    startActivity(i20);
                }
                // While loop
                if( i == 21){
                    Intent i21 = new Intent(Intent.ACTION_VIEW);
                    i21.setData(Uri.parse("https://www.youtube.com/watch?v=HZARImviDxg&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=23"));
                    startActivity(i21);
                }
                //For loop
                if( i == 22){
                    Intent i22 = new Intent(Intent.ACTION_VIEW);
                    i22.setData(Uri.parse("https://www.youtube.com/watch?v=0ZvaDa8eT5s&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=24"));
                    startActivity(i22);
                }
                // Break,continue
                if( i == 23){
                    Intent i23 = new Intent(Intent.ACTION_VIEW);
                    i23.setData(Uri.parse("https://www.youtube.com/watch?v=yCZBnjF4_tU&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=25"));
                    startActivity(i23);
                }
                // Break vs Continue
                if( i == 24){
                    Intent i24 = new Intent(Intent.ACTION_VIEW);
                    i24.setData(Uri.parse("https://www.youtube.com/watch?v=JCRpVwtVL4I&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=26"));
                    startActivity(i24);
                }

                // Printing Patterns
                if( i == 25){
                    Intent i25 = new Intent(Intent.ACTION_VIEW);
                    i25.setData(Uri.parse("https://www.youtube.com/watch?v=k8SXsT5TLxQ&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=27"));
                    startActivity(i25);
                }
                // For Else
                if( i == 26){
                    Intent i26 = new Intent(Intent.ACTION_VIEW);
                    i26.setData(Uri.parse("https://www.youtube.com/watch?v=38svC3U7hVo&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=28"));
                    startActivity(i26);
                }
                // Prime no.
                if( i == 27){
                    Intent i27 = new Intent(Intent.ACTION_VIEW);
                    i27.setData(Uri.parse("https://www.youtube.com/watch?v=SpTAxH_Geow&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=29"));
                    startActivity(i27);
                }
                // Array
                if( i == 28){
                    Intent i28 = new Intent(Intent.ACTION_VIEW);
                    i28.setData(Uri.parse("https://www.youtube.com/watch?v=6a39OjkCN5I&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=30"));
                    startActivity(i28);
                }
                // Array values from user
                if( i == 29){
                    Intent i29 = new Intent(Intent.ACTION_VIEW);
                    i29.setData(Uri.parse("https://www.youtube.com/watch?v=9c9qhIcB3NA&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=31"));
                    startActivity(i29);
                }
                // Numpy
                if( i == 30){
                    Intent i30 = new Intent(Intent.ACTION_VIEW);
                    i30.setData(Uri.parse("https://www.youtube.com/watch?v=8LlXhtfNZEQ&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=32"));
                    startActivity(i30);
                }
                // Ways of creating array
                if( i == 31){
                    Intent i31 = new Intent(Intent.ACTION_VIEW);
                    i31.setData(Uri.parse("https://www.youtube.com/watch?v=NYPKbmE0H6E&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=33"));
                    startActivity(i31);
                }
                // Copying Array
                if( i == 32){
                    Intent ix1 = new Intent(Intent.ACTION_VIEW);
                    ix1.setData(Uri.parse("https://www.youtube.com/watch?v=8sF85TyunQA&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=34"));
                    startActivity(ix1);
                }
                // Working with Matrix
                if( i == 33){
                    Intent i32 = new Intent(Intent.ACTION_VIEW);
                    i32.setData(Uri.parse("https://www.youtube.com/watch?v=Blzp9iuhZqo&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=35"));
                    startActivity(i32);
                }
                // Functions
                if( i == 34){
                    Intent i33 = new Intent(Intent.ACTION_VIEW);
                    i33.setData(Uri.parse("https://www.youtube.com/watch?v=BVfCWuca9nw&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=36"));
                    startActivity(i33);
                }
                // Fn arguments
                if( i == 35){
                    Intent i34 = new Intent(Intent.ACTION_VIEW);
                    i34.setData(Uri.parse("https://www.youtube.com/watch?v=ijXMGpoMkhQ&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=37"));
                    startActivity(i34);
                }

                // Types of Arguments
                if( i == 36){
                    Intent ix2 = new Intent(Intent.ACTION_VIEW);
                    ix2.setData(Uri.parse("https://www.youtube.com/watch?v=eci9iU_s6Ag&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=38"));
                    startActivity(ix2);
                }

                // Keyworded
                if( i == 37){
                    Intent i35 = new Intent(Intent.ACTION_VIEW);
                    i35.setData(Uri.parse("https://www.youtube.com/watch?v=kB829ciAXo4&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=39"));
                    startActivity(i35);
                }
                // Global vs local
                if( i == 38){
                    Intent i36 = new Intent(Intent.ACTION_VIEW);
                    i36.setData(Uri.parse("https://www.youtube.com/watch?v=QYUbLevwgDQ&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=40"));
                    startActivity(i36);
                }
                // Pass list
                if( i == 39){
                    Intent i37 = new Intent(Intent.ACTION_VIEW);
                    i37.setData(Uri.parse("https://www.youtube.com/watch?v=fsAzeNZXvkE&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=41"));
                    startActivity(i37);
                }
                // Fibo
                if( i == 40){
                    Intent i38 = new Intent(Intent.ACTION_VIEW);
                    i38.setData(Uri.parse("https://www.youtube.com/watch?v=7Sv4NmvdHcw&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=42"));
                    startActivity(i38);
                }
                // Fact
                if( i == 41){
                    Intent i39 = new Intent(Intent.ACTION_VIEW);
                    i39.setData(Uri.parse("https://www.youtube.com/watch?v=gfhtaP5Wq7M&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=43"));
                    startActivity(i39);
                }
                // Recursion
                if( i == 42){
                    Intent i40 = new Intent(Intent.ACTION_VIEW);
                    i40.setData(Uri.parse("https://www.youtube.com/watch?v=XkL3SUioNvo&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=44"));
                    startActivity(i40);
                }
                // Fact using recursion
                if( i == 43){
                    Intent i41 = new Intent(Intent.ACTION_VIEW);
                    i41.setData(Uri.parse("https://www.youtube.com/watch?v=TqqQld6m6A0&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=45"));
                    startActivity(i41);
                }

                //Anonymous
                if( i == 44){
                    Intent i43 = new Intent(Intent.ACTION_VIEW);
                    i43.setData(Uri.parse("https://www.youtube.com/watch?v=hYzwCsKGRrg&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=46"));
                    startActivity(i43);
                }
                //Filter Map
                if( i == 45){
                    Intent i44 = new Intent(Intent.ACTION_VIEW);
                    i44.setData(Uri.parse("https://www.youtube.com/watch?v=kj850Y8y8FI&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=47"));
                    startActivity(i44);
                }
                // Decorators
                if( i == 46){
                    Intent i45 = new Intent(Intent.ACTION_VIEW);
                    i45.setData(Uri.parse("https://www.youtube.com/watch?v=yNzxXZfkLUA&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=48"));
                    startActivity(i45);
                }
                // Modules
                if( i == 47) {
                    Intent i46 = new Intent(Intent.ACTION_VIEW);
                    i46.setData(Uri.parse("https://www.youtube.com/watch?v=1RuMJ53CKds&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=49"));
                    startActivity(i46);
                }
                // special variable
                if( i == 48){
                    Intent i47 = new Intent(Intent.ACTION_VIEW);
                    i47.setData(Uri.parse("https://www.youtube.com/watch?v=pzNISmtmzcY&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&index=50"));
                    startActivity(i47);
                }





            }
        });

    }
}