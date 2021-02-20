package com.baust.baustquestionbank.departments.cse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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

import com.baust.baustquestionbank.OnlinePdfView;
import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.Sheet;

public class L1_T2_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {
    String year = "";
    LinearLayout DM, SPL, EDC, Mathii, Chemistry,objectoriented,eenglish;
    ImageView DMd, SPLd, EDCd, Mathiid, Chemistryd;

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
        this.setTitle("Level-1 Term II Questions");
        setContentView(R.layout.activity_l1__t2__questions);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        DM = findViewById(R.id.dmid);
        DMd = findViewById(R.id.dmdownload);
        SPL = findViewById(R.id.splid);
        SPLd = findViewById(R.id.spldownload);
        EDC = findViewById(R.id.edcid);
        EDCd = findViewById(R.id.edcdownload);
        Mathii = findViewById(R.id.mathiiid);
        Mathiid = findViewById(R.id.mathiidownload);
        Chemistry = findViewById(R.id.chemistryid);
        objectoriented=findViewById(R.id.objectoriented);
        eenglish=findViewById(R.id.eenglish);

        DM.setOnClickListener(this);
        DMd.setOnClickListener(this);
        SPL.setOnClickListener(this);
        SPLd.setOnClickListener(this);
        EDC.setOnClickListener(this);
        EDCd.setOnClickListener(this);
        Mathii.setOnClickListener(this);
        Mathiid.setOnClickListener(this);
        Chemistry.setOnClickListener(this);
        objectoriented.setOnClickListener(this);
        eenglish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        globalView = view;
        if (year.equals("Fall -2017")) {
            downloadQuestions(view, "Fall -2017");
            examyear = "Fall -2017";
        }
        if (year.equals("Spring -2017")) {
            downloadQuestions(view, "Spring -2017");
            examyear = "Spring -2017";

        }
        if (year.equals("Fall -2018")) {
            downloadQuestions(view, "Fall -2018");
            examyear = "Fall -2018";
        }
        if (year.equals("Spring -2018")) {
            downloadQuestions(view, "Fall -2018");
            examyear = "Spring -2018";
        }
        if (year.equals("Fall -2019")) {
            downloadQuestions(view, "Fall -2019");
            examyear = "Fall -2019";
        }
        if (year.equals("Spring -2019")) {

            downloadQuestions(view, "Spring -2019");
            examyear = "Spring -2019";
        }
        if (year.equals("Summer -2020")) {

            downloadQuestions(view, "Summer -2020");
            examyear = "Summer -2020";
        }


    }

    private void downloadQuestions(View view, String Y) {

        if (view.getId() == R.id.dmid) {

            String pdfName = Y + "cse_dm";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }

        if (view.getId() == R.id.splid) {
            String pdfName = Y + "cse_spl";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }

        if (view.getId() == R.id.edcid) {
            String pdfName = Y + "cse_edc";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }

        if (view.getId() == R.id.mathiiid) {
            String pdfName = Y + "cse_mathii";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }

        if (view.getId() == R.id.chemistryid) {
            String pdfName = Y + "cse_chemistry";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }
        if (view.getId() == R.id.eenglish) {
            String pdfName = Y + "cse_english2";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }

        if (view.getId() == R.id.objectoriented) {
            String pdfName = Y + "cse_objectoriented";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }

        }


    }


    @Override
    public void offlineRead(boolean flag) {

        if (examyear.equals("Fall -2017")) {

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }

        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }
        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear + "cse_dm";

                String link = "https://drive.google.com/uc?export=download&id=154zwp_-EC0-2B1wzRN1kkHtSeRcnxJGB";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.splid) {
                String pdfName = matchYear + "cse_spl";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.edcid) {
                String pdfName = matchYear + "cse_edc";
                String link = "https://drive.google.com/uc?export=download&id=155fqVQhhxak78bdB6RMw8cdGgGoRJvOh";
                downloadPdfFile(link, pdfName);


            }
            if (globalView.getId() == R.id.eenglish) {
                String pdfName = matchYear + "cse_english2";
                String link = "https://drive.google.com/uc?export=download&id=1572khd124pta2CGRRdl7dGdKeXYL3hkS";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.mathiiid) {
                String pdfName = matchYear + "cse_mathii";
                String link = "https://drive.google.com/uc?export=download&id=158kNyVgpfzTxJ0hdJ1__SlbiQ91u9689";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String pdfName = matchYear + "cse_chemistry";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.objectoriented) {
                String pdfName = matchYear + "cse_objectoriented";
                String link = "https://drive.google.com/uc?export=download&id=154doRVyGy_4aVbLKlQwvI2H7FqKM3ey-";
                downloadPdfFile(link, pdfName);

            }


        }

    }

    @Override
    public void onlineRead(boolean flag) {

        if (examyear.equals("Fall -2017")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }
        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }
        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }
        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.dmid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }
        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.dmid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

        }

        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/154zwp_-EC0-2B1wzRN1kkHtSeRcnxJGB/view?usp=sharing";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

            if (globalView.getId() == R.id.splid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.edcid) {
                String link = "https://drive.google.com/file/d/155fqVQhhxak78bdB6RMw8cdGgGoRJvOh/view?usp=sharing";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.mathiiid) {
                String link = "https://drive.google.com/file/d/158kNyVgpfzTxJ0hdJ1__SlbiQ91u9689/view?usp=sharing";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.chemistryid) {
                String link = "";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.eenglish) {
                String link = "https://drive.google.com/file/d/1572khd124pta2CGRRdl7dGdKeXYL3hkS/view?usp=sharing";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);

            }
            if (globalView.getId() == R.id.objectoriented) {

                String link = "https://drive.google.com/file/d/154doRVyGy_4aVbLKlQwvI2H7FqKM3ey-/view?usp=sharing";
                checkAndOpenPdfFromOnline(L1_T2_Questions.this, link);
            }

        }

    }

    //.......................................................
    private void downloadPdfFile(String link, String pdfName) {
        if (file.notDownload(pdfName)) {
            download(link, pdfName);
        } else {
            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
    }

    //online load
    private void checkAndOpenPdfFromOnline(Context context, String link) {
        if (link.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Question is not available", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(context, OnlinePdfView.class);
            intent.putExtra("pdflink", link);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

        }
    }

    //for download a pdf...
    public void download(String url, String pdfName) {

        if (url.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Question is not available", Toast.LENGTH_SHORT).show();
        } else {
            try {
                if (isNetworkAvailable()) {
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
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
                } else {
                    Toast.makeText(getApplicationContext(), "No internet connection!", Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Can't download this pdf!", Toast.LENGTH_SHORT).show();
            }
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
