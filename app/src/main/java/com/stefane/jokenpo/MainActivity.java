package com.stefane.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada(0);
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada(1);
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada(2);
    }

    public void opcaoSelecionada(int opcaoSelecionada){

        int opcaoApp = new Random().nextInt(3);

        ImageView imagem = findViewById(R.id.exibicaoOpcaoApp);

        TextView texto = findViewById(R.id.exibicaoResultado);

        switch(opcaoApp){
            case 0:
                imagem.setImageResource(R.drawable.pedra);
                break;
            case 1:
                imagem.setImageResource(R.drawable.papel);
                break;
            case 2:
                imagem.setImageResource(R.drawable.tesoura);
                break;
        }

        if((opcaoApp == 0 && opcaoSelecionada == 2 ) || (opcaoApp == 1 && opcaoSelecionada == 0) ||
                (opcaoApp == 2 && opcaoSelecionada == 1)){ // App ganhou!
            texto.setText("Você perdeu! :(");
        }else if((opcaoSelecionada == 0 && opcaoApp == 2 ) || (opcaoSelecionada == 1 && opcaoApp == 0) ||
                (opcaoSelecionada == 2 && opcaoApp == 1)){ // Usuário ganhou!
            texto.setText("Você ganhou! :)");
        }else{ // Empatou!
            texto.setText("Empatamos! :|");
        }

    }

}
