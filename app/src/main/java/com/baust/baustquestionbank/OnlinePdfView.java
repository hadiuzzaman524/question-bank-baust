package com.baust.baustquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class OnlinePdfView extends AppCompatActivity {

    private WebView webView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));


        try {
            setContentView(R.layout.activity_online_pdf_view);


            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.setTitle("Question Paper");


            webView = findViewById(R.id.webviewid);
            progressBar = findViewById(R.id.progress_pdf_id);

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() {
                                         @Override
                                         public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                             super.onPageStarted(view, url, favicon);
                                             progressBar.setVisibility(View.VISIBLE);
                                             // setTitle("Loading...");
                                         }

                                         @Override
                                         public void onPageFinished(WebView view, String url) {
                                             super.onPageFinished(view, url);
                                             progressBar.setVisibility(View.GONE);
                                             // setTitle(view.getTitle());
                                         }
                                     }
            );

//new
            if (savedInstanceState == null) {
                webView.post(new Runnable() {
                    @Override
                    public void run() {

                        if (isNetworkAvailable()) {
                            loadwebsite();//old

                        } else {
                            progressBar.setVisibility(View.GONE);
                            show();
                            // Toast.makeText(getApplicationContext(),"No internet connection",Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }//


        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "Not open in your device", Toast.LENGTH_LONG).show();
            finish();
        }


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void show() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialogbox);
        Button button = dialog.findViewById(R.id.bid);
        dialog.setCancelable(false);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
                //Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
            }
        });
        dialog.show();

    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    private void loadwebsite() {

        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String value = bundle.getString("pdflink");
            webView.loadUrl(value);
        }
    }



}