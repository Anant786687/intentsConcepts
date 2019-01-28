package com.andro.anant.intentsconcepts;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends android.app.Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        String st = getIntent().getStringExtra("name");
        TextView tv2=findViewById(R.id.tv2);
        tv2.setText(st);
    }




}
