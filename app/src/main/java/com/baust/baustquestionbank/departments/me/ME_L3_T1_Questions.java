package com.baust.baustquestionbank.departments.me;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.baust.baustquestionbank.OnlinePdfView;
import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.Sheet;

public class ME_L3_T1_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod{
    LinearLayout me3101,me3105,me3107,me3111,me3113;
    ImageView me3101d,me3105d,me3107d,me3111d,me3113d;
    String year = "";
    View globalView;
    String examyear = "";
    OpenPdf file = new OpenPdf();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-3 Term I Questions");
        setContentView(R.layout.activity_m_e__l3__t1__questions);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }

    }

    private void findAndOnClickSet() {

        me3101= findViewById(R.id.ME3101id);
        me3101d = findViewById(R.id.ME3101download);
        me3105= findViewById(R.id.ME3105id);
        me3105d = findViewById(R.id.ME3105download);
        me3107 = findViewById(R.id.ME3107id);
        me3107d= findViewById(R.id.ME3107download);
        me3111= findViewById(R.id.ME3111id);
        me3111d= findViewById(R.id.ME3111download);
        me3113= findViewById(R.id.ME3113id);
        me3113d= findViewById(R.id.ME3113download);


        me3101.setOnClickListener(this);
        me3101d.setOnClickListener(this);
        me3105.setOnClickListener(this);
        me3105d.setOnClickListener(this);
        me3107.setOnClickListener(this);
        me3107d.setOnClickListener(this);
        me3111.setOnClickListener(this);
        me3111d.setOnClickListener(this);
        me3113.setOnClickListener(this);
        me3113d.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        globalView=view;
        if (year.equals("Fall -2017")) {
            downloadQuestions(view,"Fall -2017");
            examyear="Fall -2017";
        }
        if (year.equals("Spring -2017")) {
            downloadQuestions(view,"Spring -2017");
            examyear="Spring -2017";

        }
        if (year.equals("Fall -2018")) {
            downloadQuestions(view,"Fall -2018");
            examyear="Fall -2018";
        }
        if (year.equals("Spring -2018")) {
            downloadQuestions(view,"Fall -2018");
            examyear="Spring -2018";
        }
        if (year.equals("Fall -2019")) {
            downloadQuestions(view,"Fall -2019");
            examyear="Fall -2019";
        }
        if (year.equals("Spring -2019")) {

            downloadQuestions(view,"Spring -2019");
            examyear="Spring -2019";
        }
        if (year.equals("Summer -2020")) {

            downloadQuestions(view,"Summer -2020");
            examyear="Summer -2020";
        }

    }


    private void downloadQuestions(View view,String Y){

        if (view.getId()==R.id.ME3101id)
        {
            String pdfName = Y+"me_ME3101";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ME_L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.ME3105id)
        {
            String pdfName = Y+"me_ME3105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ME_L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.ME3107id)
        {
            String pdfName = Y+"me_ME3107";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ME_L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.ME3111id)
        {
            String pdfName = Y+"me_ME3111";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ME_L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }


        if (view.getId()==R.id.ME3113id)
        {
            String pdfName = Y+"me_ME3113";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ME_L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

    }
    @Override
    public void offlineRead(boolean flag) {
        if (examyear.equals("Fall -2017")) {

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.ME3101id) {

                String pdfName = matchYear + "me_ME3103";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3105id) {
                String pdfName = matchYear + "me_ME3105";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3107id) {
                String pdfName = matchYear + "me_ME3107";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME3111id) {
                String pdfName = matchYear + "me_ME3111";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME3113id) {
                String pdfName = matchYear + "me_ME3113";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

        }
    }
        @Override
        public void onlineRead(boolean flag) {
            if (examyear.equals("Fall -2017")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Spring -2017")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Fall -2018")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Spring -2018")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Fall -2019")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Spring -2019")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
            if (examyear.equals("Summer -2020")) {

                if (globalView.getId() == R.id.ME3101id) {

                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

                if (globalView.getId() == R.id.ME3105id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3107id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);


                }

                if (globalView.getId() == R.id.ME3111id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

                if (globalView.getId() == R.id.ME3113id) {
                    String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                    Intent intent = new Intent(ME_L3_T1_Questions.this, OnlinePdfView.class);
                    intent.putExtra("pdflink", link);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
        }


    //for download a pdf...
    public void download(String url, String pdfName) {

        try {

            if (isNetworkAvailable()) {
                DownloadManager downloadmanager;
                Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        .mkdirs();
                downloadmanager = (DownloadManager) getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse(url);
                DownloadManager.Request request = new DownloadManager.Request(uri)
                        .setTitle("Downloading")
                        .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
                                pdfName + ".pdf")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadmanager.enqueue(request);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"No internet connection!",Toast.LENGTH_LONG).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Can't download this pdf!",Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
