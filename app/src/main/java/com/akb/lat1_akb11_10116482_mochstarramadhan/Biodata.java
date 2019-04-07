package com.akb.lat1_akb11_10116482_mochstarramadhan;

//Nama  : Moch. Star Ramadhan
//Nim   : 10116482
//Kelas : AKB/IF - 11
//Waktu Pengertaan Mulai Tanggal 06/04/2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Biodata extends AppCompatActivity {

    EditText nick,age;
    Button btnNext;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nick = (EditText) findViewById(R.id.txtNama);
        age = (EditText) findViewById(R.id.txtUmur);
        btnNext = (Button) findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = nick.getText().toString();
                    String umur = age.getText().toString();
                    if (nama.isEmpty()){
                        Toast.makeText(getApplication(), "Field Nama Masih Kosong!!!",Toast.LENGTH_LONG).show();
                        nick.requestFocus();
                    }else if(umur.isEmpty()){
                        Toast.makeText(getApplication(), "Field Umur Masih Kosong!!!",Toast.LENGTH_LONG).show();
                        age.requestFocus();
                    }

                    if (!nama.isEmpty() && !umur.isEmpty()){
                        Intent i = new Intent(Biodata.this, SayHai.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, Coba Lagi !",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
