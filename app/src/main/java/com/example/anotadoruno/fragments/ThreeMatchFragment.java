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
public class ThreeMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoThreeMatch)
    LinearLayout rondaUnoThreeMatch;
    @BindView(R.id.rondaDosThreeMatch)
    LinearLayout rondaDosThreeMatch;
    @BindView(R.id.rondaTresThreeMatch)
    LinearLayout rondaTresThreeMatch;
    @BindView(R.id.rondaCuatroThreeMatch)
    LinearLayout rondaCuatroThreeMatch;
    @BindView(R.id.rondaCincoThreeMatch)
    LinearLayout rondaCincoThreeMatch;
    @BindView(R.id.rondaSeisThreeMatch)
    LinearLayout rondaSeisThreeMatch;
    @BindView(R.id.rondaSieteThreeMatch)
    LinearLayout rondaSieteThreeMatch;
    @BindView(R.id.rondaOchoThreeMatch)
    LinearLayout rondaOchoThreeMatch;
    @BindView(R.id.rondaNueveThreeMatch)
    LinearLayout rondaNueveThreeMatch;
    @BindView(R.id.rondaDiezThreeMatch)
    LinearLayout rondaDiezThreeMatch;
    @BindView(R.id.rondaOnceThreeMatch)
    LinearLayout rondaOnceThreeMatch;
    @BindView(R.id.rondaDoceThreeMatch)
    LinearLayout rondaDoceThreeMatch;
    @BindView(R.id.rondaTreceThreeMatch)
    LinearLayout rondaTreceThreeMatch;
    @BindView(R.id.rondaCatorceThreeMatch)
    LinearLayout rondaCatorceThreeMatch;
    @BindView(R.id.rondaQuinceThreeMatch)
    LinearLayout rondaQuinceThreeMatch;
    @BindView(R.id.rondaDieciSeisThreeMatch)
    LinearLayout rondaDieciSeisThreeMatch;
    @BindView(R.id.rondaDieciSieteThreeMatch)
    LinearLayout rondaDieciSieteThreeMatch;
    @BindView(R.id.rondaDieciOchoThreeMatch)
    LinearLayout rondaDieciOchoThreeMatch;
    @BindView(R.id.rondaDieciNueveThreeMatch)
    LinearLayout rondaDieciNueveThreeMatch;
    @BindView(R.id.rondaVeinteThreeMatch)
    LinearLayout rondaVeinteThreeMatch;

    @BindView(R.id.partidaUnoUnoThreeMatch)
    EditText partidaUnoUnoThreeMatch;
    @BindView(R.id.partidaUnoDosThreeMatch)
    EditText partidaUnoDosThreeMatch;
    @BindView(R.id.partidaUnoTresThreeMatch)
    EditText partidaUnoTresThreeMatch;

    @BindView(R.id.partidaDosUnoThreeMatch)
    EditText partidaDosUnoThreeMatch;
    @BindView(R.id.partidaDosDosThreeMatch)
    EditText partidaDosDosThreeMatch;
    @BindView(R.id.partidaDosTresThreeMatch)
    EditText partidaDosTresThreeMatch;

    @BindView(R.id.partidaTresUnoThreeMatch)
    EditText partidaTresUnoThreeMatch;
    @BindView(R.id.partidaTresDosThreeMatch)
    EditText partidaTresDosThreeMatch;
    @BindView(R.id.partidaTresTresThreeMatch)
    EditText partidaTresTresThreeMatch;

    @BindView(R.id.partidaCuatroUnoThreeMatch)
    EditText partidaCuatroUnoThreeMatch;
    @BindView(R.id.partidaCuatroDosThreeMatch)
    EditText partidaCuatroDosThreeMatch;
    @BindView(R.id.partidaCuatroTresThreeMatch)
    EditText partidaCuatroTresThreeMatch;

    @BindView(R.id.partidaCincoUnoThreeMatch)
    EditText partidaCincoUnoThreeMatch;
    @BindView(R.id.partidaCincoDosThreeMatch)
    EditText partidaCincoDosThreeMatch;
    @BindView(R.id.partidaCincoTresThreeMatch)
    EditText partidaCincoTresThreeMatch;

    @BindView(R.id.partidaSeisUnoThreeMatch)
    EditText partidaSeisUnoThreeMatch;
    @BindView(R.id.partidaSeisDosThreeMatch)
    EditText partidaSeisDosThreeMatch;
    @BindView(R.id.partidaSeisTresThreeMatch)
    EditText partidaSeisTresThreeMatch;

    @BindView(R.id.partidaSieteUnoThreeMatch)
    EditText partidaSieteUnoThreeMatch;
    @BindView(R.id.partidaSieteDosThreeMatch)
    EditText partidaSieteDosThreeMatch;
    @BindView(R.id.partidaSieteTresThreeMatch)
    EditText partidaSieteTresThreeMatch;

    @BindView(R.id.partidaOchoUnoThreeMatch)
    EditText partidaOchoUnoThreeMatch;
    @BindView(R.id.partidaOchoDosThreeMatch)
    EditText partidaOchoDosThreeMatch;
    @BindView(R.id.partidaOchoTresThreeMatch)
    EditText partidaOchoTresThreeMatch;

    @BindView(R.id.partidaNueveUnoThreeMatch)
    EditText partidaNueveUnoThreeMatch;
    @BindView(R.id.partidaNueveDosThreeMatch)
    EditText partidaNueveDosThreeMatch;
    @BindView(R.id.partidaNueveTresThreeMatch)
    EditText partidaNueveTresThreeMatch;

    @BindView(R.id.partidaDiezUnoThreeMatch)
    EditText partidaDiezUnoThreeMatch;
    @BindView(R.id.partidaDiezDosThreeMatch)
    EditText partidaDiezDosThreeMatch;
    @BindView(R.id.partidaDiezTresThreeMatch)
    EditText partidaDiezTresThreeMatch;

    @BindView(R.id.partidaOnceUnoThreeMatch)
    EditText partidaOnceUnoThreeMatch;
    @BindView(R.id.partidaOnceDosThreeMatch)
    EditText partidaOnceDosThreeMatch;
    @BindView(R.id.partidaOnceTresThreeMatch)
    EditText partidaOnceTresThreeMatch;

    @BindView(R.id.partidaDoceUnoThreeMatch)
    EditText partidaDoceUnoThreeMatch;
    @BindView(R.id.partidaDoceDosThreeMatch)
    EditText partidaDoceDosThreeMatch;
    @BindView(R.id.partidaDoceTresThreeMatch)
    EditText partidaDoceTresThreeMatch;

    @BindView(R.id.partidaTreceUnoThreeMatch)
    EditText partidaTreceUnoThreeMatch;
    @BindView(R.id.partidaTreceDosThreeMatch)
    EditText partidaTreceDosThreeMatch;
    @BindView(R.id.partidaTreceTresThreeMatch)
    EditText partidaTreceTresThreeMatch;

    @BindView(R.id.partidaCatorceUnoThreeMatch)
    EditText partidaCatorceUnoThreeMatch;
    @BindView(R.id.partidaCatorceDosThreeMatch)
    EditText partidaCatorceDosThreeMatch;
    @BindView(R.id.partidaCatorceTresThreeMatch)
    EditText partidaCatorceTresThreeMatch;

    @BindView(R.id.partidaQuinceUnoThreeMatch)
    EditText partidaQuinceUnoThreeMatch;
    @BindView(R.id.partidaQuinceDosThreeMatch)
    EditText partidaQuinceDosThreeMatch;
    @BindView(R.id.partidaQuinceTresThreeMatch)
    EditText partidaQuinceTresThreeMatch;

    @BindView(R.id.partidaDieciSeisUnoThreeMatch)
    EditText partidaDieciSeisUnoThreeMatch;
    @BindView(R.id.partidaDieciSeisDosThreeMatch)
    EditText partidaDieciSeisDosThreeMatch;
    @BindView(R.id.partidaDieciSeisTresThreeMatch)
    EditText partidaDieciSeisTresThreeMatch;

    @BindView(R.id.partidaDieciSieteUnoThreeMatch)
    EditText partidaDieciSieteUnoThreeMatch;
    @BindView(R.id.partidaDieciSieteDosThreeMatch)
    EditText partidaDieciSieteDosThreeMatch;
    @BindView(R.id.partidaDieciSieteTresThreeMatch)
    EditText partidaDieciSieteTresThreeMatch;

    @BindView(R.id.partidaDieciOchoUnoThreeMatch)
    EditText partidaDieciOchoUnoThreeMatch;
    @BindView(R.id.partidaDieciOchoDosThreeMatch)
    EditText partidaDieciOchoDosThreeMatch;
    @BindView(R.id.partidaDieciOchoTresThreeMatch)
    EditText partidaDieciOchoTresThreeMatch;

    @BindView(R.id.partidaDieciNueveUnoThreeMatch)
    EditText partidaDieciNueveUnoThreeMatch;
    @BindView(R.id.partidaDieciNueveDosThreeMatch)
    EditText partidaDieciNueveDosThreeMatch;
    @BindView(R.id.partidaDieciNueveTresThreeMatch)
    EditText partidaDieciNueveTresThreeMatch;

    @BindView(R.id.partidaVeinteUnoThreeMatch)
    EditText partidaVeinteUnoThreeMatch;
    @BindView(R.id.partidaVeinteDosThreeMatch)
    EditText partidaVeinteDosThreeMatch;
    @BindView(R.id.partidaVeinteTresThreeMatch)
    EditText partidaVeinteTresThreeMatch;

    @BindView(R.id.buttonSiguienteRondaThreeMatch)
    Button buttonSiguienteRondaThreeMatch;

    @BindView(R.id.textViewJugadorUnoThreeMatch)
    TextView textViewJugadorUnoThreeMatch;
    @BindView(R.id.textViewJugadorDosThreeMatch)
    TextView textViewJugadorDosThreeMatch;
    @BindView(R.id.textViewJugadorTresThreeMatch)
    TextView textViewJugadorTresThreeMatch;

    @BindView(R.id.textViewPuntajeJugadorUnoThreeMatch)
    TextView textViewPuntajeJugadorUnoThreeMatch;
    @BindView(R.id.textViewPuntajeJugadorDosThreeMatch)
    TextView textViewPuntajeJugadorDosThreeMatch;
    @BindView(R.id.textViewPuntajeJugadorTresThreeMatch)
    TextView textViewPuntajeJugadorTresThreeMatch;

    @BindView(R.id.byeJugadorUnoThreeMatch)
    ImageView byeJugadorUnoThreeMatch;
    @BindView(R.id.byeJugadorDosThreeMatch)
    ImageView byeJugadorDosThreeMatch;
    @BindView(R.id.byeJugadorTresThreeMatch)
    ImageView byeJugadorTresThreeMatch;

    private String jugadorUnoThreeMatch;
    private String jugadorDosThreeMatch;
    private String jugadorTresThreeMatch;

    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;

    private Integer contadorDeRonda = 1;


    public ThreeMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three_match, container, false);

        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();

        jugadorUnoThreeMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosThreeMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresThreeMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoThreeMatch.setText(jugadorUnoThreeMatch);
        textViewJugadorDosThreeMatch.setText(jugadorDosThreeMatch);
        textViewJugadorTresThreeMatch.setText(jugadorTresThreeMatch);

        buttonSiguienteRondaThreeMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoThreeMatch, partidaUnoDosThreeMatch, partidaUnoTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoThreeMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosThreeMatch);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTresThreeMatch);
                            setFreezeRonda(partidaUnoUnoThreeMatch, partidaUnoDosThreeMatch, partidaUnoTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoThreeMatch, partidaDosDosThreeMatch,
                                    partidaDosTresThreeMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoThreeMatch, partidaDosDosThreeMatch, partidaDosTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDosUnoThreeMatch, partidaDosDosThreeMatch, partidaDosTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoThreeMatch, partidaTresDosThreeMatch,
                                    partidaTresTresThreeMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoThreeMatch, partidaTresDosThreeMatch, partidaTresTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaTresUnoThreeMatch, partidaTresDosThreeMatch, partidaTresTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoThreeMatch, partidaCuatroDosThreeMatch,
                                    partidaCuatroTresThreeMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoThreeMatch, partidaCuatroDosThreeMatch,
                                partidaCuatroTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);

                            setFreezeRonda(partidaCuatroUnoThreeMatch, partidaCuatroDosThreeMatch,
                                    partidaCuatroTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoThreeMatch, partidaCincoDosThreeMatch,
                                    partidaCincoTresThreeMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoThreeMatch, partidaCincoDosThreeMatch,
                                partidaCincoTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaCincoUnoThreeMatch, partidaCincoDosThreeMatch,
                                    partidaCincoTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoThreeMatch, partidaSeisDosThreeMatch,
                                    partidaSeisTresThreeMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoThreeMatch, partidaSeisDosThreeMatch, partidaSeisTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaSeisUnoThreeMatch, partidaSeisDosThreeMatch, partidaSeisTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoThreeMatch, partidaSieteDosThreeMatch,
                                    partidaSieteTresThreeMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoThreeMatch, partidaSieteDosThreeMatch,
                                partidaSieteTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaSieteUnoThreeMatch, partidaSieteDosThreeMatch,
                                    partidaSieteTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoThreeMatch, partidaOchoDosThreeMatch,
                                    partidaOchoTresThreeMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoThreeMatch, partidaOchoDosThreeMatch, partidaOchoTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaOchoUnoThreeMatch, partidaOchoDosThreeMatch, partidaOchoTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoThreeMatch, partidaNueveDosThreeMatch,
                                    partidaNueveTresThreeMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoThreeMatch, partidaNueveDosThreeMatch,
                                partidaNueveTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaNueveUnoThreeMatch, partidaNueveDosThreeMatch, partidaNueveTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoThreeMatch, partidaDiezDosThreeMatch,
                                    partidaDiezTresThreeMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoThreeMatch, partidaDiezDosThreeMatch, partidaDiezTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDiezUnoThreeMatch, partidaDiezDosThreeMatch, partidaDiezTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoThreeMatch, partidaOnceDosThreeMatch,
                                    partidaOnceTresThreeMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoThreeMatch, partidaOnceDosThreeMatch, partidaOnceTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaOnceUnoThreeMatch, partidaOnceDosThreeMatch, partidaOnceTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoThreeMatch, partidaDoceDosThreeMatch,
                                    partidaDoceTresThreeMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoThreeMatch, partidaDoceDosThreeMatch,
                                partidaDoceTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDoceUnoThreeMatch, partidaDoceDosThreeMatch, partidaDoceTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoThreeMatch, partidaTreceDosThreeMatch,
                                    partidaTreceTresThreeMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoThreeMatch, partidaTreceDosThreeMatch,
                                partidaTreceTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaTreceUnoThreeMatch, partidaTreceDosThreeMatch, partidaTreceTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoThreeMatch, partidaCatorceDosThreeMatch,
                                    partidaCatorceTresThreeMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoThreeMatch, partidaCatorceDosThreeMatch,
                                partidaCatorceTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaCatorceUnoThreeMatch, partidaCatorceDosThreeMatch,
                                    partidaCatorceTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoThreeMatch, partidaQuinceDosThreeMatch,
                                    partidaQuinceTresThreeMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoThreeMatch, partidaQuinceDosThreeMatch,
                                partidaQuinceTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaQuinceUnoThreeMatch, partidaQuinceDosThreeMatch,
                                    partidaQuinceTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeisThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUnoThreeMatch, partidaDieciSeisDosThreeMatch,
                                    partidaDieciSeisTresThreeMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUnoThreeMatch, partidaDieciSeisDosThreeMatch,
                                partidaDieciSeisTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDieciSeisUnoThreeMatch, partidaDieciSeisDosThreeMatch,
                                    partidaDieciSeisTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSieteThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUnoThreeMatch, partidaDieciSieteDosThreeMatch,
                                    partidaDieciSieteTresThreeMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUnoThreeMatch, partidaDieciSieteDosThreeMatch,
                                partidaDieciSieteTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDieciSieteUnoThreeMatch, partidaDieciSieteDosThreeMatch,
                                    partidaDieciSieteTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOchoThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUnoThreeMatch, partidaDieciOchoDosThreeMatch,
                                    partidaDieciOchoTresThreeMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUnoThreeMatch, partidaDieciOchoDosThreeMatch,
                                partidaDieciOchoTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDieciOchoUnoThreeMatch, partidaDieciOchoDosThreeMatch,
                                    partidaDieciOchoTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueveThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUnoThreeMatch, partidaDieciNueveDosThreeMatch,
                                    partidaDieciNueveTresThreeMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUnoThreeMatch, partidaDieciNueveDosThreeMatch,
                                partidaDieciNueveTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaDieciNueveUnoThreeMatch, partidaDieciNueveDosThreeMatch,
                                    partidaDieciNueveTresThreeMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteThreeMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoThreeMatch, partidaVeinteDosThreeMatch,
                                    partidaVeinteTresThreeMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoThreeMatch, partidaVeinteDosThreeMatch,
                                partidaVeinteTresThreeMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoThreeMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosThreeMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresThreeMatch);
                            setFreezeRonda(partidaVeinteUnoThreeMatch, partidaVeinteDosThreeMatch,
                                    partidaVeinteTresThreeMatch);
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

    private void generalPerdedorNoSumaMas(EditText partidaUno, EditText partidaDos, EditText partidaTres) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }

    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos) {
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
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, textViewJugadorTresThreeMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, textViewJugadorDosThreeMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, textViewJugadorUnoThreeMatch);
    }


    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUnoThreeMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoThreeMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosThreeMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosThreeMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTresThreeMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTresThreeMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoThreeMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosThreeMatch.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTresThreeMatch.setText(String.valueOf(puntajeJugadorTres));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }



}
