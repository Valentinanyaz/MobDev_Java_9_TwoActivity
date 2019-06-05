package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Five extends AppCompatActivity {

    final String TAG = "States";

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_main) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_two) {
            Intent intent = new Intent(this, ActivityTwo.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_three) {
            Intent intent = new Intent(this, Three.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_four) {
            Intent intent = new Intent(this, Four.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.menu_five) {
            Intent intent = new Intent(this, Five.class);
            startActivity(intent);
        }
        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        Log.d(TAG, "ActivityFive: onCreate()");
    }

    void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActMain:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.btnActThree:
                Intent intent = new Intent(this, Three.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.btnActFour:
                Intent intent = new Intent(this, Four.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityFive: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityFive: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityFive: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityFive: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityFive: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityFive: onDestroy()");
    }
}
