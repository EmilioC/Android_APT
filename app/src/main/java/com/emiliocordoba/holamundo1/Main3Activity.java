package com.emiliocordoba.holamundo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.parceler.Parcels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main3Activity extends AppCompatActivity {

    Button btnMostrar, btnHacia7activity;
    Intent i4, itentHacia7activity;
    TextView tvSeleccionados;
    //String posicionesSeleccionadas[] = new String[2];

    final ArrayList<String> arraySeleccionados = new ArrayList<String>();

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10,
            checkBox11, checkBox12, checkBox13, checkBox14, checkBox15, checkBox16, checkBox17, checkBox18, checkBox19,
            checkBox20, checkBox21, checkBox22, checkBox23, checkBox24, checkBox25, checkBox26, checkBox27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnHacia7activity = (Button) findViewById(R.id.btnCambio1);
        btnMostrar = (Button) findViewById(R.id.btnCambio2);

        i4 = new Intent(Main3Activity.this, Main4Activity.class);
        itentHacia7activity = new Intent(Main3Activity.this, Main7Activity.class);

        tvSeleccionados = (TextView) findViewById(R.id.editText6);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);
        checkBox16 = (CheckBox) findViewById(R.id.checkBox16);
        checkBox17 = (CheckBox) findViewById(R.id.checkBox17);
        checkBox18 = (CheckBox) findViewById(R.id.checkBox18);
        checkBox19 = (CheckBox) findViewById(R.id.checkBox19);
        checkBox20 = (CheckBox) findViewById(R.id.checkBox20);
        checkBox21 = (CheckBox) findViewById(R.id.checkBox21);
        checkBox22 = (CheckBox) findViewById(R.id.checkBox22);
        checkBox23 = (CheckBox) findViewById(R.id.checkBox23);
        checkBox24 = (CheckBox) findViewById(R.id.checkBox24);
        checkBox25 = (CheckBox) findViewById(R.id.checkBox25);
        checkBox26 = (CheckBox) findViewById(R.id.checkBox26);
        checkBox27 = (CheckBox) findViewById(R.id.checkBox27);
/*
        arraySeleccionados.add("hOLA");
        arraySeleccionados.add("QUE");
        arraySeleccionados.add("TAL");
        arraySeleccionados.add("DOS");
        arraySeleccionados.add("TRES");
        arraySeleccionados.add(" último   BIEN CHICO estupendo ¡¡¡" +
                "" +
                "El peor emprendedor escribe abundante documentación, " +
                "como planes de negocio, sólo que él les llama business plans.\n")
*/
        // Budle MainActivity and write the selection in the button "mostrar" button2
        Bundle extras = getIntent().getExtras();
        final String tipoAPT = extras.getString("TipoAPT");
        btnMostrar.setText(tipoAPT);

        //buttonHaciaMain2Activity.animate().setStartDelay(360).rotationX(360);
        //buttonHaciaMain2Activity.animate().rotationX(360).setStartDelay(1500);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //for (int i=0; i<2; i++){ tvSeleccionados.setText(posicionesSeleccionadas[i].toString());}
               tvSeleccionados.setText(" ");
           /* for (int i = 0; i < posicionesSeleccionadas.length; i++) {
                 tvSeleccionados.setText(tvSeleccionados.getText() + " " + posicionesSeleccionadas[i].toString());
                   }

                    for (int i = 0; i < arraySeleccionados.size(); i++) {
                    arraySeleccionados.set(i,"");
                }
*/
                for (int i = 0; i <arraySeleccionados.size(); i++) {
                    tvSeleccionados.setText(tvSeleccionados.getText()+" "+(i+1)+".-"+arraySeleccionados.get(i));
                   //tvSeleccionados.setText(tvSeleccionados.getText() + " " + arraySeleccionados.get(i));
                }
                arraySeleccionados.clear();

