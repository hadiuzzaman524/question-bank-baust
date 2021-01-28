package com.baust.baustquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.baust.baustquestionbank.departments.BBA;
import com.baust.baustquestionbank.departments.CSE;
import com.baust.baustquestionbank.departments.EEE;
import com.baust.baustquestionbank.departments.ENGLISH;
import com.baust.baustquestionbank.departments.IPE;
import com.baust.baustquestionbank.departments.ME;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    CardView cse, eee, me, ipe, civil, bba, english, mba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.signuplogin));

        setContentView(R.layout.activity_main);
        cse = findViewById(R.id.cseid);
        eee = findViewById(R.id.eeeid);
        me = findViewById(R.id.meid);
        ipe = findViewById(R.id.ipeid);
        civil = findViewById(R.id.civilid);
        bba = findViewById(R.id.bbaid);
        english = findViewById(R.id.englishid);
        mba = findViewById(R.id.mbaid);

        cse.setOnClickListener(this);
        eee.setOnClickListener(this);
        me.setOnClickListener(this);
        ipe.setOnClickListener(this);
        civil.setOnClickListener(this);
        bba.setOnClickListener(this);
        english.setOnClickListener(this);
        mba.setOnClickListener(this);
        haveStoragePermission();

        //for navigation drawer..
        drawerLayout = findViewById(R.id.navigation_drawerid);
        navigationView = findViewById(R.id.navigationviewid);
        navigationView.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open_, R.string.close_);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.cseid) {
            startActivity(new Intent(MainActivity.this, CSE.class));
        }
        if (view.getId() == R.id.eeeid) {
            startActivity(new Intent(MainActivity.this, EEE.class));
        }

        if (view.getId() == R.id.bbaid) {
            startActivity(new Intent(MainActivity.this, BBA.class));
        }

        if (view.getId() == R.id.englishid) {
            startActivity(new Intent(MainActivity.this, ENGLISH.class));
        }
        if (view.getId() == R.id.ipeid) {
            startActivity(new Intent(MainActivity.this, IPE.class));
        }
        if (view.getId() == R.id.meid) {
            startActivity(new Intent(MainActivity.this, ME.class));
        }
        if (view.getId() == R.id.mbaid) {
            Toast.makeText(getApplicationContext(), "coming soon", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MainActivity.this, MBA.class));
        }
        if (view.getId() == R.id.civilid) {
            Toast.makeText(getApplicationContext(), "coming soon", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MainActivity.this, CIVIL.class));

            //  Sheet bottomSheet= new Sheet();
            // bottomSheet.show(getSupportFragmentManager(), "bottomsheet");


        }


    }


    //storage permission dialog
    public boolean haveStoragePermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        } else {
            return true;
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if (menuItem.getItemId() == R.id.logoutid) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(MainActivity.this, SplashScreen.class));
            finish();
            Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT).show();
        }
        if (menuItem.getItemId() == R.id.rateusid) {

            //for rate us button
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())
                ));
            }
            // Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG).show();
        }
        if (menuItem.getItemId() == R.id.visitwebsiteid) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://baust.edu.bd")));

        }
        if (menuItem.getItemId() == R.id.aboutusid) {
            Intent intent = new Intent(MainActivity.this, AboutUs.class);
            startActivity(intent);


        }
        if (menuItem.getItemId() == R.id.sharewithid) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "BAUST QUESTION BANK";
            String body = "A simple app for BAUSTIAN.\nhttps://play.google.com/store/apps/details?id=com.nested.etutor";
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);
            startActivity(Intent.createChooser(intent, "Share with "));

        }

        if (menuItem.getItemId() == R.id.exitid) {
            finish();
        }

        drawerLayout.closeDrawer(GravityCompat.START, true);
        return false;
    }


   /* @Override
    public void onlineRead(boolean flag) {

      Toast.makeText(getApplicationContext(),"Online",Toast.LENGTH_LONG).show();
    }

    @Override
    public void offlineRead(boolean flag) {
      Toast.makeText(getApplicationContext(),"offline",Toast.LENGTH_LONG).show();

    }*/
}
