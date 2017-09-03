package com.emiliocordoba.holamundo1;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Main6Activity extends AppCompatActivity {

    ListView myList;
    NotificationCompat.Builder mBuilder;
    Button btnNotificacion;
    Intent intentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        myList=(ListView)findViewById(R.id.listActivity6);
        btnNotificacion = (Button)findViewById(R.id.btnNotificacion);
        intentInicio = new Intent(Main6Activity.this, MainActivity.class);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,
                getResources().getStringArray(R.array.Repuestos));
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setAdapter(adapter);

        /* Ejemplo añadir datos a un listView
        lista =(ListView)findViewById(R.id.listView);

        riesgos = new String[]{"riesgo1", "Riesgo2","riesgo3","riesgo4","riesgo5","riesgo6"};
        ArrayAdapter<String> adapterRiesgos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapterRiesgos);

         */

        NotificationManager mNotifyMgr =(NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
        mBuilder =new NotificationCompat.Builder(getApplicationContext());

        int icono = R.mipmap.ic_launcher;
        Intent intent=new Intent(Main6Activity.this, MensajeAcitivy.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(Main6Activity.this, 0,intent, 0);


        btnNotificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //startActivity(intentInicio);
                android.support.v4.app.NotificationCompat.Builder mBuilder;
                NotificationManager mNotifyMgr =(NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);

                int icono = R.mipmap.ic_launcher;
                Intent i=new Intent(Main6Activity.this, Main3Activity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(Main6Activity.this, 0, i, 0);

                mBuilder =new NotificationCompat.Builder(getApplicationContext())
                        .setContentIntent(pendingIntent)
                        .setSmallIcon(icono)
                        .setContentTitle("Titulo")
                        .setContentText("Hola que tal?")
                        .setVibrate(new long[] {100, 250, 100, 500})
                        .setAutoCancel(true);

                mNotifyMgr.notify(1, mBuilder.build());

            }
        });

    }
}
