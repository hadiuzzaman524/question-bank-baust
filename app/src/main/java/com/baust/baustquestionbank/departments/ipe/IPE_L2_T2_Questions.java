package com.baust.baustquestionbank.departments.ipe;

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

public class IPE_L2_T2_Questions extends AppCompatActivity implements View.OnClickListener, Sheet.ReadMethod{
    LinearLayout ipe2201,eee2285,math2207,me2273,me2275;
    ImageView ipe2201d,eee2285d,math2207d,me2273d,me2275d;
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
        this.setTitle("Level-2 Term II Questions");
        setContentView(R.layout.activity_i_p_e__l2__t2__questions);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");
        }

    }

    private void findAndOnClickSet() {

        ipe2201= findViewById(R.id.IPE2201id);
        ipe2201d = findViewById(R.id.IPE2201download);
        eee2285 = findViewById(R.id.EEE2285id);
        eee2285d = findViewById(R.id.EEE2285download);
        math2207= findViewById(R.id.MATH2207id);
        math2207d = findViewById(R.id.MATH2207download);
        me2273= findViewById(R.id.ME2273id);
        me2273d= findViewById(R.id.ME2273download);
        me2275= findViewById(R.id.ME2275id);
        me2275d= findViewById(R.id.ME2275download);

        ipe2201.setOnClickListener(this);
        ipe2201d.setOnClickListener(this);
        eee2285.setOnClickListener(this);
        eee2285d.setOnClickListener(this);
        math2207.setOnClickListener(this);
        math2207d.setOnClickListener(this);
        me2273.setOnClickListener(this);
        me2273d.setOnClickListener(this);
        me2275.setOnClickListener(this);
        me2275d.setOnClickListener(this);

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

        if (view.getId() == R.id.IPE2201id) {
            String pdfName = Y + "ipe_IPE2201";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(IPE_L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }
        if (view.getId() == R.id.EEE2285id) {
            String pdfName = Y + "ipe_EEE2285";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(IPE_L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.ME2275id) {
            String pdfName = Y + "ipe_ME2275";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(IPE_L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }

        if (view.getId() == R.id.MATH2207id) {
            String pdfName = Y + "ipe_MATH2207";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(IPE_L2_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Sheet bottomSheet = new Sheet();
                bottomSheet.show(getSupportFragmentManager(), pdfName);
            }
        }


        if (view.getId() == R.id.ME2273id) {
            String pdfName = Y + "ipe_ME2273";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(IPE_L2_T2_Questions.this, PdfView.class);
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

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            String matchYear = "Fall -2017";

            if (globalView.getId() == R.id.IPE2201id) {

                String pdfName = matchYear + "ipe_IPE2201";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.EEE2285id) {
                String pdfName = matchYear + "ipe_EEE2285";

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.ME2275id) {
                String pdfName = matchYear + "ipe_ME2275";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String pdfName = matchYear + "ipe_MATH2207";
                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                    Toast.makeText(getApplicationContext(), "Download Start", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }

            }

            if (globalView.getId() == R.id.ME2273id) {
                String pdfName = matchYear + "ipe_ME2273";
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

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2017")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2018")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2018")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Fall -2019")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Spring -2019")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

        }
        if (examyear.equals("Summer -2020")) {

            if (globalView.getId() == R.id.IPE2201id) {

                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

            if (globalView.getId() == R.id.EEE2285id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2275id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


            }

            if (globalView.getId() == R.id.MATH2207id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
                intent.putExtra("pdflink", link);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }

            if (globalView.getId() == R.id.ME2273id) {
                String link = "https://drive.google.com/file/d/1TPHsoBYBY-e_9P6OB-227HNF8mziG7ZZ/view";
                Intent intent = new Intent(IPE_L2_T2_Questions.this, OnlinePdfView.class);
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
            } else {
                Toast.makeText(getApplicationContext(), "No internet connection!", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Can't download this pdf!", Toast.LENGTH_SHORT).show();
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


