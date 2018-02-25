package com.example.linggom.berliantoparlinggomansaragih_1202150016_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Linggom on 25/02/2018.
 */

public class splashscreen extends AppCompatActivity {
    private int SplashInterval = 3000; // kecepatan perpindahan 3 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
//      Menghinlangkan head atau navigasi pada SplashScreen Activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah dari splashscreen ke menulist utama
                startActivity(new Intent(splashscreen.this, login.class));
                //menampilkan toast
                Toast.makeText(splashscreen.this, "WELCOME", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}


