package com.example.anotadoruno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.botonAnotadorMainActivity)
    MaterialButton botonAnotadorMainActivity;
    @BindView(R.id.botonHistorialMainActivity)
    MaterialButton botonHistorialMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButtonAnotador();
    }

    private void clickButtonAnotador() {
        botonAnotadorMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnotadorActivity.class);
                startActivity(intent);
            }
        });
    }
}
