package com.newera.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUserName, editPassword;
    private Button btnLogin;
    String username = "L";
    String password = "B";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
        setLister();
    }

    private void findview(){
        editUserName = findViewById(R.id.edit_Username);
        editPassword = findViewById(R.id.edit_Password);
        btnLogin = findViewById(R.id.btn_Login);
    }

    private void setLister(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsername = editUserName.getText().toString();
                String inputPassword = editPassword.getText().toString();

                if(inputUsername.equals(username) && inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
