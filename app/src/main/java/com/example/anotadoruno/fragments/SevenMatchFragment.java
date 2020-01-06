package com.example.anotadoruno.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.anotadoruno.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SevenMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String NOMBRE_JUGADOR_CUATRO = "jugador cuatro";
    public static final String NOMBRE_JUGADOR_CINCO = "jugador cinco";
    public static final String NOMBRE_JUGADOR_SEIS = "jugador seis";
    public static final String NOMBRE_JUGADOR_SIETE = "jugador siete";


    @BindView(R.id.textViewJugadorUnoSevenMatch)
    TextView textViewJugadorUnoSevenMatch;
    @BindView(R.id.textViewJugadorDosSevenMatch)
    TextView textViewJugadorDosSevenMatch;
    @BindView(R.id.textViewJugadorTresSevenMatch)
    TextView textViewJugadorTresSevenMatch;
    @BindView(R.id.textViewJugadorCuatroSevenMatch)
    TextView textViewJugadorCuatroSevenMatch;
    @BindView(R.id.textViewJugadorCincoSevenMatch)
    TextView textViewJugadorCincoSevenMatch;
    @BindView(R.id.textViewJugadorSeisSevenMatch)
    TextView textViewJugadorSeisSevenMatch;
    @BindView(R.id.textViewJugadorSieteSevenMatch)
    TextView textViewJugadorSieteSevenMatch;
    private String jugadorUnoSevenMatch;
    private String jugadorDosSevenMatch;
    private String jugadorTresSevenMatch;
    private String jugadorCuatroSevenMatch;
    private String jugadorCincoSevenMatch;
    private String jugadorSeisSevenMatch;
    private String jugadorSieteSevenMatch;

    public SevenMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seven_match, container, false);
        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();
        jugadorUnoSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);
        jugadorCuatroSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CUATRO);
        jugadorCincoSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CINCO);
        jugadorSeisSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_SEIS);
        jugadorSieteSevenMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_SIETE);
        textViewJugadorUnoSevenMatch.setText(jugadorUnoSevenMatch);
        textViewJugadorDosSevenMatch.setText(jugadorDosSevenMatch);
        textViewJugadorTresSevenMatch.setText(jugadorTresSevenMatch);
        textViewJugadorCuatroSevenMatch.setText(jugadorCuatroSevenMatch);
        textViewJugadorCincoSevenMatch.setText(jugadorCincoSevenMatch);
        textViewJugadorSeisSevenMatch.setText(jugadorSeisSevenMatch);
        textViewJugadorSieteSevenMatch.setText(jugadorSieteSevenMatch);

        return view;
    }

}
