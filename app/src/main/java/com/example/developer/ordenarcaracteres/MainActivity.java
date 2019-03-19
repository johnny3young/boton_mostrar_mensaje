package com.example.developer.ordenarcaracteres;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

    Button ordenarCaracteres;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ordenarCaracteres = (Button) findViewById(R.id.ordenarCaracteres);
        editText2 = (EditText) findViewById(R.id.editText2);

        ordenarCaracteres.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText("Hola Mundo");

    }
}
