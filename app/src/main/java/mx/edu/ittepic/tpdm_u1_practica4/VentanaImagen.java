package mx.edu.ittepic.tpdm_u1_practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class VentanaImagen extends AppCompatActivity {
    Spinner sp;
    ImageView img;

    int[] imagenes={
       R.drawable.tanque1,
       R.drawable.tanque2,
       R.drawable.tanque3,
       R.drawable.tanque4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_imagen);
        cambiarimagen();
    }
public void cambiarimagen(){

  img=(ImageView) findViewById(R.id.imageView3);
    sp = (Spinner) findViewById(R.id.spinner2);
    sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            img.setImageResource(imagenes[position]);
        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

}


}
