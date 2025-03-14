package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

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

    public void cadastrarUsuario(View view) {
        EditText nomeInput = findViewById(R.id.nome);
        String nome = nomeInput.getText().toString().trim();

        EditText idadeInput = findViewById(R.id.idade);
        String idade = idadeInput.getText().toString().trim();

        EditText cidadeInput = findViewById(R.id.cidade);
        String cidade = cidadeInput.getText().toString().trim();

        EditText telefoneInput = findViewById(R.id.telefone);
        String telefone = telefoneInput.getText().toString().trim();

        EditText emailInput = findViewById(R.id.email);
        String email = emailInput.getText().toString().trim();

        CheckBox corBranco = findViewById(R.id.corBranco);
        CheckBox corPreta = findViewById(R.id.corPreto);
        CheckBox corColorido = findViewById(R.id.corColorido);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        // Verificar se pelo menos uma CheckBox está marcada
        boolean algumaCheckBoxMarcada = corBranco.isChecked() || corPreta.isChecked() || corColorido.isChecked();

        // Verificar se o RadioGroup tem um item selecionado
        boolean radioSelecionado = radioGroup.getCheckedRadioButtonId() != -1;

        // Verificar se todos os campos estão preenchidos e pelo menos uma CheckBox e um RadioButton foram marcados
        if (nome.isEmpty() || idade.isEmpty() || cidade.isEmpty() || telefone.isEmpty() || email.isEmpty() || !algumaCheckBoxMarcada || !radioSelecionado) {
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Usuário cadastrado!", Toast.LENGTH_SHORT).show();
        }
    }

}