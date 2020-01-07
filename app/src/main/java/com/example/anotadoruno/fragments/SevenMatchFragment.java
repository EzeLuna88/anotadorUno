package com.example.anotadoruno.fragments;


import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUno)
    LinearLayout rondaUno;
    @BindView(R.id.rondaDos)
    LinearLayout rondaDos;
    @BindView(R.id.rondaTres)
    LinearLayout rondaTres;

    @BindView(R.id.partidaUnoUno)
    EditText partidaUnoUno;
    @BindView(R.id.partidaUnoDos)
    EditText partidaUnoDos;
    @BindView(R.id.partidaUnoTres)
    EditText partidaUnoTres;
    @BindView(R.id.partidaUnoCuatro)
    EditText partidaUnoCuatro;
    @BindView(R.id.partidaUnoCinco)
    EditText partidaUnoCinco;
    @BindView(R.id.partidaUnoSeis)
    EditText partidaUnoSeis;
    @BindView(R.id.partidaUnoSiete)
    EditText partidaUnoSiete;

    @BindView(R.id.partidaDosUno)
    EditText partidaDosUno;
    @BindView(R.id.partidaDosDos)
    EditText partidaDosDos;
    @BindView(R.id.partidaDosTres)
    EditText partidaDosTres;
    @BindView(R.id.partidaDosCuatro)
    EditText partidaDosCuatro;
    @BindView(R.id.partidaDosCinco)
    EditText partidaDosCinco;
    @BindView(R.id.partidaDosSeis)
    EditText partidaDosSeis;
    @BindView(R.id.partidaDosSiete)
    EditText partidaDosSiete;


    @BindView(R.id.buttonSiguienteRondaSevenMatch)
    Button buttonSiguienteRondaSevenMatch;

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

    @BindView(R.id.textViewPuntajeJugadorUno)
    TextView textViewPuntajeJugadorUno;
    @BindView(R.id.textViewPuntajeJugadorDos)
    TextView textViewPuntajeJugadorDos;
    @BindView(R.id.textViewPuntajeJugadorTres)
    TextView textViewPuntajeJugadorTres;
    @BindView(R.id.textViewPuntajeJugadorCuatro)
    TextView textViewPuntajeJugadorCuatro;
    @BindView(R.id.textViewPuntajeJugadorCinco)
    TextView textViewPuntajeJugadorCinco;
    @BindView(R.id.textViewPuntajeJugadorSeis)
    TextView TextViewPuntajeJugadorSeis;
    @BindView(R.id.textViewPuntajeJugadorSiete)
    TextView textViewPuntajeJugadorSiete;


    private String jugadorUnoSevenMatch;
    private String jugadorDosSevenMatch;
    private String jugadorTresSevenMatch;
    private String jugadorCuatroSevenMatch;
    private String jugadorCincoSevenMatch;
    private String jugadorSeisSevenMatch;
    private String jugadorSieteSevenMatch;
    private String limiteDePuntosSevenMatch;
    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;
    private Integer puntajeJugadorCuatro = 0;
    private Integer puntajeJugadorCinco = 0;
    private Integer puntajeJugadorSeis = 0;
    private Integer puntajeJugadorSiete = 0;

    private Integer contadorDeRonda = 1;


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

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoSevenMatch.setText(jugadorUnoSevenMatch);
        textViewJugadorDosSevenMatch.setText(jugadorDosSevenMatch);
        textViewJugadorTresSevenMatch.setText(jugadorTresSevenMatch);
        textViewJugadorCuatroSevenMatch.setText(jugadorCuatroSevenMatch);
        textViewJugadorCincoSevenMatch.setText(jugadorCincoSevenMatch);
        textViewJugadorSeisSevenMatch.setText(jugadorSeisSevenMatch);
        textViewJugadorSieteSevenMatch.setText(jugadorSieteSevenMatch);

        buttonSiguienteRondaSevenMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (TextUtils.isEmpty(partidaUnoUno.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoDos.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoTres.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoCuatro.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoCinco.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoSeis.getText().toString()) ||
                                TextUtils.isEmpty(partidaUnoSiete.getText().toString())) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = Integer.parseInt(partidaUnoUno.getText().toString());
                            puntajeJugadorDos = Integer.parseInt(partidaUnoDos.getText().toString());
                            puntajeJugadorTres = Integer.parseInt(partidaUnoTres.getText().toString());
                            puntajeJugadorCuatro = Integer.parseInt(partidaUnoCuatro.getText().toString());
                            puntajeJugadorCinco = Integer.parseInt(partidaUnoCinco.getText().toString());
                            puntajeJugadorSeis = Integer.parseInt(partidaUnoSeis.getText().toString());
                            puntajeJugadorSiete = Integer.parseInt(partidaUnoSiete.getText().toString());
                            setFreeze(partidaUnoUno);
                            setFreeze(partidaUnoDos);
                            setFreeze(partidaUnoTres);
                            setFreeze(partidaUnoCuatro);
                            setFreeze(partidaUnoCinco);
                            setFreeze(partidaUnoSeis);
                            setFreeze(partidaUnoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDos.setVisibility(View.VISIBLE);
                            textViewPuntajeJugadorUno.setText(String.valueOf(puntajeJugadorUno));
                        }
                        break;
                    case 2:
                        if (TextUtils.isEmpty(partidaDosUno.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosDos.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosTres.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosCuatro.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosCinco.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosSeis.getText().toString()) ||
                                TextUtils.isEmpty(partidaDosSiete.getText().toString())) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            sumaDePuntaje(puntajeJugadorUno, partidaDosUno);
                            sumaDePuntaje(puntajeJugadorDos, partidaDosDos);
                            sumaDePuntaje(puntajeJugadorTres, partidaDosTres);
                            sumaDePuntaje(puntajeJugadorCuatro, partidaDosCuatro);
                            sumaDePuntaje(puntajeJugadorCinco, partidaDosCinco);
                            sumaDePuntaje(puntajeJugadorSeis, partidaDosSeis);
                            sumaDePuntaje(puntajeJugadorSiete, partidaDosSiete);
                            setFreeze(partidaDosUno);
                            setFreeze(partidaDosDos);
                            setFreeze(partidaDosTres);
                            setFreeze(partidaDosCuatro);
                            setFreeze(partidaDosCinco);
                            setFreeze(partidaDosSeis);
                            setFreeze(partidaDosSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTres.setVisibility(View.VISIBLE);
                        }
                        break;
                }
            }
        });

        return view;

    }

    private void sumaDePuntaje(Integer puntajeJugador, EditText partida) {
        puntajeJugador = puntajeJugador + Integer.parseInt(partida.getText().toString());
    }

    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }

}
