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
public class FourMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String NOMBRE_JUGADOR_CUATRO = "jugador cuatro";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoFourMatch)
    LinearLayout rondaUnoFourMatch;
    @BindView(R.id.rondaDosFourMatch)
    LinearLayout rondaDosFourMatch;
    @BindView(R.id.rondaTresFourMatch)
    LinearLayout rondaTresFourMatch;
    @BindView(R.id.rondaCuatroFourMatch)
    LinearLayout rondaCuatroFourMatch;
    @BindView(R.id.rondaCincoFourMatch)
    LinearLayout rondaCincoFourMatch;
    @BindView(R.id.rondaSeisFourMatch)
    LinearLayout rondaSeisFourMatch;
    @BindView(R.id.rondaSieteFourMatch)
    LinearLayout rondaSieteFourMatch;
    @BindView(R.id.rondaOchoFourMatch)
    LinearLayout rondaOchoFourMatch;
    @BindView(R.id.rondaNueveFourMatch)
    LinearLayout rondaNueveFourMatch;
    @BindView(R.id.rondaDiezFourMatch)
    LinearLayout rondaDiezFourMatch;
    @BindView(R.id.rondaOnceFourMatch)
    LinearLayout rondaOnceFourMatch;
    @BindView(R.id.rondaDoceFourMatch)
    LinearLayout rondaDoceFourMatch;
    @BindView(R.id.rondaTreceFourMatch)
    LinearLayout rondaTreceFourMatch;
    @BindView(R.id.rondaCatorceFourMatch)
    LinearLayout rondaCatorceFourMatch;
    @BindView(R.id.rondaQuinceFourMatch)
    LinearLayout rondaQuinceFourMatch;
    @BindView(R.id.rondaDieciSeisFourMatch)
    LinearLayout rondaDieciSeisFourMatch;
    @BindView(R.id.rondaDieciSieteFourMatch)
    LinearLayout rondaDieciSieteFourMatch;
    @BindView(R.id.rondaDieciOchoFourMatch)
    LinearLayout rondaDieciOchoFourMatch;
    @BindView(R.id.rondaDieciNueveFourMatch)
    LinearLayout rondaDieciNueveFourMatch;
    @BindView(R.id.rondaVeinteFourMatch)
    LinearLayout rondaVeinteFourMatch;

    @BindView(R.id.partidaUnoUnoFourMatch)
    EditText partidaUnoUnoFourMatch;
    @BindView(R.id.partidaUnoDosFourMatch)
    EditText partidaUnoDosFourMatch;
    @BindView(R.id.partidaUnoTresFourMatch)
    EditText partidaUnoTresFourMatch;
    @BindView(R.id.partidaUnoCuatroFourMatch)
    EditText partidaUnoCuatroFourMatch;

    @BindView(R.id.partidaDosUnoFourMatch)
    EditText partidaDosUnoFourMatch;
    @BindView(R.id.partidaDosDosFourMatch)
    EditText partidaDosDosFourMatch;
    @BindView(R.id.partidaDosTresFourMatch)
    EditText partidaDosTresFourMatch;
    @BindView(R.id.partidaDosCuatroFourMatch)
    EditText partidaDosCuatroFourMatch;

    @BindView(R.id.partidaTresUnoFourMatch)
    EditText partidaTresUnoFourMatch;
    @BindView(R.id.partidaTresDosFourMatch)
    EditText partidaTresDosFourMatch;
    @BindView(R.id.partidaTresTresFourMatch)
    EditText partidaTresTresFourMatch;
    @BindView(R.id.partidaTresCuatroFourMatch)
    EditText partidaTresCuatroFourMatch;

    @BindView(R.id.partidaCuatroUnoFourMatch)
    EditText partidaCuatroUnoFourMatch;
    @BindView(R.id.partidaCuatroDosFourMatch)
    EditText partidaCuatroDosFourMatch;
    @BindView(R.id.partidaCuatroTresFourMatch)
    EditText partidaCuatroTresFourMatch;
    @BindView(R.id.partidaCuatroCuatroFourMatch)
    EditText partidaCuatroCuatroFourMatch;

    @BindView(R.id.partidaCincoUnoFourMatch)
    EditText partidaCincoUnoFourMatch;
    @BindView(R.id.partidaCincoDosFourMatch)
    EditText partidaCincoDosFourMatch;
    @BindView(R.id.partidaCincoTresFourMatch)
    EditText partidaCincoTresFourMatch;
    @BindView(R.id.partidaCincoCuatroFourMatch)
    EditText partidaCincoCuatroFourMatch;

    @BindView(R.id.partidaSeisUnoFourMatch)
    EditText partidaSeisUnoFourMatch;
    @BindView(R.id.partidaSeisDosFourMatch)
    EditText partidaSeisDosFourMatch;
    @BindView(R.id.partidaSeisTresFourMatch)
    EditText partidaSeisTresFourMatch;
    @BindView(R.id.partidaSeisCuatroFourMatch)
    EditText partidaSeisCuatroFourMatch;

    @BindView(R.id.partidaSieteUnoFourMatch)
    EditText partidaSieteUnoFourMatch;
    @BindView(R.id.partidaSieteDosFourMatch)
    EditText partidaSieteDosFourMatch;
    @BindView(R.id.partidaSieteTresFourMatch)
    EditText partidaSieteTresFourMatch;
    @BindView(R.id.partidaSieteCuatroFourMatch)
    EditText partidaSieteCuatroFourMatch;

    @BindView(R.id.partidaOchoUnoFourMatch)
    EditText partidaOchoUnoFourMatch;
    @BindView(R.id.partidaOchoDosFourMatch)
    EditText partidaOchoDosFourMatch;
    @BindView(R.id.partidaOchoTresFourMatch)
    EditText partidaOchoTresFourMatch;
    @BindView(R.id.partidaOchoCuatroFourMatch)
    EditText partidaOchoCuatroFourMatch;

    @BindView(R.id.partidaNueveUnoFourMatch)
    EditText partidaNueveUnoFourMatch;
    @BindView(R.id.partidaNueveDosFourMatch)
    EditText partidaNueveDosFourMatch;
    @BindView(R.id.partidaNueveTresFourMatch)
    EditText partidaNueveTresFourMatch;
    @BindView(R.id.partidaNueveCuatroFourMatch)
    EditText partidaNueveCuatroFourMatch;

    @BindView(R.id.partidaDiezUnoFourMatch)
    EditText partidaDiezUnoFourMatch;
    @BindView(R.id.partidaDiezDosFourMatch)
    EditText partidaDiezDosFourMatch;
    @BindView(R.id.partidaDiezTresFourMatch)
    EditText partidaDiezTresFourMatch;
    @BindView(R.id.partidaDiezCuatroFourMatch)
    EditText partidaDiezCuatroFourMatch;

    @BindView(R.id.partidaOnceUnoFourMatch)
    EditText partidaOnceUnoFourMatch;
    @BindView(R.id.partidaOnceDosFourMatch)
    EditText partidaOnceDosFourMatch;
    @BindView(R.id.partidaOnceTresFourMatch)
    EditText partidaOnceTresFourMatch;
    @BindView(R.id.partidaOnceCuatroFourMatch)
    EditText partidaOnceCuatroFourMatch;

    @BindView(R.id.partidaDoceUnoFourMatch)
    EditText partidaDoceUnoFourMatch;
    @BindView(R.id.partidaDoceDosFourMatch)
    EditText partidaDoceDosFourMatch;
    @BindView(R.id.partidaDoceTresFourMatch)
    EditText partidaDoceTresFourMatch;
    @BindView(R.id.partidaDoceCuatroFourMatch)
    EditText partidaDoceCuatroFourMatch;

    @BindView(R.id.partidaTreceUnoFourMatch)
    EditText partidaTreceUnoFourMatch;
    @BindView(R.id.partidaTreceDosFourMatch)
    EditText partidaTreceDosFourMatch;
    @BindView(R.id.partidaTreceTresFourMatch)
    EditText partidaTreceTresFourMatch;
    @BindView(R.id.partidaTreceCuatroFourMatch)
    EditText partidaTreceCuatroFourMatch;

    @BindView(R.id.partidaCatorceUnoFourMatch)
    EditText partidaCatorceUnoFourMatch;
    @BindView(R.id.partidaCatorceDosFourMatch)
    EditText partidaCatorceDosFourMatch;
    @BindView(R.id.partidaCatorceTresFourMatch)
    EditText partidaCatorceTresFourMatch;
    @BindView(R.id.partidaCatorceCuatroFourMatch)
    EditText partidaCatorceCuatroFourMatch;

    @BindView(R.id.partidaQuinceUnoFourMatch)
    EditText partidaQuinceUnoFourMatch;
    @BindView(R.id.partidaQuinceDosFourMatch)
    EditText partidaQuinceDosFourMatch;
    @BindView(R.id.partidaQuinceTresFourMatch)
    EditText partidaQuinceTresFourMatch;
    @BindView(R.id.partidaQuinceCuatroFourMatch)
    EditText partidaQuinceCuatroFourMatch;

    @BindView(R.id.partidaDieciSeisUnoFourMatch)
    EditText partidaDieciSeisUnoFourMatch;
    @BindView(R.id.partidaDieciSeisDosFourMatch)
    EditText partidaDieciSeisDosFourMatch;
    @BindView(R.id.partidaDieciSeisTresFourMatch)
    EditText partidaDieciSeisTresFourMatch;
    @BindView(R.id.partidaDieciSeisCuatroFourMatch)
    EditText partidaDieciSeisCuatroFourMatch;

    @BindView(R.id.partidaDieciSieteUnoFourMatch)
    EditText partidaDieciSieteUnoFourMatch;
    @BindView(R.id.partidaDieciSieteDosFourMatch)
    EditText partidaDieciSieteDosFourMatch;
    @BindView(R.id.partidaDieciSieteTresFourMatch)
    EditText partidaDieciSieteTresFourMatch;
    @BindView(R.id.partidaDieciSieteCuatroFourMatch)
    EditText partidaDieciSieteCuatroFourMatch;

    @BindView(R.id.partidaDieciOchoUnoFourMatch)
    EditText partidaDieciOchoUnoFourMatch;
    @BindView(R.id.partidaDieciOchoDosFourMatch)
    EditText partidaDieciOchoDosFourMatch;
    @BindView(R.id.partidaDieciOchoTresFourMatch)
    EditText partidaDieciOchoTresFourMatch;
    @BindView(R.id.partidaDieciOchoCuatroFourMatch)
    EditText partidaDieciOchoCuatroFourMatch;

    @BindView(R.id.partidaDieciNueveUnoFourMatch)
    EditText partidaDieciNueveUnoFourMatch;
    @BindView(R.id.partidaDieciNueveDosFourMatch)
    EditText partidaDieciNueveDosFourMatch;
    @BindView(R.id.partidaDieciNueveTresFourMatch)
    EditText partidaDieciNueveTresFourMatch;
    @BindView(R.id.partidaDieciNueveCuatroFourMatch)
    EditText partidaDieciNueveCuatroFourMatch;

    @BindView(R.id.partidaVeinteUnoFourMatch)
    EditText partidaVeinteUnoFourMatch;
    @BindView(R.id.partidaVeinteDosFourMatch)
    EditText partidaVeinteDosFourMatch;
    @BindView(R.id.partidaVeinteTresFourMatch)
    EditText partidaVeinteTresFourMatch;
    @BindView(R.id.partidaVeinteCuatroFourMatch)
    EditText partidaVeinteCuatroFourMatch;

    @BindView(R.id.buttonSiguienteRondaFourMatch)
    Button buttonSiguienteRondaFourMatch;

    @BindView(R.id.textViewJugadorUnoFourMatch)
    TextView textViewJugadorUnoFourMatch;
    @BindView(R.id.textViewJugadorDosFourMatch)
    TextView textViewJugadorDosFourMatch;
    @BindView(R.id.textViewJugadorTresFourMatch)
    TextView textViewJugadorTresFourMatch;
    @BindView(R.id.textViewJugadorCuatroFourMatch)
    TextView textViewJugadorCuatroFourMatch;

    @BindView(R.id.textViewPuntajeJugadorUnoFourMatch)
    TextView textViewPuntajeJugadorUnoFourMatch;
    @BindView(R.id.textViewPuntajeJugadorDosFourMatch)
    TextView textViewPuntajeJugadorDosFourMatch;
    @BindView(R.id.textViewPuntajeJugadorTresFourMatch)
    TextView textViewPuntajeJugadorTresFourMatch;
    @BindView(R.id.textViewPuntajeJugadorCuatroFourMatch)
    TextView textViewPuntajeJugadorCuatroFourMatch;

    @BindView(R.id.byeJugadorUnoFourMatch)
    ImageView byeJugadorUnoFourMatch;
    @BindView(R.id.byeJugadorDosFourMatch)
    ImageView byeJugadorDosFourMatch;
    @BindView(R.id.byeJugadorTresFourMatch)
    ImageView byeJugadorTresFourMatch;
    @BindView(R.id.byeJugadorCuatroFourMatch)
    ImageView byeJugadorCuatroFourMatch;

    private String jugadorUnoFourMatch;
    private String jugadorDosFourMatch;
    private String jugadorTresFourMatch;
    private String jugadorCuatroFourMatch;

    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;
    private Integer puntajeJugadorCuatro = 0;

    private Integer contadorDeRonda = 1;


    public FourMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four_match, container, false);
        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();

        jugadorUnoFourMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosFourMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresFourMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);
        jugadorCuatroFourMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CUATRO);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoFourMatch.setText(jugadorUnoFourMatch);
        textViewJugadorDosFourMatch.setText(jugadorDosFourMatch);
        textViewJugadorTresFourMatch.setText(jugadorTresFourMatch);
        textViewJugadorCuatroFourMatch.setText(jugadorCuatroFourMatch);

        buttonSiguienteRondaFourMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoFourMatch, partidaUnoDosFourMatch, partidaUnoTresFourMatch,
                                partidaUnoCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoFourMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosFourMatch);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTresFourMatch);
                            puntajeJugadorCuatro = getNumeroParcial(partidaUnoCuatroFourMatch);
                            setFreezeRonda(partidaUnoUnoFourMatch, partidaUnoDosFourMatch, partidaUnoTresFourMatch,
                                    partidaUnoCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoFourMatch, partidaDosDosFourMatch,
                                    partidaDosTresFourMatch, partidaDosCuatroFourMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoFourMatch, partidaDosDosFourMatch, partidaDosTresFourMatch,
                                partidaDosCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDosUnoFourMatch, partidaDosDosFourMatch, partidaDosTresFourMatch,
                                    partidaDosCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoFourMatch, partidaTresDosFourMatch,
                                    partidaTresTresFourMatch, partidaTresCuatroFourMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoFourMatch, partidaTresDosFourMatch, partidaTresTresFourMatch,
                                partidaTresCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaTresUnoFourMatch, partidaTresDosFourMatch, partidaTresTresFourMatch,
                                    partidaTresCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoFourMatch, partidaCuatroDosFourMatch,
                                    partidaCuatroTresFourMatch, partidaCuatroCuatroFourMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoFourMatch, partidaCuatroDosFourMatch,
                                partidaCuatroTresFourMatch, partidaCuatroCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaCuatroUnoFourMatch, partidaCuatroDosFourMatch,
                                    partidaCuatroTresFourMatch, partidaCuatroCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoFourMatch, partidaCincoDosFourMatch,
                                    partidaCincoTresFourMatch, partidaCincoCuatroFourMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoFourMatch, partidaCincoDosFourMatch,
                                partidaCincoTresFourMatch, partidaCincoCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaCincoUnoFourMatch, partidaCincoDosFourMatch,
                                    partidaCincoTresFourMatch, partidaCincoCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoFourMatch, partidaSeisDosFourMatch,
                                    partidaSeisTresFourMatch, partidaSeisCuatroFourMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoFourMatch, partidaSeisDosFourMatch, partidaSeisTresFourMatch,
                                partidaSeisCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaSeisUnoFourMatch, partidaSeisDosFourMatch, partidaSeisTresFourMatch,
                                    partidaSeisCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoFourMatch, partidaSieteDosFourMatch,
                                    partidaSieteTresFourMatch, partidaSieteCuatroFourMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoFourMatch, partidaSieteDosFourMatch,
                                partidaSieteTresFourMatch, partidaSieteCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaSieteUnoFourMatch, partidaSieteDosFourMatch,
                                    partidaSieteTresFourMatch, partidaSieteCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoFourMatch, partidaOchoDosFourMatch,
                                    partidaOchoTresFourMatch, partidaOchoCuatroFourMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoFourMatch, partidaOchoDosFourMatch, partidaOchoTresFourMatch,
                                partidaOchoCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaOchoUnoFourMatch, partidaOchoDosFourMatch, partidaOchoTresFourMatch,
                                    partidaOchoCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoFourMatch, partidaNueveDosFourMatch,
                                    partidaNueveTresFourMatch, partidaNueveCuatroFourMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoFourMatch, partidaNueveDosFourMatch,
                                partidaNueveTresFourMatch, partidaNueveCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaNueveUnoFourMatch, partidaNueveDosFourMatch, partidaNueveTresFourMatch,
                                    partidaNueveCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoFourMatch, partidaDiezDosFourMatch,
                                    partidaDiezTresFourMatch, partidaDiezCuatroFourMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoFourMatch, partidaDiezDosFourMatch, partidaDiezTresFourMatch,
                                partidaDiezCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDiezUnoFourMatch, partidaDiezDosFourMatch, partidaDiezTresFourMatch,
                                    partidaDiezCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoFourMatch, partidaOnceDosFourMatch,
                                    partidaOnceTresFourMatch, partidaOnceCuatroFourMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoFourMatch, partidaOnceDosFourMatch, partidaOnceTresFourMatch,
                                partidaOnceCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaOnceUnoFourMatch, partidaOnceDosFourMatch, partidaOnceTresFourMatch,
                                    partidaOnceCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoFourMatch, partidaDoceDosFourMatch,
                                    partidaDoceTresFourMatch, partidaDoceCuatroFourMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoFourMatch, partidaDoceDosFourMatch,
                                partidaDoceTresFourMatch, partidaDoceCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDoceUnoFourMatch, partidaDoceDosFourMatch, partidaDoceTresFourMatch,
                                    partidaDoceCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoFourMatch, partidaTreceDosFourMatch,
                                    partidaTreceTresFourMatch, partidaTreceCuatroFourMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoFourMatch, partidaTreceDosFourMatch,
                                partidaTreceTresFourMatch, partidaTreceCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaTreceUnoFourMatch, partidaTreceDosFourMatch, partidaTreceTresFourMatch,
                                    partidaTreceCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoFourMatch, partidaCatorceDosFourMatch,
                                    partidaCatorceTresFourMatch, partidaCatorceCuatroFourMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoFourMatch, partidaCatorceDosFourMatch,
                                partidaCatorceTresFourMatch, partidaCatorceCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaCatorceUnoFourMatch, partidaCatorceDosFourMatch,
                                    partidaCatorceTresFourMatch, partidaCatorceCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoFourMatch, partidaQuinceDosFourMatch,
                                    partidaQuinceTresFourMatch, partidaQuinceCuatroFourMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoFourMatch, partidaQuinceDosFourMatch,
                                partidaQuinceTresFourMatch, partidaQuinceCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaQuinceUnoFourMatch, partidaQuinceDosFourMatch,
                                    partidaQuinceTresFourMatch, partidaQuinceCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeisFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUnoFourMatch, partidaDieciSeisDosFourMatch,
                                    partidaDieciSeisTresFourMatch, partidaDieciSeisCuatroFourMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUnoFourMatch, partidaDieciSeisDosFourMatch,
                                partidaDieciSeisTresFourMatch, partidaDieciSeisCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDieciSeisUnoFourMatch, partidaDieciSeisDosFourMatch,
                                    partidaDieciSeisTresFourMatch, partidaDieciSeisCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSieteFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUnoFourMatch, partidaDieciSieteDosFourMatch,
                                    partidaDieciSieteTresFourMatch, partidaDieciSieteCuatroFourMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUnoFourMatch, partidaDieciSieteDosFourMatch,
                                partidaDieciSieteTresFourMatch, partidaDieciSieteCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDieciSieteUnoFourMatch, partidaDieciSieteDosFourMatch,
                                    partidaDieciSieteTresFourMatch, partidaDieciSieteCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOchoFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUnoFourMatch, partidaDieciOchoDosFourMatch,
                                    partidaDieciOchoTresFourMatch, partidaDieciOchoCuatroFourMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUnoFourMatch, partidaDieciOchoDosFourMatch,
                                partidaDieciOchoTresFourMatch, partidaDieciOchoCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDieciOchoUnoFourMatch, partidaDieciOchoDosFourMatch,
                                    partidaDieciOchoTresFourMatch, partidaDieciOchoCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueveFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUnoFourMatch, partidaDieciNueveDosFourMatch,
                                    partidaDieciNueveTresFourMatch, partidaDieciNueveCuatroFourMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUnoFourMatch, partidaDieciNueveDosFourMatch,
                                partidaDieciNueveTresFourMatch, partidaDieciNueveCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaDieciNueveUnoFourMatch, partidaDieciNueveDosFourMatch,
                                    partidaDieciNueveTresFourMatch, partidaDieciNueveCuatroFourMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteFourMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoFourMatch, partidaVeinteDosFourMatch,
                                    partidaVeinteTresFourMatch, partidaVeinteCuatroFourMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoFourMatch, partidaVeinteDosFourMatch,
                                partidaVeinteTresFourMatch, partidaVeinteCuatroFourMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoFourMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosFourMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresFourMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroFourMatch);
                            setFreezeRonda(partidaVeinteUnoFourMatch, partidaVeinteDosFourMatch,
                                    partidaVeinteTresFourMatch, partidaVeinteCuatroFourMatch);
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

    private void generalPerdedorNoSumaMas(EditText partidaUno, EditText partidaDos, EditText partidaTres, EditText partidaCuatro) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
        perdedorNoSumaMas(puntajeJugadorCuatro, partidaCuatro);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }


    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, Integer jugadorTres, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos && jugadorTres > limiteDePuntos) {
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
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, textViewJugadorCuatroFourMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorCuatro, textViewJugadorTresFourMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, puntajeJugadorCuatro, textViewJugadorDosFourMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, textViewJugadorUnoFourMatch);
    }


    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUnoFourMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoFourMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosFourMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosFourMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTresFourMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTresFourMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro > limiteDePuntos) {
            byeJugadorCuatroFourMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCuatroFourMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres, EditText partidaDosCuatro) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
        setFreeze(partidaDosCuatro);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoFourMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosFourMatch.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTresFourMatch.setText(String.valueOf(puntajeJugadorTres));
        textViewPuntajeJugadorCuatroFourMatch.setText(String.valueOf(puntajeJugadorCuatro));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres, EditText jugadorCuatro) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString()) ||
                TextUtils.isEmpty(jugadorCuatro.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }


}
