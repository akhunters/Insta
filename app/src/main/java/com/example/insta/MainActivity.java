package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.insta.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    TextView signup;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        signup = binding.signup;
        email = binding.email;
        password = binding.password;
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked Signup", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),signup.class));
            }
        });
    }

    public void login(View v){
        String userEmail = email.getText().toString().trim();
        String userPassword = password.getText().toString().trim();
        if(userEmail.isEmpty()){
            email.setError("Enter email.");
            email.requestFocus();
            return;
        }
        if(userPassword.isEmpty()){
            password.setError("Enter password");
            password.requestFocus();
            return;
        }
    }
}
