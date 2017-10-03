package es.vcarmen.direccionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio_01E extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_01_e);
    }

    public void boton6(View view) {
        Intent intent = new Intent(this, Ejercicio_01B.class);
        startActivity(intent);
    }
    public void boton7(View view) {
        Intent intent = new Intent(this, Ejercicio_01D.class);
        startActivity(intent);
    }
}
