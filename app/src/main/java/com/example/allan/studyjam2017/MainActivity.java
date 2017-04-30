package com.example.allan.studyjam2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOi;
    private TextView tviOi;
    private EditText eteOi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOi = (Button) findViewById(R.id.btn_oi);
        tviOi = (TextView) findViewById(R.id.tvi_oi);
        eteOi = (EditText) findViewById(R.id.ete_oi);
        btnOi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = eteOi.getText().toString();
                tviOi.setText(mensagem);
            }
        });
    }
}
