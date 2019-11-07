package com.example.coffeorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.coffeorder.PilihanMenuCoffe.MenuDrinks;
import com.example.coffeorder.PilihanMenuCoffe.MenuFood;
import com.example.coffeorder.PilihanMenuCoffe.MenuKopi;

public class PilihanMenu extends AppCompatActivity {

    ImageButton btnkopi, btnfood,btndrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("PILIH MENU");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        setContentView(R.layout.activity_pilihan_menu);

        btnkopi = findViewById(R.id.IBtn_kopi);
        btnfood = findViewById(R.id.IBtn_Food);
        btndrink = findViewById(R.id.IBtn_drink);

//        Deklarasi

        btnkopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kopi = new Intent(PilihanMenu.this, MenuKopi.class);
                startActivity(kopi);
            }
        });

        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(PilihanMenu.this, MenuFood.class);
                startActivity(food);
            }
        });
        btndrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drink = new Intent(PilihanMenu.this, MenuDrinks.class);
                startActivity(drink);
            }
        });
    }
}
