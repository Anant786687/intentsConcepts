package com.andro.anant.intentsconcepts;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends android.app.Activity
{

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* Button bd = findViewById(R.id.bdial);
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = findViewById(R.id.et1);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+et1.getText().toString()));
                startActivity(i);
            }
        });*/
    }


    public void dial(View V)
    {
    EditText et1 = findViewById(R.id.et1);
    Intent i = new Intent();
    i.setAction(Intent.ACTION_DIAL);
    i.setData(Uri.parse("tel:"+et1.getText().toString()));
    startActivity(i);
    }
    public void gallery(View v)
    {
    Intent i = new Intent();
    i.setAction(Intent.ACTION_GET_CONTENT);
    i.setType("video/*");
    startActivity(i);
    }

    public void next(View view)
    {
        Intent i = new Intent();
        EditText et2=findViewById(R.id.et2);
        i.putExtra("name",et2.getText().toString());
        i.setComponent(new ComponentName(this,MainActivity2.class));
        startActivity(i);
    }

    public void whatsapp(View view)
    {
         Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
         startActivity(i);
    }









}