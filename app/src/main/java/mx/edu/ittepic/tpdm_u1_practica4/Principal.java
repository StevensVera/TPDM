package mx.edu.ittepic.tpdm_u1_practica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    ListView Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Lista = (ListView) findViewById(R.id.listamenu);

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:abrirVentanaImagen();
                        break;
                    case 1:abrirImpuesto();
                        break;
                    case 2:abrirAcecaDe();
                        break;
                    default:
                        finish();

                }

            }
        });
    }

    public void abrirVentanaImagen(){
        Intent VentanaImagen = new Intent(this,VentanaImagen.class);
        startActivity(VentanaImagen);

    }

    public void abrirImpuesto(){
        Intent VentantaImpuesto = new Intent(this,Impuesto.class);
        startActivity(VentantaImpuesto);
    }

    public void abrirAcecaDe(){
        Intent VentanaAcerca = new Intent(this,AcercaDe.class);
        startActivity(VentanaAcerca);
    }

}
