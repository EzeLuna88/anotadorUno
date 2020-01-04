package com.example.anotadoruno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.botonAnotadorMainActivity)
    Button botonAnotadorMainActivity;
    @BindView(R.id.botonHistorialMainActivity)
    Button botonHistorialMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

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
