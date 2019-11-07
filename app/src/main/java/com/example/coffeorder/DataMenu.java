package com.example.coffeorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataMenu extends AppCompatActivity {
TextView tvnamamenu,tvhargamenu;
EditText etnamapesanan, etnomeja, etjumlahpesanan;
Button btnpesanan;
Bundle dataExtra;
String tampil;

int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_menu);
        getSupportActionBar().setTitle("DATA MENU");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");

        tvnamamenu = findViewById(R.id.tv_namamenu);
        tvhargamenu = findViewById(R.id.tv_hargamenu);

        etnamapesanan = findViewById(R.id.et_namapemesan);
        etnomeja = findViewById(R.id.et_nomeja);
        etjumlahpesanan = findViewById(R.id.et_jumlahpesanan);

        btnpesanan = findViewById(R.id.btn_pesan);

        dataExtra = getIntent().getExtras();
        tampil = dataExtra.getString("data");

//        Menu Kopi

        if (tampil.equals("Espresso - Rp18000")) {
            tvnamamenu.setText("Espresso");
            tvhargamenu.setText("Rp 18.000");
            a = 18000;
        }

        else
        if (tampil.equals("Americano - Rp22000")) {
            tvnamamenu.setText("Americano");
            tvhargamenu.setText("Rp 22.000");
            a = 22000;
        }
        else
        if (tampil.equals("Picollo - Rp25000")) {
            tvnamamenu.setText("Picollo");
            tvhargamenu.setText("Rp 25.000");
            a = 25000;
        }
        else
        if (tampil.equals("Single Original - Rp25000")) {
            tvnamamenu.setText("Single Original");
            tvhargamenu.setText(" Rp 25.000");
            a = 25000;
        }
        else
        if (tampil.equals("Cappucino - Rp26000")) {
            tvnamamenu.setText("Cappucino");
            tvhargamenu.setText(" Rp 26.000");
            a = 26000;
        }
        else
        if (tampil.equals("Cafe Latte - Rp20000")) {
            tvnamamenu.setText("Cafe Latte");
            tvhargamenu.setText(" Rp 20.000");
            a = 20000;
        }

        //        food & snack
        else
        if (tampil.equals("Nasi Goreng 404 - Rp30000")) {
            tvnamamenu.setText("Nasi Goreng 404");
            tvhargamenu.setText("Rp 30.000");
            a = 30000;
        }
        else
        if (tampil.equals("Nasi Goreng Kambing 404 - Rp38000")) {
            tvnamamenu.setText("Nasi Goreng Kambing 404 ");
            tvhargamenu.setText("Rp 38.000");
            a = 28000;
        }
        else
        if (tampil.equals("Chicken Katsu Curry - Rp38000")) {
            tvnamamenu.setText("Chicken Katsu Curry");
            tvhargamenu.setText(" Rp 38.000");
            a = 38000;
        }
        else
        if (tampil.equals("Chicken Katsu Sambal Matah - Rp35000")) {
            tvnamamenu.setText("Chicken Katsu Sambal Matah");
            tvhargamenu.setText(" Rp 35.000");
            a = 35000;
        }
        else
        if (tampil.equals("Chicken Mushroom - Rp38000")) {
            tvnamamenu.setText("Chicken Mushroom");
            tvhargamenu.setText(" Rp 38.000");
            a = 38000;
        }
        else
        if (tampil.equals("Beef Burger 404 - Rp45000")) {
            tvnamamenu.setText("Beef Burger 404");
            tvhargamenu.setText("Rp 45.000");
            a = 45000;
        }
        else
        if (tampil.equals("Kentang Goreng Beneran - Rp20000")) {
            tvnamamenu.setText("Kentang Goreng Beneran");
            tvhargamenu.setText("Rp 20.000");
            a = 20000;
        }
        else
        if (tampil.equals("Pisang Goreng - Rp20000")) {
            tvnamamenu.setText("Pisang Goreng");
            tvhargamenu.setText(" Rp 20.000");
            a = 20000;
        }
        else
        if (tampil.equals("Pangsit Goreng - Rp25000")) {
            tvnamamenu.setText("Pangsit Goreng");
            tvhargamenu.setText(" Rp 25.000");
            a = 25000;
        }
        else
        if (tampil.equals("Pallter Combo - Rp28000")) {
            tvnamamenu.setText("Pallter Combo");
            tvhargamenu.setText(" Rp 28.000");
            a = 28000;
        }
        else
        if (tampil.equals("Chicken Burrito - Rp33000")) {
            tvnamamenu.setText("Chicken Burrito");
            tvhargamenu.setText(" Rp 33.000");
            a = 33000;
        }

//        menu Drinks

        else
        if (tampil.equals("Chocolate - Rp29000")) {
            tvnamamenu.setText("Chocolate");
            tvhargamenu.setText(" Rp 29.000");
            a = 29000;
        }
        else
        if (tampil.equals("Chocolate Caramel - Rp33000")) {
            tvnamamenu.setText("Chocolate Caramel");
            tvhargamenu.setText("Rp 33.000");
            a = 33000;
        }
        else
        if (tampil.equals("Avocado - Rp25000")) {
            tvnamamenu.setText("Avocado");
            tvhargamenu.setText("Rp 25.000");
            a = 25000;
        }
        else
        if (tampil.equals("Manggo - Rp25000")) {
            tvnamamenu.setText("Manggo");
            tvhargamenu.setText(" Rp 25.000");
            a = 25000;
        }
        else
        if (tampil.equals("Tea - Rp15000")) {
            tvnamamenu.setText("Tea");
            tvhargamenu.setText(" Rp 15.000");
            a = 15000;
        }

        else  {
            tvnamamenu.setText("Thai Tea");
            tvhargamenu.setText("Rp 35.000");
            a = 35000;
        }

        btnpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumlahpesanan = Integer.parseInt(etjumlahpesanan.getText().toString());

                final int JML = a * jumlahpesanan;

                Intent detail = new Intent(DataMenu.this,DetailPesanan.class);
                detail.putExtra("nama_pemesanan", etnamapesanan.getText().toString());
                detail.putExtra("nomer_meja", etnomeja.getText().toString());
                detail.putExtra("nama_menu", tvnamamenu.getText().toString());
                detail.putExtra("jumlah_pesanan",etjumlahpesanan.getText().toString());
                detail.putExtra("total", Integer.toString(JML));
                startActivity(detail);
            }
        });

    }
}
