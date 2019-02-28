package com.example.testone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etusername, etpassword;
    ImageView img;
    Button btnLogin;
    String password = "password";
    String username = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = findViewById(R.id.etUsername);
        etpassword = findViewById(R.id.etPassword);
        img = findViewById(R.id.imageView);
        btnLogin = findViewById(R.id.btnLogin);

        animate();
        login();

    }

    public void animate() {
        img.animate().rotationBy(720);
    }

    public void login( ) {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = etusername.getText().toString();
                String pass = etpassword.getText().toString();

                if(username.equals(uname) && pass.equals(password)){
                    Intent i = new Intent(getApplicationContext(),home.class);
                    startActivity(i);

                }else {
                    Toast.makeText(getApplicationContext(), "Incorrect Username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }




}



