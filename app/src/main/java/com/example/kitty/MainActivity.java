package com.example.kitty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTextView;
    Button btnOK, btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sposob3);
        tvTextView = findViewById(R.id.textView);
        btnOK = findViewById(R.id.btnOK);
        btnCancel = findViewById(R.id.btnCancel);
        View.OnClickListener oclBtn = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btnOK) {
                    tvTextView.setText("OK");
                }
                if (view.getId() == R.id.btnCancel) {
                    tvTextView.setText("cancel");
                }
            }
        };
        btnOK.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}

