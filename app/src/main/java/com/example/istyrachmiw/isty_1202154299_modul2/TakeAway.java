package com.example.istyrachmiw.isty_1202154299_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {
    Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //fungsi yang dijalankan saat activity di create
        setContentView(R.layout.activity_take_away); //memasang layout sebagai tampilan utama pada activity ini

        pilih = (Button)findViewById(R.id.button); //menghubungkan antar variabel dengan view

        pilih.setOnClickListener(new View.OnClickListener() { //aksi button
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TakeAway.this, daftarmenu.class); //perpindahan class
                startActivity(a); //pemanggilan fungsi atau passing parameter intent
            }
        });
    }
}
