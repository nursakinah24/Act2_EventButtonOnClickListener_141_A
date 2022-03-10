package com.example.activity2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
