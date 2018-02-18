package com.example.istyrachmiw.isty_1202154299_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    // membuat variabel untuk RadioGroup
    private RadioGroup c;
    private RadioButton d,e;

    //mengarahkan ke layout activity_menu_utama
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        c = (RadioGroup) findViewById(R.id.konv);

        Intent c = getIntent();
    }

    //melakukan proses eksekusi method
    public void proses(View view) {
        int selecteditem = c.getCheckedRadioButtonId();
        d = (RadioButton) findViewById(R.id.dinein);
        e = (RadioButton) findViewById(R.id.takeaway);
        //kondisi ketika salah satu dijalankan
        if (selecteditem == d.getId()) {
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent); //pemanggilan fungsi atau passing parameter intent
            Toast.makeText(MenuUtama.this,"Dine In!", Toast.LENGTH_LONG).show(); //event untuk menampilkan toast

        }else if (selecteditem == e.getId()){
            Intent intent = new Intent(this, TakeAway.class);

            startActivity(intent); //pemanggilan fungsi atau passing parameter intent
            Toast.makeText(MenuUtama.this,"Take Away!", Toast.LENGTH_LONG).show(); //event untuk menampilkan toast
        }
    }
}
