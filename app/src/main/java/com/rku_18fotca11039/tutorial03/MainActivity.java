package com.rku_18fotca11039.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.temporal.ValueRange;

public class MainActivity extends AppCompatActivity {
    EditText etxtemail;
    EditText etxtpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         etxtemail = findViewById(R.id.etxtemail);
         etxtpassword = findViewById(R.id.etxtpassword);
         btnlogin = findViewById(R.id.btnlogin);
    }


    public void btnloginClick(View view) {
        String valusername = etxtemail.getText().toString();
        String valpassword = etxtpassword.getText().toString();

        if(valusername.equals("admin@gmail.com") && valpassword.equals("123456")){
            Intent intent = new Intent(MainActivity.this,welcome.class);
            startActivity(intent);
            finish();
            Toast.makeText(this, "Loggin Successful", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Loggin failed", Toast.LENGTH_SHORT).show();
        }
    }
}
