package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void verificarIdade (View view){

        EditText idadeInput = findViewById(R.id.idade);
        int idade = Integer.parseInt(idadeInput.getText().toString());
        System.out.println(idade);

        if(idade >= 18 && idade < 100){
            Toast.makeText(Exercicio1.this, "Você é maior de idade", Toast.LENGTH_SHORT).show();

        }else if (idade < 18 && idade > 0){
            Toast.makeText(Exercicio1.this, "Você é menor de idade", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(Exercicio1.this, "Digite uma idade válida", Toast.LENGTH_SHORT).show();

        }
    }
}