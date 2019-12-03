package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView soroborno,banjonborno,number,alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soroborno = findViewById(R.id.tvSorborno);
        banjonborno = findViewById(R.id.tvBanjon);
        alphabet = findViewById(R.id.tvABC);
        number = findViewById(R.id.tvDigit);

        final HashMap<String,String> sorobornolist=new HashMap<>();
        sorobornolist.put("অ","অজগর");
        sorobornolist.put("আ","আম");

        final HashMap<String,String> banjonlist=new HashMap<>();
        banjonlist.put("ক","কাক");
        banjonlist.put("খ","খই");
        final Intent i=new Intent(this,Data_Activity.class);

        final HashMap<String,String> alphabetlist=new HashMap<>();
        alphabetlist.put("A","Apple");
        alphabetlist.put("B","Ball");
        alphabetlist.put("C","Cat");

        final HashMap<String,String> numberlist=new HashMap<>();
        numberlist.put("1","One");
        numberlist.put("2","Two");
        numberlist.put("3","Three");

        soroborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("datatype",sorobornolist);
                startActivity(i);
            }
        });
        banjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("datatype",banjonlist);
                startActivity(i);

            }
        });
        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            i.putExtra("datatype",alphabetlist);
            startActivity(i);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("datatype",numberlist);
                startActivity(i);

            }
        });

    }
}
