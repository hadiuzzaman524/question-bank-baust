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

public class L2_T2_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod {

    String year="";
    private LinearLayout OOPII,Algorithm,DEPT,NM,Mathiv;
    private ImageView OOPIId,Algorithmd,DEPTd,NMd,Mathivd;
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
        this.setTitle("Level-2 Term II Questions");
        setContentView(R.layout.activity_l2__t2__questions);
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
        OOPII=findViewById(R.id.oopiiid);
        Algorithm=findViewById(R.id.algorithmid);
        DEPT=findViewById(R.id.deptid);
        NM=findViewById(R.id.nmid);
        Mathiv=findViewById(R.id.mathivid);

        OOPIId=findViewById(R.id.oopiidownload);
        Algorithmd=findViewById(R.id.algorithmdownload);
        DEPTd=findViewById(R.id.deptdownload);
        NMd=findViewById(R.id.nmdownload);
        Mathivd=findViewById(R.id.mathivdownload);

        OOPII.setOnClickListener(this);
        Algorithm.setOnClickListener(this);
        DEPT.setOnClickListener(this);
        NM.setOnClickListener(this);
        Mathiv.setOnClickListener(this);

        OOPIId.setOnClickListener(this);
        Algorithmd.setOnClickListener(this);
        DEPTd.setOnClickListener(this);
        NMd.setOnClickListener(this);
        Mathivd.setOnClickListener(this);

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

        if (view.getId()==R.id.oopiiid)
        {
            String pdfName = Y+"cse_oopii";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.algorithmid)
        {
            String pdfName = Y+"cse_algorithm";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.deptid)
        {
            String pdfName = Y+"cse_dept";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }

