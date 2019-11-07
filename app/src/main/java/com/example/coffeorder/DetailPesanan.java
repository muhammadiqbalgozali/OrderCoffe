package com.example.coffeorder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailPesanan extends AppCompatActivity {

    TextView tvdetailnamapesanan, tvdetailnomermeja, tvdetailnamamenu, tvdetailharga, tvdetailjumlahpesanan;
    Button btnback, btnkirim;

    Bundle datake2;

    String Nama_pemesanan, Nomer_meja, Nama_menu, Jumlah_pesanan, Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("DETAIL PESANAN");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        setContentView(R.layout.activity_detail_pesanan);

        tvdetailnamapesanan = findViewById(R.id.tv_detailnamapemesan);
        tvdetailnomermeja = findViewById(R.id.tv_detailnomermeja);
        tvdetailnamamenu = findViewById(R.id.tv_detailnamamenu);
        tvdetailharga = findViewById(R.id.tv_detailharga);
        tvdetailjumlahpesanan = findViewById(R.id.tv_detailjumlahpesanan);

        btnback = findViewById(R.id.btn_back);
        btnkirim = findViewById(R.id.btn_kirim);

        datake2 = getIntent().getExtras();
        Nama_pemesanan = datake2.getString("nama_pemesanan");
        Nomer_meja = datake2.getString("nomer_meja");
        Nama_menu = datake2.getString("nama_menu");
        Jumlah_pesanan = datake2.getString("jumlah_pesanan");
        Total = datake2.getString("total");

        tvdetailnamapesanan.setText(Nama_pemesanan);
        tvdetailnomermeja.setText(Nomer_meja);
        tvdetailnamamenu.setText(Nama_menu);
        tvdetailharga.setText(Total);
        tvdetailjumlahpesanan.setText(Jumlah_pesanan);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bck = new Intent(DetailPesanan.this, PilihanMenu.class);
                startActivity(bck);
            }
        });
        btnkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent feedbackIntent = new Intent(Intent.ACTION_SEND, Uri.parse("malito : "));
                feedbackIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"miqbalgozali@gmail.com"});
                feedbackIntent.putExtra(Intent.EXTRA_SUBJECT, "E-Order Caffe");
                feedbackIntent.putExtra(Intent.EXTRA_TEXT, (
                        "\nPembeli : " + tvdetailnamapesanan.getText().toString() +

                                "\n\nNomor Meja :" + tvdetailnomermeja.getText().toString() +
                                "\nNama Menu :" + tvdetailnamamenu.getText().toString() +
                                "\nJumlah Pesanan Anda :" + tvdetailjumlahpesanan.getText().toString() +
                                "\nTotal Biaya Adalah : Rp. " + tvdetailharga.getText().toString() + " ,-\n\n" +
                                "Terima kasih telah memesan, orderan anda akan tiba."));

                feedbackIntent.setType("plain/text");

                startActivity(feedbackIntent);


            }
        });

    }
}
