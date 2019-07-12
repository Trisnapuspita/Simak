package com.example.adefault.simak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PengumumanPemilikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengumuman_pemilik);

        getSupportActionBar().setTitle("Pengumuman");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
