package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void gerarCheckBox(View view){
        EditText nomeInput = findViewById(R.id.nome);
        String nome = nomeInput.getText().toString();

        for(int i = 0 ; i < nome.length(); i++){
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(nome.charAt(i)));
            LinearLayout linearLayout = findViewById(R.id.linearLayout);
            linearLayout.addView(checkBox);
        }

    }
}