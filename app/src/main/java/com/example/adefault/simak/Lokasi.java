package com.example.adefault.simak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lokasi extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

    text = (TextView)findViewById(R.id.jakarta);
    text.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openJakarta();
        }
    });
    }
    public void openJakarta(){
        Intent intent = new Intent(this, Jakarta.class);
        startActivity(intent);
    }
}
