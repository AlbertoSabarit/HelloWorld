package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Alberto Sabarit Peñalosa
 * @version 1.0
 * Aplicación que muestra el ejemplo de Hola Mundo
 * <ol>
 *     <li>Se ha visto como se crean los recursos en XML</li>
 *     <li>Se ha instanciado en Java un objeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicación</li>
 * </ol>
 */
public class MainActivity extends AppCompatActivity {

    private TextView tvMessageStart;
    private TextView tvMessageEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessageStart = findViewById(R.id.tvMessageStart);
        tvMessageEnd = findViewById(R.id.tvMessageEnd);
        tvMessageStart.setTextColor(getColor(R.color.white));
        tvMessageEnd.setText(R.string.tvMessageOptimist_text);
    }
}