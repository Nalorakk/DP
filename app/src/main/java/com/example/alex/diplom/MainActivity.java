package com.example.alex.diplom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickTimer(View view){
        Intent intent = new Intent(this, MainTimer.class);
        startActivity(intent);
    }
    public void onClickLibra (View view){
        Intent inlibra = new Intent(this, LibraActivity.class);
        startActivity(inlibra);
    }
    public void onClickComp(View view){
        Intent comp = new Intent(this, CompActivity.class);
        startActivity(comp);
    }
    public void onClickInfo(View view){
        Intent info = new Intent(this, InfoActivity.class);
        startActivity(info);
    }

}
