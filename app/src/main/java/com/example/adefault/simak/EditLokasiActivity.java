package com.example.adefault.simak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditLokasiActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_lokasi);

        button = (Button)findViewById(R.id.pintubaru);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPengguna();
            }
        });
    }
    public void openPengguna(){
//        Intent intent = new Intent(this, Pengguna.class);
//        startActivity(intent);
    }
}
