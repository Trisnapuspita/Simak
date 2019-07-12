package com.example.adefault.simak;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TunggakanPemilikActivity extends AppCompatActivity {
    private Button button;

    private BottomNavigationView.OnNavigationItemSelectedListener monNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_account:
                    return true;
            }
            return false;
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tunggakan_pemilik);

        getSupportActionBar().setTitle("Tunggakan Penyewa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT);
            }
        });

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT2 = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT2);
            }
        });

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT3 = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT3);
            }
        });

        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT4 = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT4);
            }
        });

        button = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT5 = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT5);
            }
        });

        button = (Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmlT6 = new Intent(TunggakanPemilikActivity.this, JumlahTunggakanActivity.class);
                startActivity(jmlT6);
            }
        });

        BottomNavigationView navigation = (BottomNavigationView)findViewById(R.id.nav_view);
        navigation.setOnNavigationItemSelectedListener(monNavigationItemSelectedListener);

    }
}
