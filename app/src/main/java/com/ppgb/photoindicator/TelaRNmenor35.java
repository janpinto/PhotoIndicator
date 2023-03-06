package com.ppgb.photoindicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class TelaRNmenor35 extends AppCompatActivity {
    private Switch sw0, sw1, sw2, sw3, sw4, sw5, sw6, sw7;
    private AutoCompleteTextView spIG;
    TextView txtresult, txtresult2, valBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_rnmenor35);
        //instância o actionbar
        ActionBar actionBar = getSupportActionBar();
        //mostrando o botão voltar
        actionBar.setDisplayHomeAsUpEnabled(true);

        sw0 = findViewById(R.id.sw0);
        sw1 = findViewById(R.id.sw1);
        sw2 = findViewById(R.id.sw2);
        sw3 = findViewById(R.id.sw3);
        sw4 = findViewById(R.id.sw4);
        sw5 = findViewById(R.id.sw5);
        sw6 = findViewById(R.id.sw6);
        sw7 = findViewById(R.id.sw7);
        txtresult = findViewById(R.id.txt_resul2);
        txtresult2 = findViewById(R.id.txt_fototerapia);
        valBT = findViewById(R.id.txt_bt);
        spIG = findViewById(R.id.spIG);

        /* Carregar o Spinner com idade gestacional*/
        String[] listaIG = getResources().getStringArray(R.array.idadegestacao);
        ArrayAdapter<String> adapterIG =new ArrayAdapter<String>(this,
               com.google.android.material.R.layout.support_simple_spinner_dropdown_item,listaIG);
        adapterIG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spIG.setAdapter(adapterIG);
        /*Setar o valor da fototerapia para nada*/
        txtresult2.setText("");
        spIG.setEnabled(false);
        /*Verificar os checklist de RN fatores de risco*/
        sw0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw0.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw1.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw2.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw3.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw4.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw5.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw6.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw7.isChecked()){
                    txtresult.setText("SIM");
                    txtresult.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked() && !sw4.isChecked()
                        && !sw5.isChecked() && !sw6.isChecked() && !sw7.isChecked()){
                    txtresult.setText("NÃO");
                    txtresult.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });

        /*Focar digitação de valBT*/
        valBT.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String strBT = valBT.getText().toString();
                if(!strBT.equals("") && !strBT.equals(null)){
                    spIG.setEnabled(true);
                }else{
                    spIG.setEnabled(false);
                    txtresult2.setText("");
                }
            }
        });

        /*Verifica a possibilidade de fototerapia a partir da BT e da iddde gestacional*/
        spIG.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strBT = valBT.getText().toString();
                String strDoenca = txtresult.getText().toString();

                if(!strBT.equals("") && !strBT.equals(null)) {
                    double btval = Double.parseDouble(strBT);
                    switch (i){
                        case 1:
                            if(strDoenca=="SIM" && btval>=4 && btval<=6){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=4 && btval<=8){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtresult2.setText("NÃO");
                                txtresult2.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                        case 2:
                            if(strDoenca=="SIM" && btval>=4 && btval<=8){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=5 && btval<=10){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtresult2.setText("NÃO");
                                txtresult2.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                        case 3:
                            if(strDoenca=="SIM" && btval>=5 && btval<=10){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=6 && btval<=12){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtresult2.setText("NÃO");
                                txtresult2.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                        case 4:
                            if(strDoenca=="SIM" && btval>=5 && btval<=12){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=6 && btval<=13){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtresult2.setText("NÃO");
                                txtresult2.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                        case 5:
                            if(strDoenca=="SIM" && btval>=5 && btval<=13){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=6 && btval<=14){
                                txtresult2.setText("SIM");
                                txtresult2.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtresult2.setText("NÃO");
                                txtresult2.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                    }

                }else{
                    txtresult2.setText("");
                    spIG.setSelection(0);
                }
            }
        });

    }
    public void resetObjs(){
        valBT.setText("");
        spIG.setText(spIG.getAdapter().getItem(0).toString(),false);
        txtresult2.setText("");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}

