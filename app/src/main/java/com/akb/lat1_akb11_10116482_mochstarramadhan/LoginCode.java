package com.akb.lat1_akb11_10116482_mochstarramadhan;

//Nama  : Moch. Star Ramadhan
//Nim   : 10116482
//Kelas : AKB/IF - 11
//Waktu Pengertaan Mulai Tanggal 06/04/2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
    }
    public void kePage3(View view) {
        Intent intent = new Intent(LoginCode.this, Biodata.class);
        startActivity(intent);
    }
}
