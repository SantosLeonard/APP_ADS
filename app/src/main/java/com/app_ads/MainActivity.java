package com.app_ads;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v){
        EditText edt_texto1 = findViewById(R.id.edt_texto1);
        EditText edt_texto2 = findViewById(R.id.edt_texto2);
        String texto_final = edt_texto1.getText().toString() + edt_texto2.getText().toString();
        Toast.makeText(MainActivity.this, texto_final,Toast.LENGTH_LONG).show();
    }
    public void onClickBtnReset(View v){
        EditText edt_texto1 = findViewById(R.id.edt_texto1);
        EditText edt_texto2 = findViewById(R.id.edt_texto2);
        edt_texto1.getText().clear();
        edt_texto2.getText().clear();
    }
}
