package com.example.coffeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnpilihmenu,btnketerangan,btnabout,btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("DASHBOARD");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        setContentView(R.layout.activity_main);
        btnpilihmenu = findViewById(R.id.IBtn_PilihMenu);
        btnketerangan = findViewById(R.id.IBtn_ketcoffe);
        btnabout = findViewById(R.id.IBtn_about);
        btnexit = findViewById(R.id.IBtn_exit);

//        deklarasi

        btnpilihmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startpilihmenu = new Intent(MainActivity.this, PilihanMenu.class);
                startActivity(startpilihmenu);
            }
        });
        btnketerangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startkomposisicoffe = new Intent(MainActivity.this,KomposisiCoffe.class);
                startActivity(startkomposisicoffe);
            }
        });
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startabout = new Intent(MainActivity.this,About.class);
                startActivity(startabout);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
    }
}
