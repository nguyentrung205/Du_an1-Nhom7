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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class San_pham extends AppCompatActivity {
    private ImageView navHome,navCart,navFavorite,navAcc,navBell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_san_pham);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        navHome= findViewById(R.id.nav_home);
        navBell = findViewById(R.id.nav_bell);
        navCart=findViewById(R.id.nav_cart);
        navFavorite= findViewById(R.id.nav_favorite);
        navAcc = findViewById(R.id.nav_account);
        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(San_pham.this, MainActivity.class);
                startActivity(intent);

            }
        });
        navAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(San_pham.this, profile.class);
                startActivity(intent);
            }
        });
        navFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(San_pham.this, San_pham.class);
                startActivity(intent);
            }
        });
        navCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(San_pham.this, Gio_hang.class);
                startActivity(intent);
            }
        });
        navBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(San_pham.this, thong_bao.class);
                startActivity(intent);
            }
        });

    }
}