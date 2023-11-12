package com.example.temucovet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int counter;
    Button btn_agregarcaso, btn_vermapa;
    ProgressBar pb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1=findViewById(R.id.progressBar);
        btn_agregarcaso = findViewById(R.id.btn_agregarhistorial);
        btn_vermapa = findViewById(R.id.btn_vermapa);

        btn_agregarcaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb1.setProgress(counter);
                        if (counter == 20) {
                            timer.cancel();

                            Intent opcion = new Intent(MainActivity.this, ListaPerritos.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask,100,100);
            }
        });
        btn_vermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb1.setProgress(counter);
                        if (counter == 20) {
                            timer.cancel();

                            Intent opcion = new Intent(MainActivity.this, MapaVeterinarias.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask,100,100);
            }
        });
    }
}