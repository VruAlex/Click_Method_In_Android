package com.example.vrushabh.clickmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To declare the event handler Programmatically, create an View.OnClickListener
        //object and assign it to button by calling setOnClickListener(View.OnClickListener)
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button One Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //The android:onClick attribute must have a specifically, the method must:
    //Be public
    //Return void
    //Define a view as its only parameter
    public void SecondButton(View view){
        Toast.makeText(MainActivity.this, "Button Two Clicked", Toast.LENGTH_SHORT).show();
    }



}
