package com.example.chandru.myapplicationvook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class forgotpass_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass_activity);

        TextView textView=(TextView)findViewById(R.id.close_signin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgot=new Intent(forgotpass_activity.this,signin_activity.class);
                startActivity(forgot);
                finish();
            }
        });
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent forgot=new Intent(forgotpass_activity.this,MainActivity.class);
//                startActivity(forgot);
//                finish();
//            }
//        });
    }
}
