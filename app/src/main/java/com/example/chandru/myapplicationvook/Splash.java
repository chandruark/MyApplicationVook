package com.example.chandru.myapplicationvook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



            super.onCreate(savedInstanceState);

            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
            finish();

    }

}
