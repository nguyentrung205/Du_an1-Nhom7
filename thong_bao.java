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

public class thong_bao extends AppCompatActivity {
    private ImageView navHome,navCart,navFavorite,navBell,navAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thong_bao);

        navHome= findViewById(R.id.nav_home);
        navBell = findViewById(R.id.nav_bell);
        navCart=findViewById(R.id.nav_cart);
        navFavorite= findViewById(R.id.nav_favorite);
        navAcc = findViewById(R.id.nav_account);
        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thong_bao.this, MainActivity.class);
                startActivity(intent);

            }
        });
        navAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thong_bao.this, profile.class);
                startActivity(intent);
            }
        });
        navFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thong_bao.this, San_pham.class);
                startActivity(intent);
            }
        });
        navCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thong_bao.this, Gio_hang.class);
                startActivity(intent);
            }
        });
        navBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thong_bao.this, thong_bao.class);
                startActivity(intent);
            }
        });
    }
}