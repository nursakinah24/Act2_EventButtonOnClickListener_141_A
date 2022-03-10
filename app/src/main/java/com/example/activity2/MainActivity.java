package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignIn);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                validation();
            }
        });
    }
    public void validation(){
        nama = edemail.getText().toString();
        password = edpassword.getText().toString();

        String email = "nursakinah@gmail.com";
        String pass = "141";

        if (nama.isEmpty() && password.isEmpty())
        {
            edemail.setError("Email Diperlukan");
            edpassword.setError("Password Diperlukan");
        } else {
            if (nama.equals("nursakinah@gmail.com") && password.equals("141")) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Berhasil. Email anda : " + nama + " dan Password anda : " + password + "", Toast.LENGTH_LONG);
                t.show();
                Bundle b = new Bundle();
                b.putString("a", nama.trim());
                b.putString("b", password.trim());
                Intent i = new Intent(getApplicationContext(), ActivityHasil.class);
                i.putExtras(b);
                startActivity(i);
            } else if (!nama.equals("nursakinah@gmail.com") && password.equals("141")) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Email salah", Toast.LENGTH_LONG);
                t.show();
            } else if (nama.equals("nursakinah@gmail.com") && !password.equals("141")) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Password salah", Toast.LENGTH_LONG);
                t.show();
            } else {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Email dan Password salah", Toast.LENGTH_LONG);
                t.show();
            }
        }
    }
}