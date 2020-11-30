package com.example.profilepahlawannasioanan;


import android.content.Context;

import com.example.profilepahlawannasioanan.model.Nasional;
import com.example.profilepahlawannasioanan.model.Pahlawan;
import com.example.profilepahlawannasioanan.model.Revolusi;

import java.util.ArrayList;
import java.util.List;




public class DataProvider {
    private static List<Pahlawan> pahlawans = new ArrayList<>();

    private static List<Nasional> initDataNasional(Context ctx) {
        List<Nasional> nasionals = new ArrayList<>();
        nasionals.add(new Nasional("SOEKARNO", "Jawa Timur",
                "Iamemainkanperananpentinguntukmemerdekakanbangsa Indonesia daripenjajahanBelanda. IaadalahpenggaliPancasila. IaadalahProklamatorKemerdekaan Indonesia", R.drawable.nasional_ir_soekarno));
        nasionals.add(new Nasional("CUT NYAK DHIEN", "aceh",
                "Cut nyakdienTokohwanitasatuini di kenalsebagaisalahsatupahlawannasionalwanita Indonesia yang terkenaldalamperlawanannyamelawanpenjajahkolonialBelanda", R.drawable.nasional_cut_nyak_dhien));
        nasionals.add(new Nasional("IDAM KHALID ", "kalimantan",
                "IdamKhalid  IdhamChalidbergabungkedalambadan-badanperjuangan. Menjelangkemerdekaan, iaaktifdalamPanitiaKemerdekaan Indonesia Daerah di kotaAmuntai", R.drawable.nasional_idam_khalid));
        nasionals.add(new Nasional("JENDRAL SOEDIRMAN", "Jawa Tengah ",
                "Jendralsoedirman lahir di BodasKarangjati, Rembang, Purbalingga, 24 Januari 1916", R.drawable.nasional_jendral_soedirman));
        nasionals.add(new Nasional("RA.KARTINI", "jawa Tengah",
                "RadenAjengKartini, beliaudikenalsebagaipahlawannasional yang dikenalmasyarakatgigihmemperjuangkanemansipasiwanita", R.drawable.nasional_rakartini));
        return nasionals;
    }
    private static List<Revolusi> initDataRevolusi(Context ctx) {
        List<Revolusi> revolusis = new ArrayList<>();
        revolusis.add(new Revolusi("AHMAD YANI", "Jawa tengah",
                "JendralahmadyaniPadatahun 1943, iabergabungdengantentara yang disponsoriJepangPeta (Pembela Tanah Air), danmenjalanipelatihanlebihlanjut di Magelang. ", R.drawable.revolusi_achmadyani));
        revolusis.add(new Revolusi("PANDJAITAN", "Sumatra utarar",
                "BrigadirJenderal TNI Anumerta Donald Isaac Pendidikan formal dimulaidariSekolahDasar, lantasmasukSekolahMenengahPertama, danterakhir di SekolahMenengahAtas", R.drawable.revolusi_di_pandjaitan));
        revolusis.add(new Revolusi("MT.HARYONO", "Jawa Timur",
                "pahlawanrevolusi Indonesia yang terbunuhpadapersitiwa G30S PKI. LetjenAnumerta M.T. Haryonosebelumnyamendapat  pendidikan di ELS ", R.drawable.revolusi_mt_haryono));
        revolusis.add(new Revolusi("S.PARMAN", "",
                "LetnanJenderal TNI AnumertaSiswondoParman salahsatupahlawanrevolusi Indonesia danfigurmiliter Indonesia", R.drawable.revolusi_s_parman));
        revolusis.add(new Revolusi("LET JEN SOEPRAPTO", "jawa tengah",
                "seorangpahlawannasional Indonesia. Iaadalahsalahsatukorbandalam G30SPKI dandimakamkan di Taman MakamPahlawanKalibata, ", R.drawable.revolusiletjensoeprapto));
        return revolusis;

    }

    private static void initAllPahlawans(Context ctx) {
        pahlawans.addAll(initDataNasional(ctx));
        pahlawans.addAll(initDataRevolusi(ctx));

    }

    public static List<Pahlawan> getAllPahlawan(Context ctx) {
        if (pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        return  pahlawans;
    }

    public static List<Pahlawan> getPahlawansByTipe(Context ctx, String kategori) {
        List<Pahlawan> pahlawansByType = new ArrayList<>();
        if (pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        for (Pahlawan o : pahlawans) {
            if (o.getKategori().equals(kategori)) {
                pahlawansByType.add(o);
            }
        }
        return pahlawansByType;
    }

}







