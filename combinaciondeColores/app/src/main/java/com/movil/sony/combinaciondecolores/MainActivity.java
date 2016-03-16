package com.movil.sony.combinaciondecolores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView pantalla;
    CheckBox azul;
    CheckBox amarillo;
    CheckBox rojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mezcla();

    }

    public void mezcla(){

        pantalla = (ImageView) findViewById(R.id.pantalla);
        azul = (CheckBox) findViewById(R.id.azul);
        amarillo = (CheckBox) findViewById(R.id.amarillo);
        rojo = (CheckBox) findViewById(R.id.rojo);

        azul.setOnCheckedChangeListener(new myChechBoxChangeClicker());
        amarillo.setOnCheckedChangeListener(new myChechBoxChangeClicker());
        rojo.setOnCheckedChangeListener(new myChechBoxChangeClicker());

    }

    class myChechBoxChangeClicker implements CheckBox.OnCheckedChangeListener{


        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if(!azul.isChecked()&&!amarillo.isChecked()&&!rojo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(253,232,215));
            }
            if(azul.isChecked()&&amarillo.isChecked()&&!rojo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(0,255,0));
            }
            if(azul.isChecked()&&rojo.isChecked()&&!amarillo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(102, 0, 153));
            }
            if(amarillo.isChecked()&&azul.isChecked()&&!rojo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(0,255,0));
            }
            if(amarillo.isChecked()&&rojo.isChecked()&&!azul.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(255, 102, 0));
            }
            if(rojo.isChecked()&&amarillo.isChecked()&&!azul.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(255,102,0));
            }
            if(rojo.isChecked()&&azul.isChecked()&&!amarillo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(102,0,153));
            }
            if(azul.isChecked()&&amarillo.isChecked()&&rojo.isChecked()){
                pantalla.setBackgroundColor(Color.rgb(255,255,255));
            }

        }
    }
}
