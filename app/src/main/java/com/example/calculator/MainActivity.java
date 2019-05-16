package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner spinnerOperator;
    EditText edt_Number1, edt_Number2, Hasil;
    Button btn;
    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                spinnerOperator = (Spinner) findViewById(R.id.operator);
                edt_Number1 = (EditText) findViewById(R.id.edt1);
                edt_Number2 = (EditText) findViewById(R.id.edt2);
                Hasil = (EditText) findViewById(R.id.edthasil);


                item = (String) spinnerOperator.getSelectedItem();

                if (item.trim().equals("+")) {
                    float result = Float.parseFloat(edt_Number1.getText().toString()) + Float.parseFloat(edt_Number2.getText().toString());
                    Hasil.setText(Float.toString(result));
                } else if (item.trim().equals("-")) {
                    float resuslt = Float.parseFloat(edt_Number1.getText().toString()) - Float.parseFloat(edt_Number2.getText().toString());
                    Hasil.setText(Float.toString(resuslt));
                } else if (item.trim().equals("*")) {
                    float result = Float.parseFloat(edt_Number1.getText().toString()) * Float.parseFloat(edt_Number2.getText().toString());
                    Hasil.setText(Float.toString(result));
                } else if (item.trim().equals("/")) {
                    float result = Float.parseFloat(edt_Number1.getText().toString()) / Float.parseFloat(edt_Number2.getText().toString());
                    Hasil.setText(Float.toString(result));
                }
            }


        };

        btn = (Button) findViewById(R.id.btn_hasil);
        btn.setOnClickListener(listener);

    }
}


