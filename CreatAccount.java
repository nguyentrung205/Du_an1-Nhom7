package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreatAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_creat_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button createAccountButton = findViewById(R.id.btnCreateAccount);
        TextView loginText = findViewById(R.id.txtLogin);

        createAccountButton.setOnClickListener(v -> {
            Toast.makeText(CreatAccount.this, "Account created!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(CreatAccount.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        loginText.setOnClickListener(v -> {
            Intent intent = new Intent(CreatAccount.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
