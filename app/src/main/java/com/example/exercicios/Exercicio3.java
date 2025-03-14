package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void cadastrarUsuario(View view){
        EditText nomeInput = findViewById(R.id.nome);

        EditText idadeInput = findViewById(R.id.idade);
        EditText cidadeInput = findViewById(R.id.cidade);
        EditText telefoneInput = findViewById(R.id.telefone);
        EditText emailInput = findViewById(R.id.email);
        CheckBox corBranco = findViewById(R.id.corBranco);
        CheckBox corPreta = findViewById(R.id.corPreto);
        CheckBox corColorido = findViewById(R.id.corColorido);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.getCheckedRadioButtonId();




    }
}