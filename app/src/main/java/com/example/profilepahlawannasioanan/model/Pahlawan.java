package com.example.profilepahlawannasioanan.model;


public class Pahlawan {
    private String kategori;
    private String nama;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public Pahlawan(String ketegori, String nama, String asal, String deskripsi, int drawableRes) {
        this.kategori = ketegori;
        this.nama = nama;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getAsal() { return asal; }

    public void setAsal(String asal) { this.asal= asal; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
