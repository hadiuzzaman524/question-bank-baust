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

public class L3_T2_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {
    String year = "";

    private LinearLayout Compiler, OS, CN, MACS, EEA;
    private ImageView Compilerd, OSd, CNd, MACSd, EEAd;
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
        setContentView(R.layout.activity_l3__t2__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        Compiler = findViewById(R.id.compilerid);
        OS = findViewById(R.id.osid);
        CN = findViewById(R.id.cnid);
        MACS = findViewById(R.id.macsid);
        EEA = findViewById(R.id.eeaid);

        Compilerd = findViewById(R.id.compilerdownload);
        OSd = findViewById(R.id.osdownload);
        CNd = findViewById(R.id.cndownload);
        MACSd = findViewById(R.id.macsdownload);
        EEAd = findViewById(R.id.eeadownload);

        Compiler.setOnClickListener(this);
        Compilerd.setOnClickListener(this);
        OS.setOnClickListener(this);
        OSd.setOnClickListener(this);
        CN.setOnClickListener(this);
        CNd.setOnClickListener(this);
        MACS.setOnClickListener(this);
        MACSd.setOnClickListener(this);
        EEA.setOnClickListener(this);
        EEAd.setOnClickListener(this);


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

        if (view.getId() == R.id.compilerid) {
            String pdfName = Y + "cse_compiler";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.osid) {
            String pdfName = Y + "cse_os";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.cnid) {
            String pdfName = Y + "cse_cn";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.macsid) {
            String pdfName = Y + "cse_macs";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }


        if (view.getId() == R.id.eeaid) {
            String pdfName = Y + "cse_eea";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";
                String link = "";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";
                String link = "https://drive.google.com/uc?export=download&id=1ln3KQK53VAXrVf5XtHnmm23_3ICtIUx8";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";

                String link = "https://drive.google.com/uc?export=download&id=1FuDeoFZQADAUXQ9KSS2qpcfOU4zDnrgI";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "https://drive.google.com/uc?export=download&id=1_s43cUBaJeuvtEX38wB322U84vXCfYwZ";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "https://drive.google.com/uc?export=download&id=1b8P6H_b-aSNAc1ipmkrd1RnsvXyM0dJ3";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "https://drive.google.com/uc?export=download&id=1ti02pguuacrrz0m-AUvw1GQnRLUpQThn";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "os";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "";
                downloadPdfFile(link, pdfName);
            }
        }
        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";

                String link = "https://drive.google.com/uc?export=download&id=1bZ_dZsLoF0RNLAiNmOg6aRpTp7TAy0Ot";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";

                String link = "https://drive.google.com/uc?export=download&id=1KiVenHV5fsO3Fjw_tgpC_CI-NXyhk_RF";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "https://drive.google.com/uc?export=download&id=1wL7XHFSNrtNhxAWfmjceJWbtXb7JjMu1";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "https://drive.google.com/uc?export=download&id=1k2n5XAm8qRbktmmn13vL9h7r0FOOlHo8";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "https://drive.google.com/uc?export=download&id=1Vby5gJAhxdyAZwbMCZ-ZB6-now0wdyhn";
                downloadPdfFile(link, pdfName);
            }
        }


        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.compilerid) {

                String pdfName = matchYear + "cse_compiler";

                String link = "https://drive.google.com/uc?export=download&id=1Wj8nwdAFJwDL65IxSGxnTi2jAFM_ejiI";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.osid) {
                String pdfName = matchYear + "cse_os";

                String link = "https://drive.google.com/uc?export=download&id=1wrYEraKn2t2h18LnBX8PYd_eC1XeUo46";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.cnid) {
                String pdfName = matchYear + "cse_cn";
                String link = "https://drive.google.com/uc?export=download&id=1Yt8xASqiF_2YPLvL2uLlZVYrmJ8G2iOB";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.macsid) {
                String pdfName = matchYear + "cse_macs";
                String link = "https://drive.google.com/uc?export=download&id=10aTHL7WcHHGdDUy94jTOc0ya0Fgd5ZwL";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.eeaid) {
                String pdfName = matchYear + "cse_eea";
                String link = "https://drive.google.com/uc?export=download&id=1-aBf8_on5MR4N-GrhapaO_eeZ-MLE4H4";
                downloadPdfFile(link, pdfName);

            }

        }


    }

    @Override
    public void onlineRead(boolean flag) {


        if (examyear.equals("Fall -2017")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.cnid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.osid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "https://drive.google.com/file/d/1ln3KQK53VAXrVf5XtHnmm23_3ICtIUx8/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "https://drive.google.com/file/d/1FuDeoFZQADAUXQ9KSS2qpcfOU4zDnrgI/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "https://drive.google.com/file/d/1_s43cUBaJeuvtEX38wB322U84vXCfYwZ/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "https://drive.google.com/file/d/1b8P6H_b-aSNAc1ipmkrd1RnsvXyM0dJ3/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "https://drive.google.com/file/d/1ti02pguuacrrz0m-AUvw1GQnRLUpQThn/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "https://drive.google.com/file/d/1bZ_dZsLoF0RNLAiNmOg6aRpTp7TAy0Ot/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "https://drive.google.com/file/d/1KiVenHV5fsO3Fjw_tgpC_CI-NXyhk_RF/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "https://drive.google.com/file/d/1wL7XHFSNrtNhxAWfmjceJWbtXb7JjMu1/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "https://drive.google.com/file/d/1k2n5XAm8qRbktmmn13vL9h7r0FOOlHo8/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "https://drive.google.com/file/d/1Vby5gJAhxdyAZwbMCZ-ZB6-now0wdyhn/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

        }

        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.compilerid) {

                String link = "https://drive.google.com/file/d/1Wj8nwdAFJwDL65IxSGxnTi2jAFM_ejiI/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.osid) {
                String link = "https://drive.google.com/file/d/1wrYEraKn2t2h18LnBX8PYd_eC1XeUo46/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.cnid) {
                String link = "https://drive.google.com/file/d/1Yt8xASqiF_2YPLvL2uLlZVYrmJ8G2iOB/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.macsid) {
                String link = "https://drive.google.com/file/d/10aTHL7WcHHGdDUy94jTOc0ya0Fgd5ZwL/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.eeaid) {
                String link = "https://drive.google.com/file/d/1-aBf8_on5MR4N-GrhapaO_eeZ-MLE4H4/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T2_Questions.this, link);

            }

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

    private void downloadPdfFile(String link, String pdfName) {
        if (file.notDownload(pdfName)) {
            download(link, pdfName);
        } else {
            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
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
