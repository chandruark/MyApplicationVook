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

public class signin_activity extends AppCompatActivity {
    public int setup_signin;
    EditText pass_signin;
    TextView txt_signin,Signup_txtbtn,mov_forgpass,close_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_activity);
//        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);// error gott resolved
        setup_signin =1;
        Signup_txtbtn=(TextView)findViewById(R.id.Signup_txtbtn);
        pass_signin =(EditText)findViewById(R.id.password_signin);
        txt_signin =(TextView) findViewById(R.id.textEye_signin);
        txt_signin.setBackgroundResource(R.drawable.view_pwd);

        txt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setup_signin ==1){
                    setup_signin =0;
                    pass_signin.setTransformationMethod(null);
                    if(pass_signin.getText().length() > 0)
                        pass_signin.setSelection(pass_signin.getText().length());

                    txt_signin.setBackgroundResource(R.drawable.view_pwd);
                }
                else {
                    setup_signin =1;
                    pass_signin.setTransformationMethod(new PasswordTransformationMethod());
                    if(pass_signin.getText().length()>0)
                        pass_signin.setSelection(pass_signin.getText().length());
                    txt_signin.setBackgroundResource(R.drawable.hide_pwd);



                }
            }
        });

        Signup_txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signin_activity.this, "mov to signup"+pass_signin.getText(), Toast.LENGTH_SHORT).show();
                Intent mov_tosignup =new Intent(signin_activity.this,signup_activity.class);
                startActivity(mov_tosignup);
                finish();

            }
        });
        mov_forgpass=(TextView)findViewById(R.id.mov_forgpass);
        mov_forgpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mov_toforgp =new Intent(signin_activity.this,forgotpass_activity.class);
                startActivity(mov_toforgp);
            }
        });

        close_sign=(TextView)findViewById(R.id.close_sign);
        close_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mov_main1 =new Intent(signin_activity.this,MainActivity.class);
                startActivity(mov_main1);
                finish();

            }
        });
    }
}