        if (view.getId()==R.id.nmid)
        {
            String pdfName = Y+"cse_nm";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            }
            else {
                Sheet bottomSheet=new Sheet();
                bottomSheet.show(getSupportFragmentManager(),pdfName);
            }
        }


        if (view.getId()==R.id.mathivid)
        {
            String pdfName = Y+"cse_mathiv";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(L2_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";

                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

        }
        if (examyear.equals("Spring -2017")) {

            String matchYear = "Spring -2017";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";

                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "";
                downloadPdfFile(link, pdfName);

            }


        }

        if (examyear.equals("Fall -2018")) {

            String matchYear = "Fall -2018";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "https://drive.google.com/uc?export=download&id=1A99QnR9btUmkgK-9l-YDLkqO7879TzNH";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";
                String link = "https://drive.google.com/uc?export=download&id=1HsAWpuuqCTN5B6XBrAKVYulywDm6zZFj";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "https://drive.google.com/uc?export=download&id=1qIQnHPG-7wOkYonWVhDwYmMnS2vicRqb";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "https://drive.google.com/uc?export=download&id=1QnFoBnDgRxbk2BQovMILPpa1yMPfg9lL";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "https://drive.google.com/uc?export=download&id=1u2_EB3yB5IdfqPjyQAmv78BiGxv4urTJ";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Spring -2018")) {

            String matchYear = "Spring -2018";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";

                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Fall -2019")) {

            String matchYear = "Fall -2019";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "";
                downloadPdfFile(link, pdfName);

            }
        }
        if (examyear.equals("Spring -2019")) {

            String matchYear = "Spring -2019";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "https://drive.google.com/uc?export=download&id=1klyY4STnVwQK-nWi0gBd-kyrLZPWId8g";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";

                String link = "https://drive.google.com/uc?export=download&id=18HXI7DVndlKg_um0Y-14LgpvndemoP30";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "https://drive.google.com/uc?export=download&id=14vmM3KqMhWG-RyYckX9ASPCysV82SOLO";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "https://drive.google.com/uc?export=download&id=1gGJGyPifJEEYgMjpxVC5DO9PtbqNaN3H";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "https://drive.google.com/uc?export=download&id=1tawfyrvoUjG_7C0eYSbKL8LAlAF6G0Ec";
                downloadPdfFile(link, pdfName);

            }
        }

        if (examyear.equals("Summer -2020")) {

            String matchYear = "Summer -2020";

            if (globalView.getId() == R.id.oopiiid) {

                String pdfName = matchYear+"cse_oopii";

                String link = "https://drive.google.com/uc?export=download&id=125BEFDEvcQDU-A80KY7HWzh-U8GV38uX";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String pdfName = matchYear+"cse_algorithm";

                String link = "https://drive.google.com/uc?export=download&id=11xsSlKJgFXYAxYZCMO4RVezDAaYyozRW";
                downloadPdfFile(link, pdfName);



            }

            if (globalView.getId()==R.id.deptid)
            {
                String pdfName = matchYear+"cse_dept";
                String link = "https://drive.google.com/uc?export=download&id=11zojWNsfzZt_P4voYr0Yj_MUjwwusQUO";
                downloadPdfFile(link, pdfName);


            }

            if (globalView.getId()==R.id.nmid)
            {
                String pdfName = matchYear+"cse_nm";
                String link = "https://drive.google.com/uc?export=download&id=12PKuE-Zyzc5G6PbfLhRcNrs1unhPrebV";
                downloadPdfFile(link, pdfName);

            }

            if (globalView.getId()==R.id.mathivid)
            {
                String pdfName = matchYear+"cse_mathiv";
                String link = "https://drive.google.com/uc?export=download&id=12ERvvg7QzatgfkM_i2687hHSL70zXNxl";
                downloadPdfFile(link, pdfName);

            }

        }


    }
    @Override
    public void onlineRead(boolean flag) {
        if (examyear.equals("Fall -2017")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "https://drive.google.com/file/d/1A99QnR9btUmkgK-9l-YDLkqO7879TzNH/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "https://drive.google.com/file/d/1HsAWpuuqCTN5B6XBrAKVYulywDm6zZFj/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "https://drive.google.com/file/d/1qIQnHPG-7wOkYonWVhDwYmMnS2vicRqb/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "https://drive.google.com/file/d/1QnFoBnDgRxbk2BQovMILPpa1yMPfg9lL/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "https://drive.google.com/file/d/1u2_EB3yB5IdfqPjyQAmv78BiGxv4urTJ/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "https://drive.google.com/file/d/1klyY4STnVwQK-nWi0gBd-kyrLZPWId8g/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "https://drive.google.com/file/d/18HXI7DVndlKg_um0Y-14LgpvndemoP30/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "https://drive.google.com/file/d/14vmM3KqMhWG-RyYckX9ASPCysV82SOLO/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "https://drive.google.com/file/d/1gGJGyPifJEEYgMjpxVC5DO9PtbqNaN3H/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "https://drive.google.com/file/d/1tawfyrvoUjG_7C0eYSbKL8LAlAF6G0Ec/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

        }

        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.oopiiid) {

                String link = "https://drive.google.com/file/d/125BEFDEvcQDU-A80KY7HWzh-U8GV38uX/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);

            }

            if (globalView.getId()==R.id.algorithmid)
            {
                String link = "https://drive.google.com/file/d/11xsSlKJgFXYAxYZCMO4RVezDAaYyozRW/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);


            }

            if (globalView.getId()==R.id.deptid)
            {
                String link = "https://drive.google.com/file/d/11zojWNsfzZt_P4voYr0Yj_MUjwwusQUO/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);



            }

            if (globalView.getId()==R.id.nmid)
            {
                String link = "https://drive.google.com/file/d/12PKuE-Zyzc5G6PbfLhRcNrs1unhPrebV/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);
            }

            if (globalView.getId()==R.id.mathivid)
            {
                String link = "https://drive.google.com/file/d/12ERvvg7QzatgfkM_i2687hHSL70zXNxl/view?usp=sharing";
                checkAndOpenPdfFromOnline(L2_T2_Questions.this, link);
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
    private  void checkAndOpenPdfFromOnline(Context context, String link){
        if(link.isEmpty()){
            Toast.makeText(getApplicationContext(),"Question is not available",Toast.LENGTH_SHORT).show();
        }
        else{
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
