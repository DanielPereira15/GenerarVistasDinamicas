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
    int numBoton = 2;
    String valorBoton;
    int cantidadBotonesGenerar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaTexto = findViewById(R.id.cajaTexto);
        lienzo = findViewById(R.id.lienzo);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void escribirBoton(View v) {
        //this.cajaTexto.setText("Hola");
        //nombre.charAt(0) > 'A' && nombre.charAt(0) < 'Z'
        //lienzo.removeAllViews();
        if (cajaTexto.getText().charAt(0) > '0' && cajaTexto.getText().charAt(0) < '9') {
            cantidadBotonesGenerar = Integer.parseInt(cajaTexto.getText().toString());
            for (int i = 0; i < cantidadBotonesGenerar; i++) {
                Button btn = new Button(this);
                btn.setText("botón " + numBoton);
                btn.setId(View.generateViewId());
                btn.setTag("boton" + numBoton);


                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valorBoton = btn.getText().toString();
                        cajaTexto.setText("Botón " + valorBoton + " pulsado");
                    }
                });
                lienzo.addView(btn);
                numBoton++;
            }
        }
    }
}

