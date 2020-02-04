package com.example.tugas3_10rpl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity implements View.OnClickListener {
    EditText txtAngka1,txtAngka2;
    TextView tvHasil, tv_user;
    Button btnTambah,btnKurang,btnKali,btnBagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAngka1 = findViewById(R.id.txtAngka1);
        txtAngka2 = findViewById(R.id.txtAngka2);
        tvHasil = findViewById(R.id.tvHasil);
        tv_user = findViewById(R.id.tv_user);
        btnBagi = findViewById(R.id.btnBagi);
        btnKali = findViewById(R.id.btnKali);
        btnKurang = findViewById(R.id.btnKurang);
        btnTambah = findViewById(R.id.btnTambah);
        btnBagi.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnTambah.setOnClickListener(this);

        String username;
        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            username = "null";
        }else{
            username = bundle.getString("user");
        }tv_user.setText(username);
    }
    public void onClick(View view){
        double Angka1 = Double.parseDouble(txtAngka1.getText().toString());
        double Angka2 = Double.parseDouble(txtAngka2.getText().toString());
        double c=0;
        switch(view.getId()){
            case R.id.btnBagi:
                c=Angka1/Angka2;
                break;
            case R.id.btnKali:
                c=Angka1*Angka2;
                break;
            case R.id.btnKurang:
                c=Angka1-Angka2;
                break;
            case R.id.btnTambah:
                c=Angka1+Angka2;
                break;
        }
        tvHasil.setText(Double.toString(c));
        if (txtAngka1.getText().toString().isEmpty()|| txtAngka2.getText().toString().isEmpty()){
            Toast.makeText(calculator.this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(calculator.this, "Bisa dihitung", Toast.LENGTH_SHORT).show();
        }

    }
}
