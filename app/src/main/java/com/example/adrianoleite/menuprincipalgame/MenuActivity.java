package com.example.adrianoleite.menuprincipalgame;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MenuActivity extends AppCompatActivity {

    private Button btPlay, btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Referencia nosso objeto com o layout

        btPlay = (Button) findViewById(R.id.btPlay);
        btSair = (Button) findViewById(R.id.btSair);

        //Cria a instancia da fonte que será utilizada
        Typeface fonte = Typeface.createFromAsset(getAssets(), "fonts/angrybirds.ttf");

        //Aplica a fonte nos botoes do game
        //btPlay.setTypeFace(fonte);
        //btSair.setTypeFace(fonte);

    }

    public void play(View v){
        //Exibe uma mensagem para usuario informando que o jogo ainda está em construção
        Toast.makeText(this, "O Jogo ainda está sendo construido", Toast.LENGTH_SHORT).show();
    }
    public void sair(View v){
        //Finaliza a active atual
        finish();
    }



}
