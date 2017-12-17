package com.example.chandru.myapplicationvook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class signup_activity extends AppCompatActivity {

    public int setup_signup;
    EditText pass_signup;
    TextView txt_signup,Signin_txtbtn,close_sign2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);
        setup_signup =1;
//        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        pass_signup =(EditText)findViewById(R.id.password);
        txt_signup=(TextView) findViewById(R.id.textEye);
        Signin_txtbtn=(TextView)findViewById(R.id.Signin_txtbtn);
        txt_signup.setBackgroundResource(R.drawable.view_pwd);


        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setup_signup ==1){
                    setup_signup =0;
                    pass_signup.setTransformationMethod(null);
                    if(pass_signup.getText().length() > 0)
                        pass_signup.setSelection(pass_signup.getText().length());

                    txt_signup.setBackgroundResource(R.drawable.view_pwd);
                }
                else {
                    setup_signup =1;
                    pass_signup.setTransformationMethod(new PasswordTransformationMethod());
                    if(pass_signup.getText().length()>0)
                        pass_signup.setSelection(pass_signup.getText().length());
                    txt_signup.setBackgroundResource(R.drawable.hide_pwd);



                }
            }
        });


        Signin_txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signup_activity.this, "mov to signin  "+pass_signup.getText(), Toast.LENGTH_SHORT).show();
                Intent tosignin =new Intent(signup_activity.this,signin_activity.class);
                startActivity(tosignin);
                finish();

            }
        });
        close_sign2=(TextView) findViewById(R.id.close_sign2);
        close_sign2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tosign2 =new Intent(signup_activity.this,MainActivity.class);
                startActivity(tosign2);
                finish();

            }
        });
    }
}
