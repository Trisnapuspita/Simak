package com.example.adefault.simak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JumlahTunggakanActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah_tunggakan);

        getSupportActionBar().setTitle("Jumlah Tunggakan Penyewa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (Button)findViewById(R.id.pengumumanTunggak);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnpengumuman = new Intent(JumlahTunggakanActivity.this, PengumumanPemilikActivity.class);
                startActivity(btnpengumuman);
            }
        });
    }
}
