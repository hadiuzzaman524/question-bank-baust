package com.baust.baustquestionbank.departments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.baust.baustquestionbank.R;
import com.baust.baustquestionbank.adapter.LevelTermAdapter;
import com.baust.baustquestionbank.departments.eee.EEE_L1_T1;
import com.baust.baustquestionbank.departments.english.ENGLISH_L1_T1;
import com.baust.baustquestionbank.departments.english.ENGLISH_L1_T2;
import com.baust.baustquestionbank.departments.english.ENGLISH_L2_T1;
import com.baust.baustquestionbank.departments.english.ENGLISH_L2_T2;
import com.baust.baustquestionbank.departments.english.ENGLISH_L3_T1;
import com.baust.baustquestionbank.departments.english.ENGLISH_L3_T2;
import com.baust.baustquestionbank.departments.english.ENGLISH_L4_T1;
import com.baust.baustquestionbank.departments.english.ENGLISH_L4_T2;

public class ENGLISH extends AppCompatActivity {

    ListView listView;
    String[] name;
    int[] flags = {R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo,
            R.drawable.baustlogo, R.drawable.baustlogo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("DEPARTMENT OF ENGLISH");
        setContentView(R.layout.activity_e_n_g_l_i_s_h);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = getResources().getStringArray(R.array.lvelterm);

        listView = findViewById(R.id.g_1_bookslistviewid);
        LevelTermAdapter adapter = new LevelTermAdapter(this, name, flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L1_T1.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 1) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L1_T2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 2) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L2_T1.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 3) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L2_T2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 4) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L3_T1.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 5) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L3_T2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 6) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L4_T1.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                if (i == 7) {
                    Intent intent = new Intent(ENGLISH.this, ENGLISH_L4_T2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
