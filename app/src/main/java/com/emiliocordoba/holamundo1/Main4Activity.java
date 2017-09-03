package com.emiliocordoba.holamundo1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    ListView myList;
    SharedPreferences SharedPreferences;
    TextView tViewSeleccionRiesgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4a);

        myList = (ListView)findViewById(R.id.list);
        tViewSeleccionRiesgo = (TextView)findViewById(R.id.tViewSeleccionRiesgo);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,
                getResources().getStringArray(R.array.Categoria));
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setAdapter(adapter);


        String selected = "";
        String selected1 = "";
        int cntChoice = myList.getCount();

        SparseBooleanArray sparseBooleanArray = myList.getCheckedItemPositions();
        for (int i = 0; i < cntChoice; i++) {
            if (sparseBooleanArray.get(i)) {
                selected += myList.getItemAtPosition(i).toString() + "\n";
                selected1 += " - "+ myList.getItemAtPosition(i).toString();
                System.out.println("Checking list while adding:" + myList.getItemAtPosition(i).toString());
                tViewSeleccionRiesgo.setText(selected1);
            }
        }




    }
}
