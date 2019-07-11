package com.example.adefault.simak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PembayaranPemilikActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_pemilik);

        button = (Button)findViewById(R.id.lokasi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLokasi();
            }
        });
        button = (Button)findViewById(R.id.verifikasi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVerifikasi();
            }
        });
        button = (Button)findViewById(R.id.tunggakan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTunggakan();
            }
        });
    }
    public void openLokasi(){
        Intent intent = new Intent(this, DaftarLokasiActivity.class);
        startActivity(intent);
    }
    public void openVerifikasi(){
        Intent intent = new Intent(this, VerifikasiPenyewaActivity.class);
        startActivity(intent);
    }
    public void openTunggakan(){
        Intent intent = new Intent(this, TunggakanPemilikActivity.class);
        startActivity(intent);
    }
}
