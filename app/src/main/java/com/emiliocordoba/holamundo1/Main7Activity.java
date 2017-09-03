package com.emiliocordoba.holamundo1;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.parceler.Parcels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import static com.emiliocordoba.holamundo1.R.id.tViewSeleccionRiesgo;

public class Main7Activity extends AppCompatActivity {

    ArrayList arraySeleccionados;
    TextView textViewCategoria, tvtipoAPT;
    EditText edtCliente,edtZona, edtFecha, edtDescripcionAPT,edtAccionTomada;
    String tipoAPT,categoriaApt,cliente,zona, descripcionApt, correccionApt,fecha;
    //String posicionesSeleccionadas7 [] = new String [3];
    APT APT1;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        tvtipoAPT = (TextView)findViewById(R.id.textViewtipo);
        textViewCategoria = (TextView)findViewById(R.id.textViewCategoria);
        edtCliente = (EditText)findViewById(R.id.edtCliente);
        edtZona = (EditText)findViewById(R.id.edtZona);
        edtFecha= (EditText)findViewById(R.id.edtFecha);
        edtDescripcionAPT =(EditText)findViewById(R.id.edtDescripcionAPT);
        edtAccionTomada =(EditText)findViewById(R.id.edtAccionTomada);
        btnFinalizar = (Button)findViewById(R.id.btnFinalizar);


        cliente= edtCliente.getText().toString();
        zona = edtZona.getText().toString();
        fecha= edtFecha.getText().toString();

        Bundle extras = getIntent().getExtras();
        ArrayList arraySeleccionados = Parcels.unwrap(getIntent().getParcelableExtra("arraySeleccionados"));
        String tipoAPT = extras.getString("tipoAPT");
        tvtipoAPT.setText(tipoAPT);

        APT1 = new APT(cliente, zona, fecha, descripcionApt,correccionApt,tipoAPT,categoriaApt);

       // ArrayList<String> arraySeleccionados =extras.getStringArrayList(String.valueOf(extras));

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","correo@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Android APP - ");
        startActivity(Intent.createChooser(emailIntent,  getActivity().getString(R.string.enviar_mail)));



        for (int i = 0; i <arraySeleccionados.size(); i++) {
            textViewCategoria.setText(textViewCategoria.getText()+" "+(i+1)+".-"+arraySeleccionados.get(i));
            //tvSeleccionados.setText(tvSeleccionados.getText() + " " + arraySeleccionados.get(i));
        }
        arraySeleccionados.clear();
/*
        for (int i=0; i< posicionesSeleccionadas7.length; i++){
            tvSeleccionados.setText(tvSeleccionados.getText()+" "+posicionesSeleccionadas7[i].toString());
        }
*/

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
    @Override
             public void onClick(View v) {



            }
          }
        );
    }
}
