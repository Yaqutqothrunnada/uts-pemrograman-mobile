package com.example.profilepahlawannasioanan;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

import com.example.profilepahlawannasioanan.model.Pahlawan;


public class GaleriActivity extends AppCompatActivity {

    List<Pahlawan> pahlawans;
    int indeksTampil = 0;
    String kategoriPahlawan;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txAsal,txDeskripsi,txJudul,txNama;
    ImageView ivFotoPahlawan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_nama);
        Intent intent = getIntent();
        kategoriPahlawan= intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        pahlawans = DataProvider.getPahlawansByTipe(this, kategoriPahlawan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> pahlawanPertama());
        btnTerakhir.setOnClickListener(view -> pahlawanTerakhir());
        btnSebelumnya.setOnClickListener(view -> pahlawanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> pahlawanBerikutnya());

        txNama = findViewById(R.id.txNama);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoPahlawan = findViewById(R.id.gambarPahlawan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Nama "+kategoriPahlawan);
    }

    private void tampilkanProfil() {
        Pahlawan p = pahlawans.get(indeksTampil);
        Log.d("Revolusi","Menampilkan pahlawanrevolusi"+p.getKategori());
        txAsal.setText(p.getAsal());
        txNama.setText(p.getNama());
        txDeskripsi.setText(p.getDeskripsi());
        ivFotoPahlawan.setImageDrawable(this.getDrawable(p.getDrawableRes()));
    }

    private void pahlawanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void pahlawanTerakhir() {
        int posAkhir = pahlawans.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi_terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void pahlawanBerikutnya() {
        if (indeksTampil == pahlawans.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void pahlawanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}