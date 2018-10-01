package com.example.perso.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    public void Anterior(View view){
        Intent Anterior = new Intent(this,MainActivity.class);
        startActivity(Anterior);



    }



}
