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
public class FiveMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String NOMBRE_JUGADOR_CUATRO = "jugador cuatro";
    public static final String NOMBRE_JUGADOR_CINCO = "jugador cinco";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoFiveMatch)
    LinearLayout rondaUnoFiveMatch;
    @BindView(R.id.rondaDosFiveMatch)
    LinearLayout rondaDosFiveMatch;
    @BindView(R.id.rondaTresFiveMatch)
    LinearLayout rondaTresFiveMatch;
    @BindView(R.id.rondaCuatroFiveMatch)
    LinearLayout rondaCuatroFiveMatch;
    @BindView(R.id.rondaCincoFiveMatch)
    LinearLayout rondaCincoFiveMatch;
    @BindView(R.id.rondaSeisFiveMatch)
    LinearLayout rondaSeisFiveMatch;
    @BindView(R.id.rondaSieteFiveMatch)
    LinearLayout rondaSieteFiveMatch;
    @BindView(R.id.rondaOchoFiveMatch)
    LinearLayout rondaOchoFiveMatch;
    @BindView(R.id.rondaNueveFiveMatch)
    LinearLayout rondaNueveFiveMatch;
    @BindView(R.id.rondaDiezFiveMatch)
    LinearLayout rondaDiezFiveMatch;
    @BindView(R.id.rondaOnceFiveMatch)
    LinearLayout rondaOnceFiveMatch;
    @BindView(R.id.rondaDoceFiveMatch)
    LinearLayout rondaDoceFiveMatch;
    @BindView(R.id.rondaTreceFiveMatch)
    LinearLayout rondaTreceFiveMatch;
    @BindView(R.id.rondaCatorceFiveMatch)
    LinearLayout rondaCatorceFiveMatch;
    @BindView(R.id.rondaQuinceFiveMatch)
    LinearLayout rondaQuinceFiveMatch;
    @BindView(R.id.rondaDieciSeisFiveMatch)
    LinearLayout rondaDieciSeisFiveMatch;
    @BindView(R.id.rondaDieciSieteFiveMatch)
    LinearLayout rondaDieciSieteFiveMatch;
    @BindView(R.id.rondaDieciOchoFiveMatch)
    LinearLayout rondaDieciOchoFiveMatch;
    @BindView(R.id.rondaDieciNueveFiveMatch)
    LinearLayout rondaDieciNueveFiveMatch;
    @BindView(R.id.rondaVeinteFiveMatch)
    LinearLayout rondaVeinteFiveMatch;

    @BindView(R.id.partidaUnoUnoFiveMatch)
    EditText partidaUnoUnoFiveMatch;
    @BindView(R.id.partidaUnoDosFiveMatch)
    EditText partidaUnoDosFiveMatch;
    @BindView(R.id.partidaUnoTresFiveMatch)
    EditText partidaUnoTresFiveMatch;
    @BindView(R.id.partidaUnoCuatroFiveMatch)
    EditText partidaUnoCuatroFiveMatch;
    @BindView(R.id.partidaUnoCincoFiveMatch)
    EditText partidaUnoCincoFiveMatch;

    @BindView(R.id.partidaDosUnoFiveMatch)
    EditText partidaDosUnoFiveMatch;
    @BindView(R.id.partidaDosDosFiveMatch)
    EditText partidaDosDosFiveMatch;
    @BindView(R.id.partidaDosTresFiveMatch)
    EditText partidaDosTresFiveMatch;
    @BindView(R.id.partidaDosCuatroFiveMatch)
    EditText partidaDosCuatroFiveMatch;
    @BindView(R.id.partidaDosCincoFiveMatch)
    EditText partidaDosCincoFiveMatch;

    @BindView(R.id.partidaTresUnoFiveMatch)
    EditText partidaTresUnoFiveMatch;
    @BindView(R.id.partidaTresDosFiveMatch)
    EditText partidaTresDosFiveMatch;
    @BindView(R.id.partidaTresTresFiveMatch)
    EditText partidaTresTresFiveMatch;
    @BindView(R.id.partidaTresCuatroFiveMatch)
    EditText partidaTresCuatroFiveMatch;
    @BindView(R.id.partidaTresCincoFiveMatch)
    EditText partidaTresCincoFiveMatch;

    @BindView(R.id.partidaCuatroUnoFiveMatch)
    EditText partidaCuatroUnoFiveMatch;
    @BindView(R.id.partidaCuatroDosFiveMatch)
    EditText partidaCuatroDosFiveMatch;
    @BindView(R.id.partidaCuatroTresFiveMatch)
    EditText partidaCuatroTresFiveMatch;
    @BindView(R.id.partidaCuatroCuatroFiveMatch)
    EditText partidaCuatroCuatroFiveMatch;
    @BindView(R.id.partidaCuatroCincoFiveMatch)
    EditText partidaCuatroCincoFiveMatch;

    @BindView(R.id.partidaCincoUnoFiveMatch)
    EditText partidaCincoUnoFiveMatch;
    @BindView(R.id.partidaCincoDosFiveMatch)
    EditText partidaCincoDosFiveMatch;
    @BindView(R.id.partidaCincoTresFiveMatch)
    EditText partidaCincoTresFiveMatch;
    @BindView(R.id.partidaCincoCuatroFiveMatch)
    EditText partidaCincoCuatroFiveMatch;
    @BindView(R.id.partidaCincoCincoFiveMatch)
    EditText partidaCincoCincoFiveMatch;

    @BindView(R.id.partidaSeisUnoFiveMatch)
    EditText partidaSeisUnoFiveMatch;
    @BindView(R.id.partidaSeisDosFiveMatch)
    EditText partidaSeisDosFiveMatch;
    @BindView(R.id.partidaSeisTresFiveMatch)
    EditText partidaSeisTresFiveMatch;
    @BindView(R.id.partidaSeisCuatroFiveMatch)
    EditText partidaSeisCuatroFiveMatch;
    @BindView(R.id.partidaSeisCincoFiveMatch)
    EditText partidaSeisCincoFiveMatch;

    @BindView(R.id.partidaSieteUnoFiveMatch)
    EditText partidaSieteUnoFiveMatch;
    @BindView(R.id.partidaSieteDosFiveMatch)
    EditText partidaSieteDosFiveMatch;
    @BindView(R.id.partidaSieteTresFiveMatch)
    EditText partidaSieteTresFiveMatch;
    @BindView(R.id.partidaSieteCuatroFiveMatch)
    EditText partidaSieteCuatroFiveMatch;
    @BindView(R.id.partidaSieteCincoFiveMatch)
    EditText partidaSieteCincoFiveMatch;

    @BindView(R.id.partidaOchoUnoFiveMatch)
    EditText partidaOchoUnoFiveMatch;
    @BindView(R.id.partidaOchoDosFiveMatch)
    EditText partidaOchoDosFiveMatch;
    @BindView(R.id.partidaOchoTresFiveMatch)
    EditText partidaOchoTresFiveMatch;
    @BindView(R.id.partidaOchoCuatroFiveMatch)
    EditText partidaOchoCuatroFiveMatch;
    @BindView(R.id.partidaOchoCincoFiveMatch)
    EditText partidaOchoCincoFiveMatch;

    @BindView(R.id.partidaNueveUnoFiveMatch)
    EditText partidaNueveUnoFiveMatch;
    @BindView(R.id.partidaNueveDosFiveMatch)
    EditText partidaNueveDosFiveMatch;
    @BindView(R.id.partidaNueveTresFiveMatch)
    EditText partidaNueveTresFiveMatch;
    @BindView(R.id.partidaNueveCuatroFiveMatch)
    EditText partidaNueveCuatroFiveMatch;
    @BindView(R.id.partidaNueveCincoFiveMatch)
    EditText partidaNueveCincoFiveMatch;

    @BindView(R.id.partidaDiezUnoFiveMatch)
    EditText partidaDiezUnoFiveMatch;
    @BindView(R.id.partidaDiezDosFiveMatch)
    EditText partidaDiezDosFiveMatch;
    @BindView(R.id.partidaDiezTresFiveMatch)
    EditText partidaDiezTresFiveMatch;
    @BindView(R.id.partidaDiezCuatroFiveMatch)
    EditText partidaDiezCuatroFiveMatch;
    @BindView(R.id.partidaDiezCincoFiveMatch)
    EditText partidaDiezCincoFiveMatch;

    @BindView(R.id.partidaOnceUnoFiveMatch)
    EditText partidaOnceUnoFiveMatch;
    @BindView(R.id.partidaOnceDosFiveMatch)
    EditText partidaOnceDosFiveMatch;
    @BindView(R.id.partidaOnceTresFiveMatch)
    EditText partidaOnceTresFiveMatch;
    @BindView(R.id.partidaOnceCuatroFiveMatch)
    EditText partidaOnceCuatroFiveMatch;
    @BindView(R.id.partidaOnceCincoFiveMatch)
    EditText partidaOnceCincoFiveMatch;

    @BindView(R.id.partidaDoceUnoFiveMatch)
    EditText partidaDoceUnoFiveMatch;
    @BindView(R.id.partidaDoceDosFiveMatch)
    EditText partidaDoceDosFiveMatch;
    @BindView(R.id.partidaDoceTresFiveMatch)
    EditText partidaDoceTresFiveMatch;
    @BindView(R.id.partidaDoceCuatroFiveMatch)
    EditText partidaDoceCuatroFiveMatch;
    @BindView(R.id.partidaDoceCincoFiveMatch)
    EditText partidaDoceCincoFiveMatch;

    @BindView(R.id.partidaTreceUnoFiveMatch)
    EditText partidaTreceUnoFiveMatch;
    @BindView(R.id.partidaTreceDosFiveMatch)
    EditText partidaTreceDosFiveMatch;
    @BindView(R.id.partidaTreceTresFiveMatch)
    EditText partidaTreceTresFiveMatch;
    @BindView(R.id.partidaTreceCuatroFiveMatch)
    EditText partidaTreceCuatroFiveMatch;
    @BindView(R.id.partidaTreceCincoFiveMatch)
    EditText partidaTreceCincoFiveMatch;

    @BindView(R.id.partidaCatorceUnoFiveMatch)
    EditText partidaCatorceUnoFiveMatch;
    @BindView(R.id.partidaCatorceDosFiveMatch)
    EditText partidaCatorceDosFiveMatch;
    @BindView(R.id.partidaCatorceTresFiveMatch)
    EditText partidaCatorceTresFiveMatch;
    @BindView(R.id.partidaCatorceCuatroFiveMatch)
    EditText partidaCatorceCuatroFiveMatch;
    @BindView(R.id.partidaCatorceCincoFiveMatch)
    EditText partidaCatorceCincoFiveMatch;

    @BindView(R.id.partidaQuinceUnoFiveMatch)
    EditText partidaQuinceUnoFiveMatch;
    @BindView(R.id.partidaQuinceDosFiveMatch)
    EditText partidaQuinceDosFiveMatch;
    @BindView(R.id.partidaQuinceTresFiveMatch)
    EditText partidaQuinceTresFiveMatch;
    @BindView(R.id.partidaQuinceCuatroFiveMatch)
    EditText partidaQuinceCuatroFiveMatch;
    @BindView(R.id.partidaQuinceCincoFiveMatch)
    EditText partidaQuinceCincoFiveMatch;

    @BindView(R.id.partidaDieciSeisUnoFiveMatch)
    EditText partidaDieciSeisUnoFiveMatch;
    @BindView(R.id.partidaDieciSeisDosFiveMatch)
    EditText partidaDieciSeisDosFiveMatch;
    @BindView(R.id.partidaDieciSeisTresFiveMatch)
    EditText partidaDieciSeisTresFiveMatch;
    @BindView(R.id.partidaDieciSeisCuatroFiveMatch)
    EditText partidaDieciSeisCuatroFiveMatch;
    @BindView(R.id.partidaDieciSeisCincoFiveMatch)
    EditText partidaDieciSeisCincoFiveMatch;

    @BindView(R.id.partidaDieciSieteUnoFiveMatch)
    EditText partidaDieciSieteUnoFiveMatch;
    @BindView(R.id.partidaDieciSieteDosFiveMatch)
    EditText partidaDieciSieteDosFiveMatch;
    @BindView(R.id.partidaDieciSieteTresFiveMatch)
    EditText partidaDieciSieteTresFiveMatch;
    @BindView(R.id.partidaDieciSieteCuatroFiveMatch)
    EditText partidaDieciSieteCuatroFiveMatch;
    @BindView(R.id.partidaDieciSieteCincoFiveMatch)
    EditText partidaDieciSieteCincoFiveMatch;

    @BindView(R.id.partidaDieciOchoUnoFiveMatch)
    EditText partidaDieciOchoUnoFiveMatch;
    @BindView(R.id.partidaDieciOchoDosFiveMatch)
    EditText partidaDieciOchoDosFiveMatch;
    @BindView(R.id.partidaDieciOchoTresFiveMatch)
    EditText partidaDieciOchoTresFiveMatch;
    @BindView(R.id.partidaDieciOchoCuatroFiveMatch)
    EditText partidaDieciOchoCuatroFiveMatch;
    @BindView(R.id.partidaDieciOchoCincoFiveMatch)
    EditText partidaDieciOchoCincoFiveMatch;

    @BindView(R.id.partidaDieciNueveUnoFiveMatch)
    EditText partidaDieciNueveUnoFiveMatch;
    @BindView(R.id.partidaDieciNueveDosFiveMatch)
    EditText partidaDieciNueveDosFiveMatch;
    @BindView(R.id.partidaDieciNueveTresFiveMatch)
    EditText partidaDieciNueveTresFiveMatch;
    @BindView(R.id.partidaDieciNueveCuatroFiveMatch)
    EditText partidaDieciNueveCuatroFiveMatch;
    @BindView(R.id.partidaDieciNueveCincoFiveMatch)
    EditText partidaDieciNueveCincoFiveMatch;

    @BindView(R.id.partidaVeinteUnoFiveMatch)
    EditText partidaVeinteUnoFiveMatch;
    @BindView(R.id.partidaVeinteDosFiveMatch)
    EditText partidaVeinteDosFiveMatch;
    @BindView(R.id.partidaVeinteTresFiveMatch)
    EditText partidaVeinteTresFiveMatch;
    @BindView(R.id.partidaVeinteCuatroFiveMatch)
    EditText partidaVeinteCuatroFiveMatch;
    @BindView(R.id.partidaVeinteCincoFiveMatch)
    EditText partidaVeinteCincoFiveMatch;

    @BindView(R.id.buttonSiguienteRondaFiveMatch)
    Button buttonSiguienteRondaFiveMatch;

    @BindView(R.id.textViewJugadorUnoFiveMatch)
    TextView textViewJugadorUnoFiveMatch;
    @BindView(R.id.textViewJugadorDosFiveMatch)
    TextView textViewJugadorDosFiveMatch;
    @BindView(R.id.textViewJugadorTresFiveMatch)
    TextView textViewJugadorTresFiveMatch;
    @BindView(R.id.textViewJugadorCuatroFiveMatch)
    TextView textViewJugadorCuatroFiveMatch;
    @BindView(R.id.textViewJugadorCincoFiveMatch)
    TextView textViewJugadorCincoFiveMatch;

    @BindView(R.id.textViewPuntajeJugadorUnoFiveMatch)
    TextView textViewPuntajeJugadorUnoFiveMatch;
    @BindView(R.id.textViewPuntajeJugadorDosFiveMatch)
    TextView textViewPuntajeJugadorDosFiveMatch;
    @BindView(R.id.textViewPuntajeJugadorTresFiveMatch)
    TextView textViewPuntajeJugadorTresFiveMatch;
    @BindView(R.id.textViewPuntajeJugadorCuatroFiveMatch)
    TextView textViewPuntajeJugadorCuatroFiveMatch;
    @BindView(R.id.textViewPuntajeJugadorCincoFiveMatch)
    TextView textViewPuntajeJugadorCincoFiveMatch;

    @BindView(R.id.byeJugadorUnoFiveMatch)
    ImageView byeJugadorUnoFiveMatch;
    @BindView(R.id.byeJugadorDosFiveMatch)
    ImageView byeJugadorDosFiveMatch;
    @BindView(R.id.byeJugadorTresFiveMatch)
    ImageView byeJugadorTresFiveMatch;
    @BindView(R.id.byeJugadorCuatroFiveMatch)
    ImageView byeJugadorCuatroFiveMatch;
    @BindView(R.id.byeJugadorCincoFiveMatch)
    ImageView byeJugadorCincoFiveMatch;

    private String jugadorUnoFiveMatch;
    private String jugadorDosFiveMatch;
    private String jugadorTresFiveMatch;
    private String jugadorCuatroFiveMatch;
    private String jugadorCincoFiveMatch;

    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;
    private Integer puntajeJugadorCuatro = 0;
    private Integer puntajeJugadorCinco = 0;

    private Integer contadorDeRonda = 1;


    public FiveMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_five_match, container, false);
        ButterKnife.bind(this, view);

        Bundle bundle = getArguments();

        jugadorUnoFiveMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosFiveMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresFiveMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);
        jugadorCuatroFiveMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CUATRO);
        jugadorCincoFiveMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CINCO);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoFiveMatch.setText(jugadorUnoFiveMatch);
        textViewJugadorDosFiveMatch.setText(jugadorDosFiveMatch);
        textViewJugadorTresFiveMatch.setText(jugadorTresFiveMatch);
        textViewJugadorCuatroFiveMatch.setText(jugadorCuatroFiveMatch);
        textViewJugadorCincoFiveMatch.setText(jugadorCincoFiveMatch);

        buttonSiguienteRondaFiveMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoFiveMatch, partidaUnoDosFiveMatch, partidaUnoTresFiveMatch,
                                partidaUnoCuatroFiveMatch, partidaUnoCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoFiveMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosFiveMatch);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTresFiveMatch);
                            puntajeJugadorCuatro = getNumeroParcial(partidaUnoCuatroFiveMatch);
                            puntajeJugadorCinco = getNumeroParcial(partidaUnoCincoFiveMatch);
                            setFreezeRonda(partidaUnoUnoFiveMatch, partidaUnoDosFiveMatch, partidaUnoTresFiveMatch,
                                    partidaUnoCuatroFiveMatch, partidaUnoCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoFiveMatch, partidaDosDosFiveMatch,
                                    partidaDosTresFiveMatch, partidaDosCuatroFiveMatch, partidaDosCincoFiveMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoFiveMatch, partidaDosDosFiveMatch, partidaDosTresFiveMatch,
                                partidaDosCuatroFiveMatch, partidaDosCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDosCincoFiveMatch);
                            setFreezeRonda(partidaDosUnoFiveMatch, partidaDosDosFiveMatch, partidaDosTresFiveMatch,
                                    partidaDosCuatroFiveMatch, partidaDosCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoFiveMatch, partidaTresDosFiveMatch,
                                    partidaTresTresFiveMatch, partidaTresCuatroFiveMatch, partidaTresCincoFiveMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoFiveMatch, partidaTresDosFiveMatch, partidaTresTresFiveMatch,
                                partidaTresCuatroFiveMatch, partidaTresCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTresUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTresDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTresTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTresCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTresCincoFiveMatch);
                            setFreezeRonda(partidaTresUnoFiveMatch, partidaTresDosFiveMatch, partidaTresTresFiveMatch,
                                    partidaTresCuatroFiveMatch, partidaTresCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoFiveMatch, partidaCuatroDosFiveMatch,
                                    partidaCuatroTresFiveMatch, partidaCuatroCuatroFiveMatch,
                                    partidaCuatroCincoFiveMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoFiveMatch, partidaCuatroDosFiveMatch,
                                partidaCuatroTresFiveMatch, partidaCuatroCuatroFiveMatch,
                                partidaCuatroCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCuatroUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCuatroDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCuatroTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCuatroCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCuatroCincoFiveMatch);
                            setFreezeRonda(partidaCuatroUnoFiveMatch, partidaCuatroDosFiveMatch,
                                    partidaCuatroTresFiveMatch, partidaCuatroCuatroFiveMatch,
                                    partidaCuatroCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoFiveMatch, partidaCincoDosFiveMatch,
                                    partidaCincoTresFiveMatch, partidaCincoCuatroFiveMatch,
                                    partidaCincoCincoFiveMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoFiveMatch, partidaCincoDosFiveMatch,
                                partidaCincoTresFiveMatch, partidaCincoCuatroFiveMatch,
                                partidaCincoCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCincoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCincoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCincoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCincoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCincoCincoFiveMatch);
                            setFreezeRonda(partidaCincoUnoFiveMatch, partidaCincoDosFiveMatch,
                                    partidaCincoTresFiveMatch, partidaCincoCuatroFiveMatch,
                                    partidaCincoCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoFiveMatch, partidaSeisDosFiveMatch,
                                    partidaSeisTresFiveMatch, partidaSeisCuatroFiveMatch,
                                    partidaSeisCincoFiveMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoFiveMatch, partidaSeisDosFiveMatch, partidaSeisTresFiveMatch,
                                partidaSeisCuatroFiveMatch, partidaSeisCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSeisUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSeisDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSeisTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSeisCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSeisCincoFiveMatch);
                            setFreezeRonda(partidaSeisUnoFiveMatch, partidaSeisDosFiveMatch, partidaSeisTresFiveMatch,
                                    partidaSeisCuatroFiveMatch, partidaSeisCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoFiveMatch, partidaSieteDosFiveMatch,
                                    partidaSieteTresFiveMatch, partidaSieteCuatroFiveMatch, partidaSieteCincoFiveMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoFiveMatch, partidaSieteDosFiveMatch,
                                partidaSieteTresFiveMatch, partidaSieteCuatroFiveMatch,
                                partidaSieteCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSieteUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSieteDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSieteTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSieteCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSieteCincoFiveMatch);
                            setFreezeRonda(partidaSieteUnoFiveMatch, partidaSieteDosFiveMatch,
                                    partidaSieteTresFiveMatch, partidaSieteCuatroFiveMatch,
                                    partidaSieteCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoFiveMatch, partidaOchoDosFiveMatch,
                                    partidaOchoTresFiveMatch, partidaOchoCuatroFiveMatch,
                                    partidaOchoCincoFiveMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoFiveMatch, partidaOchoDosFiveMatch, partidaOchoTresFiveMatch,
                                partidaOchoCuatroFiveMatch, partidaOchoCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaOchoUnoFiveMatch, partidaOchoDosFiveMatch, partidaOchoTresFiveMatch,
                                    partidaOchoCuatroFiveMatch, partidaOchoCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoFiveMatch, partidaNueveDosFiveMatch,
                                    partidaNueveTresFiveMatch, partidaNueveCuatroFiveMatch,
                                    partidaNueveCincoFiveMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoFiveMatch, partidaNueveDosFiveMatch,
                                partidaNueveTresFiveMatch, partidaNueveCuatroFiveMatch,
                                partidaNueveCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaNueveUnoFiveMatch, partidaNueveDosFiveMatch, partidaNueveTresFiveMatch,
                                    partidaNueveCuatroFiveMatch, partidaNueveCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoFiveMatch, partidaDiezDosFiveMatch,
                                    partidaDiezTresFiveMatch, partidaDiezCuatroFiveMatch,
                                    partidaDiezCincoFiveMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoFiveMatch, partidaDiezDosFiveMatch, partidaDiezTresFiveMatch,
                                partidaDiezCuatroFiveMatch, partidaDiezCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDiezUnoFiveMatch, partidaDiezDosFiveMatch, partidaDiezTresFiveMatch,
                                    partidaDiezCuatroFiveMatch, partidaDiezCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoFiveMatch, partidaOnceDosFiveMatch,
                                    partidaOnceTresFiveMatch, partidaOnceCuatroFiveMatch,
                                    partidaOnceCincoFiveMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoFiveMatch, partidaOnceDosFiveMatch, partidaOnceTresFiveMatch,
                                partidaOnceCuatroFiveMatch, partidaOnceCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaOnceUnoFiveMatch, partidaOnceDosFiveMatch, partidaOnceTresFiveMatch,
                                    partidaOnceCuatroFiveMatch, partidaOnceCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoFiveMatch, partidaDoceDosFiveMatch,
                                    partidaDoceTresFiveMatch, partidaDoceCuatroFiveMatch, partidaDoceCincoFiveMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoFiveMatch, partidaDoceDosFiveMatch,
                                partidaDoceTresFiveMatch, partidaDoceCuatroFiveMatch, partidaDoceCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDoceUnoFiveMatch, partidaDoceDosFiveMatch, partidaDoceTresFiveMatch,
                                    partidaDoceCuatroFiveMatch, partidaDoceCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoFiveMatch, partidaTreceDosFiveMatch,
                                    partidaTreceTresFiveMatch, partidaTreceCuatroFiveMatch, partidaTreceCincoFiveMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoFiveMatch, partidaTreceDosFiveMatch,
                                partidaTreceTresFiveMatch, partidaTreceCuatroFiveMatch, partidaTreceCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaTreceUnoFiveMatch, partidaTreceDosFiveMatch, partidaTreceTresFiveMatch,
                                    partidaTreceCuatroFiveMatch, partidaTreceCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoFiveMatch, partidaCatorceDosFiveMatch,
                                    partidaCatorceTresFiveMatch, partidaCatorceCuatroFiveMatch,
                                    partidaCatorceCincoFiveMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoFiveMatch, partidaCatorceDosFiveMatch,
                                partidaCatorceTresFiveMatch, partidaCatorceCuatroFiveMatch,
                                partidaCatorceCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaCatorceUnoFiveMatch, partidaCatorceDosFiveMatch,
                                    partidaCatorceTresFiveMatch, partidaCatorceCuatroFiveMatch,
                                    partidaCatorceCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoFiveMatch, partidaQuinceDosFiveMatch,
                                    partidaQuinceTresFiveMatch, partidaQuinceCuatroFiveMatch,
                                    partidaQuinceCincoFiveMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoFiveMatch, partidaQuinceDosFiveMatch,
                                partidaQuinceTresFiveMatch, partidaQuinceCuatroFiveMatch,
                                partidaQuinceCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaQuinceUnoFiveMatch, partidaQuinceDosFiveMatch,
                                    partidaQuinceTresFiveMatch, partidaQuinceCuatroFiveMatch,
                                    partidaQuinceCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeisFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUnoFiveMatch, partidaDieciSeisDosFiveMatch,
                                    partidaDieciSeisTresFiveMatch, partidaDieciSeisCuatroFiveMatch,
                                    partidaDieciSeisCincoFiveMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUnoFiveMatch, partidaDieciSeisDosFiveMatch,
                                partidaDieciSeisTresFiveMatch, partidaDieciSeisCuatroFiveMatch,
                                partidaDieciSeisCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDieciSeisUnoFiveMatch, partidaDieciSeisDosFiveMatch,
                                    partidaDieciSeisTresFiveMatch, partidaDieciSeisCuatroFiveMatch,
                                    partidaSeisCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSieteFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUnoFiveMatch, partidaDieciSieteDosFiveMatch,
                                    partidaDieciSieteTresFiveMatch, partidaDieciSieteCuatroFiveMatch,
                                    partidaDieciSieteCincoFiveMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUnoFiveMatch, partidaDieciSieteDosFiveMatch,
                                partidaDieciSieteTresFiveMatch, partidaDieciSieteCuatroFiveMatch,
                                partidaDieciSieteCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDieciSieteUnoFiveMatch, partidaDieciSieteDosFiveMatch,
                                    partidaDieciSieteTresFiveMatch, partidaDieciSieteCuatroFiveMatch,
                                    partidaDieciSieteCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOchoFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUnoFiveMatch, partidaDieciOchoDosFiveMatch,
                                    partidaDieciOchoTresFiveMatch, partidaDieciOchoCuatroFiveMatch,
                                    partidaDieciOchoCincoFiveMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUnoFiveMatch, partidaDieciOchoDosFiveMatch,
                                partidaDieciOchoTresFiveMatch, partidaDieciOchoCuatroFiveMatch,
                                partidaDieciOchoCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDieciOchoUnoFiveMatch, partidaDieciOchoDosFiveMatch,
                                    partidaDieciOchoTresFiveMatch, partidaDieciOchoCuatroFiveMatch,
                                    partidaDieciOchoCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueveFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUnoFiveMatch, partidaDieciNueveDosFiveMatch,
                                    partidaDieciNueveTresFiveMatch, partidaDieciNueveCuatroFiveMatch,
                                    partidaDieciNueveCincoFiveMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUnoFiveMatch, partidaDieciNueveDosFiveMatch,
                                partidaDieciNueveTresFiveMatch, partidaDieciNueveCuatroFiveMatch,
                                partidaDieciNueveCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaDieciNueveUnoFiveMatch, partidaDieciNueveDosFiveMatch,
                                    partidaDieciNueveTresFiveMatch, partidaDieciNueveCuatroFiveMatch,
                                    partidaDieciNueveCincoFiveMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteFiveMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoFiveMatch, partidaVeinteDosFiveMatch,
                                    partidaVeinteTresFiveMatch, partidaVeinteCuatroFiveMatch,
                                    partidaVeinteCincoFiveMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoFiveMatch, partidaVeinteDosFiveMatch,
                                partidaVeinteTresFiveMatch, partidaVeinteCuatroFiveMatch,
                                partidaVeinteCincoFiveMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoFiveMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosFiveMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresFiveMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroFiveMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoFiveMatch);
                            setFreezeRonda(partidaVeinteUnoFiveMatch, partidaVeinteDosFiveMatch,
                                    partidaVeinteTresFiveMatch, partidaVeinteCuatroFiveMatch,
                                    partidaVeinteCincoFiveMatch);
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
                                          EditText partidaCinco) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
        perdedorNoSumaMas(puntajeJugadorCuatro, partidaCuatro);
        perdedorNoSumaMas(puntajeJugadorCinco, partidaCinco);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }


    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, Integer jugadorTres, Integer jugadorCuatro, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos
                && jugadorTres > limiteDePuntos && jugadorCuatro > limiteDePuntos) {
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

    private void checkWinner() {
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, textViewJugadorCincoFiveMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCinco, textViewJugadorCuatroFiveMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorCuatro, puntajeJugadorCinco, textViewJugadorTresFiveMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco, textViewJugadorDosFiveMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco, textViewJugadorUnoFiveMatch);
    }


    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUnoFiveMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoFiveMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosFiveMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosFiveMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTresFiveMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTresFiveMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro > limiteDePuntos) {
            byeJugadorCuatroFiveMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCuatroFiveMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCinco > limiteDePuntos) {
            byeJugadorCincoFiveMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCincoFiveMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres, EditText partidaDosCuatro, EditText partidaDosCinco) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
        setFreeze(partidaDosCuatro);
        setFreeze(partidaDosCinco);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoFiveMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosFiveMatch.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTresFiveMatch.setText(String.valueOf(puntajeJugadorTres));
        textViewPuntajeJugadorCuatroFiveMatch.setText(String.valueOf(puntajeJugadorCuatro));
        textViewPuntajeJugadorCincoFiveMatch.setText(String.valueOf(puntajeJugadorCinco));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres, EditText jugadorCuatro,
                                      EditText jugadorCinco) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString()) ||
                TextUtils.isEmpty(jugadorCuatro.getText().toString()) ||
                TextUtils.isEmpty(jugadorCinco.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }


}
