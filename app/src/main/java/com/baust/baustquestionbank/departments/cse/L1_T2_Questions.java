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
    LinearLayout DM,SPL,EDC,Mathii,Chemistry;
    ImageView DMd,SPLd,EDCd,Mathiid,Chemistryd;

    View globalView;
    String examyear="";
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

    private void findAndOnClickSet()
    {
        DM=findViewById(R.id.dmid);
        DMd=findViewById(R.id.dmdownload);
        SPL=findViewById(R.id.splid);
        SPLd=findViewById(R.id.spldownload);
        EDC=findViewById(R.id.edcid);
        EDCd=findViewById(R.id.edcdownload);
        Mathii=findViewById(R.id.mathiiid);
        Mathiid=findViewById(R.id.mathiidownload);
        Chemistry=findViewById(R.id.chemistryid);

        DM.setOnClickListener(this);
        DMd.setOnClickListener(this);
        SPL.setOnClickListener(this);
        SPLd.setOnClickListener(this);
        EDC.setOnClickListener(this);
        EDCd.setOnClickListener(this);
        Mathii.setOnClickListener(this);
        Mathiid.setOnClickListener(this);
        Chemistry.setOnClickListener(this);
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

    }

    private void downloadQuestions(View view,String Y){

        if (view.getId() == R.id.dmid) {

            String pdfName = Y+"cse_dm";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }

        }

        if (view.getId()==R.id.splid)
        {
            String pdfName = Y+"cse_spl";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }

        }

        if (view.getId()==R.id.edcid)
        {
            String pdfName = Y+"cse_edc";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }

        }

        if (view.getId()==R.id.mathiiid)
        {
            String pdfName = Y+"cse_mathii";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }

        }

        if (view.getId()==R.id.chemistryid)
        {
            String pdfName = Y+"cse_chemistry";

            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L1_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String pdfName = matchYear+"cse_dm";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.splid)
            {
                String pdfName = matchYear+"cse_spl";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.edcid)
            {
                String pdfName = matchYear+"cse_edc";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }



            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String pdfName = matchYear+"cse_mathii";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String pdfName = matchYear+"cse_chemistry";
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

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.dmid) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId()==R.id.splid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.edcid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId()==R.id.mathiiid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId()==R.id.chemistryid)
            {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent=new Intent(L1_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink",link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }

    }
//.......................................................

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
