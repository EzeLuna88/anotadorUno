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
public class TwoMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoTwoMatch)
    LinearLayout rondaUnoTwoMatch;
    @BindView(R.id.rondaDosTwoMatch)
    LinearLayout rondaDosTwoMatch;
    @BindView(R.id.rondaTresTwoMatch)
    LinearLayout rondaTresTwoMatch;
    @BindView(R.id.rondaCuatroTwoMatch)
    LinearLayout rondaCuatroTwoMatch;
    @BindView(R.id.rondaCincoTwoMatch)
    LinearLayout rondaCincoTwoMatch;
    @BindView(R.id.rondaSeisTwoMatch)
    LinearLayout rondaSeisTwoMatch;
    @BindView(R.id.rondaSieteTwoMatch)
    LinearLayout rondaSieteTwoMatch;
    @BindView(R.id.rondaOchoTwoMatch)
    LinearLayout rondaOchoTwoMatch;
    @BindView(R.id.rondaNueveTwoMatch)
    LinearLayout rondaNueveTwoMatch;
    @BindView(R.id.rondaDiezTwoMatch)
    LinearLayout rondaDiezTwoMatch;
    @BindView(R.id.rondaOnceTwoMatch)
    LinearLayout rondaOnceTwoMatch;
    @BindView(R.id.rondaDoceTwoMatch)
    LinearLayout rondaDoceTwoMatch;
    @BindView(R.id.rondaTreceTwoMatch)
    LinearLayout rondaTreceTwoMatch;
    @BindView(R.id.rondaCatorceTwoMatch)
    LinearLayout rondaCatorceTwoMatch;
    @BindView(R.id.rondaQuinceTwoMatch)
    LinearLayout rondaQuinceTwoMatch;
    @BindView(R.id.rondaDieciSeisTwoMatch)
    LinearLayout rondaDieciSeisTwoMatch;
    @BindView(R.id.rondaDieciSieteTwoMatch)
    LinearLayout rondaDieciSieteTwoMatch;
    @BindView(R.id.rondaDieciOchoTwoMatch)
    LinearLayout rondaDieciOchoTwoMatch;
    @BindView(R.id.rondaDieciNueveTwoMatch)
    LinearLayout rondaDieciNueveTwoMatch;
    @BindView(R.id.rondaVeinteTwoMatch)
    LinearLayout rondaVeinteTwoMatch;
    @BindView(R.id.rondaVeintiunoTwoMatch)
    LinearLayout rondaVeintiunoTwoMatch;
    @BindView(R.id.rondaVeintidosTwoMatch)
    LinearLayout rondaVeintidosTwoMatch;
    @BindView(R.id.rondaVeintitresTwoMatch)
    LinearLayout rondaVeintitresTwoMatch;
    @BindView(R.id.rondaVeinticuatroTwoMatch)
    LinearLayout rondaVeinticuatroTwoMatch;
    @BindView(R.id.rondaVeinticincoTwoMatch)
    LinearLayout rondaVeinticincoTwoMatch;
    @BindView(R.id.rondaVeintiseisTwoMatch)
    LinearLayout rondaVeintiseisTwoMatch;
    @BindView(R.id.rondaVeintisieteTwoMatch)
    LinearLayout rondaVeintisieteTwoMatch;
    @BindView(R.id.rondaVeintiochoTwoMatch)
    LinearLayout rondaVeintiochoTwoMatch;
    @BindView(R.id.rondaVeintinueveTwoMatch)
    LinearLayout rondaVeintinueveTwoMatch;
    @BindView(R.id.rondaTreintaTwoMatch)
    LinearLayout rondaTreintaTwoMatch;

    @BindView(R.id.partidaUnoUnoTwoMatch)
    EditText partidaUnoUnoTwoMatch;
    @BindView(R.id.partidaUnoDosTwoMatch)
    EditText partidaUnoDosTwoMatch;

    @BindView(R.id.partidaDosUnoTwoMatch)
    EditText partidaDosUnoTwoMatch;
    @BindView(R.id.partidaDosDosTwoMatch)
    EditText partidaDosDosTwoMatch;

    @BindView(R.id.partidaTresUnoTwoMatch)
    EditText partidaTresUnoTwoMatch;
    @BindView(R.id.partidaTresDosTwoMatch)
    EditText partidaTresDosTwoMatch;

    @BindView(R.id.partidaCuatroUnoTwoMatch)
    EditText partidaCuatroUnoTwoMatch;
    @BindView(R.id.partidaCuatroDosTwoMatch)
    EditText partidaCuatroDosTwoMatch;

    @BindView(R.id.partidaCincoUnoTwoMatch)
    EditText partidaCincoUnoTwoMatch;
    @BindView(R.id.partidaCincoDosTwoMatch)
    EditText partidaCincoDosTwoMatch;

    @BindView(R.id.partidaSeisUnoTwoMatch)
    EditText partidaSeisUnoTwoMatch;
    @BindView(R.id.partidaSeisDosTwoMatch)
    EditText partidaSeisDosTwoMatch;

    @BindView(R.id.partidaSieteUnoTwoMatch)
    EditText partidaSieteUnoTwoMatch;
    @BindView(R.id.partidaSieteDosTwoMatch)
    EditText partidaSieteDosTwoMatch;

    @BindView(R.id.partidaOchoUnoTwoMatch)
    EditText partidaOchoUnoTwoMatch;
    @BindView(R.id.partidaOchoDosTwoMatch)
    EditText partidaOchoDosTwoMatch;

    @BindView(R.id.partidaNueveUnoTwoMatch)
    EditText partidaNueveUnoTwoMatch;
    @BindView(R.id.partidaNueveDosTwoMatch)
    EditText partidaNueveDosTwoMatch;

    @BindView(R.id.partidaDiezUnoTwoMatch)
    EditText partidaDiezUnoTwoMatch;
    @BindView(R.id.partidaDiezDosTwoMatch)
    EditText partidaDiezDosTwoMatch;

    @BindView(R.id.partidaOnceUnoTwoMatch)
    EditText partidaOnceUnoTwoMatch;
    @BindView(R.id.partidaOnceDosTwoMatch)
    EditText partidaOnceDosTwoMatch;

    @BindView(R.id.partidaDoceUnoTwoMatch)
    EditText partidaDoceUnoTwoMatch;
    @BindView(R.id.partidaDoceDosTwoMatch)
    EditText partidaDoceDosTwoMatch;

    @BindView(R.id.partidaTreceUnoTwoMatch)
    EditText partidaTreceUnoTwoMatch;
    @BindView(R.id.partidaTreceDosTwoMatch)
    EditText partidaTreceDosTwoMatch;

    @BindView(R.id.partidaCatorceUnoTwoMatch)
    EditText partidaCatorceUnoTwoMatch;
    @BindView(R.id.partidaCatorceDosTwoMatch)
    EditText partidaCatorceDosTwoMatch;

    @BindView(R.id.partidaQuinceUnoTwoMatch)
    EditText partidaQuinceUnoTwoMatch;
    @BindView(R.id.partidaQuinceDosTwoMatch)
    EditText partidaQuinceDosTwoMatch;

    @BindView(R.id.partidaDieciSeisUnoTwoMatch)
    EditText partidaDieciSeisUnoTwoMatch;
    @BindView(R.id.partidaDieciSeisDosTwoMatch)
    EditText partidaDieciSeisDosTwoMatch;

    @BindView(R.id.partidaDieciSieteUnoTwoMatch)
    EditText partidaDieciSieteUnoTwoMatch;
    @BindView(R.id.partidaDieciSieteDosTwoMatch)
    EditText partidaDieciSieteDosTwoMatch;

    @BindView(R.id.partidaDieciOchoUnoTwoMatch)
    EditText partidaDieciOchoUnoTwoMatch;
    @BindView(R.id.partidaDieciOchoDosTwoMatch)
    EditText partidaDieciOchoDosTwoMatch;

    @BindView(R.id.partidaDieciNueveUnoTwoMatch)
    EditText partidaDieciNueveUnoTwoMatch;
    @BindView(R.id.partidaDieciNueveDosTwoMatch)
    EditText partidaDieciNueveDosTwoMatch;

    @BindView(R.id.partidaVeinteUnoTwoMatch)
    EditText partidaVeinteUnoTwoMatch;
    @BindView(R.id.partidaVeinteDosTwoMatch)
    EditText partidaVeinteDosTwoMatch;

    @BindView(R.id.partidaVeintiunoUnoTwoMatch)
    EditText partidaVeintiunoUnoTwoMatch;
    @BindView(R.id.partidaVeintiunoDosTwoMatch)
    EditText partidaVeintiunoDosTwoMatch;

    @BindView(R.id.partidaVeintidosUnoTwoMatch)
    EditText partidaVeintidosUnoTwoMatch;
    @BindView(R.id.partidaVeintidosDosTwoMatch)
    EditText partidaVeintidosDosTwoMatch;

    @BindView(R.id.partidaVeintitresUnoTwoMatch)
    EditText partidaVeintitresUnoTwoMatch;
    @BindView(R.id.partidaVeintitresDosTwoMatch)
    EditText partidaVeintitresDosTwoMatch;

    @BindView(R.id.partidaVeinticuatroUnoTwoMatch)
    EditText partidaVeinticuatroUnoTwoMatch;
    @BindView(R.id.partidaVeinticuatroDosTwoMatch)
    EditText partidaVeinticuatroDosTwoMatch;

    @BindView(R.id.partidaVeinticincoUnoTwoMatch)
    EditText partidaVeinticincoUnoTwoMatch;
    @BindView(R.id.partidaVeinticincoDosTwoMatch)
    EditText partidaVeinticincoDosTwoMatch;

    @BindView(R.id.partidaVeintiseisUnoTwoMatch)
    EditText partidaVeintiseisUnoTwoMatch;
    @BindView(R.id.partidaVeintiseisDosTwoMatch)
    EditText partidaVeintiseisDosTwoMatch;

    @BindView(R.id.partidaVeintisieteUnoTwoMatch)
    EditText partidaVeintisieteUnoTwoMatch;
    @BindView(R.id.partidaVeintisieteDosTwoMatch)
    EditText partidaVeintisieteDosTwoMatch;

    @BindView(R.id.partidaVeintiochoUnoTwoMatch)
    EditText partidaVeintiochoUnoTwoMatch;
    @BindView(R.id.partidaVeintiochoDosTwoMatch)
    EditText partidaVeintiochoDosTwoMatch;

    @BindView(R.id.partidaVeintinueveUnoTwoMatch)
    EditText partidaVeintinueveUnoTwoMatch;
    @BindView(R.id.partidaVeintinueveDosTwoMatch)
    EditText partidaVeintinueveDosTwoMatch;

    @BindView(R.id.partidaTreintaUnoTwoMatch)
    EditText partidaTreintaUnoTwoMatch;
    @BindView(R.id.partidaTreintaDosTwoMatch)
    EditText partidaTreintaDosTwoMatch;

    @BindView(R.id.buttonSiguienteRondaTwoMatch)
    Button buttonSiguienteRondaTwoMatch;

    @BindView(R.id.textViewJugadorUnoTwoMatch)
    TextView textViewJugadorUnoTwoMatch;
    @BindView(R.id.textViewJugadorDosTwoMatch)
    TextView textViewJugadorDosTwoMatch;

    @BindView(R.id.textViewPuntajeJugadorUnoTwoMatch)
    TextView textViewPuntajeJugadorUnoTwoMatch;
    @BindView(R.id.textViewPuntajeJugadorDosTwoMatch)
    TextView textViewPuntajeJugadorDosTwoMatch;

    @BindView(R.id.byeJugadorUnoTwoMatch)
    ImageView byeJugadorUnoTwoMatch;
    @BindView(R.id.byeJugadorDosTwoMatch)
    ImageView byeJugadorDosTwoMatch;

    private String jugadorUnoTwoMatch;
    private String jugadorDosTwoMatch;

    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;

    private Integer contadorDeRonda = 1;


    public TwoMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two_match, container, false);

        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();

        jugadorUnoTwoMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosTwoMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoTwoMatch.setText(jugadorUnoTwoMatch);
        textViewJugadorDosTwoMatch.setText(jugadorDosTwoMatch);

        buttonSiguienteRondaTwoMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoTwoMatch, partidaUnoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoTwoMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosTwoMatch);
                            setFreezeRonda(partidaUnoUnoTwoMatch, partidaUnoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoTwoMatch, partidaDosDosTwoMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoTwoMatch, partidaDosDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosTwoMatch);
                            setFreezeRonda(partidaDosUnoTwoMatch, partidaDosDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoTwoMatch, partidaTresDosTwoMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoTwoMatch, partidaTresDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTresUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTresDosTwoMatch);
                            setFreezeRonda(partidaTresUnoTwoMatch, partidaTresDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoTwoMatch, partidaCuatroDosTwoMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoTwoMatch, partidaCuatroDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCuatroUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCuatroDosTwoMatch);
                            setFreezeRonda(partidaCuatroUnoTwoMatch, partidaCuatroDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoTwoMatch, partidaCincoDosTwoMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoTwoMatch, partidaCincoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCincoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCincoDosTwoMatch);
                            setFreezeRonda(partidaCincoUnoTwoMatch, partidaCincoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoTwoMatch, partidaSeisDosTwoMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoTwoMatch, partidaSeisDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSeisUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSeisDosTwoMatch);
                            setFreezeRonda(partidaSeisUnoTwoMatch, partidaSeisDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoTwoMatch, partidaSieteDosTwoMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoTwoMatch, partidaSieteDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSieteUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSieteDosTwoMatch);
                            setFreezeRonda(partidaSieteUnoTwoMatch, partidaSieteDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoTwoMatch, partidaOchoDosTwoMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoTwoMatch, partidaOchoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosTwoMatch);
                            setFreezeRonda(partidaOchoUnoTwoMatch, partidaOchoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoTwoMatch, partidaNueveDosTwoMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoTwoMatch, partidaNueveDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaNueveUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaNueveDosTwoMatch);
                            setFreezeRonda(partidaNueveUnoTwoMatch, partidaNueveDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoTwoMatch, partidaDiezDosTwoMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoTwoMatch, partidaDiezDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiezUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiezDosTwoMatch);
                            setFreezeRonda(partidaDiezUnoTwoMatch, partidaDiezDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoTwoMatch, partidaOnceDosTwoMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoTwoMatch, partidaOnceDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOnceUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOnceDosTwoMatch);
                            setFreezeRonda(partidaOnceUnoTwoMatch, partidaOnceDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoTwoMatch, partidaDoceDosTwoMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoTwoMatch, partidaDoceDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDoceUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDoceDosTwoMatch);
                            setFreezeRonda(partidaDoceUnoTwoMatch, partidaDoceDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoTwoMatch, partidaTreceDosTwoMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoTwoMatch, partidaTreceDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreceUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreceDosTwoMatch);
                            setFreezeRonda(partidaTreceUnoTwoMatch, partidaTreceDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoTwoMatch, partidaCatorceDosTwoMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoTwoMatch, partidaCatorceDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCatorceUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCatorceDosTwoMatch);
                            setFreezeRonda(partidaCatorceUnoTwoMatch, partidaCatorceDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoTwoMatch, partidaQuinceDosTwoMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoTwoMatch, partidaQuinceDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaQuinceUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaQuinceDosTwoMatch);
                            setFreezeRonda(partidaQuinceUnoTwoMatch, partidaQuinceDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeisTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUnoTwoMatch, partidaDieciSeisDosTwoMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUnoTwoMatch, partidaDieciSeisDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSeisUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSeisDosTwoMatch);
                            setFreezeRonda(partidaDieciSeisUnoTwoMatch, partidaDieciSeisDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSieteTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUnoTwoMatch, partidaDieciSieteDosTwoMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUnoTwoMatch, partidaDieciSieteDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSieteUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSieteDosTwoMatch);
                            setFreezeRonda(partidaDieciSieteUnoTwoMatch, partidaDieciSieteDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOchoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUnoTwoMatch, partidaDieciOchoDosTwoMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUnoTwoMatch, partidaDieciOchoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciOchoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciOchoDosTwoMatch);
                            setFreezeRonda(partidaDieciOchoUnoTwoMatch, partidaDieciOchoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueveTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUnoTwoMatch, partidaDieciNueveDosTwoMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUnoTwoMatch, partidaDieciNueveDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciNueveUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciNueveDosTwoMatch);
                            setFreezeRonda(partidaDieciNueveUnoTwoMatch, partidaDieciNueveDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoTwoMatch, partidaVeinteDosTwoMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoTwoMatch, partidaVeinteDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinteUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinteDosTwoMatch);
                            setFreezeRonda(partidaVeinteUnoTwoMatch, partidaVeinteDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiunoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiunoUnoTwoMatch, partidaVeintiunoDosTwoMatch);
                        }
                        break;
                    case 21:
                        if (checkEmptyNumbers(partidaVeintiunoUnoTwoMatch, partidaVeintiunoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiunoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiunoDosTwoMatch);
                            setFreezeRonda(partidaVeintiunoUnoTwoMatch, partidaVeintiunoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintidosTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintidosUnoTwoMatch, partidaVeintidosDosTwoMatch);
                        }
                        break;
                    case 22:
                        if (checkEmptyNumbers(partidaVeintidosUnoTwoMatch, partidaVeintidosDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintidosUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintidosDosTwoMatch);
                            setFreezeRonda(partidaVeintidosUnoTwoMatch, partidaVeintidosDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintitresTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintitresUnoTwoMatch, partidaVeintitresDosTwoMatch);
                        }
                        break;
                    case 23:
                        if (checkEmptyNumbers(partidaVeintitresUnoTwoMatch, partidaVeintitresDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintitresUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintitresDosTwoMatch);
                            setFreezeRonda(partidaVeintitresUnoTwoMatch, partidaVeintitresDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticuatroTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticuatroUnoTwoMatch, partidaVeinticuatroDosTwoMatch);
                        }
                        break;
                    case 24:
                        if (checkEmptyNumbers(partidaVeinticuatroUnoTwoMatch, partidaVeinticuatroDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticuatroUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticuatroDosTwoMatch);
                            setFreezeRonda(partidaVeinticuatroUnoTwoMatch, partidaVeinticuatroDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticincoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticincoUnoTwoMatch, partidaVeinticincoDosTwoMatch);
                        }
                        break;
                    case 25:
                        if (checkEmptyNumbers(partidaVeinticincoUnoTwoMatch, partidaVeinticincoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticincoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticincoDosTwoMatch);
                            setFreezeRonda(partidaVeinticincoUnoTwoMatch, partidaVeinticincoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiseisTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiseisUnoTwoMatch, partidaVeintiseisDosTwoMatch);
                        }
                        break;
                    case 26:
                        if (checkEmptyNumbers(partidaVeintiseisUnoTwoMatch, partidaVeintiseisDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiseisUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiseisDosTwoMatch);
                            setFreezeRonda(partidaVeintiseisUnoTwoMatch, partidaVeintiseisDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintisieteTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintisieteUnoTwoMatch, partidaVeintisieteDosTwoMatch);
                        }
                        break;
                    case 27:
                        if (checkEmptyNumbers(partidaVeintisieteUnoTwoMatch, partidaVeintisieteDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintisieteUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintisieteDosTwoMatch);
                            setFreezeRonda(partidaVeintisieteUnoTwoMatch, partidaVeintisieteDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiochoTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiochoUnoTwoMatch, partidaVeintiochoDosTwoMatch);
                        }
                        break;
                    case 28:
                        if (checkEmptyNumbers(partidaVeintiochoUnoTwoMatch, partidaVeintiochoDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiochoUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiochoDosTwoMatch);
                            setFreezeRonda(partidaVeintiochoUnoTwoMatch, partidaVeintiochoDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintinueveTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintinueveUnoTwoMatch, partidaVeintinueveDosTwoMatch);
                        }
                        break;
                    case 29:
                        if (checkEmptyNumbers(partidaVeintinueveUnoTwoMatch, partidaVeintinueveDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintinueveUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintinueveDosTwoMatch);
                            setFreezeRonda(partidaVeintinueveUnoTwoMatch, partidaVeintinueveDosTwoMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreintaTwoMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreintaUnoTwoMatch, partidaTreintaDosTwoMatch);
                        }
                        break;
                    case 30:
                        if (checkEmptyNumbers(partidaTreintaUnoTwoMatch, partidaTreintaDosTwoMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreintaUnoTwoMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreintaDosTwoMatch);
                            setFreezeRonda(partidaTreintaUnoTwoMatch, partidaTreintaDosTwoMatch);
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

    private void generalPerdedorNoSumaMas(EditText partidaUno, EditText partidaDos) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }

    private void checkWinnerPlayer(Integer jugadorUno, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos) {
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
        checkWinnerPlayer(puntajeJugadorUno, textViewJugadorDosTwoMatch);
        checkWinnerPlayer(puntajeJugadorDos, textViewJugadorUnoTwoMatch);
    }


    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUnoTwoMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoTwoMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosTwoMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosTwoMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoTwoMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosTwoMatch.setText(String.valueOf(puntajeJugadorDos));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }

}
