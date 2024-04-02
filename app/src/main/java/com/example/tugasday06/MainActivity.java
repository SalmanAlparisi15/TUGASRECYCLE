package com.example.tugasday06;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getData();

        recyclerView = findViewById(R.id.recycleView);
        adapter = new Adapter(models,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        models = new ArrayList<>();
        models.add(new Model("CHASE ATLANTIC","Asal : Cairns, Queensland, Australia","Genre : R&B, pop rock, synthpop, new wave, alternative pop, alternative hip hop","Tahun Dibuat : 2014","Tentang : Chase Atlantic adalah grup musik alternatif pop dari Australia yang dibentuk pada tahun 2014. Grup ini terdiri dari tiga anggota, yaitu Mitchel Cave (vokal utama dan programming), Christian Anthony (gitar rhythm, vokal lirik, dan programming), dan Clinton Cave (produksi, gitar lead, saxofon tenor, dan vokal bak), serta dua anggota touring, Patrick Wilde (gitar dan bass) dan Jesse Boyle (bass dan drum)",R.drawable.chaseatlantic));
        models.add(new Model("REALESTK","Asal : Toronto, Kanada","Genre : R&B","Tahun Dibuat : 2004","RealestK adalah musisi yang dikenal dengan nama realitas, lahir pada 5 Juni 2004 di Toronto, Kanada. RealestK merupakan musisi R&B yang terkenal dari Canada. Dia memulai kariernya pada tahun 2021 dengan singlenya WFM, yang mencapai posisi 67 pada Billboard Hot 100. ",R.drawable.realestk__1_));
        models.add(new Model("ARTIC MONKEYS","Asal : Sheffield, Inggris","Genre : Rock","Tahun Dibuat : 2002","Arctic Monkeys adalah grup musik rock alternatif dari Inggris, yang dibentuk pada tahun 2002. Grup ini terdiri dari Alex Turner (vokal, guitar), Jamie Cook (guitar), Matt Helders (drum), dan Andy Nicholson (bass) sebelumnya, dan sekarang terdiri dari Alex Turner, Jamie Cook, Matt Helders, dan Nick O'Malley (bass) Arctic Monkeys telah memiliki tujuh album studio, lima EP, dua album video, dua album musik video, dan 23 single",R.drawable.articmonkeys));
        models.add(new Model("TAME IMPALA","Asal : Perth, Western Australia, Australia","Genre : psychedelic rock, indie rock","Tahun Dibuat : 2007","Tame Impala adalah projek musik psychedelic rock yang dikelola oleh multi-instrumentalist Australian Kevin Parker. Projek ini dibentuk pada tahun 2007 di Perth, Australia. Tame Impala mulai memulai kariernya dengan menghasilkan single Desire Be Desire Go (original version) pada 1 Januari 2008 Projek ini dibentuk sebagai home-recording project oleh Parker, yang menyebarkan track-tracknya di Myspace, yang menghasilkan bantuan dari beberapa label",R.drawable.tameimpala));
        models.add(new Model("DJO","Asal : Toronto, Kanada","Genre : hip-hop","Tahun Dibuat : 2010","Djo dikenal karena gaya musiknya yang eksperimental, yang sering menggabungkan berbagai genre musik seperti elektronik, indie, dan elemen etnik Indonesia",R.drawable.djo));
        models.add(new Model("TRAVIS SCOTT","Asal : Houston, Texas, Amerika Serikat","Genre : hip-hop","Tahun Lahir : 1991","Travis Scott adalah rapper, penulis dan produser musik Amerika Serikat, lahir pada 30 April 1991. Travis Scott mengumpulkan popularitas dengan album,Birds in the Trap Sing McKnight pada tahun 2016, yang mencapai posisi pertama pada Billboard 200. Dia memiliki stil performance yang rancu dan konser gratis yang mengumpulkan banyak pengunjung. Travis Scott juga mendapat perhatian karena kemampiannya dalam menciptakan musik yang menarik dan mengembangkan kreativitas",R.drawable.traviscott));
        models.add(new Model("THE WEEKND","Asal : Toronto, Kanada","Genre : R&B","Tahun Dibuat : 2010","The Weeknd, nama penuhnya Abel Tesfaye, adalah musisi kanada yang dikenal dengan nama realitas. The Weeknd dibentuk pada tahun 2010 dan memulai kariernya dengan mengumpulkan kritik dan popularitas dengan single House of Balloons pada tahun 2011.The Weeknd adalah musisi yang berasal dari Toronto, Ontario, Kanada. The Weeknd dikenal dengan stil musiknya yang berasal dari R&B, hip-hop, dan elektronik.The Weeknd telah mengeluarkan berbagai album, mulai dari House of Balloons pada tahun 2011 hingga Dawn FM pada tahun 2022",R.drawable.theweeknd));
        models.add(new Model("JUSTIN BIEBER","Asal : London, Ontario, Kanada","Genre : pop, R&B","Tahun Dibuat : 2008","Justin Bieber adalah musisi pop yang dikenal dengan nama realitas. Bieber dibentuk pada tahun 2008 di London, Ontario, Kanada. Dia memulai kariernya dengan membuat video-video yang dikirim ke website YouTube, yang akhirnya menarik perhatian dari manajer dan produsen musik.Bieber memiliki beberapa album, mulai dari My World 2.0 pada tahun 2010 hingga Purpose pada tahun 2015",R.drawable.justinbieber));
        models.add(new Model("DRAKE","Asal : Toronto, Kanada","Genre : hip-hop, R&B","Tahun Dibuat : 2001","Drake adalah musisi hip-hop dan R&B yang dikenal dengan nama realitas. Drake dibentuk pada tahun 2001 di Toronto, Ontario, Kanada. Dia memulai kariernya dengan menghasilkan mixtape-mixtape yang mendapat popularitas di internet. Drake memiliki beberapa album, mulai dari Thank Me Later pada tahun 2010 hingga Certified Lover Boy pada tahun 2021. Drake juga bekerja dengan beberapa artis populer, seperti Lil Wayne, Beyoncé, Nicki Minaj, Rihanna, Kanye West, Jay-Z, Chris Brown, Ed Sheeran, Ariana Grande, Travis Scott, dan The Weeknd",R.drawable.drake));
        models.add(new Model("USHER","Asal : Dallas, Georgia, Amerika Serikat","Genre : pop, R&B","Tahun Dibuat : 1994","Usher terdiri dari tiga kata, yaitu U (untuk Ushers), S (untuk Raymond), dan H (untuk Herbert). Usher Raymond IV, dikenal sebagai Usher, adalah musisi R&B yang dikenal dengan nama realitas. Usher dibentuk pada tahun 1994 di Dallas, Texas. Usher memiliki beberapa album, mulai dari Usher pada tahun 1994 hingga Confessions pada tahun 2004",R.drawable.usher));
        models.add(new Model("BRUNO MARS","Asal : Honolulu, Hawaii, Amerika Serikat","Genre : R&B, pop, soul","Tahun Dibuat : 2009","Bruno Mars adalah musisi pop yang dikenal dengan nama realitas. Dia lahir pada 8 Oktober 1985 di Honolulu, Hawaii, dan berumur 5'5. Mars memulai kariernya di Los Angeles pada usia 17 tahun. Dia memiliki album debut, Doo-Wops & Hooligans, yang diterbitkan pada Oktober 2010 dan mencapai posisi tiga pada Billboard 200. Lead single dari album tersebut, Just the Way You Are, mencapai posisi satu pada Hot 100.",R.drawable.brunomars));
        models.add(new Model("KANYE WEST","Asal : Chicago, Illinois, Amerika Serikat","Genre : hip-hop, R&B","Tahun Dibuat : 2004","Kanye West dibentuk pada tanggal 8 Juni 1977 di Atlanta, Georgia, Amerika Serikat. West merupakan musisi rap, penulis, dan produser musik. Dia juga bekerja sebagai desainer mode. West telah menerima banyak penghargaan, termasuk 24 Grammy Awards, yang membuatnya salah satu artis hip hop dengan penghargaan terbanyak. Dia juga menjadi salah satu dari 100 orang terbaik yang bekerja di industri musik sebagai penulis lirik. West telah bekerja dengan beberapa artis populer, seperti Jay-Z, Kid Cudi, Ty Dolla Sign, Pusha T, Teyana Taylor, Nas, dan lebih lanjut",R.drawable.kanye));
        models.add(new Model("POST MALONE","Asal : Syracuse, New York, Amerika Serikat","Genre : hip-hop, R&B","Tahun Dibuat : 2013","Post Malone adalah seorang rapper, penyanyi, dan penulis lagu asal Amerika Serikat. Dia dikenal karena gaya musiknya yang mencakup berbagai genre seperti hip-hop, R&B, dan rock. Lagu-lagu hitsnya termasuk Rockstar, Circles, dan Congratulations. Post Malone telah menjadi salah satu artis terlaris di dunia dengan album-albumnya yang sukses secara komersial.",R.drawable.postmalone));
        models.add(new Model("SKRILLEX","Asal : Los Angeles, California, Amerika Serikat","Genre : EDM","Tahun Dibuat : 2004","Skrillex adalah seorang DJ, produser musik, dan musisi elektronik asal Amerika Serikat. Dia dikenal karena kontribusinya dalam genre musik elektronik, terutama dubstep dan EDM. Skrillex telah merilis berbagai album dan singel yang sukses, dan diakui sebagai salah satu pionir dalam mengubah lanskap musik elektronik modern.",R.drawable.skrillex));
        models.add(new Model("AVICII","Asal : Stockholm, Sweden","Genre : EDM","Tahun Dibuat : Avicii adalah seorang DJ, produser musik, dan musisi elektronik asal Swedia. Dia dikenal karena lagu-lagu hitnya seperti \"Levels\", \"Wake Me Up\", dan \"Hey Brother\". Avicii menjadi salah satu DJ paling terkenal di dunia sebelum kematiannya pada tahun 2018. Karyanya telah memberi dampak besar pada genre musik dance dan EDM secara keseluruhan.","",R.drawable.avicii));
    }

}