package com.example.dede_s_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Dr. Sarde");
        fotoMahasiswa.add("https://statik.tempo.co/data/2019/01/28/id_815361/815361_720.jpg");
        infoMahasiswa.add("1.\tSelasa\t08.00 - 11.00\n" +
                "2.\tRabu\t08.00 - 11.00\n" +
                "3.\tKamis\t08.00 - 11.00\n" +
                "4.\tJumat\t08.00 - 11.00\n" +
                "5.\tSabtu\t08.00 - 11.00\n");
        kelasMahasiswa.add("Sepesialis Penyakit Dalam");

        namaMahasiswa.add("Dr. Nikolas");
        fotoMahasiswa.add("https://statik.tempo.co/data/2019/01/28/id_815361/815361_720.jpg");
        infoMahasiswa.add("1.\tSelasa\t08.00 - 11.00\n" +
                "2.\tRabu\t08.00 - 11.00\n" +
                "3.\tKamis\t08.00 - 11.00\n" +
                "4.\tJumat\t08.00 - 11.00\n" +
                "5.\tSabtu\t08.00 - 11.00\n");
        kelasMahasiswa.add("Spesialis Kelamin");

        namaMahasiswa.add("Dr. Bagus");
        fotoMahasiswa.add("https://statik.tempo.co/data/2019/01/28/id_815361/815361_720.jpg");
        infoMahasiswa.add("1.\tSelasa\t08.00 - 11.00\n" +
                "2.\tRabu\t08.00 - 11.00\n" +
                "3.\tKamis\t08.00 - 11.00\n" +
                "4.\tJumat\t08.00 - 11.00\n" +
                "5.\tSabtu\t08.00 - 11.00\n");
        kelasMahasiswa.add("Sepesialis Kelamin");




        prosesRecyclerViewAdapter();

    }
}