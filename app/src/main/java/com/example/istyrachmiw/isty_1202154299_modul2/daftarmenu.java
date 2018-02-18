package com.example.istyrachmiw.isty_1202154299_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class daftarmenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private daftarMenuAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //Daftar Menu
    private String[] menu = {"Nasi Katsu", "Nasi Cumi Teriyaki", "Nasi Ayam Sambal Matah", "Nasi Thailand", "Nasi Gyudon", "Salmon Poke Bowl"};

    //Daftar Harga
    private String[] price = {"10.000", "15.000", "15.000", "30.000", "35.000", "40.000"};

    //Daftar Gambar
    private int[] image = {R.drawable.katsu, R.drawable.cumiteriyaki, R.drawable.matah, R.drawable.nasithai, R.drawable.nasigyudon,
            R.drawable.salmon};

    @Override
    protected void onCreate(Bundle savedInstanceState) { //fungsi yang dijalankan saat activity di create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu); //memasang layout sebagai tampilan utama pada activity ini

            Menu = new ArrayList<>();
            Price = new ArrayList<>();
            Gambar = new ArrayList<>();

            recyclerView= findViewById(R.id.recycle);
            DaftarItem();

            //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);
            adapter = new daftarMenuAdapter(Menu, Price, Gambar);

            //Memasang Adapter pada RecyclerView
            recyclerView.setAdapter(adapter);
        }

    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}
