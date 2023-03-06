package com.ppgb.photoindicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

import Dialogs.DialogSimplesInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instância o actionbar
        ActionBar actionBar = getSupportActionBar();
        //mostrando o botão voltar/fechar
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_close_24);

        Button btnmenor35 = findViewById(R.id.btnmenor35);
        Button btnmaior35 = findViewById(R.id.btnmaior35);
        FloatingActionButton fbtnHelp = findViewById(R.id.fbtn_help);

        btnmenor35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenor35 = new Intent(MainActivity.this,TelaRNmenor35.class);
                startActivity(telaMenor35);

            }
        });
        btnmaior35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMaior35 = new Intent(MainActivity.this, TelaRNmaior35.class);
                startActivity(telaMaior35);
            }
        });

        fbtnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "Aplicativo desenvolvido pela equipe de pesquisa do PPGB/UnP\n\n" +
                        "Suporte para a equipe de saúde na indicação do uso da fototerapia para recém nascidos.\n" +
                        "App de fácil manuseio com preenchimento de perguntas dicotômicas (sim/não) associadas ao valor da bilirrubina sérica, cujos parâmetros estão baseados no Protocolo NICE. \n" +
                        "A utilização dessa ferramenta garantirá a prestação de cuidados de qualidade de maneira prática e ágil.\n\n" +
                        "Autores: \nDr. Jan Erik Mont Gomery Pinto\nDr. Ricardo Cobucci\nJullyana Davanyelle dos Santos Oliveira\n" +
                        "\n" +
                        "Fonte de referência:\n" +
                        "AMOS, Rachel C.; JACOB, Hannah; LEITH, Wynne. Jaundice in newborn babies " +
                        "under 28 days: NICE guideline 2016 (CG98). Archives of Disease in Childhood" +
                        "-Education and Practice, v. 102, n. 4, p. 207-209, 2017.\n\n" +
                        "DOI:\nhttps://doi.org/10.1136/archdischild-2016-311556";
                String titulo = "Sobre o aplicativo";
                dialogInformation(msg, titulo);
            }
        });


    }
    private void dialogInformation(String msg, String Titulo) {
        DialogSimplesInfo simplesDialog = new DialogSimplesInfo(msg, Titulo);
        simplesDialog.show(getSupportFragmentManager(),"TAGmsg");

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                finishAffinity();
                System.exit(0);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}