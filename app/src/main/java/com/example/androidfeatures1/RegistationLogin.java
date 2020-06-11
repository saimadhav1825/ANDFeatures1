package com.example.androidfeatures1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistationLogin extends AppCompatActivity {
    EditText name;
    EditText mail;
    EditText num;
    EditText password;
    Button rlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation_login);

        name=(EditText)findViewById(R.id.textView3);
        mail=(EditText)findViewById(R.id.textView4);
        num=(EditText)findViewById(R.id.textView5);
        password=(EditText)findViewById(R.id.textView6);
        rlogin=(Button)findViewById(R.id.button4);

       String uname=name.getText().toString();
       String umail=mail.getText().toString();
        String unum=num.getText().toString();
        String upass=password.getText().toString();
        rlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistationLogin.this,"registration login",Toast.LENGTH_SHORT).show();
            }
        });

    }
}