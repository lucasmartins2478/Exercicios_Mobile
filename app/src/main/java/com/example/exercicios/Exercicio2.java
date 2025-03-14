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

public class Exercicio2 extends AppCompatActivity {

    EditText numero1Input, numero2Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializando as views corretamente
        numero1Input = findViewById(R.id.numero1);
        numero2Input = findViewById(R.id.numero2);
    }

    public void somar(View view) {
        if (validarInputs()) {
            int numero1 = Integer.parseInt(numero1Input.getText().toString());
            int numero2 = Integer.parseInt(numero2Input.getText().toString());
            int resultado = numero1 + numero2;

            Toast.makeText(this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void subtrair(View view) {
        if (validarInputs()) {
            int numero1 = Integer.parseInt(numero1Input.getText().toString());
            int numero2 = Integer.parseInt(numero2Input.getText().toString());
            int resultado = numero1 - numero2;

            Toast.makeText(this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar(View view) {
        if (validarInputs()) {
            int numero1 = Integer.parseInt(numero1Input.getText().toString());
            int numero2 = Integer.parseInt(numero2Input.getText().toString());
            int resultado = numero1 * numero2;

            Toast.makeText(this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir(View view) {
        if (validarInputs()) {
            int numero1 = Integer.parseInt(numero1Input.getText().toString());
            int numero2 = Integer.parseInt(numero2Input.getText().toString());

            if (numero2 == 0) {
                Toast.makeText(this, "Erro: Não é possivel dividir por zero", Toast.LENGTH_SHORT).show();
                return;
            }

            int resultado = numero1 / numero2;
            Toast.makeText(this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validarInputs() {
        if (numero1Input.getText().toString().isEmpty() || numero2Input.getText().toString().isEmpty()) {
            Toast.makeText(this, "Preencha ambos os números!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
