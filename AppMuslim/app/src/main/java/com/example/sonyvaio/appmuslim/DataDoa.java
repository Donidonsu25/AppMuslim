package com.example.sonyvaio.appmuslim;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataDoa extends AppCompatActivity {
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData() {
        String doa = getIntent().getExtras().getString("MyName");

        switch (doa) {
            case "Doa Masuk Masjid":
                Getdoa.setText("Doa Masuk Masjid");
                Getarab.setText("اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ");
                Getbaca.setText("Allahummaf-tahlii abwaaba rahmatika");
                Getarti.setText("Ya Allah, bukakanlah untukku pintu-pintu rahmat-Mu");
                break;

            case "Doa Keluar Masjid":
                Getdoa.setText("Doa Keluar Masjid");
                Getarab.setText("اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكََ");
                Getbaca.setText("Allahumma innii as-aluka min fadhlik");
                Getarti.setText("Ya Allah, sesungguhnya aku memohon kepada-Mu atas segala keutamaan dari-Mu");
                break;

            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("الْحَمْدُ لِلَّهِ الَّذِى أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ");
                Getbaca.setText("Alhamdulillaahil ladzii ahyaanaa ba’da maa amaatanaa wa ilaihin nusyuur");
                Getarti.setText("Segala puji bagi Allah yang telah menghidupkan kami setelah Dia mematikan kami. Dan kepadaNyalah kami kembali.");
                break;

            case "Doa Bercermin":
                Getdoa.setText("Doa Bercermin");
                Getarab.setText("اللَّهُمَّ كَمَا حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي");
                Getbaca.setText("Alloohumma kamaa hassanta kholqii fahassin khuluqi");
                Getarti.setText(" Ya Allah, sebagaimana Engkau baguskan tubuhku, maka baguskanlah akhlaqku");
                break;

            case "Doa Memakai Pakaian":
                Getdoa.setText("Doa Memakai Pakaian");
                Getarab.setText("الْحَمْدُ لِلَّهِ الَّذِى كَسَانِى هَذَا الثَّوْبَ وَرَزَقَنِيهِ مِنْ غَيْرِ حَوْلٍ مِنِّى وَلاَ قُوَّةٍ");
                Getbaca.setText("Alhamdulillaahil ladzii kasaanii haadzats tsauba warozaqoniihi min ghoiri haulin minnii walaa quwwah");
                Getarti.setText("Segala puji bagi Allah yang telah memberikan pakaian dan rezeki kepadaku tanpa daya dan upaya dariku");
                break;

            case "Doa Melepas Pakaian":
                Getdoa.setText("Doa Melepas Pakaian");
                Getarab.setText("بِسْمِ اللَّهِ الَّذِى لَا إِلَهَ إِلَّا هُوَ");
                Getbaca.setText("Bismillaahil ladzii laa ilaaha illaa huw");
                Getarti.setText("Dengan nama Allah yang tiada tuhan selain Dia");
                break;

            case "Doa Kedua Orang Tua":
                Getdoa.setText("Doa Kedua Orang Tua");
                Getarab.setText("اللَّهُمَّ اغْفِرْ لِى وَلِوَ الِدَىَّ وَارْ حَمْهُمَا كَمَا رَبَّيَا نِى صَغِيْرًاََ");
                Getbaca.setText("Allahumma fighfirlii wa liwaa lidhayya warham humaa kamaa rabbayaa nii shokhiroon");
                Getarti.setText(" Ya Allah, ampunilah aku dan kedua orang tuaku, baik ibu dan bapakku, kasihanilah keduanya seperti mereka menyayangiku di waktu kecil.");
        }
    }
}
