package com.emiliocordoba.holamundo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main8Activity extends AppCompatActivity {

    TextView textView3;
    Button botonMostrar;
    Intent i3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        textView3 = (TextView)findViewById(R.id.textView3);
        botonMostrar = (Button)findViewById(R.id.button);

        final ArrayList<String> nombreArrayList = new ArrayList<String>();

        nombreArrayList.add ("UNO");
        nombreArrayList.add ("DDDD");
        nombreArrayList.add ("UCCCCNO");
        nombreArrayList.add ("FFF");
        nombreArrayList.add (" RRR");
        nombreArrayList.add (" RRRR");

            botonMostrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    textView3.setText("");

                    for (String item: nombreArrayList){
                        textView3.setText(textView3.getText().toString()+item);
                    }
                }

    });
}
}
