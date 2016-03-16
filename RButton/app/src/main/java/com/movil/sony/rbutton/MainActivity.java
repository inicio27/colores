package com.movil.sony.rbutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //creamos las variables que necesitamos
    //en este caso hemos creado 4 variable que son equivalentes a los cuatro
    //recursos que usamos en el layout
    //tenemos la variable azul que es de tipo RadioButton asi mismo es para las demas
    RadioButton azul;
    RadioButton amarillo;
    RadioButton rojo;
    ImageView pantalla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //creamos el metodo para iniciar con la logica
        initialUIsetup();
    }
     //dentro de este metodo debemos de llamar a las variable que creamos anteriormente
    //para poder usarlas, es decir que estamos enlazando el layout con la codigo funcional
    public void initialUIsetup (){

        pantalla = (ImageView) findViewById(R.id.pantalla);
        azul = (RadioButton) findViewById(R.id.azul);
        amarillo = (RadioButton) findViewById(R.id.amarillo);
        rojo = (RadioButton) findViewById(R.id.rojo);

        azul.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        amarillo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        rojo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
    }
    class  myCheckBoxChangeClicker implements RadioButton.OnCheckedChangeListener{



        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(buttonView==azul){
                pantalla.setBackgroundColor(Color.rgb(0,0,255));
                amarillo.setChecked(false);
                rojo.setChecked(false);
            }
            else if(buttonView==amarillo){
                pantalla.setBackgroundColor(Color.rgb(255,255,0));
                azul.setChecked(false);
                rojo.setChecked(false);
            }
            else if(buttonView==rojo){
                pantalla.setBackgroundColor(Color.rgb(255,0,0));
                azul.setChecked(false);
                amarillo.setChecked(false);
            }
        }
    }






}
