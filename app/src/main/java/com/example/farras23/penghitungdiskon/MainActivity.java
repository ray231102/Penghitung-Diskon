package com.example.farras23.penghitungdiskon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText harga, diskon;
    Button hasil;
    TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        harga = (EditText)findViewById(R.id.editText_hrgbarang);
        diskon = (EditText)findViewById(R.id.editText_discount);
        hasil = (Button) findViewById(R.id.hitung);
        total = (TextView)findViewById(R.id.txt_hasil);
        hasil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int nharga = Integer.parseInt(harga.getText().toString());
                int ndiskon = Integer.parseInt(diskon.getText().toString());
                int diskon = ndiskon * nharga;
                int totaldiskon = diskon / 100;
                int totalbayar = nharga - totaldiskon;
                total.setText(String.valueOf(totalbayar));
            }
        });
    }
    public void keluar (View view){
        finish();
    }
}
