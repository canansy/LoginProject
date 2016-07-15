package com.example.canan.loginproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Login Activity


    TextView signIn;
    EditText userName,password;
    Button loginButton;


    public void declaretion()
    {
        signIn = (TextView)findViewById(R.id.textView);
        userName = (EditText)findViewById(R.id.userName);
        password = (EditText)findViewById(R.id.password);
        loginButton = (Button)findViewById(R.id.loginButton);
    }

    public void veriCek()
    {
        String user = userName.getText().toString();
        String pass = password.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("username",user);
        intent.putExtra("password",pass);
        startActivity(intent);
    }

    public void loginButtonAct()
    {
        declaretion();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veriCek();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButtonAct();   //Log in yapıldığında yeni aktivasyon
    }
}
