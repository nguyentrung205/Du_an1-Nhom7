package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profile extends AppCompatActivity {
    private ImageView navHome,navCart,navFavorite,navAcc,navBell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        navHome= findViewById(R.id.nav_home);
        navCart=findViewById(R.id.nav_cart);
        navFavorite= findViewById(R.id.nav_favorite);
        navAcc = findViewById(R.id.nav_account);
        navBell = findViewById(R.id.nav_bell);
        navBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, thong_bao.class);
                startActivity(intent);
            }
        });
        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, MainActivity.class);
                startActivity(intent);

            }
        });
        navAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, profile.class);
                startActivity(intent);
            }
        });
        navFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, San_pham.class);
                startActivity(intent);
            }
        });
        navCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, Gio_hang.class);
                startActivity(intent);
            }
        });
    }
}