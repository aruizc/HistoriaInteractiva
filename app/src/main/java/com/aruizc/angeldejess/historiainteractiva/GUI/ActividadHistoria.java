package com.aruizc.angeldejess.historiainteractiva.GUI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aruizc.angeldejess.historiainteractiva.Modelos.Historia;
import com.aruizc.angeldejess.historiainteractiva.Modelos.Pagina;
import com.aruizc.angeldejess.historiainteractiva.R;


public class ActividadHistoria extends ActionBarActivity {


    private Historia historia = new Historia();
    private ImageView imagen;
    private TextView textView;
    private Button desicion1;
    private Button desicion2;
    private String nombre;
    private Pagina paginaActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_historia);
        Intent intent  = getIntent();
        nombre = intent.getStringExtra(R.string.key_name + "");

        imagen = (ImageView)findViewById(R.id.imgImagenHistoria);
        textView = (TextView)findViewById(R.id.txtHistoria);
        desicion1 = (Button)findViewById(R.id.btnDecision1);
        desicion2 = (Button)findViewById(R.id.btnDecision2);

        CargarPagina(0);
    }

    private void CargarPagina(int desicion){
       paginaActual = historia.getPagina(desicion);

        Drawable drawable = getResources().getDrawable(paginaActual.getIdImagen());
        imagen.setImageDrawable(drawable);

        String textoPagina = paginaActual.getTexto();
        //Agrega el nomnbre a la historia
        textoPagina = String.format(textoPagina,nombre);

        textView.setText(paginaActual.getTexto());

        if(paginaActual.getIsFinal()){
              desicion1.setVisibility(View.INVISIBLE);
              desicion2.setText("Volver a Jugar");
              desicion2.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      finish();
                  }
              });
        }
        else {
            desicion1.setText(paginaActual.getDecision1().getTexto());
            desicion2.setText(paginaActual.getDecision2().getTexto());

            desicion1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int proximaPagina = paginaActual.getDecision1().getSiguientePagina();
                    CargarPagina(proximaPagina);
                }
            });

            desicion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int proximaPagina = paginaActual.getDecision2().getSiguientePagina();
                    CargarPagina(proximaPagina);
                }
            });
        }
    }

}
