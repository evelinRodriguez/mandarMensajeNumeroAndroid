package com.example.estudiantes.buscarnombre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class CambiarNombre extends AppCompatActivity {
    int Numer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_nombre);
        Random respuesta= new Random();
        Numer= respuesta.nextInt();

    }

    public void BuscarVista(View vista){
        TextView miEti=(TextView)findViewById(R.id.textView2);
        Button miboton=(Button)findViewById(R.id.button);
        EditText miCuadrito=(EditText)findViewById(R.id.editText);
        int numero=Integer.parseInt(miEti.getText().toString());

          //String salon=miCuadrito.getText().toString();
              if(numero==Numer){
                  miEti.setText("gano"  );


              }else {
                  if (numero > Numer) {
                      miEti.setText("EL NUMERO ES Mayor");
                  } else {
                      if (numero < Numer) {
                          miEti.setText("EL NUMERO ES MENOR");
                      }
                  }

              }

    }
}
