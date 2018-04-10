package com.example.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText tIL= findViewById(R.id.textEmail);
    String mail= tIL.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogIn(View view){
            Intent intent = new Intent(this, MainActivity.class);
            Intent i =new Intent(getApplicationContext(),MainActivity.class);
            i.putExtra("usuario",mail);
            startActivity(i);
    }
}
