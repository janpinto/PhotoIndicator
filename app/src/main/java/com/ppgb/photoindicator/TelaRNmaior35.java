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
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class TelaRNmaior35 extends AppCompatActivity {
    private Switch sw0, sw1, sw2, sw3, sw4, sw5, sw7, sw8, sw9, sw10, sw11;
    AutoCompleteTextView spIG;
    TextView txtdoencagrave, txtfototerapia, valBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_rnmaior35);
        //instância o actionbar
        ActionBar actionBar = getSupportActionBar();
        //mostrando o botão voltar
        actionBar.setDisplayHomeAsUpEnabled(true);

        sw0 = findViewById(R.id.sw_0);
        sw1 = findViewById(R.id.sw_1);
        sw2 = findViewById(R.id.sw_2);
        sw3 = findViewById(R.id.sw_3);
        sw4 = findViewById(R.id.sw_4);
        sw5 = findViewById(R.id.sw_5);
        sw7 = findViewById(R.id.sw_7);
        sw8 = findViewById(R.id.sw_8);
        sw9 = findViewById(R.id.sw_9);
        sw10 = findViewById(R.id.sw_10);
        sw11 = findViewById(R.id.sw_11);
        txtdoencagrave = findViewById(R.id.txt_deoncagrave);
        txtfototerapia = findViewById(R.id.txt_fototerapia);
        valBT = findViewById(R.id.txt_bt);
        spIG = findViewById(R.id.spIG);


        /* Carregar o Spinner com idade gestacional*/
        String[] listaIG = getResources().getStringArray(R.array.idadegestacao2);
        ArrayAdapter<String> adapterIG =new ArrayAdapter<String>(this,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item,listaIG);
        adapterIG.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spIG.setAdapter(adapterIG);


        /*Setar o valor da fototerapia para nada*/
        txtfototerapia.setText("");
        spIG.setEnabled(false);
        /*Verificar os checklist de RN fatores de risco*/
        sw0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw0.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw1.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw2.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw3.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw4.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw5.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw7.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw8.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw9.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw10.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
                }
                resetObjs();
            }
        });
        sw11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw11.isChecked()){
                    txtdoencagrave.setText("SIM");
                    txtdoencagrave.setTextColor(Color.parseColor("#FB0738"));
                }else if(!sw0.isChecked() && !sw1.isChecked() && !sw2.isChecked() && !sw3.isChecked()
                        && !sw4.isChecked() && !sw5.isChecked() && !sw7.isChecked() && !sw8.isChecked() && !sw9.isChecked()
                        && !sw10.isChecked() && !sw11.isChecked()){
                    txtdoencagrave.setText("NÃO");
                    txtdoencagrave.setTextColor(Color.parseColor("#41CA06"));
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
                    txtfototerapia.setText("");
                }
            }
        });

        /*Verifica a possibilidade de fototerapia a partir da BT e da iddde gestacional*/
        spIG.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strBT = valBT.getText().toString();
                String strDoenca = txtdoencagrave.getText().toString();

                if(!strBT.equals("") && !strBT.equals(null)) {
                    double btval = Double.parseDouble(strBT);
                    switch (i){
                        case 1:
                            if(strDoenca=="SIM" && btval>=6 && btval<=15){
                                txtfototerapia.setText("SIM");
                                txtfototerapia.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=8 && btval<=18){
                                txtfototerapia.setText("SIM");
                                txtfototerapia.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtfototerapia.setText("NÃO");
                                txtfototerapia.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                        case 2:
                            if(strDoenca=="SIM" && btval>=8 && btval<=18){
                                txtfototerapia.setText("SIM");
                                txtfototerapia.setTextColor(Color.parseColor("#FB0738"));
                            }else if(strDoenca=="NÃO" && btval>=9 && btval<=21){
                                txtfototerapia.setText("SIM");
                                txtfototerapia.setTextColor(Color.parseColor("#FB0738"));
                            }else{
                                txtfototerapia.setText("NÃO");
                                txtfototerapia.setTextColor(Color.parseColor("#41CA06"));
                            }
                            break;
                    }

                }else{
                    txtfototerapia.setText("");
                    spIG.setListSelection(0);
                }
            }
        });

    }

    private void resetObjs() {
        valBT.setText("");
        spIG.setText(spIG.getAdapter().getItem(0).toString(),false);
        txtfototerapia.setText("");
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