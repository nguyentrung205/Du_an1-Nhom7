package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button signInButton = findViewById(R.id.btnSignIn);
        CheckBox rememberMeCheckbox = findViewById(R.id.chkRememberMe);
        TextView forgotPassword = findViewById(R.id.txtForgotPassword);
        TextView createNewAccount = findViewById(R.id.txtCreateNewAccount);

        signInButton.setOnClickListener(v -> {
            Toast.makeText(LoginActivity.this, "Signed in successfully!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            finish();
        });

        forgotPassword.setOnClickListener(v ->
                Toast.makeText(LoginActivity.this, "Forgot password clicked", Toast.LENGTH_SHORT).show()
        );

        createNewAccount.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, CreatAccount.class);
            startActivity(intent);
        });
    }
}
