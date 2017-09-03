package com.emiliocordoba.holamundo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import static com.emiliocordoba.holamundo1.R.id.checkBox1;

public class Main2Activity extends AppCompatActivity {

    Button buttonHaciaMain3Activity;
    CheckBox CheckBox1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonHaciaMain3Activity = (Button)findViewById(R.id.btnCambio1);


        CheckBox1 = (CheckBox)findViewById(checkBox1);
        final Intent i = new Intent(Main2Activity.this,Main3Activity.class);


        buttonHaciaMain3Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Transporte:  i.putExtra("nombre",editTextnombre.getText().toString());

                startActivity(i);
            }
        });

        CheckBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intCheckBox =0;
                if (CheckBox1.isChecked()& intCheckBox<1);
                    //editText6.setText(editText6.getText()+" Vamos");

            }
        });

    }


}
