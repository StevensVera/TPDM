package mx.edu.ittepic.tpdm_u1_practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Impuesto extends AppCompatActivity {

EditText text1,text2;
Spinner sp;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impuesto);

        text1 = (EditText) findViewById(R.id.editText);
        text2 = (EditText) findViewById(R.id.editText2);
        sp = (Spinner) findViewById(R.id.spinner);
        String []Opciones={"ISR","IVA","IETU"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Opciones);
        sp.setAdapter(adapter);


        btn1 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String Valor1 = text1.getText().toString();
            String Valor2 = text2.getText().toString();
            Double num1 = Double.parseDouble(Valor1);
            //Double resultado = Double.parseDouble(Valor2);
            String select = sp.getSelectedItem().toString();
             if(select.equals("ISR")){
                 Double isr = num1*(0.07)+num1;
                 String resu= String.valueOf(isr);
                 text2.setText(resu);
             }else {
                 if (select.equals("IVA")){
                     Double isr = num1*(0.16)+num1;
                     String resu= String.valueOf(isr);
                     text2.setText(resu);
                 }else{
                     if (select.equals("IETU")){
                         Double isr = num1*(0.19)+num1;
                         String resu= String.valueOf(isr);
                         text2.setText(resu);
                     }
                 }

             }



            }//public void
        });




    }



}
