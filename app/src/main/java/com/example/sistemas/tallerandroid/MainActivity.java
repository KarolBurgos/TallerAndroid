package com.example.sistemas.tallerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText resultado,num1,num2;
    private TextView textResultado,al1,al2;
    private int contador;
    private int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultado=(EditText)findViewById(R.id.resultado);
        num1 =(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);

        textResultado=(TextView)findViewById(R.id.txtRes);
        num1.setText(String.valueOf((int)(Math.random()*12+1)));
        num2.setText((int)(Math.random()*12+1));
        contador=0;

    }
    public void acercade(View view){
        Intent i=new Intent (this,acercaDe.class);
        startActivity(i);
    }

    public void operar(View view){

       if(Integer.valueOf(num1.getText().toString())*Integer.valueOf(num2.getText().toString())==Integer.valueOf(textResultado.getText().toString()))
       {
           Toast resu=Toast.makeText(this,"Numero correcto: ",Toast.LENGTH_LONG);
           resu.show();
           num1.setText((int)Math.random()*12+1);
           num2.setText((int)Math.random()*12+1);
           contador++;
       }else
       {
           Toast resu=Toast.makeText(this,"Numero incorrecto: ",Toast.LENGTH_LONG);
           resu.show();
       }
       if(contador==5)
       {
           finish();
       }

         }

}
