package es.ujaen.git.sm1718_practica2;


import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.ServerSocket;

//Si está en gris es que no está siendo usado.

public class MainActivity extends AppCompatActivity {
    private ServerSocket serverSocket;

    Handler UIHandler;
    Thread Thread1 = null;

    private EditText EDITTTEXT;

    private String datosvolatiles = "Hola";
    private TextView volatil = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            datosvolatiles = savedInstanceState.getString("volatil", datosvolatiles);
        }

        volatil = (TextView) findViewById(R.id.volatil);
        volatil.setText(datosvolatiles);
 //Poniendo parámetros, aun no adaptado a nuestra practica.
        EDITTTEXT = (EditText) findViewById(R.id.editText_login_user);
        EDITTTEXT = (EditText) findViewById(R.id.editText_login_pass);
        EDITTTEXT = (EditText) findViewById(R.id.editText_login_ip);
        EDITTTEXT = (EditText) findViewById(R.id.editText_login_port);

    }

    public void onIcon(View vista) {
        datosvolatiles = datosvolatiles.toUpperCase();
        volatil.setText(datosvolatiles);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("volatil", datosvolatiles);
    }


}
