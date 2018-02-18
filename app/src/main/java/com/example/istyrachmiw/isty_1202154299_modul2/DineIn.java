package com.example.istyrachmiw.isty_1202154299_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity {

    private Spinner d;  //membuat variabel untuk spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        d = findViewById(R.id.nomeja); //melakukan proses eksekusi
    }

    public void makan(View view) {
           Intent intent = new Intent(this, daftarmenu.class); //perpindahan dari dine in ke daftar menu

           startActivity(intent); //pemanggilan fungsi atau passing parameter intent

    }
}
