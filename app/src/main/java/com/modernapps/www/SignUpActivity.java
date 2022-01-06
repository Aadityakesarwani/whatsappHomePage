package com.modernapps.www;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.modernapps.www.databinding.ActivitySignUpBinding;

import java.util.Objects;



public class SignUpActivity extends AppCompatActivity {

    Button signup , google ,facebook;
    EditText email ,password , name;
    TextView signwithphone , alreadyhaveacc;

    ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();

      signup = binding.signUp;
      google= binding.bGoogle;
      facebook = binding.bFacebook;

      email = binding.email;
      password = binding.password;
      name = binding.name;

      signwithphone = binding.signWithPhone;
      alreadyhaveacc = binding.alredyHaveAcc;

    }
}