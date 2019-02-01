package com.arnawa.owan.simpanpinjamnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button my_btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        my_btnLogin = (Button) findViewById(R.id.my_btnLogin);
        my_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplhkoperasi = new Intent (Login.this, SimpanPinjam.class);
                startActivity(intentplhkoperasi);
                finish();
            }
        });
    }
}
