package com.example.anotadoruno;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;


public class EleccionGrupoFragment extends Fragment {

    @BindView(R.id.botonCrearGrupoEleccionFragment)
    Button botonCrearGrupoEleccionFragment;
    @BindView(R.id.botonElegirGrupoEleccionFragment)
    Button botonElegirGrupoEleccionFragment;
    @BindView(R.id.botonAmistosoEleccionFragment)
    Button botonAmistosoEleccionFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eleccion_grupo, container, false);

        ButterKnife.bind(this, view);

        botonAmistosoEleccionFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }


}
