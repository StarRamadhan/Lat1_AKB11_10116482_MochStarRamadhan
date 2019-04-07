package com.akb.lat1_akb11_10116482_mochstarramadhan;

//Nama  : Moch. Star Ramadhan
//Nim   : 10116482
//Kelas : AKB/IF - 11
//Waktu Pengertaan Mulai Tanggal 06/04/2019

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SayHai extends AppCompatActivity {

    TextView txtNote;
    Button btnExit;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        btnExit = (Button)findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.exit(0);
                moveTaskToBack(true);
            }
        });


        txtNote = (TextView) findViewById(R.id.txtNote);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtNote.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP mu tiap hari " +
                "buat bantu kamu ngatur waktu :)");
    }
}
