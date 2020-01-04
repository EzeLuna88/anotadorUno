package com.example.anotadoruno.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.anotadoruno.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class AmistosoCrearJugadoresFragment extends Fragment {

    @BindView(R.id.editTextJugadorUno)
    TextInputEditText editTextJugadorUno;
    @BindView(R.id.editTextJugadorDos)
    TextInputEditText editTextJugadorDos;
    @BindView(R.id.editTextJugadorTres)
    TextInputEditText editTextJugadorTres;
    @BindView(R.id.editTextJugadorCuatro)
    TextInputEditText editTextJugadorCuatro;
    @BindView(R.id.editTextJugadorCinco)
    TextInputEditText editTextJugadorCinco;
    @BindView(R.id.editTextJugadorSeis)
    TextInputEditText editTextJugadorSeis;
    @BindView(R.id.editTextJugadorSiete)
    TextInputEditText editTextJugadorSiete;
    @BindView(R.id.editTextJugadorOcho)
    TextInputEditText editTextJugadorOcho;
    @BindView(R.id.editTextJugadorNueve)
    TextInputEditText editTextJugadorNueve;
    @BindView(R.id.editTextJugadorDiez)
    TextInputEditText editTextJugadorDiez;
    @BindView(R.id.botonEmpezarPartida)
    Button botonEmpezarPartida;
    @BindView(R.id.jugadorUno)
    TextInputLayout jugadorUno;
    @BindView(R.id.jugadorDos)
    TextInputLayout jugadorDos;
    @BindView(R.id.jugadorTres)
    TextInputLayout jugadorTres;
    @BindView(R.id.jugadorCuatro)
    TextInputLayout jugadorCuatro;
    @BindView(R.id.jugadorCinco)
    TextInputLayout jugadorCinco;
    @BindView(R.id.jugadorSeis)
    TextInputLayout jugadorSeis;
    @BindView(R.id.jugadorSiete)
    TextInputLayout jugadorSiete;
    @BindView(R.id.jugadorOcho)
    TextInputLayout jugadorOcho;
    @BindView(R.id.jugadorNueve)
    TextInputLayout jugadorNueve;
    @BindView(R.id.jugadorDiez)
    TextInputLayout jugadorDiez;
    String nombreJugadorUno;
    String nombreJugadorDos;
    String nombreJugadorTres;
    String nombreJugadorCuatro;
    String nombreJugadorCinco;
    String nombreJugadorSeis;
    String nombreJugadorSiete;
    String nombreJugadorOcho;
    String nombreJugadorNueve;
    String nombreJugadorDiez;

    public AmistosoCrearJugadoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_amistoso_crear_jugadores, container, false);
        ButterKnife.bind(this, view);

        setVisibilityJugador(editTextJugadorUno, jugadorDos);
        setVisibilityJugador(editTextJugadorDos, jugadorTres);
        setVisibilityJugador(editTextJugadorTres, jugadorCuatro);
        setVisibilityJugador(editTextJugadorCuatro, jugadorCinco);
        setVisibilityJugador(editTextJugadorCinco, jugadorSeis);
        setVisibilityJugador(editTextJugadorSeis, jugadorSiete);
        setVisibilityJugador(editTextJugadorSiete, jugadorOcho);
        setVisibilityJugador(editTextJugadorOcho, jugadorNueve);
        setVisibilityJugador(editTextJugadorNueve, jugadorDiez);



        nombreJugadorCuatro = editTextJugadorCuatro.getText().toString();
        nombreJugadorCinco = editTextJugadorCinco.getText().toString();
        nombreJugadorSeis = editTextJugadorSeis.getText().toString();
        nombreJugadorSiete = editTextJugadorSiete.getText().toString();
        nombreJugadorOcho = editTextJugadorOcho.getText().toString();
        nombreJugadorNueve = editTextJugadorNueve.getText().toString();
        nombreJugadorDiez = editTextJugadorDiez.getText().toString();

        botonEmpezarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreJugadorUno = editTextJugadorUno.getText().toString();
                nombreJugadorDos = editTextJugadorDos.getText().toString();
                if (nombreJugadorUno.matches("") || nombreJugadorDos.matches("")) {
                    Toast.makeText(getContext(), "La partida necesita minimo dos jugadores", Toast.LENGTH_SHORT).show();
                } else {
                    nombreJugadorTres = editTextJugadorTres.getText().toString();
                    if (nombreJugadorTres.matches("")){

                    }
                }


            }
        });


        return view;
    }

    private void setVisibilityJugador(TextInputEditText editTextJugador, final TextInputLayout numeroJugador) {
        editTextJugador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                numeroJugador.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

}
