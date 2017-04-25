package com.example.genesiszul.calculadoramagica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nume1,nume2;
    Button sum,res,mul,div;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        nume1 = (EditText) findViewById(R.id.num1);
        nume2 = (EditText) findViewById(R.id.num2);

        sum = (Button) findViewById(R.id.sumar);
        res = (Button) findViewById(R.id.restar);
        mul = (Button) findViewById(R.id.div);
        div = (Button) findViewById(R.id.multi);

        resultado = (TextView) findViewById(R.id.resul);

        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String n1 = nume1.getText().toString();
        String n2 = nume2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2= Integer.parseInt(n2);

        int rpta=0;

        switch (v.getId()){
            case R.id.sumar:
                rpta = entero1 + entero2;
                break;
            case R.id.restar:
                rpta = entero1 - entero2;
                break;
            case R.id.multi:
                rpta = entero1 * entero2;
                break;
            case R.id.div:
                rpta = entero1 / entero2;
                break;
        }

        resultado.setText(""+rpta);

    }
}
