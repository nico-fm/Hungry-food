package com.example.hp.hungryfood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnIniciar;
    private TextView txtResultado;
    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;


        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String campo_usuario = txtUsuario.getText().toString();
                String campo_password = txtPassword.getText().toString();

                if (campo_usuario.compareTo("gabriel") == 0 && campo_password.compareTo("gabriel") == 0) {
                    Intent a = new Intent(context, menu_principal.class);
                    String[] datos = new String[2];
                    datos[0] = txtUsuario.getText().toString();
                    datos[1] = txtPassword.getText().toString();
                    a.putExtra("datos_usuario", datos);
                    startActivity(a);

                } else {
                    btnIniciar.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            Toast mensaje = Toast.makeText(getApplicationContext(),
                                    "Usuario o Contrasena Incorrecta", Toast.LENGTH_SHORT);
                            mensaje.show();
                        }
                    });


                }
            }
        });
    }
}
