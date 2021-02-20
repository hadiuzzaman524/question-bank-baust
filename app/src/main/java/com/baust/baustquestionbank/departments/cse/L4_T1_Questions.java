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

public class L4_T1_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {

    private LinearLayout AL, SEI, IM, DNS,  ML;
  //  private ImageView ALd, SEId, IMd, AAd, BGTd, FTSd, BMTd, DNSd, OOSEd, ANNFSd, DAd, Bioinformaticsd, Roboticsd, MLd, ASQTd, CGd, DSDd, PIESd, MCAd, WAd, PPDSd;
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
        this.setTitle("Level-4 Term I Questions");
        setContentView(R.layout.activity_l4__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }
    }

    private void findAndOnClickSet() {
        AL = findViewById(R.id.alid);
        SEI = findViewById(R.id.seisid);
        IM = findViewById(R.id.imid);
        DNS = findViewById(R.id.dnsid);
        ML = findViewById(R.id.mlid);


        AL.setOnClickListener(this);
        SEI.setOnClickListener(this);
        IM.setOnClickListener(this);
        DNS.setOnClickListener(this);
        ML.setOnClickListener(this);


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

        if (view.getId() == R.id.alid) {
            String pdfName = Y + "cse_aL";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.seisid) {
            String pdfName = Y + "cse_seis";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.imid) {
            String pdfName = Y + "cse_im";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }


        if (view.getId() == R.id.dnsid) {
            String pdfName = Y + "cse_dns";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }


        if (view.getId() == R.id.mlid) {
            String pdfName = Y + "cse_mL";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L4_T1_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "https://drive.google.com/uc?export=download&id=1ZzvUHYkji9xcxdvtGNQKw8IKITqC9-XF";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "https://drive.google.com/uc?export=download&id=1c064iw-b9ieqxkiwUZhW4adlGsbz7BG-";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "https://drive.google.com/uc?export=download&id=12oev4c7rRbe0qnndxLqti0ZuPF7WAL16";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "https://drive.google.com/uc?export=download&id=1_nvD42Vt6a3_H7ayzHTfvOGqunkshXN3";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "https://drive.google.com/uc?export=download&id=1QzAMdR-J-4XbnvuriOVITKBBWXy2sWu7";
                downloadPdfFile(link, pdfName);

            }


        }
        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Fall -2019")) {
            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Spring -2019")) {
            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "https://drive.google.com/uc?export=download&id=1tshY9yhdSHosq6ikQEQVDf9wfB2KZolL";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "https://drive.google.com/uc?export=download&id=1-N4zqZj7lUr40oTaBVa9_PqIdwu3lRoB";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "https://drive.google.com/uc?export=download&id=1-qBiv3WpNoaXsF4_9LWRARq7hSdO_QCS";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "https://drive.google.com/uc?export=download&id=19BP9p4boJTnRLutrpcbozjQn9rTBimVY";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "https://drive.google.com/uc?export=download&id=1zlyJG9bko3ibDwxmKcoJqZeQc6vELDL7";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.alid) {

                String pdfName = matchYear + "cse_aL";

                String link = "https://drive.google.com/uc?export=download&id=1AYXjlwfwAZVHF86iGR7fEEXjK6JF6Fmw";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.seisid) {
                String pdfName = matchYear + "cse_seis";

                String link = "https://drive.google.com/uc?export=download&id=1ABm3hsHrocnEpXfol-ne7yTemuwhyy_B";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId() == R.id.imid) {
                String pdfName = matchYear + "cse_im";
                String link = "https://drive.google.com/uc?export=download&id=1AQoCkEq7muoDOGfMyEXnDgAy4jrzCQGS";
                downloadPdfFile(link, pdfName);
            }


            if (globalView.getId() == R.id.dnsid) {
                String pdfName = matchYear + "cse_dns";
                String link = "https://drive.google.com/uc?export=download&id=1AlLEfPcHVuQ_NQo8qqT5ghBS8X7giNa6";
                downloadPdfFile(link, pdfName);

            }


            if (globalView.getId() == R.id.mlid) {
                String pdfName = matchYear + "cse_mL";
                String link = "https://drive.google.com/uc?export=download&id=1AQoCkEq7muoDOGfMyEXnDgAy4jrzCQGS";
                downloadPdfFile(link, pdfName);

            }


        }

    }

    @Override
    public void onlineRead(boolean flag) {


        if (examyear.equals("Fall -2017")) {


            if (globalView.getId() == R.id.alid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }


        }

        if (examyear.equals("Spring -2017")) {


            if (globalView.getId() == R.id.alid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2018")) {


            if (globalView.getId() == R.id.alid) {

                String link = "https://drive.google.com/file/d/1ZzvUHYkji9xcxdvtGNQKw8IKITqC9-XF/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "https://drive.google.com/file/d/1c064iw-b9ieqxkiwUZhW4adlGsbz7BG-/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "https://drive.google.com/file/d/12oev4c7rRbe0qnndxLqti0ZuPF7WAL16/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "https://drive.google.com/file/d/1_nvD42Vt6a3_H7ayzHTfvOGqunkshXN3/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "https://drive.google.com/file/d/1QzAMdR-J-4XbnvuriOVITKBBWXy2sWu7/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }


        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.alid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }


        }
        if (examyear.equals("Fall -2019")) {


            if (globalView.getId() == R.id.alid) {

                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2019")) {


            if (globalView.getId() == R.id.alid) {

                String link = "https://drive.google.com/file/d/1tshY9yhdSHosq6ikQEQVDf9wfB2KZolL/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "https://drive.google.com/file/d/1-N4zqZj7lUr40oTaBVa9_PqIdwu3lRoB/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "https://drive.google.com/file/d/1-qBiv3WpNoaXsF4_9LWRARq7hSdO_QCS/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "https://drive.google.com/file/d/19BP9p4boJTnRLutrpcbozjQn9rTBimVY/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "https://drive.google.com/file/d/1zlyJG9bko3ibDwxmKcoJqZeQc6vELDL7/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

        }

        if (examyear.equals("Summer -2020")) {


            if (globalView.getId() == R.id.alid) {

                String link = "https://drive.google.com/file/d/1AYXjlwfwAZVHF86iGR7fEEXjK6JF6Fmw/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);

            }

            if (globalView.getId() == R.id.seisid) {
                String link = "https://drive.google.com/file/d/1ABm3hsHrocnEpXfol-ne7yTemuwhyy_B/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.imid) {
                String link = "https://drive.google.com/file/d/1AQoCkEq7muoDOGfMyEXnDgAy4jrzCQGS/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.dnsid) {
                String link = "https://drive.google.com/file/d/1AlLEfPcHVuQ_NQo8qqT5ghBS8X7giNa6/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


            }

            if (globalView.getId() == R.id.mlid) {
                String link = "https://drive.google.com/file/d/1AQoCkEq7muoDOGfMyEXnDgAy4jrzCQGS/view?usp=sharing";
                checkAndOpenPdfFromOnline(L4_T1_Questions.this, link);


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

    private void downloadPdfFile(String link, String pdfName) {
        if (file.notDownload(pdfName)) {
            download(link, pdfName);
        } else {
            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
