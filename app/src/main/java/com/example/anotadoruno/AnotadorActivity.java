package com.example.anotadoruno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.anotadoruno.fragments.AmistosoCrearJugadoresFragment;
import com.example.anotadoruno.fragments.GrupoOAmistosoFragment;

public class AnotadorActivity extends AppCompatActivity implements GrupoOAmistosoFragment.NotificadorBotonAmistoso, AmistosoCrearJugadoresFragment.NotificadorBotonEmpezarPartida {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotador);

        GrupoOAmistosoFragment grupoOAmistosoFragment = new GrupoOAmistosoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorDeFragment, grupoOAmistosoFragment).commit();
    }

    @Override
    public void hicieronClickBotonAmistoso() {
    AmistosoCrearJugadoresFragment amistosoCrearJugadoresFragment = new AmistosoCrearJugadoresFragment();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.contenedorDeFragment, amistosoCrearJugadoresFragment).commit();

    }

    @Override
    public void hicieronClickBotonEmpezarPartida() {

    }
}
