package com.example.generarvistasdinamicas;

import static android.view.View.*;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    EditText cajaTexto;
    LinearLayout lienzo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaTexto= findViewById(R.id.cajaTexto);
        lienzo=findViewById(R.id.lienzo);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void escribirBoton(View v){
        //this.cajaTexto.setText("Hola");
        Button btn = new Button(this);
        btn.setText("botón 2");
        btn.setId(View.generateViewId());
        btn.setTag("boton2");


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                cajaTexto.setText("Botón 2 pulsado");
            }
        });
        lienzo.addView(btn);
    }
}