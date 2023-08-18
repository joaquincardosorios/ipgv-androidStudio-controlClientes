package com.example.jrc_appcontadorpersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSumar;
    Button btnRestar;
    TextView contador;
    int contadorNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = findViewById(R.id.btn_mas);
        btnRestar = findViewById(R.id.btn_menos);
        contador = findViewById(R.id.txt_number);
        contadorNum = Integer.parseInt(contador.getText().toString());
        checkContador();
    }

    public void sumar(View view){
        if(contadorNum == 20){
            Toast.makeText(this, "Alcanzó el máximo de Clientes", Toast.LENGTH_LONG).show();
        } else {
            contadorNum++;
            contador.setText(contadorNum+"");
            checkContador();
        }
    }

    public void restar(View view){
        if(contadorNum == 0){
            Toast.makeText(this, "No pueden haber menos de cero clientes", Toast.LENGTH_LONG).show();
        } else {
            contadorNum--;
            contador.setText(contadorNum+"");
            checkContador();
        }
    }

    private  void checkContador(){
        if (contadorNum <= 7){
            contador.setTextColor(Color.GREEN);
        } else if(contadorNum > 7 && contadorNum<=14){
            contador.setTextColor(Color.rgb(255,165,0));
        } else {
            contador.setTextColor(Color.RED);
        }
    }
}