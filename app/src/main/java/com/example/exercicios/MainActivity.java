package com.example.exercicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
    }

    public void navegarExercicio( View view){

        int idInt = view.getId();
        String id = getResources().getResourceEntryName(idInt);


        switch (id) {
            case "exercicio1": {
                Intent intent = new Intent(view.getContext(), Exercicio1.class);
                startActivity(intent);
                break;
            }
            case "exercicio2": {
                Intent intent = new Intent(view.getContext(), Exercicio2.class);
                startActivity(intent);
                break;
            }
            case "exercicio3": {
                Intent intent = new Intent(view.getContext(), Exercicio3.class);
                startActivity(intent);
                break;
            }
            case "exercicio4": {
                Intent intent = new Intent(view.getContext(), Exercicio4.class);
                startActivity(intent);
                break;
            }
            default: {
                Intent intent = new Intent(view.getContext(), Exercicio5.class);
                startActivity(intent);
                break;
            }
        }

    }
}