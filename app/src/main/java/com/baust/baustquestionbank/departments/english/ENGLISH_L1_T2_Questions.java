package com.baust.baustquestionbank.departments.english;

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

import com.baust.baustquestionbank.OpenPdf;
import com.baust.baustquestionbank.PdfView;
import com.baust.baustquestionbank.R;

public class ENGLISH_L1_T2_Questions extends AppCompatActivity implements View.OnClickListener {
    LinearLayout eng1201, eng1202, eng1203, eng1204, eng1205;
    ImageView eng1201d, eng1202d, eng1203d, eng1204d, eng1205d;
    String year = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Level-1 Term II Questions");
        setContentView(R.layout.activity_e_n_g_l_i_s_h__l1__t2__questions);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findAndOnClickSet();


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            year = bundle.getString("year");

        }
    }

    private void findAndOnClickSet() {
        eng1201 = findViewById(R.id.ENG1201id);
        eng1201d = findViewById(R.id.ENG1201download);
        eng1202 = findViewById(R.id.ENG1202id);
        eng1202d = findViewById(R.id.ENG1202download);
        eng1203 = findViewById(R.id.ENG1203id);
        eng1203d = findViewById(R.id.ENG1203download);
        eng1204 = findViewById(R.id.ENG1204id);
        eng1204d = findViewById(R.id.ENG1204download);
        eng1205 = findViewById(R.id.ENG1205id);
        eng1205d = findViewById(R.id.ENG1205download);


        eng1201.setOnClickListener(this);
        eng1201d.setOnClickListener(this);
        eng1202.setOnClickListener(this);
        eng1202d.setOnClickListener(this);
        eng1203.setOnClickListener(this);
        eng1203d.setOnClickListener(this);
        eng1204.setOnClickListener(this);
        eng1204d.setOnClickListener(this);
        eng1205.setOnClickListener(this);
        eng1205d.setOnClickListener(this);

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

        if (view.getId() == R.id.ENG1201id) {

            String pdfName = "F17english_ENG1201";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1201download) {

            String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
            String pdfName = "F17english_ENG1201";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.getId() == R.id.ENG1202id) {

            String pdfName = "F17english_ENG1202";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1202download) {


            String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
            String pdfName = "F17english_ENG1202";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1203id) {
            String pdfName = "F17english_ENG1203";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1203download) {
            String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
            String pdfName = "F17english_ENG1203";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1204id) {
            String pdfName = "F17english_ENG1204";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1204download) {

            String link = "";
            String pdfName = "F17english_ENG1204";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1205id) {
            String pdfName = "F17english_ENG1205";
            if (file.isDownload(pdfName)) {

                Uri uri = file.open(pdfName);
                Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("uripath", uri);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.ENG1205download) {
            String link = "";
            String pdfName = "F17english_ENG1205";
            if (file.notDownload(pdfName)) {
                download(link, pdfName);
            } else {
                Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
            }
        }
    }


        private void downloadSpring17(View view) {

            OpenPdf file = new OpenPdf();

            if (view.getId() == R.id.ENG1201id) {

                String pdfName = "S17english_ENG1201";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1201download) {

                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                String pdfName = "S17english_ENG1201";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }

            if (view.getId() == R.id.ENG1202id) {

                String pdfName = "S17english_ENG1202";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1202download) {


                String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                String pdfName = "S17english_ENG1202";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1203id) {
                String pdfName = "S17english_ENG1203";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1203download) {
                String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                String pdfName = "S17english_ENG1203";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1204id) {
                String pdfName = "S17english_ENG1204";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1204download) {

                String link = "";
                String pdfName = "S17english_ENG1204";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1205id) {
                String pdfName = "S17english_ENG1205";
                if (file.isDownload(pdfName)) {

                    Uri uri = file.open(pdfName);
                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("uripath", uri);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                }
            }
            if (view.getId() == R.id.ENG1205download) {
                String link = "";
                String pdfName = "S17english_ENG1205";
                if (file.notDownload(pdfName)) {
                    download(link, pdfName);
                } else {
                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                }
            }
        }

            private void downloadFall18 (View view) {

                OpenPdf file = new OpenPdf();

                if (view.getId() == R.id.ENG1201id) {

                    String pdfName = "F18english_ENG1201";
                    if (file.isDownload(pdfName)) {

                        Uri uri = file.open(pdfName);
                        Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("uripath", uri);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1201download) {

                    String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                    String pdfName = "F18english_ENG1201";
                    if (file.notDownload(pdfName)) {
                        download(link, pdfName);
                    } else {
                        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                    }
                }

                if (view.getId() == R.id.ENG1202id) {

                    String pdfName = "F18english_ENG1202";
                    if (file.isDownload(pdfName)) {

                        Uri uri = file.open(pdfName);
                        Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("uripath", uri);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1202download) {


                    String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                    String pdfName = "F18english_ENG1202";
                    if (file.notDownload(pdfName)) {
                        download(link, pdfName);
                    } else {
                        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1203id) {
                    String pdfName = "F18english_ENG1203";
                    if (file.isDownload(pdfName)) {

                        Uri uri = file.open(pdfName);
                        Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("uripath", uri);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1203download) {
                    String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                    String pdfName = "F18english_ENG1203";
                    if (file.notDownload(pdfName)) {
                        download(link, pdfName);
                    } else {
                        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1204id) {
                    String pdfName = "F18english_ENG1204";
                    if (file.isDownload(pdfName)) {

                        Uri uri = file.open(pdfName);
                        Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("uripath", uri);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1204download) {

                    String link = "";
                    String pdfName = "F18english_ENG1204";
                    if (file.notDownload(pdfName)) {
                        download(link, pdfName);
                    } else {
                        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1205id) {
                    String pdfName = "F18english_ENG1205";
                    if (file.isDownload(pdfName)) {

                        Uri uri = file.open(pdfName);
                        Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("uripath", uri);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (view.getId() == R.id.ENG1205download) {
                    String link = "";
                    String pdfName = "F18english_ENG1205";
                    if (file.notDownload(pdfName)) {
                        download(link, pdfName);
                    } else {
                        Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
                private void downloadSpring18 (View view) {

                    OpenPdf file = new OpenPdf();

                    if (view.getId() == R.id.ENG1201id) {

                        String pdfName = "S18english_ENG1201";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1201download) {

                        String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                        String pdfName = "S18english_ENG1201";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    if (view.getId() == R.id.ENG1202id) {

                        String pdfName = "S18english_ENG1202";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1202download) {


                        String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                        String pdfName = "S18english_ENG1202";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1203id) {
                        String pdfName = "S18english_ENG1203";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1203download) {
                        String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                        String pdfName = "S18english_ENG1203";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1204id) {
                        String pdfName = "S18english_ENG1204";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1204download) {

                        String link = "";
                        String pdfName = "S18english_ENG1204";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1205id) {
                        String pdfName = "S18english_ENG1205";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1205download) {
                        String link = "";
                        String pdfName = "S18english_ENG1205";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                private void downloadFall19 (View view) {

                    OpenPdf file = new OpenPdf();

                    if (view.getId() == R.id.ENG1201id) {

                        String pdfName = "F19english_ENG1201";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1201download) {

                        String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                        String pdfName = "F19english_ENG1201";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    if (view.getId() == R.id.ENG1202id) {

                        String pdfName = "F19english_ENG1202";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1202download) {


                        String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                        String pdfName = "F19english_ENG1202";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1203id) {
                        String pdfName = "F19english_ENG1203";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1203download) {
                        String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                        String pdfName = "F19english_ENG1203";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1204id) {
                        String pdfName = "F19english_ENG1204";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1204download) {

                        String link = "";
                        String pdfName = "F19english_ENG1204";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1205id) {
                        String pdfName = "F19english_ENG1205";
                        if (file.isDownload(pdfName)) {

                            Uri uri = file.open(pdfName);
                            Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("uripath", uri);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (view.getId() == R.id.ENG1205download) {
                        String link = "";
                        String pdfName = "F19english_ENG1205";
                        if (file.notDownload(pdfName)) {
                            download(link, pdfName);
                        } else {
                            Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                        }
                    }

                }
                        private void downloadSpring19 (View view) {

                            OpenPdf file = new OpenPdf();

                            if (view.getId() == R.id.ENG1201id) {

                                String pdfName = "S19english_ENG1201";
                                if (file.isDownload(pdfName)) {

                                    Uri uri = file.open(pdfName);
                                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("uripath", uri);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1201download) {

                                String link = "https://www.webpages.uidaho.edu/~stevel/301answer/6.pdf";
                                String pdfName = "S19english_ENG1201";
                                if (file.notDownload(pdfName)) {
                                    download(link, pdfName);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                                }
                            }

                            if (view.getId() == R.id.ENG1202id) {

                                String pdfName = "S19english_ENG1202";
                                if (file.isDownload(pdfName)) {

                                    Uri uri = file.open(pdfName);
                                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("uripath", uri);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1202download) {


                                String link = "http://www.pitt.edu/~edindex/OfficeXPTutorials/Lesson9XP.pdf";
                                String pdfName = "S19english_ENG1202";
                                if (file.notDownload(pdfName)) {
                                    download(link, pdfName);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1203id) {
                                String pdfName = "S19english_ENG1203";
                                if (file.isDownload(pdfName)) {

                                    Uri uri = file.open(pdfName);
                                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("uripath", uri);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1203download) {
                                String link = "https://drive.google.com/uc?export=download&id=1Da3wd-vPk7zU7qEaLNlmkdnkxL8obfdt";
                                String pdfName = "S19english_ENG1203";
                                if (file.notDownload(pdfName)) {
                                    download(link, pdfName);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1204id) {
                                String pdfName = "S19english_ENG1204";
                                if (file.isDownload(pdfName)) {

                                    Uri uri = file.open(pdfName);
                                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("uripath", uri);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1204download) {

                                String link = "";
                                String pdfName = "S19english_ENG1204";
                                if (file.notDownload(pdfName)) {
                                    download(link, pdfName);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1205id) {
                                String pdfName = "S19english_ENG1205";
                                if (file.isDownload(pdfName)) {

                                    Uri uri = file.open(pdfName);
                                    Intent intent = new Intent(ENGLISH_L1_T2_Questions.this, PdfView.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("uripath", uri);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Download first then try to open it!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            if (view.getId() == R.id.ENG1205download) {
                                String link = "";
                                String pdfName = "S19english_ENG1205";
                                if (file.notDownload(pdfName)) {
                                    download(link, pdfName);
                                } else {
                                    Toast.makeText(getApplicationContext(), "Already download it please open now!", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                            //for download a pdf...
                            public void download (String url, String pdfName){

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
                            private boolean isNetworkAvailable () {
                                ConnectivityManager connectivityManager
                                        = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                            }

                            @Override
                            public boolean onOptionsItemSelected (@NonNull MenuItem item){

                                if (item.getItemId() == android.R.id.home) {
                                    finish();
                                }
                                return super.onOptionsItemSelected(item);
                            }
                        }




