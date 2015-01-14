package com.aruizc.angeldejess.historiainteractiva.GUI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aruizc.angeldejess.historiainteractiva.R;


public class MainActivity extends ActionBarActivity {

    TextView txtNombre;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (TextView)findViewById(R.id.txtNombre);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                ComenzarHistoria(nombre);
            }
        });
    }

    public void ComenzarHistoria(String nombre){

        Intent intent = new Intent(MainActivity.this,ActividadHistoria.class);
        intent.putExtra(R.string.key_name + "",nombre);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtNombre.setText("");
    }
}
