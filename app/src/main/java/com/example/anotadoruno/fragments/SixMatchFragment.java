package com.example.anotadoruno.fragments;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anotadoruno.MainActivity;
import com.example.anotadoruno.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SixMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String NOMBRE_JUGADOR_CUATRO = "jugador cuatro";
    public static final String NOMBRE_JUGADOR_CINCO = "jugador cinco";
    public static final String NOMBRE_JUGADOR_SEIS = "jugador seis";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoSixMatch)
    LinearLayout rondaUnoSixMatch;
    @BindView(R.id.rondaDosSixMatch)
    LinearLayout rondaDosSixMatch;
    @BindView(R.id.rondaTresSixMatch)
    LinearLayout rondaTresSixMatch;
    @BindView(R.id.rondaCuatroSixMatch)
    LinearLayout rondaCuatroSixMatch;
    @BindView(R.id.rondaCincoSixMatch)
    LinearLayout rondaCincoSixMatch;
    @BindView(R.id.rondaSeisSixMatch)
    LinearLayout rondaSeisSixMatch;
    @BindView(R.id.rondaSieteSixMatch)
    LinearLayout rondaSieteSixMatch;
    @BindView(R.id.rondaOchoSixMatch)
    LinearLayout rondaOchoSixMatch;
    @BindView(R.id.rondaNueveSixMatch)
    LinearLayout rondaNueveSixMatch;
    @BindView(R.id.rondaDiezSixMatch)
    LinearLayout rondaDiezSixMatch;
    @BindView(R.id.rondaOnceSixMatch)
    LinearLayout rondaOnceSixMatch;
    @BindView(R.id.rondaDoceSixMatch)
    LinearLayout rondaDoceSixMatch;
    @BindView(R.id.rondaTreceSixMatch)
    LinearLayout rondaTreceSixMatch;
    @BindView(R.id.rondaCatorceSixMatch)
    LinearLayout rondaCatorceSixMatch;
    @BindView(R.id.rondaQuinceSixMatch)
    LinearLayout rondaQuinceSixMatch;
    @BindView(R.id.rondaDieciSeisSixMatch)
    LinearLayout rondaDieciSeisSixMatch;
    @BindView(R.id.rondaDieciSieteSixMatch)
    LinearLayout rondaDieciSieteSixMatch;
    @BindView(R.id.rondaDieciOchoSixMatch)
    LinearLayout rondaDieciOchoSixMatch;
    @BindView(R.id.rondaDieciNueveSixMatch)
    LinearLayout rondaDieciNueveSixMatch;
    @BindView(R.id.rondaVeinteSixMatch)
    LinearLayout rondaVeinteSixMatch;

    @BindView(R.id.partidaUnoUnoSixMatch)
    EditText partidaUnoUnoSixMatch;
    @BindView(R.id.partidaUnoDosSixMatch)
    EditText partidaUnoDosSixMatch;
    @BindView(R.id.partidaUnoTresSixMatch)
    EditText partidaUnoTresSixMatch;
    @BindView(R.id.partidaUnoCuatroSixMatch)
    EditText partidaUnoCuatroSixMatch;
    @BindView(R.id.partidaUnoCincoSixMatch)
    EditText partidaUnoCincoSixMatch;
    @BindView(R.id.partidaUnoSeisSixMatch)
    EditText partidaUnoSeisSixMatch;

    @BindView(R.id.partidaDosUnoSixMatch)
    EditText partidaDosUnoSixMatch;
    @BindView(R.id.partidaDosDosSixMatch)
    EditText partidaDosDosSixMatch;
    @BindView(R.id.partidaDosTresSixMatch)
    EditText partidaDosTresSixMatch;
    @BindView(R.id.partidaDosCuatroSixMatch)
    EditText partidaDosCuatroSixMatch;
    @BindView(R.id.partidaDosCincoSixMatch)
    EditText partidaDosCincoSixMatch;
    @BindView(R.id.partidaDosSeisSixMatch)
    EditText partidaDosSeisSixMatch;

    @BindView(R.id.partidaTresUnoSixMatch)
    EditText partidaTresUnoSixMatch;
    @BindView(R.id.partidaTresDosSixMatch)
    EditText partidaTresDosSixMatch;
    @BindView(R.id.partidaTresTresSixMatch)
    EditText partidaTresTresSixMatch;
    @BindView(R.id.partidaTresCuatroSixMatch)
    EditText partidaTresCuatroSixMatch;
    @BindView(R.id.partidaTresCincoSixMatch)
    EditText partidaTresCincoSixMatch;
    @BindView(R.id.partidaTresSeisSixMatch)
    EditText partidaTresSeisSixMatch;

    @BindView(R.id.partidaCuatroUnoSixMatch)
    EditText partidaCuatroUnoSixMatch;
    @BindView(R.id.partidaCuatroDosSixMatch)
    EditText partidaCuatroDosSixMatch;
    @BindView(R.id.partidaCuatroTresSixMatch)
    EditText partidaCuatroTresSixMatch;
    @BindView(R.id.partidaCuatroCuatroSixMatch)
    EditText partidaCuatroCuatroSixMatch;
    @BindView(R.id.partidaCuatroCincoSixMatch)
    EditText partidaCuatroCincoSixMatch;
    @BindView(R.id.partidaCuatroSeisSixMatch)
    EditText partidaCuatroSeisSixMatch;

    @BindView(R.id.partidaCincoUnoSixMatch)
    EditText partidaCincoUnoSixMatch;
    @BindView(R.id.partidaCincoDosSixMatch)
    EditText partidaCincoDosSixMatch;
    @BindView(R.id.partidaCincoTresSixMatch)
    EditText partidaCincoTresSixMatch;
    @BindView(R.id.partidaCincoCuatroSixMatch)
    EditText partidaCincoCuatroSixMatch;
    @BindView(R.id.partidaCincoCincoSixMatch)
    EditText partidaCincoCincoSixMatch;
    @BindView(R.id.partidaCincoSeisSixMatch)
    EditText partidaCincoSeisSixMatch;

    @BindView(R.id.partidaSeisUnoSixMatch)
    EditText partidaSeisUnoSixMatch;
    @BindView(R.id.partidaSeisDosSixMatch)
    EditText partidaSeisDosSixMatch;
    @BindView(R.id.partidaSeisTresSixMatch)
    EditText partidaSeisTresSixMatch;
    @BindView(R.id.partidaSeisCuatroSixMatch)
    EditText partidaSeisCuatroSixMatch;
    @BindView(R.id.partidaSeisCincoSixMatch)
    EditText partidaSeisCincoSixMatch;
    @BindView(R.id.partidaSeisSeisSixMatch)
    EditText partidaSeisSeisSixMatch;

    @BindView(R.id.partidaSieteUnoSixMatch)
    EditText partidaSieteUnoSixMatch;
    @BindView(R.id.partidaSieteDosSixMatch)
    EditText partidaSieteDosSixMatch;
    @BindView(R.id.partidaSieteTresSixMatch)
    EditText partidaSieteTresSixMatch;
    @BindView(R.id.partidaSieteCuatroSixMatch)
    EditText partidaSieteCuatroSixMatch;
    @BindView(R.id.partidaSieteCincoSixMatch)
    EditText partidaSieteCincoSixMatch;
    @BindView(R.id.partidaSieteSeisSixMatch)
    EditText partidaSieteSeisSixMatch;

    @BindView(R.id.partidaOchoUnoSixMatch)
    EditText partidaOchoUnoSixMatch;
    @BindView(R.id.partidaOchoDosSixMatch)
    EditText partidaOchoDosSixMatch;
    @BindView(R.id.partidaOchoTresSixMatch)
    EditText partidaOchoTresSixMatch;
    @BindView(R.id.partidaOchoCuatroSixMatch)
    EditText partidaOchoCuatroSixMatch;
    @BindView(R.id.partidaOchoCincoSixMatch)
    EditText partidaOchoCincoSixMatch;
    @BindView(R.id.partidaOchoSeisSixMatch)
    EditText partidaOchoSeisSixMatch;

    @BindView(R.id.partidaNueveUnoSixMatch)
    EditText partidaNueveUnoSixMatch;
    @BindView(R.id.partidaNueveDosSixMatch)
    EditText partidaNueveDosSixMatch;
    @BindView(R.id.partidaNueveTresSixMatch)
    EditText partidaNueveTresSixMatch;
    @BindView(R.id.partidaNueveCuatroSixMatch)
    EditText partidaNueveCuatroSixMatch;
    @BindView(R.id.partidaNueveCincoSixMatch)
    EditText partidaNueveCincoSixMatch;
    @BindView(R.id.partidaNueveSeisSixMatch)
    EditText partidaNueveSeisSixMatch;

    @BindView(R.id.partidaDiezUnoSixMatch)
    EditText partidaDiezUnoSixMatch;
    @BindView(R.id.partidaDiezDosSixMatch)
    EditText partidaDiezDosSixMatch;
    @BindView(R.id.partidaDiezTresSixMatch)
    EditText partidaDiezTresSixMatch;
    @BindView(R.id.partidaDiezCuatroSixMatch)
    EditText partidaDiezCuatroSixMatch;
    @BindView(R.id.partidaDiezCincoSixMatch)
    EditText partidaDiezCincoSixMatch;
    @BindView(R.id.partidaDiezSeisSixMatch)
    EditText partidaDiezSeisSixMatch;

    @BindView(R.id.partidaOnceUnoSixMatch)
    EditText partidaOnceUnoSixMatch;
    @BindView(R.id.partidaOnceDosSixMatch)
    EditText partidaOnceDosSixMatch;
    @BindView(R.id.partidaOnceTresSixMatch)
    EditText partidaOnceTresSixMatch;
    @BindView(R.id.partidaOnceCuatroSixMatch)
    EditText partidaOnceCuatroSixMatch;
    @BindView(R.id.partidaOnceCincoSixMatch)
    EditText partidaOnceCincoSixMatch;
    @BindView(R.id.partidaOnceSeisSixMatch)
    EditText partidaOnceSeisSixMatch;

    @BindView(R.id.partidaDoceUnoSixMatch)
    EditText partidaDoceUnoSixMatch;
    @BindView(R.id.partidaDoceDosSixMatch)
    EditText partidaDoceDosSixMatch;
    @BindView(R.id.partidaDoceTresSixMatch)
    EditText partidaDoceTresSixMatch;
    @BindView(R.id.partidaDoceCuatroSixMatch)
    EditText partidaDoceCuatroSixMatch;
    @BindView(R.id.partidaDoceCincoSixMatch)
    EditText partidaDoceCincoSixMatch;
    @BindView(R.id.partidaDoceSeisSixMatch)
    EditText partidaDoceSeisSixMatch;

    @BindView(R.id.partidaTreceUnoSixMatch)
    EditText partidaTreceUnoSixMatch;
    @BindView(R.id.partidaTreceDosSixMatch)
    EditText partidaTreceDosSixMatch;
    @BindView(R.id.partidaTreceTresSixMatch)
    EditText partidaTreceTresSixMatch;
    @BindView(R.id.partidaTreceCuatroSixMatch)
    EditText partidaTreceCuatroSixMatch;
    @BindView(R.id.partidaTreceCincoSixMatch)
    EditText partidaTreceCincoSixMatch;
    @BindView(R.id.partidaTreceSeisSixMatch)
    EditText partidaTreceSeisSixMatch;

    @BindView(R.id.partidaCatorceUnoSixMatch)
    EditText partidaCatorceUnoSixMatch;
    @BindView(R.id.partidaCatorceDosSixMatch)
    EditText partidaCatorceDosSixMatch;
    @BindView(R.id.partidaCatorceTresSixMatch)
    EditText partidaCatorceTresSixMatch;
    @BindView(R.id.partidaCatorceCuatroSixMatch)
    EditText partidaCatorceCuatroSixMatch;
    @BindView(R.id.partidaCatorceCincoSixMatch)
    EditText partidaCatorceCincoSixMatch;
    @BindView(R.id.partidaCatorceSeisSixMatch)
    EditText partidaCatorceSeisSixMatch;

    @BindView(R.id.partidaQuinceUnoSixMatch)
    EditText partidaQuinceUnoSixMatch;
    @BindView(R.id.partidaQuinceDosSixMatch)
    EditText partidaQuinceDosSixMatch;
    @BindView(R.id.partidaQuinceTresSixMatch)
    EditText partidaQuinceTresSixMatch;
    @BindView(R.id.partidaQuinceCuatroSixMatch)
    EditText partidaQuinceCuatroSixMatch;
    @BindView(R.id.partidaQuinceCincoSixMatch)
    EditText partidaQuinceCincoSixMatch;
    @BindView(R.id.partidaQuinceSeisSixMatch)
    EditText partidaQuinceSeisSixMatch;

    @BindView(R.id.partidaDieciSeisUnoSixMatch)
    EditText partidaDieciSeisUnoSixMatch;
    @BindView(R.id.partidaDieciSeisDosSixMatch)
    EditText partidaDieciSeisDosSixMatch;
    @BindView(R.id.partidaDieciSeisTresSixMatch)
    EditText partidaDieciSeisTresSixMatch;
    @BindView(R.id.partidaDieciSeisCuatroSixMatch)
    EditText partidaDieciSeisCuatroSixMatch;
    @BindView(R.id.partidaDieciSeisCincoSixMatch)
    EditText partidaDieciSeisCincoSixMatch;
    @BindView(R.id.partidaDieciSeisSeisSixMatch)
    EditText partidaDieciSeisSeisSixMatch;

    @BindView(R.id.partidaDieciSieteUnoSixMatch)
    EditText partidaDieciSieteUnoSixMatch;
    @BindView(R.id.partidaDieciSieteDosSixMatch)
    EditText partidaDieciSieteDosSixMatch;
    @BindView(R.id.partidaDieciSieteTresSixMatch)
    EditText partidaDieciSieteTresSixMatch;
    @BindView(R.id.partidaDieciSieteCuatroSixMatch)
    EditText partidaDieciSieteCuatroSixMatch;
    @BindView(R.id.partidaDieciSieteCincoSixMatch)
    EditText partidaDieciSieteCincoSixMatch;
    @BindView(R.id.partidaDieciSieteSeisSixMatch)
    EditText partidaDieciSieteSeisSixMatch;

    @BindView(R.id.partidaDieciOchoUnoSixMatch)
    EditText partidaDieciOchoUnoSixMatch;
    @BindView(R.id.partidaDieciOchoDosSixMatch)
    EditText partidaDieciOchoDosSixMatch;
    @BindView(R.id.partidaDieciOchoTresSixMatch)
    EditText partidaDieciOchoTresSixMatch;
    @BindView(R.id.partidaDieciOchoCuatroSixMatch)
    EditText partidaDieciOchoCuatroSixMatch;
    @BindView(R.id.partidaDieciOchoCincoSixMatch)
    EditText partidaDieciOchoCincoSixMatch;
    @BindView(R.id.partidaDieciOchoSeisSixMatch)
    EditText partidaDieciOchoSeisSixMatch;

    @BindView(R.id.partidaDieciNueveUnoSixMatch)
    EditText partidaDieciNueveUnoSixMatch;
    @BindView(R.id.partidaDieciNueveDosSixMatch)
    EditText partidaDieciNueveDosSixMatch;
    @BindView(R.id.partidaDieciNueveTresSixMatch)
    EditText partidaDieciNueveTresSixMatch;
    @BindView(R.id.partidaDieciNueveCuatroSixMatch)
    EditText partidaDieciNueveCuatroSixMatch;
    @BindView(R.id.partidaDieciNueveCincoSixMatch)
    EditText partidaDieciNueveCincoSixMatch;
    @BindView(R.id.partidaDieciNueveSeisSixMatch)
    EditText partidaDieciNueveSeisSixMatch;

    @BindView(R.id.partidaVeinteUnoSixMatch)
    EditText partidaVeinteUnoSixMatch;
    @BindView(R.id.partidaVeinteDosSixMatch)
    EditText partidaVeinteDosSixMatch;
    @BindView(R.id.partidaVeinteTresSixMatch)
    EditText partidaVeinteTresSixMatch;
    @BindView(R.id.partidaVeinteCuatroSixMatch)
    EditText partidaVeinteCuatroSixMatch;
    @BindView(R.id.partidaVeinteCincoSixMatch)
    EditText partidaVeinteCincoSixMatch;
    @BindView(R.id.partidaVeinteSeisSixMatch)
    EditText partidaVeinteSeisSixMatch;

    @BindView(R.id.buttonSiguienteRondaSixMatch)
    Button buttonSiguienteRondaSixMatch;

    @BindView(R.id.textViewJugadorUnoSixMatch)
    TextView textViewJugadorUnoSixMatch;
    @BindView(R.id.textViewJugadorDosSixMatch)
    TextView textViewJugadorDosSixMatch;
    @BindView(R.id.textViewJugadorTresSixMatch)
    TextView textViewJugadorTresSixMatch;
    @BindView(R.id.textViewJugadorCuatroSixMatch)
    TextView textViewJugadorCuatroSixMatch;
    @BindView(R.id.textViewJugadorCincoSixMatch)
    TextView textViewJugadorCincoSixMatch;
    @BindView(R.id.textViewJugadorSeisSixMatch)
    TextView textViewJugadorSeisSixMatch;

    @BindView(R.id.textViewPuntajeJugadorUnoSixMatch)
    TextView textViewPuntajeJugadorUnoSixMatch;
    @BindView(R.id.textViewPuntajeJugadorDosSixMatch)
    TextView textViewPuntajeJugadorDosSixMatch;
    @BindView(R.id.textViewPuntajeJugadorTresSixMatch)
    TextView textViewPuntajeJugadorTresSixMatch;
    @BindView(R.id.textViewPuntajeJugadorCuatroSixMatch)
    TextView textViewPuntajeJugadorCuatroSixMatch;
    @BindView(R.id.textViewPuntajeJugadorCincoSixMatch)
    TextView textViewPuntajeJugadorCincoSixMatch;
    @BindView(R.id.textViewPuntajeJugadorSeisSixMatch)
    TextView textViewPuntajeJugadorSeisSixMatch;

    @BindView(R.id.byeJugadorUnoSixMatch)
    ImageView byeJugadorUnoSixMatch;
    @BindView(R.id.byeJugadorDosSixMatch)
    ImageView byeJugadorDosSixMatch;
    @BindView(R.id.byeJugadorTresSixMatch)
    ImageView byeJugadorTresSixMatch;
    @BindView(R.id.byeJugadorCuatroSixMatch)
    ImageView byeJugadorCuatroSixMatch;
    @BindView(R.id.byeJugadorCincoSixMatch)
    ImageView byeJugadorCincoSixMatch;
    @BindView(R.id.byeJugadorSeisSixMatch)
    ImageView byeJugadorSeisSixMatch;

    private String jugadorUnoSixMatch;
    private String jugadorDosSixMatch;
    private String jugadorTresSixMatch;
    private String jugadorCuatroSixMatch;
    private String jugadorCincoSixMatch;
    private String jugadorSeisSixMatch;

    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;
    private Integer puntajeJugadorCuatro = 0;
    private Integer puntajeJugadorCinco = 0;
    private Integer puntajeJugadorSeis = 0;

    private Integer contadorDeRonda = 1;


    public SixMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_six_match, container, false);

        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();

        jugadorUnoSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);
        jugadorCuatroSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CUATRO);
        jugadorCincoSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CINCO);
        jugadorSeisSixMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_SEIS);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoSixMatch.setText(jugadorUnoSixMatch);
        textViewJugadorDosSixMatch.setText(jugadorDosSixMatch);
        textViewJugadorTresSixMatch.setText(jugadorTresSixMatch);
        textViewJugadorCuatroSixMatch.setText(jugadorCuatroSixMatch);
        textViewJugadorCincoSixMatch.setText(jugadorCincoSixMatch);
        textViewJugadorSeisSixMatch.setText(jugadorSeisSixMatch);

        buttonSiguienteRondaSixMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoSixMatch, partidaUnoDosSixMatch, partidaUnoTresSixMatch,
                                partidaUnoCuatroSixMatch, partidaUnoCincoSixMatch, partidaUnoSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoSixMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosSixMatch);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTresSixMatch);
                            puntajeJugadorCuatro = getNumeroParcial(partidaUnoCuatroSixMatch);
                            puntajeJugadorCinco = getNumeroParcial(partidaUnoCincoSixMatch);
                            puntajeJugadorSeis = getNumeroParcial(partidaUnoSeisSixMatch);
                            setFreezeRonda(partidaUnoUnoSixMatch, partidaUnoDosSixMatch, partidaUnoTresSixMatch,
                                    partidaUnoCuatroSixMatch, partidaUnoCincoSixMatch, partidaUnoSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoSixMatch, partidaDosDosSixMatch,
                                    partidaDosTresSixMatch, partidaDosCuatroSixMatch, partidaDosCincoSixMatch,
                                    partidaDosSeisSixMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoSixMatch, partidaDosDosSixMatch, partidaDosTresSixMatch,
                                partidaDosCuatroSixMatch, partidaDosCincoSixMatch, partidaDosSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDosCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDosSeisSixMatch);
                            setFreezeRonda(partidaDosUnoSixMatch, partidaDosDosSixMatch, partidaDosTresSixMatch,
                                    partidaDosCuatroSixMatch, partidaDosCincoSixMatch, partidaDosSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoSixMatch, partidaTresDosSixMatch,
                                    partidaTresTresSixMatch, partidaTresCuatroSixMatch, partidaTresCincoSixMatch,
                                    partidaTresSeisSixMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoSixMatch, partidaTresDosSixMatch, partidaTresTresSixMatch,
                                partidaTresCuatroSixMatch, partidaTresCincoSixMatch, partidaTresSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTresUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTresDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTresTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTresCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTresCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTresSeisSixMatch);
                            setFreezeRonda(partidaTresUnoSixMatch, partidaTresDosSixMatch, partidaTresTresSixMatch,
                                    partidaTresCuatroSixMatch, partidaTresCincoSixMatch, partidaTresSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoSixMatch, partidaCuatroDosSixMatch,
                                    partidaCuatroTresSixMatch, partidaCuatroCuatroSixMatch,
                                    partidaCuatroCincoSixMatch, partidaCuatroSeisSixMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoSixMatch, partidaCuatroDosSixMatch,
                                partidaCuatroTresSixMatch, partidaCuatroCuatroSixMatch,
                                partidaCuatroCincoSixMatch, partidaCuatroSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCuatroUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCuatroDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCuatroTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCuatroCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCuatroCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCuatroSeisSixMatch);
                            setFreezeRonda(partidaCuatroUnoSixMatch, partidaCuatroDosSixMatch,
                                    partidaCuatroTresSixMatch, partidaCuatroCuatroSixMatch,
                                    partidaCuatroCincoSixMatch, partidaCuatroSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoSixMatch, partidaCincoDosSixMatch,
                                    partidaCincoTresSixMatch, partidaCincoCuatroSixMatch,
                                    partidaCincoCincoSixMatch, partidaCincoSeisSixMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoSixMatch, partidaCincoDosSixMatch,
                                partidaCincoTresSixMatch, partidaCincoCuatroSixMatch,
                                partidaCincoCincoSixMatch, partidaCincoSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCincoUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCincoDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCincoTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCincoCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCincoCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCincoSeisSixMatch);
                            setFreezeRonda(partidaCincoUnoSixMatch, partidaCincoDosSixMatch,
                                    partidaCincoTresSixMatch, partidaCincoCuatroSixMatch,
                                    partidaCincoCincoSixMatch, partidaCincoSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoSixMatch, partidaSeisDosSixMatch,
                                    partidaSeisTresSixMatch, partidaSeisCuatroSixMatch,
                                    partidaSeisCincoSixMatch, partidaSeisSeisSixMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoSixMatch, partidaSeisDosSixMatch, partidaSeisTresSixMatch,
                                partidaSeisCuatroSixMatch, partidaSeisCincoSixMatch, partidaSeisSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSeisUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSeisDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSeisTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSeisCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSeisCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSeisSeisSixMatch);
                            setFreezeRonda(partidaSeisUnoSixMatch, partidaSeisDosSixMatch, partidaSeisTresSixMatch,
                                    partidaSeisCuatroSixMatch, partidaSeisCincoSixMatch, partidaSeisSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoSixMatch, partidaSieteDosSixMatch,
                                    partidaSieteTresSixMatch, partidaSieteCuatroSixMatch, partidaSieteCincoSixMatch,
                                    partidaSieteSeisSixMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoSixMatch, partidaSieteDosSixMatch,
                                partidaSieteTresSixMatch, partidaSieteCuatroSixMatch,
                                partidaSieteCincoSixMatch, partidaSieteSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSieteUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSieteDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSieteTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSieteCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSieteCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSieteSeisSixMatch);
                            setFreezeRonda(partidaSieteUnoSixMatch, partidaSieteDosSixMatch,
                                    partidaSieteTresSixMatch, partidaSieteCuatroSixMatch,
                                    partidaSieteCincoSixMatch, partidaSieteSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoSixMatch, partidaOchoDosSixMatch,
                                    partidaOchoTresSixMatch, partidaOchoCuatroSixMatch,
                                    partidaOchoCincoSixMatch, partidaOchoSeisSixMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoSixMatch, partidaOchoDosSixMatch, partidaOchoTresSixMatch,
                                partidaOchoCuatroSixMatch, partidaOchoCincoSixMatch, partidaOchoSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOchoSeisSixMatch);
                            setFreezeRonda(partidaOchoUnoSixMatch, partidaOchoDosSixMatch, partidaOchoTresSixMatch,
                                    partidaOchoCuatroSixMatch, partidaOchoCincoSixMatch, partidaOchoSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoSixMatch, partidaNueveDosSixMatch,
                                    partidaNueveTresSixMatch, partidaNueveCuatroSixMatch,
                                    partidaNueveCincoSixMatch, partidaNueveSeisSixMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoSixMatch, partidaNueveDosSixMatch,
                                partidaNueveTresSixMatch, partidaNueveCuatroSixMatch,
                                partidaNueveCincoSixMatch, partidaNueveSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaNueveUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaNueveDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaNueveTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaNueveCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaNueveCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaNueveSeisSixMatch);
                            setFreezeRonda(partidaNueveUnoSixMatch, partidaNueveDosSixMatch, partidaNueveTresSixMatch,
                                    partidaNueveCuatroSixMatch, partidaNueveCincoSixMatch, partidaNueveSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoSixMatch, partidaDiezDosSixMatch,
                                    partidaDiezTresSixMatch, partidaDiezCuatroSixMatch,
                                    partidaDiezCincoSixMatch, partidaDiezSeisSixMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoSixMatch, partidaDiezDosSixMatch, partidaDiezTresSixMatch,
                                partidaDiezCuatroSixMatch, partidaDiezCincoSixMatch, partidaDiezSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiezUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiezDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDiezTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDiezCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDiezCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDiezSeisSixMatch);
                            setFreezeRonda(partidaDiezUnoSixMatch, partidaDiezDosSixMatch, partidaDiezTresSixMatch,
                                    partidaDiezCuatroSixMatch, partidaDiezCincoSixMatch, partidaDiezSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoSixMatch, partidaOnceDosSixMatch,
                                    partidaOnceTresSixMatch, partidaOnceCuatroSixMatch,
                                    partidaOnceCincoSixMatch, partidaOnceSeisSixMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoSixMatch, partidaOnceDosSixMatch, partidaOnceTresSixMatch,
                                partidaOnceCuatroSixMatch, partidaOnceCincoSixMatch,
                                partidaOnceSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOnceUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOnceDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOnceTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOnceCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOnceCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOnceSeisSixMatch);
                            setFreezeRonda(partidaOnceUnoSixMatch, partidaOnceDosSixMatch, partidaOnceTresSixMatch,
                                    partidaOnceCuatroSixMatch, partidaOnceCincoSixMatch,
                                    partidaOnceSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoSixMatch, partidaDoceDosSixMatch,
                                    partidaDoceTresSixMatch, partidaDoceCuatroSixMatch, partidaDoceCincoSixMatch,
                                    partidaDoceSeisSixMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoSixMatch, partidaDoceDosSixMatch,
                                partidaDoceTresSixMatch, partidaDoceCuatroSixMatch, partidaDoceCincoSixMatch,
                                partidaDoceSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDoceUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDoceDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDoceTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDoceCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDoceCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDoceSeisSixMatch);
                            setFreezeRonda(partidaDoceUnoSixMatch, partidaDoceDosSixMatch, partidaDoceTresSixMatch,
                                    partidaDoceCuatroSixMatch, partidaDoceCincoSixMatch,
                                    partidaDoceSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoSixMatch, partidaTreceDosSixMatch,
                                    partidaTreceTresSixMatch, partidaTreceCuatroSixMatch, partidaTreceCincoSixMatch,
                                    partidaTreceSeisSixMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoSixMatch, partidaTreceDosSixMatch,
                                partidaTreceTresSixMatch, partidaTreceCuatroSixMatch, partidaTreceCincoSixMatch,
                                partidaTreceSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreceUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreceDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTreceTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTreceCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTreceCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTreceSeisSixMatch);
                            setFreezeRonda(partidaTreceUnoSixMatch, partidaTreceDosSixMatch, partidaTreceTresSixMatch,
                                    partidaTreceCuatroSixMatch, partidaTreceCincoSixMatch,
                                    partidaTreceSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoSixMatch, partidaCatorceDosSixMatch,
                                    partidaCatorceTresSixMatch, partidaCatorceCuatroSixMatch,
                                    partidaCatorceCincoSixMatch, partidaCatorceSeisSixMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoSixMatch, partidaCatorceDosSixMatch,
                                partidaCatorceTresSixMatch, partidaCatorceCuatroSixMatch,
                                partidaCatorceCincoSixMatch, partidaCatorceSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCatorceUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCatorceDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCatorceTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCatorceCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCatorceCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCatorceSeisSixMatch);
                            setFreezeRonda(partidaCatorceUnoSixMatch, partidaCatorceDosSixMatch,
                                    partidaCatorceTresSixMatch, partidaCatorceCuatroSixMatch,
                                    partidaCatorceCincoSixMatch, partidaCatorceSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoSixMatch, partidaQuinceDosSixMatch,
                                    partidaQuinceTresSixMatch, partidaQuinceCuatroSixMatch,
                                    partidaQuinceCincoSixMatch, partidaQuinceSeisSixMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoSixMatch, partidaQuinceDosSixMatch,
                                partidaQuinceTresSixMatch, partidaQuinceCuatroSixMatch,
                                partidaQuinceCincoSixMatch, partidaQuinceSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaQuinceUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaQuinceDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaQuinceTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaQuinceCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaQuinceCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaQuinceSeisSixMatch);
                            setFreezeRonda(partidaQuinceUnoSixMatch, partidaQuinceDosSixMatch,
                                    partidaQuinceTresSixMatch, partidaQuinceCuatroSixMatch,
                                    partidaQuinceCincoSixMatch, partidaQuinceSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeisSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUnoSixMatch, partidaDieciSeisDosSixMatch,
                                    partidaDieciSeisTresSixMatch, partidaDieciSeisCuatroSixMatch,
                                    partidaDieciSeisCincoSixMatch, partidaDieciSeisSeisSixMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUnoSixMatch, partidaDieciSeisDosSixMatch,
                                partidaDieciSeisTresSixMatch, partidaDieciSeisCuatroSixMatch,
                                partidaDieciSeisCincoSixMatch, partidaDieciSeisSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSeisUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSeisDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciSeisTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciSeisCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciSeisCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciSeisSeisSixMatch);
                            setFreezeRonda(partidaDieciSeisUnoSixMatch, partidaDieciSeisDosSixMatch,
                                    partidaDieciSeisTresSixMatch, partidaDieciSeisCuatroSixMatch,
                                    partidaDieciSeisCincoSixMatch, partidaDieciSeisSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSieteSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUnoSixMatch, partidaDieciSieteDosSixMatch,
                                    partidaDieciSieteTresSixMatch, partidaDieciSieteCuatroSixMatch,
                                    partidaDieciSieteCincoSixMatch, partidaDieciSieteSeisSixMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUnoSixMatch, partidaDieciSieteDosSixMatch,
                                partidaDieciSieteTresSixMatch, partidaDieciSieteCuatroSixMatch,
                                partidaDieciSieteCincoSixMatch, partidaDieciSieteSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSieteUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSieteDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciSieteTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciSieteCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciSieteCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciSieteSeisSixMatch);
                            setFreezeRonda(partidaDieciSieteUnoSixMatch, partidaDieciSieteDosSixMatch,
                                    partidaDieciSieteTresSixMatch, partidaDieciSieteCuatroSixMatch,
                                    partidaDieciSieteCincoSixMatch, partidaDieciSieteSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOchoSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUnoSixMatch, partidaDieciOchoDosSixMatch,
                                    partidaDieciOchoTresSixMatch, partidaDieciOchoCuatroSixMatch,
                                    partidaDieciOchoCincoSixMatch, partidaDieciOchoSeisSixMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUnoSixMatch, partidaDieciOchoDosSixMatch,
                                partidaDieciOchoTresSixMatch, partidaDieciOchoCuatroSixMatch,
                                partidaDieciOchoCincoSixMatch, partidaDieciOchoSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciOchoUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciOchoDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciOchoTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciOchoCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciOchoCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciOchoSeisSixMatch);
                            setFreezeRonda(partidaDieciOchoUnoSixMatch, partidaDieciOchoDosSixMatch,
                                    partidaDieciOchoTresSixMatch, partidaDieciOchoCuatroSixMatch,
                                    partidaDieciOchoCincoSixMatch, partidaDieciOchoSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueveSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUnoSixMatch, partidaDieciNueveDosSixMatch,
                                    partidaDieciNueveTresSixMatch, partidaDieciNueveCuatroSixMatch,
                                    partidaDieciNueveCincoSixMatch, partidaDieciNueveSeisSixMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUnoSixMatch, partidaDieciNueveDosSixMatch,
                                partidaDieciNueveTresSixMatch, partidaDieciNueveCuatroSixMatch,
                                partidaDieciNueveCincoSixMatch, partidaDieciNueveSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciNueveUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciNueveDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciNueveTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciNueveCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciNueveCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciNueveSeisSixMatch);
                            setFreezeRonda(partidaDieciNueveUnoSixMatch, partidaDieciNueveDosSixMatch,
                                    partidaDieciNueveTresSixMatch, partidaDieciNueveCuatroSixMatch,
                                    partidaDieciNueveCincoSixMatch, partidaDieciNueveSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteSixMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoSixMatch, partidaVeinteDosSixMatch,
                                    partidaVeinteTresSixMatch, partidaVeinteCuatroSixMatch,
                                    partidaVeinteCincoSixMatch, partidaVeinteSeisSixMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoSixMatch, partidaVeinteDosSixMatch,
                                partidaVeinteTresSixMatch, partidaVeinteCuatroSixMatch,
                                partidaVeinteCincoSixMatch, partidaVeinteSeisSixMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinteUnoSixMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinteDosSixMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinteTresSixMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinteCuatroSixMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinteCincoSixMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinteSeisSixMatch);
                            setFreezeRonda(partidaVeinteUnoSixMatch, partidaVeinteDosSixMatch,
                                    partidaVeinteTresSixMatch, partidaVeinteCuatroSixMatch,
                                    partidaVeinteCincoSixMatch, partidaVeinteSeisSixMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                        }
                        break;
                }
            }
        });

        return view;
    }

    private void generalPerdedorNoSumaMas(EditText partidaUno, EditText partidaDos, EditText partidaTres, EditText partidaCuatro,
                                          EditText partidaCinco, EditText partidaSeis) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
        perdedorNoSumaMas(puntajeJugadorCuatro, partidaCuatro);
        perdedorNoSumaMas(puntajeJugadorCinco, partidaCinco);
        perdedorNoSumaMas(puntajeJugadorSeis, partidaSeis);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }

    private void checkWinner() {
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, textViewJugadorSeisSixMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorSeis, textViewJugadorCincoSixMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCinco,
                puntajeJugadorSeis, textViewJugadorCuatroSixMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, textViewJugadorTresSixMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, textViewJugadorDosSixMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, textViewJugadorUnoSixMatch);
    }

    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, Integer jugadorTres, Integer jugadorCuatro,
                                   Integer jugadorCinco, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos
                && jugadorTres > limiteDePuntos && jugadorCuatro > limiteDePuntos
                && jugadorCinco > limiteDePuntos) {
            new AlertDialog.Builder(getContext())
                    .setMessage("Felicidades " + nombreJugadorGanador.getText().toString() + " has ganado")
                    .setPositiveButton(R.string.volver_al_inicio, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getActivity(), MainActivity.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton(R.string.nueva_partida, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            AmistosoCrearJugadoresFragment amistosoCrearJugadoresFragment = new AmistosoCrearJugadoresFragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, amistosoCrearJugadoresFragment).commit();
                        }
                    })
                    .show();
        }
    }

    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUnoSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoSixMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosSixMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTresSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTresSixMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro > limiteDePuntos) {
            byeJugadorCuatroSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCuatroSixMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCinco > limiteDePuntos) {
            byeJugadorCincoSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCincoSixMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorSeis > limiteDePuntos) {
            byeJugadorSeisSixMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorSeisSixMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres, EditText partidaDosCuatro, EditText partidaDosCinco, EditText partidaDosSeis) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
        setFreeze(partidaDosCuatro);
        setFreeze(partidaDosCinco);
        setFreeze(partidaDosSeis);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoSixMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosSixMatch.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTresSixMatch.setText(String.valueOf(puntajeJugadorTres));
        textViewPuntajeJugadorCuatroSixMatch.setText(String.valueOf(puntajeJugadorCuatro));
        textViewPuntajeJugadorCincoSixMatch.setText(String.valueOf(puntajeJugadorCinco));
        textViewPuntajeJugadorSeisSixMatch.setText(String.valueOf(puntajeJugadorSeis));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres, EditText jugadorCuatro,
                                      EditText jugadorCinco, EditText jugadorSeis) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString()) ||
                TextUtils.isEmpty(jugadorCuatro.getText().toString()) ||
                TextUtils.isEmpty(jugadorCinco.getText().toString()) ||
                TextUtils.isEmpty(jugadorSeis.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }


}
