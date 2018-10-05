package c.borra.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class reporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);
    }

    public void inicio(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void rec(View view) {
        Intent r = new Intent(this,recordatorio.class);
        startActivity(r);
    }

    public void bita(View view) {
        Intent b = new Intent(this,bitacora.class);
        startActivity(b);
    }
}
