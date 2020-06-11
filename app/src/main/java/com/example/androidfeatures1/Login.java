package com.example.androidfeatures1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText)findViewById(R.id.textView);
        pass=(EditText)findViewById(R.id.textView2);
        login=(Button)findViewById(R.id.button3);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("")||pass.getText().toString().equals(""))
                {
                    Toast.makeText(Login.this,"enter username and password",Toast.LENGTH_SHORT).show();
                }
                if(user.getText().toString().equals("sai")||pass.getText().equals("1234")){
                    Toast.makeText(Login.this,"sucessfull login",Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}