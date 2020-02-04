package com.example.tugas3_10rpl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText txt_username, txt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btnLogin);
        txt_username = findViewById(R.id.Username);
        txt_password = findViewById(R.id.Password);
        TextView tv_forget = findViewById(R.id.tv_forget);
            String Text = "Forgot your login details? Get help signing in.";
            SpannableString ss=new SpannableString(Text);
            StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
            ss.setSpan(boldSpan,27,47 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            tv_forget.setText(ss);

            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(txt_username.getText().toString().equals("nadia") && txt_password.getText().toString().equals("nadia")){
                        Intent intent = new Intent(MainActivity.this, calculator.class);
                        String username = txt_username.getText().toString();
                        intent.putExtra("username", txt_username.getText().toString());
                        startActivity(intent);
                    }else{
                        txt_username.setError("Username anda salah");
                        txt_password.setError("Password anda salah");
                    }
                }
            });
    }
}
