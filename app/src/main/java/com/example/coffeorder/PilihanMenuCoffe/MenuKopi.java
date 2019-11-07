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

public class MenuKopi extends AppCompatActivity {
    ListView lvkopi;

            String[] listviewkopi = new String[]{"Espresso - Rp18000","Americano - Rp22000","Picollo - Rp25000",
            "Single Original - Rp25000", "Cappucino - Rp26000", "Cafe Latte - Rp25000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("MENU KOPI");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        setContentView(R.layout.activity_menu_kopi);

        lvkopi = findViewById(R.id.lv_menukopi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listviewkopi);
        lvkopi.setAdapter(adapter);

        lvkopi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent datamenu = new Intent(MenuKopi.this, DataMenu.class);
                datamenu.putExtra("data",listviewkopi[i].toString());
                startActivity(datamenu);
            }
        });


    }
}
