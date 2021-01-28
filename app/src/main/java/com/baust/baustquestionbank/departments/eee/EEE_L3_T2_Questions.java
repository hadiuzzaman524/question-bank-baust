package com.baust.baustquestionbank.departments.eee;

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

public class EEE_L3_T2_Questions extends AppCompatActivity implements View.OnClickListener,Sheet.ReadMethod{
    LinearLayout me3293,eee3203,eee3207,eee3213,eee3200;
    ImageView me3293d,eee3203d,eee3207d,eee3213d,eee3200d;
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
        this.setTitle("Level-3 Term II Questions");
        setContentView(R.layout.activity_e_e_e__l3__t2__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");

        }
    }

    private void findAndOnClickSet() {
        me3293 = findViewById(R.id.ME3293id);
        me3293d = findViewById(R.id.ME3293download);
        eee3203= findViewById(R.id.EEE3203id);
        eee3203d = findViewById(R.id.EEE3203download);
        eee3207= findViewById(R.id.EEE3207id);
        eee3207d= findViewById(R.id.EEE3207download);
        eee3213 = findViewById(R.id.EEE3213id);
        eee3213d = findViewById(R.id.EEE3213download);
        eee3200= findViewById(R.id.EEE3200id);
        eee3200d = findViewById(R.id.EEE3200download);


        me3293.setOnClickListener(this);
        me3293d.setOnClickListener(this);
        eee3203.setOnClickListener(this);
        eee3203d.setOnClickListener(this);
        eee3207.setOnClickListener(this);
        eee3207d.setOnClickListener(this);
        eee3213.setOnClickListener(this);
        eee3213d.setOnClickListener(this);
        eee3200.setOnClickListener(this);
        eee3200d.setOnClickListener(this);

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

        if (view.getId()==R.id.ME3293id)
        {
            String pdfName = Y+"eee_ME3293";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.EEE3203id)
        {
            String pdfName = Y+"eee_EEE3203";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.EEE3207id)
        {
            String pdfName = Y+"eee_EEE3207";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.EEE3213id)
        {
            String pdfName = Y+"eee_EEE3213";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }


        if (view.getId()==R.id.EEE3200id)
        {
            String pdfName = Y+"eee_EEE3200";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(EEE_L3_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String pdfName = matchYear+"eee_ME3293";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String pdfName = matchYear+"eee_EEE3203";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String pdfName = matchYear+"eee_EEE3207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String pdfName = matchYear+"eee_EEE3213";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String pdfName = matchYear+"eee_EEE3200";
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

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.ME3293id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.EEE3203id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3207id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.EEE3213id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.EEE3200id)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(EEE_L3_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
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




