package es.vcarmen.direccionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio_01C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_01_c);
    }
    public void boton4(View view) {
        Intent intent = new Intent(this, Ejercicio_01F.class);
        startActivity(intent);
    }
}
