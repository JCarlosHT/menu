package c.borra.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bita(View view) {
        Intent bitacora = new Intent(this,bitacora.class);
        startActivity(bitacora);
    }

    public void repo(View view) {
        Intent reporte = new Intent(this,reporte.class);
        startActivity(reporte);
    }

    public void alar(View view) {
        Intent a = new Intent(this,recordatorio.class);
        startActivity(a);
    }
}
