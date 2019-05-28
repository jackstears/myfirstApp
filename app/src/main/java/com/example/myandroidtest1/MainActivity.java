package com.example.myandroidtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ex1(View view) {
        Intent intent = new Intent(this, Open_Browser.class);
        startActivity(intent);
    }
    public void ex2(View view) {
        Intent intent = new Intent( this, User_Login.class);
        startActivity(intent);
    }
}
