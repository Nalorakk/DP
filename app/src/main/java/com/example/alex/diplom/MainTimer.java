package com.example.alex.diplom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }
    public  void onClickAddTimer(View view)
    {
        Intent taimer = new Intent(this, Timer_meneger.class);
        startActivity(taimer);
    }
}