/*
                for (String item: arraySeleccionados){
                    tvSeleccionados.setText(item+" ");
                   // tvSeleccionados.setText(tvSeleccionados.getText().toString()+item+" ");
                }
*/
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
                checkBox10.setChecked(false);
                checkBox11.setChecked(false);
                checkBox12.setChecked(false);
                checkBox13.setChecked(false);
                checkBox14.setChecked(false);
                checkBox15.setChecked(false);
                checkBox16.setChecked(false);
                checkBox17.setChecked(false);
                checkBox18.setChecked(false);
                checkBox19.setChecked(false);
                checkBox20.setChecked(false);
                checkBox21.setChecked(false);
                checkBox22.setChecked(false);
                checkBox23.setChecked(false);
                checkBox24.setChecked(false);
                checkBox25.setChecked(false);
                checkBox26.setChecked(false);
                checkBox27.setChecked(false);

            }
     });
        btnHacia7activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itentHacia7activity.putExtra("arraySeleccionados", Parcels.wrap(posicionesSeleccionadas));
               itentHacia7activity.putExtra("arraySeleccionados", Parcels.wrap(arraySeleccionados));
                itentHacia7activity.putExtra("tipoAPT", tipoAPT);
                startActivity(itentHacia7activity);
            }
        });
    }

    public void onCheckboxClicked(View view) {
// Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
// Check which checkbox was clicked
            switch (view.getId()) {

/*
              case R.id.checkBox1: if (checked){ posicionesSeleccionadas [0]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [0]= "";} break;
                case R.id.checkBox2: if (checked){ posicionesSeleccionadas [1]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [1]= "";} break;
               case R.id.checkBox3: if (checked){ posicionesSeleccionadas [2]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [2]= "";} break;
              case R.id.checkBox4: if (checked){ posicionesSeleccionadas [3]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [3]= "";} break;
                case R.id.checkBox5: if (checked){ posicionesSeleccionadas [4]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [4]= "";} break;
                case R.id.checkBox6: if (checked){ posicionesSeleccionadas [5]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [5]= "";} break;
                case R.id.checkBox7: if (checked){ posicionesSeleccionadas [6]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [6]= "";} break;
                case R.id.checkBox8: if (checked){ posicionesSeleccionadas [7]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [7]= "";} break;
                case R.id.checkBox9: if (checked){ posicionesSeleccionadas [8]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [8]= "";} break;
                case R.id.checkBox10: if (checked){ posicionesSeleccionadas [9]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [9]= "";} break;
                case R.id.checkBox11: if (checked){ posicionesSeleccionadas [10]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [10]= "";} break;
                case R.id.checkBox12: if (checked){ posicionesSeleccionadas [11]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [11]= "";} break;
                case R.id.checkBox13: if (checked){ posicionesSeleccionadas [12]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [12]= "";} break;
                case R.id.checkBox14: if (checked){ posicionesSeleccionadas [13]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [13]= "";} break;
                case R.id.checkBox15: if (checked){ posicionesSeleccionadas [14]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [14]= "";} break;
                case R.id.checkBox16: if (checked){ posicionesSeleccionadas [15]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [15]= "";} break;
                case R.id.checkBox17: if (checked){ posicionesSeleccionadas [16]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [16]= "";} break;
                case R.id.checkBox18: if (checked){ posicionesSeleccionadas [17]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [17]= "";} break;
                case R.id.checkBox19: if (checked){ posicionesSeleccionadas [18]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [18]= "";} break;
                case R.id.checkBox20: if (checked){ posicionesSeleccionadas [19]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [19]= "";} break;
                case R.id.checkBox21: if (checked){ posicionesSeleccionadas [20]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [20]= "";} break;
                case R.id.checkBox22: if (checked){ posicionesSeleccionadas [21]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [21]= "";} break;
                case R.id.checkBox23: if (checked){ posicionesSeleccionadas [22]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [22]= "";} break;
                case R.id.checkBox24: if (checked){ posicionesSeleccionadas [23]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [23]= "";} break;
                case R.id.checkBox25: if (checked){ posicionesSeleccionadas [24]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [24]= "";} break;
                case R.id.checkBox26: if (checked){ posicionesSeleccionadas [25]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [25]= "";} break;
                case R.id.checkBox27: if (checked){ posicionesSeleccionadas [26]= ((CheckBox)view).getText().toString();}else{ posicionesSeleccionadas [26]= "";} break;

         case R.id.checkBox1: if (checked){arraySeleccionados.add(" Peligro Electrico");posicionesSeleccionadas [0]= (String) checkBox7.getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox2: if (checked){arraySeleccionados.add(" Medio Ambiente");posicionesSeleccionadas [1]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox3: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Condición");posicionesSeleccionadas [2]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox4: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Utilización");posicionesSeleccionadas [3]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox5: if (checked){arraySeleccionados.add(" Caída desde altura/Elevación ");posicionesSeleccionadas [4]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox6: if (checked){arraySeleccionados.add(" Peligro en la conducción");posicionesSeleccionadas [5]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox7: if (checked){arraySeleccionados.add(" Peligro Electrico");posicionesSeleccionadas [7]= (String) checkBox7.getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox8: if (checked){arraySeleccionados.add(" Medio Ambiente");posicionesSeleccionadas [8]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox9: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Condición");posicionesSeleccionadas [9]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox10: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Utilización");posicionesSeleccionadas [10]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox11: if (checked){arraySeleccionados.add(" Caída desde altura/Elevación ");posicionesSeleccionadas [11]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox12: if (checked){arraySeleccionados.add(" Peligro de Incendio/Fuego");posicionesSeleccionadas [12]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox13: if (checked){arraySeleccionados.add(" Orden y Limpieza");posicionesSeleccionadas [13]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox14: if (checked){arraySeleccionados.add(" Etiquetas/Señalización");posicionesSeleccionadas [14]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox15: if (checked){arraySeleccionados.add(" Peligro de Corte/Laceración");posicionesSeleccionadas [15]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox16: if (checked){arraySeleccionados.add(" Fuga/Derrame de Material");posicionesSeleccionadas [16]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox17: if (checked){arraySeleccionados.add(" Nivel de Ruido");posicionesSeleccionadas [17]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox18: if (checked){arraySeleccionados.add(" Sobreesfuerzo/Ergonomía");posicionesSeleccionadas [18]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox19: if (checked){arraySeleccionados.add("Paying Attention to the Task");posicionesSeleccionadas [19]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox20: if (checked){arraySeleccionados.add(" Fatiga/Cansancio");posicionesSeleccionadas [20]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox21: if (checked){arraySeleccionados.add(" EPIs - Ojos");posicionesSeleccionadas [21]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox22: if (checked){arraySeleccionados.add(" EPIs - Manos ");posicionesSeleccionadas [22]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox23: if (checked){arraySeleccionados.add(" EPIs - Oídos");posicionesSeleccionadas [23]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox24: if (checked){arraySeleccionados.add(" EPIs - Otros");posicionesSeleccionadas [24]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox25: if (checked){arraySeleccionados.add(" Atrapamientos");posicionesSeleccionadas [25]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox26: if (checked){arraySeleccionados.add(" Mala utilización de productos");posicionesSeleccionadas [26]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox27: if (checked){arraySeleccionados.add(" Security");posicionesSeleccionadas [27]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;
            case R.id.checkBox28: if (checked){arraySeleccionados.add(" Security");posicionesSeleccionadas [27]= (String) ((CheckBox)view).getText(); }else{arraySeleccionados.add("");} break;

*/
                case R.id.checkBox1: if (checked){arraySeleccionados.add("Salpicadura/Espray ");}else{arraySeleccionados.add("");}
                case R.id.checkBox2: if (checked){arraySeleccionados.add(" Ser golpeado por algo"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox3: if (checked){arraySeleccionados.add(" Peligro de quemadura"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox4: if (checked){arraySeleccionados.add(" Exposición a producto químico"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox5: if (checked){arraySeleccionados.add(" Peligro en la conducción"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox6: if (checked){arraySeleccionados.add(" Peligro Electrico"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox7: if (checked){arraySeleccionados.add(" Peligro Electrico"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox8: if (checked){arraySeleccionados.add(" Medio Ambiente"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox9: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Condición"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox10: if (checked){arraySeleccionados.add(" Equipos/Herramientas - Utilización"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox11: if (checked){arraySeleccionados.add(" Caída desde altura/Elevación "); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox12: if (checked){arraySeleccionados.add(" Peligro de Incendio/Fuego"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox13: if (checked){arraySeleccionados.add(" Orden y Limpieza"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox14: if (checked){arraySeleccionados.add(" Etiquetas/Señalización"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox15: if (checked){arraySeleccionados.add(" Peligro de Corte/Laceración"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox16: if (checked){arraySeleccionados.add(" Fuga/Derrame de Material"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox17: if (checked){arraySeleccionados.add(" Nivel de Ruido"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox18: if (checked){arraySeleccionados.add(" Sobreesfuerzo/Ergonomía"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox19: if (checked){arraySeleccionados.add("Paying Attention to the Task"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox20: if (checked){arraySeleccionados.add(" Fatiga/Cansancio"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox21: if (checked){arraySeleccionados.add(" EPIs - Ojos"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox22: if (checked){arraySeleccionados.add(" EPIs - Manos "); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox23: if (checked){arraySeleccionados.add(" EPIs - Oídos"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox24: if (checked){arraySeleccionados.add(" EPIs - Otros"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox25: if (checked){arraySeleccionados.add(" Atrapamientos"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox26: if (checked){arraySeleccionados.add(" Mala utilización de productos"); }else{arraySeleccionados.add("");} break;
                case R.id.checkBox27: if (checked){arraySeleccionados.add(" Security"); }else{arraySeleccionados.add("");} break;

            }
    }

}


