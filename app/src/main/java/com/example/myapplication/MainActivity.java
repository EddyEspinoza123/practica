package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tem=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tem=(Button)findViewById(R.id.btn1);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambiar=new Intent(getApplicationContext(),Tem.class);
                startActivity(cambiar);
            }
        });
    }
}