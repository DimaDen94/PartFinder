package com.denejkodlj.partfinder.Activity;


import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.denejkodlj.partfinder.R;


public class LoginActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button sing;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        sing  = (Button) findViewById(R.id.email_sign_in_button);
        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(login.getText().toString(),password.getText().toString())){

                }
            }
        });

    }
    boolean check(String login, String password){
        return true;
    }




}

