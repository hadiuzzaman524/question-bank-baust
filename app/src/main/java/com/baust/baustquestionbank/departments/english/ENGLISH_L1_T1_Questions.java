package com.baust.baustquestionbank.departments.english;

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

import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.departments.eee.EEE_L1_T1_Questions;

public class ENGLISH_L1_T1_Questions extends AppCompatActivity implements View.OnClickListener {

    LinearLayout eng1101,eng1102,eng1103,bs1104,cse1105;
    ImageView eng1101d,eng1102d,eng1103d,bs1104d,cse1105d;
    String year = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-1 Term I Questions");
        setContentView(R.layout.activity_e_n_g_l_i_s_h__l1__t1__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");

        }
    }

    private void findAndOnClickSet() {
        eng1101 = findViewById(R.id.ENG1101id);
        eng1101d = findViewById(R.id.ENG1101download);
        eng1102= findViewById(R.id.ENG1102id);
        eng1102d = findViewById(R.id.ENG1102download);
        eng1103= findViewById(R.id.ENG1103id);
        eng1103d = findViewById(R.id.ENG1103download);
        bs1104= findViewById(R.id.BS1104id);
        bs1104d = findViewById(R.id.BS1104download);
        cse1105= findViewById(R.id.CSE1105id);
        cse1105d = findViewById(R.id.CSE1105download);


        eng1101.setOnClickListener(this);
        eng1101d.setOnClickListener(this);
        eng1102.setOnClickListener(this);
        eng1102d.setOnClickListener(this);
        eng1103.setOnClickListener(this);
        eng1103d.setOnClickListener(this);
        bs1104.setOnClickListener(this);
        bs1104d.setOnClickListener(this);
        cse1105.setOnClickListener(this);
        cse1105d.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (year.equals("Fall -2017")) {
            downloadFall17(view);
        }
        if (year.equals("Spring -2017")) {
            downloadSpring17(view);

        }
        if (year.equals("Fall -2018")) {
            downloadFall18(view);
        }
        if (year.equals("Spring -2018")) {
            downloadSpring18(view);
        }
        if (year.equals("Fall -2019")) {
            downloadFall19(view);
        }
        if (year.equals("Spring -2019")) {

            downloadSpring19(view);
        }
    }


    private void downloadFall17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.ENG1101id) {

            String pdfName = "F17english_ENG1101";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1101download) {

            String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
            String pdfName = "F17english_ENG1101";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ENG1102id) {

            String pdfName = "F17english_ENG1102";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1102download) {


            String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
            String pdfName = "F17english_ENG1102";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1103id) {
            String pdfName = "F17english_ENG1103";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1103download) {
            String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
            String pdfName = "F17english_ENG1103";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.BS1104id) {
            String pdfName = "F17english_BS1104";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.BS1104download) {

            String link = "";
            String pdfName = "F17english_BS1104";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE1105id) {
            String pdfName = "F17english_CSE1105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE1105download) {
            String link = "";
            String pdfName = "F17english_CSE1105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }



    }


private void downloadSpring17(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.ENG1101id) {

        String pdfName = "S17english_ENG1101";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1101download) {

        String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
        String pdfName = "S17english_ENG1101";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }

        if (view.getId() == R.id.ENG1102id) {

        String pdfName = "S17english_ENG1102";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1102download) {


        String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
        String pdfName = "S17english_ENG1102";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103id) {
        String pdfName = "S17english_ENG1103";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103download) {
        String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
        String pdfName = "S17english_ENG1103";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104id) {
        String pdfName = "S17english_BS1104";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104download) {

        String link = "";
        String pdfName = "S17english_BS1104";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105id) {
        String pdfName = "S17english_CSE1105";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105download) {
        String link = "";
        String pdfName = "S17english_CSE1105";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }



        }

        private void downloadFall18(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.ENG1101id) {

        String pdfName = "F18english_ENG1101";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1101download) {

        String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
        String pdfName = "F18english_ENG1101";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }

        if (view.getId() == R.id.ENG1102id) {

        String pdfName = "F18english_ENG1102";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1102download) {


        String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
        String pdfName = "F18english_ENG1102";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103id) {
        String pdfName = "F18english_ENG1103";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103download) {
        String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
        String pdfName = "F18english_ENG1103";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104id) {
        String pdfName = "F18english_BS1104";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104download) {

        String link = "";
        String pdfName = "F18english_BS1104";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105id) {
        String pdfName = "F18english_CSE1105";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105download) {
        String link = "";
        String pdfName = "F18english_CSE1105";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }



        }

        private void downloadSpring18(View view) {

            OpenPdf file = new OpenPdf();

            if (view.getId() == R.id.ENG1101id) {

                String pdfName = "S18english_ENG1101";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1101download) {

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                String pdfName = "S18english_ENG1101";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }

            if (view.getId() == R.id.ENG1102id) {

                String pdfName = "S18english_ENG1102";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1102download) {


                String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                String pdfName = "S18english_ENG1102";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1103id) {
                String pdfName = "S18english_ENG1103";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1103download) {
                String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                String pdfName = "S18english_ENG1103";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.BS1104id) {
                String pdfName = "S18english_BS1104";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.BS1104download) {

                String link = "";
                String pdfName = "S18english_BS1104";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.CSE1105id) {
                String pdfName = "S18english_CSE1105";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.CSE1105download) {
                String link = "";
                String pdfName = "S18english_CSE1105";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }


        }

    private void downloadFall19(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.ENG1101id) {

            String pdfName = "F19english_ENG1101";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1101download) {

            String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
            String pdfName = "F19english_ENG1101";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ENG1102id) {

            String pdfName = "F19english_ENG1102";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1102download) {


            String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
            String pdfName = "F19english_ENG1102";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1103id) {
            String pdfName = "F19english_ENG1103";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1103download) {
            String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
            String pdfName = "F19english_ENG1103";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.BS1104id) {
            String pdfName = "F19english_BS1104";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.BS1104download) {

            String link = "";
            String pdfName = "F19english_BS1104";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE1105id) {
            String pdfName = "F19english_CSE1105";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.CSE1105download) {
            String link = "";
            String pdfName = "F19english_CSE1105";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }



    }
        private void downloadSpring19(View view) {

        OpenPdf file = new OpenPdf();

        if (view.getId() == R.id.ENG1101id) {

        String pdfName = "S19english_ENG1101";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1101download) {

        String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
        String pdfName = "S19english_ENG1101";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }

        if (view.getId() == R.id.ENG1102id) {

        String pdfName = "S19english_ENG1102";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1102download) {


        String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
        String pdfName = "S19english_ENG1102";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103id) {
        String pdfName = "S19english_ENG1103";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.ENG1103download) {
        String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
        String pdfName = "S19english_ENG1103";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104id) {
        String pdfName = "S19english_BS1104";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.BS1104download) {

        String link = "";
        String pdfName = "S19english_BS1104";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105id) {
        String pdfName = "S19english_CSE1105";
        if (file.isDownload(pdfName)) {

        Uri uri = file.open(pdfName);
        Intent intent = new Intent(ENGLISH_L1_T1_Questions.this, PdfView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("uripath", uri);
        startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
        }
        }
        if (view.getId() == R.id.CSE1105download) {
        String link = "";
        String pdfName = "S19english_CSE1105";
        if (file.notDownload(pdfName)) {
        download(link, pdfName);
        } else {
        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
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




