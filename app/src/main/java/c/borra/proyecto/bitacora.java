package c.borra.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bitacora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitacora);
    }

    public void inicio(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void repo(View view) {
        Intent r = new Intent(this,reporte.class);
        startActivity(r);
    }

    public void alar(View view) {
        Intent alarma = new Intent(this,recordatorio.class);
        startActivity(alarma);
    }
}
