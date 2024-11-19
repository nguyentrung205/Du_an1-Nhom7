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

public class Gio_hang extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapterSP adapter;
    private List<Product> productList;
    private ImageView navHome,navCart,navFavorite,navAcc,navBell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gio_hang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        navHome= findViewById(R.id.nav_home);
        navCart=findViewById(R.id.nav_cart);
        navFavorite= findViewById(R.id.nav_favorite);
        navAcc = findViewById(R.id.nav_account);
        navBell = findViewById(R.id.nav_bell);
        navBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gio_hang.this, thong_bao.class);
                startActivity(intent);
            }
        });
        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gio_hang.this, MainActivity.class);
                startActivity(intent);

            }
        });
        navAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gio_hang.this, profile.class);
                startActivity(intent);
            }
        });
        navFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gio_hang.this, San_pham.class);
                startActivity(intent);
            }
        });
        navCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gio_hang.this, Gio_hang.class);
                startActivity(intent);
            }
        });
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Product("Giày xé", "300,000đ",R.drawable.lucsac));
        productList.add(new Product("Giày xanh", "250,000đ",R.drawable.xanh));
        productList.add(new Product("Đỏ cam", "150,000đ",R.drawable.doo));

        adapter = new ProductAdapterSP(productList);
        recyclerView.setAdapter(adapter);
    }
}