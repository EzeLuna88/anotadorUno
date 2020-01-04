package com.example.anotadoruno.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.anotadoruno.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class GrupoOAmistosoFragment extends Fragment {

    @BindView(R.id.botonCrearGrupoEleccionFragment)
    Button botonCrearGrupoEleccionFragment;
    @BindView(R.id.botonElegirGrupoEleccionFragment)
    Button botonElegirGrupoEleccionFragment;
    @BindView(R.id.botonAmistosoEleccionFragment)
    Button botonAmistosoEleccionFragment;
    private NotificadorBotonAmistoso notificadorBotonAmistoso;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.notificadorBotonAmistoso = (NotificadorBotonAmistoso) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_grupo_o_amistoso, container, false);

        ButterKnife.bind(this, view);

        botonAmistosoEleccionFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            notificadorBotonAmistoso.hicieronClickBotonAmistoso();
            }
        });

        return view;
    }


    public interface NotificadorBotonAmistoso {
        public void hicieronClickBotonAmistoso();
    }
}
