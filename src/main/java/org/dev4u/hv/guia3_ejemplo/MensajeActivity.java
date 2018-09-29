package org.dev4u.hv.guia3_ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MensajeActivity extends AppCompatActivity {

    Button btnAdd;
    EditText contenido;
    //variable que me dice el estado
    private AdaptadorMensaje adaptadorMensaje;
    private ArrayList<Mensaje> mensajeArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        btnAdd=findViewById(R.id.btnAgregar);
        contenido=findViewById(R.id.txtEntrada);
        /*btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                Date date = new Date();
                Mensaje m = new Mensaje(contenido.getText().toString(),dateFormat.format(date));
                //TODO agrego a la lista y luego actualizo el adaptador, de lo contrario no se mostraria el cambio
                mensajeArrayList.add(m);
                adaptadorMensaje.notifyDataSetChanged();
            }
        });
        */
    }
}
