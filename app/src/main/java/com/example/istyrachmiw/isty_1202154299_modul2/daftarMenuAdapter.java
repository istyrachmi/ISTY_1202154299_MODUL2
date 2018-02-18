package com.example.istyrachmiw.isty_1202154299_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

    //Class Adapter untuk mengatur data yang akan ditampilkan
    public class daftarMenuAdapter extends RecyclerView.Adapter<daftarMenuAdapter.ViewHolder> {

        private ArrayList<String> arrayListMenu; //Digunakan untuk Judul
        private ArrayList<String> arrayListsPrice; //Digunakan untuk Menu
        private ArrayList<Integer> gambar; //Digunakan untuk gambar

        //Membuat knstruktor di Class RecyclerViewAdapter
        daftarMenuAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsPrice, ArrayList<Integer> Gambar) {
            this.arrayListMenu = arrayListMenu;
            this.arrayListsPrice = arrayListsPrice;
            this.gambar = Gambar;
        }

        //ViewHolder digunakan untuk menyimpan referensi dari View-view
        class ViewHolder extends RecyclerView.ViewHolder {

            private TextView menu, price;
            private ImageView gambar;
            private LinearLayout ItemList;

            ViewHolder(View itemView) {
                super(itemView);
                //inisialisasi View-view untuk kita gunakan pada RecyclerView
                menu = itemView.findViewById(R.id.txtMenu);
                price = itemView.findViewById(R.id.txtPrice);
                gambar = itemView.findViewById(R.id.image);
                ItemList = itemView.findViewById(R.id.item_list);
            }
        }

        public daftarMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            ViewHolder VH = new ViewHolder(V);
            return VH;
        }


        public void onBindViewHolder(final daftarMenuAdapter.ViewHolder holder, final int position) {
            //Memanggil Nilai pada View-view Yang sebelumnya dibuat
            final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
            final String price = arrayListsPrice.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
            final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
            holder.menu.setText(menu);
            holder.price.setText("Harga Rp. " + price);
            holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang telah ditentukan
            //Membuat aksi saat judul dilist ditekan
            holder.menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            //Membuat aksi saat list ditekan
            holder.ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), DetailMenu.class);
                    String komposisi;
                    switch (position) {
                        case 0:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Nasi, Katsu, Salad, Saus";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Nasi, Cumi, Salad, Saus Teriyaki";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Nasi, Ayam, Sambal Matah";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Nasi, Daging, Sayur";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Nasi, Gyudon, Saus Khas Thai";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("menu", arrayListMenu.get(position));
                            intent.putExtra("price", arrayListsPrice.get(position));
                            intent.putExtra("image", gambar.get(position));
                            komposisi = "Salmon, Saus, Alpukat";
                            intent.putExtra("komposisi", komposisi);
                            view.getContext().startActivity(intent);
                            break;
                    }
                }
            });
        }


        public int getItemCount() {
            return arrayListMenu.size();
        }
    }

