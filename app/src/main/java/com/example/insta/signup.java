package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.insta.databinding.ActivitySignupBinding;

public class signup extends AppCompatActivity {
    ActivitySignupBinding binding;
    TextView loginText;
    EditText email;
    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivitySignupBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        loginText=binding.loginText;
        email=binding.email;
        name=binding.name;
        password=binding.password;
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signup.this, "Clicked Signup", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),signup.class));
            }
        });
    }

    public void signup(View v){

        String useremail=email.getText().toString().trim();
        String username=name.getText().toString().trim();
        String userpassword=password.getText().toString().trim();

        if(useremail.isEmpty()){
            email.setError("Enter email.");
            email.requestFocus();
            return;
        }
        if(username.isEmpty()){
            name.setError("Please provide username");
            name.requestFocus();
            return;
        }
        if(userpassword.isEmpty()){
            password.setError("Enter password");
            password.requestFocus();
            return;
        }
    }
}
