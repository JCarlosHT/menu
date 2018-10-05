package c.borra.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class recordatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorio);
    }

    public void repo(View view) {
        Intent rep = new Intent(this,reporte.class);
        startActivity(rep);
    }

    public void bita(View view) {
        Intent bita = new Intent(this,bitacora.class);
        startActivity(bita);
    }

    public void inicio(View view) {
        Intent ini = new Intent(this,MainActivity.class);
        startActivity(ini);
    }
}
