package com.example.istyrachmiw.isty_1202154299_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    //membuat value splash
    private static int splashInterval = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() { //membuat berhenti selama beberapa detik
            @Override

                public void run() {
                Intent i = new Intent(SplashScreen.this, MenuUtama.class); //perpindahan class dari splash ke menuutama
                startActivity(i);

                Toast.makeText(SplashScreen.this, "ISTY_1202154299", Toast.LENGTH_LONG).show(); //event untuk menampilkan toast

                this.finish();
            }

            private void finish() {
            }
        }, splashInterval);
    } ;
}
