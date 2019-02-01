package com.arnawa.owan.simpanpinjamnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihKoperasi extends AppCompatActivity {

    private Button btn_pilihKoperasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_koperasi);

        btn_pilihKoperasi = (Button) findViewById(R.id.btn_pilihKoperasi);
        btn_pilihKoperasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplhkoperasi = new Intent (PilihKoperasi.this, Login.class);
                startActivity(intentplhkoperasi);
                finish();
            }
        });
    }
}
