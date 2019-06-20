package com.example.adefault.simak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);
        getSupportActionBar().setTitle("Home");

        Button Bayar = (Button)findViewById(R.id.btnBayar);
        Bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(HomeUser.this, pembayaran.class);
                startActivity(int1);
            }
        });

        Button Keluhan = (Button)findViewById(R.id.btnKeluhan);
        Keluhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(HomeUser.this, Keluh.class);
                startActivity(int2);
            }
        });

        Button Pengumuman = (Button)findViewById(R.id.btnPengumuman);
        Pengumuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(HomeUser.this, Pengumuman.class);
                startActivity(int3);
            }
        });

    }
}
