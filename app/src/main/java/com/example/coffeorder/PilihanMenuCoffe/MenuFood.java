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

public class MenuFood extends AppCompatActivity {
    ListView lvfood;
    String[] listviewfood = new String[]{"Nasi Goreng 404 - Rp30000","Nasi Goreng Kambing 404 - Rp38000",
            "Chicken Katsu Curry - Rp38000", "Chicken Katsu Sambal Matah - Rp35000",
            "Chicken Mushroom - Rp38000", "Beef Burger 404 - Rp45000","Kentang Goreng Beneran - Rp20000",
            "Pisang Goreng - Rp20000", "Pangsit Goreng - Rp25000", "Pallter Combo - Rp28000","Chicken Burrito - Rp33000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_food);
        getSupportActionBar().setTitle("MENU FOOD");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");

        lvfood = findViewById(R.id.lv_menufood);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listviewfood);
        lvfood.setAdapter(adapter);

lvfood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent datamenu = new Intent(MenuFood.this, DataMenu.class);
        datamenu.putExtra("data",listviewfood[i].toString());
        startActivity(datamenu);
    }
});
    }
}
