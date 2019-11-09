package com.example.servjack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

        Button button = findViewById(R.id.buttonDados);
        Button pontos2 = findViewById(R.id.pontos2);
        Button pontos3 = findViewById(R.id.pontos3);
        Button pontos4 = findViewById(R.id.pontos4);
        final int[] pontos = new int[1];
        final int[] marcadorEasy = new int[1];
        final int[] marcadorMedium = new int[1];
        final int[] marcadorHard = new int[1];
        final String[] pontosText = new String[1];

        pontos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (marcadorEasy[0] < 6 && pontos[0] != 12) {
                    pontos[0] += 2;
                    marcadorEasy[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12){
                    Toast.makeText(getApplicationContext(), pontosText[0], Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                }
            }
        });

        pontos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (marcadorMedium[0] < 4 && pontos[0] != 12) {
                    pontos[0] += 3;
                    marcadorMedium[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12) {
                    Toast.makeText(getApplicationContext(), pontosText[0], Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                }
            }
        });

        pontos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (marcadorHard[0] < 3 && pontos[0] != 12) {
                    pontos[0] += 4;
                    marcadorHard[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12) {
                    Toast.makeText(getApplicationContext(), pontosText[0], Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                    }
            }
        });

        pontos2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (marcadorEasy[0] < 6 && pontos[0] != 12){
                    pontos[0] -= 2;
                    marcadorEasy[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] < 0){
                    pontos[0] = 0;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12) {
                   Toast.makeText(getApplicationContext(), pontosText[0] , Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                }
                return true;
            }
        });

        pontos3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (marcadorMedium[0] < 4 && pontos[0] != 12){
                    pontos[0] -= 3;
                    marcadorMedium[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] < 0){
                    pontos[0] = 0;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12) {
                   Toast.makeText(getApplicationContext(), pontosText[0] , Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                }
                return true;
            }
        });

        pontos4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (marcadorHard[0] < 3 && pontos[0] != 12){
                    pontos[0] -= 4;
                    marcadorHard[0] += 1;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] < 0){
                    pontos[0] = 0;
                    pontosText[0] = String.valueOf(pontos[0]);
                }
                if (pontos[0] != 12) {
                   Toast.makeText(getApplicationContext(), pontosText[0] , Toast.LENGTH_SHORT).show();
                }
                if(pontos[0] == 12){
                    Toast.makeText(getApplicationContext(), "Você perdeu... é você mesmo, teoricamente mesmo o senhor tendo guiado nosso companheiro do outro lado da mesa até agora, ele completou 12 pontos, mas se considere um campeão também pois provavelmente ele te guiou pelo caminho mais ardiloso possível e você não é tem ódio o suficiente para tal façanha, da próxima vez se lemre que tudo pode ser resolvido na agressão física.", Toast.LENGTH_LONG).show();
                }
                return true;
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Random random = new Random();
                int valor = random.nextInt(6) + 1;
                String aleatorio = String.valueOf(valor);
                Toast.makeText(getApplicationContext(),aleatorio, Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int valor = random.nextInt(4) + 1;
                String aleatorio = String.valueOf(valor);
                Toast.makeText(getApplicationContext(),aleatorio, Toast.LENGTH_LONG).show();
            }
        });


    }

}
