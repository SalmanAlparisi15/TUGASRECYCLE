package com.example.tugasday06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {


    private String nama;
    private String asal;
    private String genre;
    private String tahun;
    private String deskripsi;
    private Button btnShare;
    private TextView Nama, Asal, Genre, Tahun, Deskripsi;
    private int fotodetaill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView fotodetail = findViewById(R.id.ivDetail);
        Nama = findViewById(R.id.tvnamaDetail);
        Asal = findViewById(R.id.tvasalDetail);
        Genre = findViewById(R.id.tvgenreDetail);
        Tahun = findViewById(R.id.tvterbentukDetail);
        Deskripsi = findViewById(R.id.tvdeskripsiDetail);
        btnShare = findViewById(R.id.btnShare);


        fotodetaill = getIntent().getIntExtra("Foto",0);
        nama = getIntent().getStringExtra("Nama");
        asal = getIntent().getStringExtra("Asal");
        genre = getIntent().getStringExtra("Genre");
        tahun = getIntent().getStringExtra("Tahun");
        deskripsi = getIntent().getStringExtra("Deskripsi");


        fotodetail.setImageResource(fotodetaill);
        Nama.setText(nama);
        Asal.setText(asal);
        Genre.setText(genre);
        Tahun.setText(tahun);
        Deskripsi.setText(deskripsi);

        btnShare.setOnClickListener(click -> {
            Intent intent1 = new Intent(Intent.ACTION_SEND);
            intent1.setType("text/plain");
            String shareMessage = Nama.getText() +"\n"+ Asal.getText() +"\n"+ Genre.getText() +"\n"+ Tahun.getText()+"\n" + Deskripsi.getText();
            intent1.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(intent1, "Bagikan Pesan Melalui..."));
        });
    }
}