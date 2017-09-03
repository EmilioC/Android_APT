package com.emiliocordoba.holamundo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button buttonComportamiento, buttonCondicion, buttonRefuerzoPositivo;
    Intent i2 , i3, i4, i6,iActivityImpacto, i7, i8;
    ArrayList arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonComportamiento = (Button)findViewById(R.id.buttonComportamiento);
        buttonCondicion = (Button)findViewById(R.id.buttonCondicion);
        buttonRefuerzoPositivo = (Button)findViewById(R.id.buttonRefuerzoPositivo);

        ArrayList <String> arraySeleccionados= new ArrayList<String>();
        arraySeleccionados.add("hOLA");
        arraySeleccionados.add("QUE");
        arraySeleccionados.add("TAL");
        arraySeleccionados.add("DOS");
        arraySeleccionados.add("TRES");
        arraySeleccionados.add("CUATRO");

        i2 = new Intent(MainActivity.this,Main2Activity.class);
        i3 = new Intent(MainActivity.this,Main3Activity.class);
        i4 = new Intent(MainActivity.this,Main4Activity.class);
        i6 = new Intent(MainActivity.this,Main6Activity.class);
        i7 = new Intent(MainActivity.this,Main7Activity.class);
        i8 = new Intent(MainActivity.this,Main8Activity.class);
        //iActivityImpacto = new Intent(MainActivity.this,ImpactoActivity.class);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonComportamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Comportamiento");
                startActivity(i3);
            }
        });
        buttonCondicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Condicion");
                startActivity(i3);
            }
        });
        buttonRefuerzoPositivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Refuerzo positivo");
                startActivity(i6);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
           //Transporte:  i.putExtra("nombre",editTextnombre.getText().toString());

            startActivity(i2);

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
