package com.example.myapplication;
import static android.content.ContentValues.TAG;

import android.util.Log;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Caminhao c = new Caminhao("preto", "chevrolet", 4, "transporte de carga", 50.0, 30.0, 10.0, 6.0);
        c.setModelo("Fiat");
        c.setQtdPneu(8);
        Log.i(TAG, "Modelo:"+ c.getModelo());
        Log.i(TAG, "Quantidade de Pneu:"+ c.getQtdPneu());
        Log.i(TAG, "Volume:"+ c.calculaVolume());

        Computador c1 = new Computador("Computador", "Lenovo", "I3", 4, "Programas leves", 1500);
        c1.setQtdMemoria(8);
        c1.setModelo("I7");
        c1.setFuncao("Jogos e programas pesados");
        Log.i(TAG, "Dispositivo:"+ c1.getDispositivo());
        Log.i(TAG, "Modelo:"+ c1.getModelo());
        Log.i(TAG, "Quantidade de Memória:"+ c1.getQtdMemoria());
        Log.i(TAG, "Função:"+ c1.getFuncao());

    }


}