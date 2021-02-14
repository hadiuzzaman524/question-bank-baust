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

public class L3_T1_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {
    String year = "";
    private LinearLayout DMS, MAL, CA, CE, TC, SET;
    private ImageView DMSd, MALd, CAd, CEd, TCd, SETd;
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
        setContentView(R.layout.activity_l3__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        DMS = findViewById(R.id.dmsid);
        MAL = findViewById(R.id.malid);
        CA = findViewById(R.id.caid);
        CE = findViewById(R.id.ceid);
        TC = findViewById(R.id.tcid);
        SET = findViewById(R.id.setid);

        DMSd = findViewById(R.id.dmsdownload);
        MALd = findViewById(R.id.maldownload);
        CAd = findViewById(R.id.cadownload);
        CEd = findViewById(R.id.cedownload);
        TCd = findViewById(R.id.tcdownload);
        SETd = findViewById(R.id.setdownload);

        DMS.setOnClickListener(this);
        MAL.setOnClickListener(this);
        CA.setOnClickListener(this);
        CE.setOnClickListener(this);
        TC.setOnClickListener(this);
        SET.setOnClickListener(this);
        DMSd.setOnClickListener(this);
        MALd.setOnClickListener(this);
        CAd.setOnClickListener(this);
        CEd.setOnClickListener(this);
        TCd.setOnClickListener(this);
        SETd.setOnClickListener(this);
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

        if (view.getId() == R.id.dmsid) {
            String pdfName = Y + "cse_dms";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.malid) {
            String pdfName = Y + "cse_mal";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.caid) {
            String pdfName = Y + "cse_ca";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.ceid) {
            String pdfName = Y + "cse_ce";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }


        if (view.getId() == R.id.tcid) {
            String pdfName = Y + "cse_tc";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }
        if (view.getId() == R.id.setid) {
            String pdfName = Y + "cse_set";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L3_T1_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                // String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                String link = "https://drive.google.com/uc?export=download&id=1H7Wa0OPuTnRmLRJ8Un_X_2ywVZRmP5Y_";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "https://drive.google.com/uc?export=download&id=1lRN_9vFd-7tnwdQpgVPoiJ7E0E8mFn2t";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "https://drive.google.com/uc?export=download&id=1_U_2oP2QN-9CiMB6EVrQYWQo60J8dKgL";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "https://drive.google.com/uc?export=download&id=1Yuri3vfLk1RjHmacgvDx_bFOXPUkof-B";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "https://drive.google.com/uc?export=download&id=1wqo5ghSxGxg3nqcBA7DlS0R2Rdi9-0Yu";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "https://drive.google.com/uc?export=download&id=1Zsmbjlwg--F22z65j9Ekhdtx3sAymSXr";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }
        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";
                String link = "https://drive.google.com/uc?export=download&id=1EKfx7-q4VBbNnp5pyWkXZS-KBb35nE_F";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "https://drive.google.com/uc?export=download&id=14e2pVB_ib3J9IE76cpu-854_aNGY1c3Q";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "https://drive.google.com/uc?export=download&id=18KMUIiRYvqzTJZzcay9s7caOaAa59hS5";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "https://drive.google.com/uc?export=download&id=1bp4w3D_7O4mE3oCAkR4SxfqLaKQcxGzh";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "https://drive.google.com/uc?export=download&id=1idCaQTe4bnH7tJmoIY7xGskMvUBH0rtY";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "https://drive.google.com/uc?export=download&id=1fMib_-n9MIG8wNXxaxj3NCBXQZ60iigK";
                downloadPdfFile(link, pdfName);

            }
        }


        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.dmsid) {

                String pdfName = matchYear + "cse_dms";

                String link = "https://drive.google.com/uc?export=download&id=1v0z7cL3lt2t1QRgVVLYKUtt8fnXBNTn8";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.malid) {
                String pdfName = matchYear + "cse_mal";

                String link = "https://drive.google.com/uc?export=download&id=1GF_yJl8pF6CqotaLb480L-QL5BsP41G4";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.caid) {
                String pdfName = matchYear + "cse_ca";
                String link = "https://drive.google.com/uc?export=download&id=1NQtxEbRICF5eazel5v0Qw-3SspPA258Q";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.ceid) {
                String pdfName = matchYear + "cse_ce";
                String link = "https://drive.google.com/uc?export=download&id=1P9PrEVsXNxWCna6UdoxA-n17kqaSWkKH";
                downloadPdfFile(link, pdfName);
            }

            if (globalView.getId() == R.id.tcid) {
                String pdfName = matchYear + "cse_tc";
                String link = "https://drive.google.com/uc?export=download&id=12eDQyiOWQ0mXCxWSWq8JnQACSL4MvH3w";
                downloadPdfFile(link, pdfName);

            }
            if (globalView.getId() == R.id.setid) {
                String pdfName = matchYear + "cse_set";
                String link = "https://drive.google.com/uc?export=download&id=1adEcOG0WDEa92KzlHnj9uVWa4ZVv7So_";
                downloadPdfFile(link, pdfName);
            }


        }


    }

    @Override
    public void onlineRead(boolean flag) {


        if (examyear.equals("Fall -2017")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.dmsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.malid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid
            ) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid
            ) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }


        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.malid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.tcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "https://drive.google.com/file/d/1H7Wa0OPuTnRmLRJ8Un_X_2ywVZRmP5Y_/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.malid) {
                String link = "https://drive.google.com/file/d/1lRN_9vFd-7tnwdQpgVPoiJ7E0E8mFn2t/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "https://drive.google.com/file/d/1_U_2oP2QN-9CiMB6EVrQYWQo60J8dKgL/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid) {
                String link = "https://drive.google.com/file/d/1Yuri3vfLk1RjHmacgvDx_bFOXPUkof-B/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.tcid) {
                String link = "https://drive.google.com/file/d/1wqo5ghSxGxg3nqcBA7DlS0R2Rdi9-0Yu/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid) {
                String link = "https://drive.google.com/file/d/1Zsmbjlwg--F22z65j9Ekhdtx3sAymSXr/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.malid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.tcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.malid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.tcid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid) {
                String link = "";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "https://drive.google.com/file/d/1EKfx7-q4VBbNnp5pyWkXZS-KBb35nE_F/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.malid) {
                String link = "https://drive.google.com/file/d/14e2pVB_ib3J9IE76cpu-854_aNGY1c3Q/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "https://drive.google.com/file/d/18KMUIiRYvqzTJZzcay9s7caOaAa59hS5/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid) {
                String link = "https://drive.google.com/file/d/1bp4w3D_7O4mE3oCAkR4SxfqLaKQcxGzh/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.tcid) {
                String link = "https://drive.google.com/file/d/1idCaQTe4bnH7tJmoIY7xGskMvUBH0rtY/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid) {
                String link = "https://drive.google.com/file/d/1fMib_-n9MIG8wNXxaxj3NCBXQZ60iigK/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

        }


        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.dmsid) {

                String link = "https://drive.google.com/file/d/1v0z7cL3lt2t1QRgVVLYKUtt8fnXBNTn8/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);

            }

       /*     if (globalView.getId() == R.id.dmsid) {
                String link = "https://drive.google.com/file/d/1GF_yJl8pF6CqotaLb480L-QL5BsP41G4/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }*/

            if (globalView.getId() == R.id.malid) {
                String link = "https://drive.google.com/file/d/1GF_yJl8pF6CqotaLb480L-QL5BsP41G4/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.caid) {
                String link = "https://drive.google.com/file/d/1NQtxEbRICF5eazel5v0Qw-3SspPA258Q/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.ceid
            ) {
                String link = "https://drive.google.com/file/d/1P9PrEVsXNxWCna6UdoxA-n17kqaSWkKH/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.setid
            ) {
                String link = "https://drive.google.com/file/d/1adEcOG0WDEa92KzlHnj9uVWa4ZVv7So_/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


            }
            if (globalView.getId() == R.id.tcid) {
                String link = "https://drive.google.com/file/d/12eDQyiOWQ0mXCxWSWq8JnQACSL4MvH3w/view?usp=sharing";
                checkAndOpenPdfFromOnline(L3_T1_Questions.this, link);


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
