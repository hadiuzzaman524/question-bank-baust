package com.baust.baustquestionbank.departments.english;

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
import com.baust.baustquestionbank.adapter.YearShowAdapter;
import com.baust.baustquestionbank.departments.eee.EEE_L1_T1;
import com.baust.baustquestionbank.departments.eee.EEE_L1_T1_Questions;

public class ENGLISH_L1_T1 extends AppCompatActivity {

    ListView listView;
    String[] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));
        this.setTitle("Department of ENGLISH");

        setContentView(R.layout.activity_e_n_g_l_i_s_h__l1__t1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = getResources().getStringArray(R.array.yearname);

        listView = findViewById(R.id.yearlistviewid);
        YearShowAdapter adapter = new YearShowAdapter(this, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String x = name[i].trim();
                if (x.equals("Fall -2017")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Fall -2017");
                    startActivity(intent);
                }
                if (x.equals("Spring -2017")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Spring -2017");
                    startActivity(intent);
                }

                if (x.equals("Fall -2018")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Fall -2018");
                    startActivity(intent);
                }

                if (x.equals("Spring -2018")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Spring -2018");
                    startActivity(intent);
                }
                if (x.equals("Fall -2019")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Fall -2019");
                    startActivity(intent);
                }

                if (x.equals("Spring -2019")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Spring -2019");
                    startActivity(intent);
                }
                if (x.equals("Summer -2020")) {
                    Intent intent=new Intent(ENGLISH_L1_T1.this, ENGLISH_L1_T1_Questions.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("year","Summer -2020");
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


