package com.example.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Log.d(TAG, "onCreate");
        button1 = findViewById(R.id.btnButton1);
        button3= findViewById(R.id.btnButton3);
        button6= findViewById(R.id.btnButton6);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    public void onButton1ClickListener(View view) {
        Toast.makeText(MainActivity.this, button1.getText(),Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onClick");
    }


    public void onButton3ClickListener(View view) {
        final Context context= this;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context,Fragment.class);
                startActivity(intent);
            }
        });
    }
    public void onButton6ClickListener(View view) {
        final Context context= this;
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, ItemsFragment.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
