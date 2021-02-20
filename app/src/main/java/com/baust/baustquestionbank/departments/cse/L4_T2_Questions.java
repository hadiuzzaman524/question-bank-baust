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

public class L4_T2_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {

    private LinearLayout CG, DSP, VD, PR, DIP, SM, DWHDM, NP, CNS;
    private ImageView CGd, DSPd, VDd, PRd, DIPd, SMd, DWHDMd, NPd, CNSd;
    private String year = "";
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
        this.setTitle("Level-4 Term II Questions");
        setContentView(R.layout.activity_l4__t2__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {

        CG = findViewById(R.id.cgid);
        DSP = findViewById(R.id.dspid);
        DIP = findViewById(R.id.dipid);
        DWHDM = findViewById(R.id.dwhdmid);


        CG.setOnClickListener(this);
        DSP.setOnClickListener(this);
        DIP.setOnClickListener(this);

        DWHDM.setOnClickListener(this);

/*

        CGd = findViewById(R.id.cgdownload);
        DSPd = findViewById(R.id.dspdownload);

        DIPd = findViewById(R.id.dipdownload);

        DWHDMd = findViewById(R.id.dwhdmdownload);

*/


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

        if (view.getId() == R.id.cgid) {
            String pdfName = Y + "cse_cg";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.dspid) {
            String pdfName = Y + "cse_dsp";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }



        if (view.getId() == R.id.dipid) {
            String pdfName = Y + "cse_dip";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.dwhdmid) {
            String pdfName = Y + "cse_dwhdm";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "https://drive.google.com/uc?export=download&id=1zJMYDFIPlOVg55SkEwOFW8nlKFN9zpzs";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "https://drive.google.com/uc?export=download&id=10UNsDvdMWxUjpGM8GtOwYm2ohvZblkec";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "https://drive.google.com/uc?export=download&id=1ZeYjfzAzAEXPg_MMRbSrLzwSWZWwuptz";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "https://drive.google.com/uc?export=download&id=1zJMYDFIPlOVg55SkEwOFW8nlKFN9zpzs";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";
            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }

        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";
            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "https://drive.google.com/uc?export=download&id=1hFeJaPrS_dKSRNe7nxQIpUZFIeTLJRz-";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "https://drive.google.com/uc?export=download&id=18zLjPDnJ_6Q_puZ-schJggKdvrYq30NE";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "https://drive.google.com/uc?export=download&id=10WO23yeoeZyyqDelkFfhuU2VmRp9LdeR";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "https://drive.google.com/uc?export=download&id=1_gQ3I-g9s80IPQQB5eH7Cl4oZRn7dzZw";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";
            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }

        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";
            if (globalView.getId() == R.id.cgid) {

                String pdfName = matchYear + "cse_cg";
                String link = "https://drive.google.com/uc?export=download&id=15U0s82n6EQn-9jVFM2RMLnfRmrf_n9dH";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId() == R.id.dspid) {
                String pdfName = matchYear + "cse_dsp";
                String link = "https://drive.google.com/uc?export=download&id=15Tm5a-7w4fNrjkrE1CDes-KvuFRwNPL7";
                downloadPdfFile(link, pdfName);


            }



            if (globalView.getId() == R.id.dipid) {
                String pdfName = matchYear + "cse_dip";
                String link = "https://drive.google.com/uc?export=download&id=15Rq6V-tfnEh46uk7dSUgnwU8-FgIdIBj";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.dwhdmid) {
                String pdfName = matchYear + "cse_dwhdm";
                String link = "https://drive.google.com/uc?export=download&id=15SKg4pLEhsU8yWA_dWSekvqbhmprV6Ei";
                downloadPdfFile(link, pdfName);

            }

        }

    }

    @Override
    public void onlineRead(boolean flag) {


        if (examyear.equals("Fall -2017")) {

            if (globalView.getId() == R.id.cgid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2017")) {
            if (globalView.getId() == R.id.cgid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.cgid) {

                String link = "https://drive.google.com/file/d/1zJMYDFIPlOVg55SkEwOFW8nlKFN9zpzs/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "https://drive.google.com/file/d/10UNsDvdMWxUjpGM8GtOwYm2ohvZblkec/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "https://drive.google.com/file/d/1ZeYjfzAzAEXPg_MMRbSrLzwSWZWwuptz/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "https://drive.google.com/file/d/1zJMYDFIPlOVg55SkEwOFW8nlKFN9zpzs/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }
        }
        if (examyear.equals("Spring -2018")) {
            if (globalView.getId() == R.id.cgid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }
        }
        if (examyear.equals("Fall -2019")) {
            if (globalView.getId() == R.id.cgid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }
        }



        if (examyear.equals("Spring -2019")) {
            if (globalView.getId() == R.id.cgid) {

                String link = "https://drive.google.com/file/d/1hFeJaPrS_dKSRNe7nxQIpUZFIeTLJRz-/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "https://drive.google.com/file/d/18zLjPDnJ_6Q_puZ-schJggKdvrYq30NE/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "https://drive.google.com/file/d/10WO23yeoeZyyqDelkFfhuU2VmRp9LdeR/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "https://drive.google.com/file/d/1_gQ3I-g9s80IPQQB5eH7Cl4oZRn7dzZw/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }
        }

        if (examyear.equals("Summer -2020")) {
            if (globalView.getId() == R.id.cgid) {

                String link = "https://drive.google.com/file/d/15U0s82n6EQn-9jVFM2RMLnfRmrf_n9dH/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);

            }

            if (globalView.getId() == R.id.dspid) {

                String link = "https://drive.google.com/file/d/15Tm5a-7w4fNrjkrE1CDes-KvuFRwNPL7/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }


            if (globalView.getId() == R.id.dipid) {

                String link = "https://drive.google.com/file/d/15Rq6V-tfnEh46uk7dSUgnwU8-FgIdIBj/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }

            if (globalView.getId() == R.id.dwhdmid) {

                String link = "https://drive.google.com/file/d/15SKg4pLEhsU8yWA_dWSekvqbhmprV6Ei/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T2_Questions.this, link);


            }
        }
    }

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
