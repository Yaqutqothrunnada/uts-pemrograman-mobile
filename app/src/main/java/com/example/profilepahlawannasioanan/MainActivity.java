package com.example.profilepahlawannasioanan;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnNasional,btnRevolusi;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnNasional= findViewById(R.id.btn_buka_nama_nasional);
        btnRevolusi= findViewById(R.id.btn_buka_nama_revolusi);
        btnNasional.setOnClickListener(view -> bukaGaleri("PahlawanNasional"));
        btnRevolusi.setOnClickListener(view -> bukaGaleri("PahlawanRevolusi"));
    }

    private void bukaGaleri(String ketegoriPahlawan) {
        Log.d("MAIN","Buka activity Nasional");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, ketegoriPahlawan);
        startActivity(intent);
    }

}