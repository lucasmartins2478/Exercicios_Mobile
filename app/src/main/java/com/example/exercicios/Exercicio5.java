package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void salvarPreferencias(View view){
        CheckBox receberNotificacoes = findViewById(R.id.receberNotificacoes);
        CheckBox modoEscuro = findViewById(R.id.modoEscuro);
        CheckBox lembrarLogin = findViewById(R.id.lembrarLogin);

        String preferencias = "";

        if(receberNotificacoes.isChecked()){
            preferencias = "Receber Notificações; ";
        }
        if(modoEscuro.isChecked()){
            preferencias += "Modo escuro; ";
        }
        if(lembrarLogin.isChecked()){
            preferencias += "Lembrar login; ";
        }

        if(!lembrarLogin.isChecked() && !modoEscuro.isChecked() && !receberNotificacoes.isChecked()){
            Toast.makeText(this, "Nenhuma preferência escolhida", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, preferencias, Toast.LENGTH_SHORT).show();

        }
    }

}