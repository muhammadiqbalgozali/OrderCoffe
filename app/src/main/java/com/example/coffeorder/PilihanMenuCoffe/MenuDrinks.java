package com.example.coffeorder.PilihanMenuCoffe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.coffeorder.DataMenu;
import com.example.coffeorder.R;

public class MenuDrinks extends AppCompatActivity {
    ListView lvdrink;

    String[] listviewdrink = new String[]{"Chocolate - Rp29000", "Chocolate Caramel - Rp33000", "Avocado - Rp25000",
            "Manggo - Rp25000", "Tea - Rp15000", "Thai Tea - Rp25000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_drinks);
        getSupportActionBar().setTitle("MENU DRINKS");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        lvdrink = findViewById(R.id.lv_menudrink);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listviewdrink);
        lvdrink.setAdapter(adapter);
        lvdrink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent datamenu = new Intent(MenuDrinks.this, DataMenu.class);
                datamenu.putExtra("data", listviewdrink[i].toString());
                startActivity(datamenu);
            }
        });
    }
}
