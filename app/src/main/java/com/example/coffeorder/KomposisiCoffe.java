package com.example.coffeorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KomposisiCoffe extends AppCompatActivity {
    private WebView view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("KOMPOSISI KOPI");
        getSupportActionBar().setSubtitle("Kopi Kolenel 404");
        setContentView(R.layout.activity_komposisi_coffe);

        view = findViewById(R.id.webv_komposisi);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new MyBrowser());
        view.loadUrl("https://www.sasamecoffee.com/kopipedia/jenis-jenis-minuman-kopi/");
    }


    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String Url) {
            view.loadUrl(Url);
            return true;
        }
    }
}
