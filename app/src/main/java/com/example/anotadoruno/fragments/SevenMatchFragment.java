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
import android.widget.ImageView;
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
    @BindView(R.id.rondaCuatro)
    LinearLayout rondaCuatro;
    @BindView(R.id.rondaCinco)
    LinearLayout rondaCinco;
    @BindView(R.id.rondaSeis)
    LinearLayout rondaSeis;
    @BindView(R.id.rondaSiete)
    LinearLayout rondaSiete;
    @BindView(R.id.rondaOcho)
    LinearLayout rondaOcho;
    @BindView(R.id.rondaNueve)
    LinearLayout rondaNueve;
    @BindView(R.id.rondaDiez)
    LinearLayout rondaDiez;
    @BindView(R.id.rondaOnce)
    LinearLayout rondaOnce;
    @BindView(R.id.rondaDoce)
    LinearLayout rondaDoce;
    @BindView(R.id.rondaTrece)
    LinearLayout rondaTrece;
    @BindView(R.id.rondaCatorce)
    LinearLayout rondaCatorce;
    @BindView(R.id.rondaQuince)
    LinearLayout rondaQuince;
    @BindView(R.id.rondaDieciSeis)
    LinearLayout rondaDieciSeis;
    @BindView(R.id.rondaDieciSiete)
    LinearLayout rondaDieciSiete;
    @BindView(R.id.rondaDieciOcho)
    LinearLayout rondaDieciOcho;
    @BindView(R.id.rondaDieciNueve)
    LinearLayout rondaDieciNueve;
    @BindView(R.id.rondaVeinte)
    LinearLayout rondaVeinte;

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

    @BindView(R.id.partidaTresUno)
    EditText partidaTresUno;
    @BindView(R.id.partidaTresDos)
    EditText partidaTresDos;
    @BindView(R.id.partidaTresTres)
    EditText partidaTresTres;
    @BindView(R.id.partidaTresCuatro)
    EditText partidaTresCuatro;
    @BindView(R.id.partidaTresCinco)
    EditText partidaTresCinco;
    @BindView(R.id.partidaTresSeis)
    EditText partidaTresSeis;
    @BindView(R.id.partidaTresSiete)
    EditText partidaTresSiete;

    @BindView(R.id.partidaCuatroUno)
    EditText partidaCuatroUno;
    @BindView(R.id.partidaCuatroDos)
    EditText partidaCuatroDos;
    @BindView(R.id.partidaCuatroTres)
    EditText partidaCuatroTres;
    @BindView(R.id.partidaCuatroCuatro)
    EditText partidaCuatroCuatro;
    @BindView(R.id.partidaCuatroCinco)
    EditText partidaCuatroCinco;
    @BindView(R.id.partidaCuatroSeis)
    EditText partidaCuatroSeis;
    @BindView(R.id.partidaCuatroSiete)
    EditText partidaCuatroSiete;

    @BindView(R.id.partidaCincoUno)
    EditText partidaCincoUno;
    @BindView(R.id.partidaCincoDos)
    EditText partidaCincoDos;
    @BindView(R.id.partidaCincoTres)
    EditText partidaCincoTres;
    @BindView(R.id.partidaCincoCuatro)
    EditText partidaCincoCuatro;
    @BindView(R.id.partidaCincoCinco)
    EditText partidaCincoCinco;
    @BindView(R.id.partidaCincoSeis)
    EditText partidaCincoSeis;
    @BindView(R.id.partidaCincoSiete)
    EditText partidaCincoSiete;

    @BindView(R.id.partidaSeisUno)
    EditText partidaSeisUno;
    @BindView(R.id.partidaSeisDos)
    EditText partidaSeisDos;
    @BindView(R.id.partidaSeisTres)
    EditText partidaSeisTres;
    @BindView(R.id.partidaSeisCuatro)
    EditText partidaSeisCuatro;
    @BindView(R.id.partidaSeisCinco)
    EditText partidaSeisCinco;
    @BindView(R.id.partidaSeisSeis)
    EditText partidaSeisSeis;
    @BindView(R.id.partidaSeisSiete)
    EditText partidaSeisSiete;

    @BindView(R.id.partidaSieteUno)
    EditText partidaSieteUno;
    @BindView(R.id.partidaSieteDos)
    EditText partidaSieteDos;
    @BindView(R.id.partidaSieteTres)
    EditText partidaSieteTres;
    @BindView(R.id.partidaSieteCuatro)
    EditText partidaSieteCuatro;
    @BindView(R.id.partidaSieteCinco)
    EditText partidaSieteCinco;
    @BindView(R.id.partidaSieteSeis)
    EditText partidaSieteSeis;
    @BindView(R.id.partidaSieteSiete)
    EditText partidaSieteSiete;

    @BindView(R.id.partidaOchoUno)
    EditText partidaOchoUno;
    @BindView(R.id.partidaOchoDos)
    EditText partidaOchoDos;
    @BindView(R.id.partidaOchoTres)
    EditText partidaOchoTres;
    @BindView(R.id.partidaOchoCuatro)
    EditText partidaOchoCuatro;
    @BindView(R.id.partidaOchoCinco)
    EditText partidaOchoCinco;
    @BindView(R.id.partidaOchoSeis)
    EditText partidaOchoSeis;
    @BindView(R.id.partidaOchoSiete)
    EditText partidaOchoSiete;

    @BindView(R.id.partidaNueveUno)
    EditText partidaNueveUno;
    @BindView(R.id.partidaNueveDos)
    EditText partidaNueveDos;
    @BindView(R.id.partidaNueveTres)
    EditText partidaNueveTres;
    @BindView(R.id.partidaNueveCuatro)
    EditText partidaNueveCuatro;
    @BindView(R.id.partidaNueveCinco)
    EditText partidaNueveCinco;
    @BindView(R.id.partidaNueveSeis)
    EditText partidaNueveSeis;
    @BindView(R.id.partidaNueveSiete)
    EditText partidaNueveSiete;

    @BindView(R.id.partidaDiezUno)
    EditText partidaDiezUno;
    @BindView(R.id.partidaDiezDos)
    EditText partidaDiezDos;
    @BindView(R.id.partidaDiezTres)
    EditText partidaDiezTres;
    @BindView(R.id.partidaDiezCuatro)
    EditText partidaDiezCuatro;
    @BindView(R.id.partidaDiezCinco)
    EditText partidaDiezCinco;
    @BindView(R.id.partidaDiezSeis)
    EditText partidaDiezSeis;
    @BindView(R.id.partidaDiezSiete)
    EditText partidaDiezSiete;

    @BindView(R.id.partidaOnceUno)
    EditText partidaOnceUno;
    @BindView(R.id.partidaOnceDos)
    EditText partidaOnceDos;
    @BindView(R.id.partidaOnceTres)
    EditText partidaOnceTres;
    @BindView(R.id.partidaOnceCuatro)
    EditText partidaOnceCuatro;
    @BindView(R.id.partidaOnceCinco)
    EditText partidaOnceCinco;
    @BindView(R.id.partidaOnceSeis)
    EditText partidaOnceSeis;
    @BindView(R.id.partidaOnceSiete)
    EditText partidaOnceSiete;

    @BindView(R.id.partidaDoceUno)
    EditText partidaDoceUno;
    @BindView(R.id.partidaDoceDos)
    EditText partidaDoceDos;
    @BindView(R.id.partidaDoceTres)
    EditText partidaDoceTres;
    @BindView(R.id.partidaDoceCuatro)
    EditText partidaDoceCuatro;
    @BindView(R.id.partidaDoceCinco)
    EditText partidaDoceCinco;
    @BindView(R.id.partidaDoceSeis)
    EditText partidaDoceSeis;
    @BindView(R.id.partidaDoceSiete)
    EditText partidaDoceSiete;

    @BindView(R.id.partidaTreceUno)
    EditText partidaTreceUno;
    @BindView(R.id.partidaTreceDos)
    EditText partidaTreceDos;
    @BindView(R.id.partidaTreceTres)
    EditText partidaTreceTres;
    @BindView(R.id.partidaTreceCuatro)
    EditText partidaTreceCuatro;
    @BindView(R.id.partidaTreceCinco)
    EditText partidaTreceCinco;
    @BindView(R.id.partidaTreceSeis)
    EditText partidaTreceSeis;
    @BindView(R.id.partidaTreceSiete)
    EditText partidaTreceSiete;

    @BindView(R.id.partidaCatorceUno)
    EditText partidaCatorceUno;
    @BindView(R.id.partidaCatorceDos)
    EditText partidaCatorceDos;
    @BindView(R.id.partidaCatorceTres)
    EditText partidaCatorceTres;
    @BindView(R.id.partidaCatorceCuatro)
    EditText partidaCatorceCuatro;
    @BindView(R.id.partidaCatorceCinco)
    EditText partidaCatorceCinco;
    @BindView(R.id.partidaCatorceSeis)
    EditText partidaCatorceSeis;
    @BindView(R.id.partidaCatorceSiete)
    EditText partidaCatorceSiete;

    @BindView(R.id.partidaQuinceUno)
    EditText partidaQuinceUno;
    @BindView(R.id.partidaQuinceDos)
    EditText partidaQuinceDos;
    @BindView(R.id.partidaQuinceTres)
    EditText partidaQuinceTres;
    @BindView(R.id.partidaQuinceCuatro)
    EditText partidaQuinceCuatro;
    @BindView(R.id.partidaQuinceCinco)
    EditText partidaQuinceCinco;
    @BindView(R.id.partidaQuinceSeis)
    EditText partidaQuinceSeis;
    @BindView(R.id.partidaQuinceSiete)
    EditText partidaQuinceSiete;

    @BindView(R.id.partidaDieciSeisUno)
    EditText partidaDieciSeisUno;
    @BindView(R.id.partidaDieciSeisDos)
    EditText partidaDieciSeisDos;
    @BindView(R.id.partidaDieciSeisTres)
    EditText partidaDieciSeisTres;
    @BindView(R.id.partidaDieciSeisCuatro)
    EditText partidaDieciSeisCuatro;
    @BindView(R.id.partidaDieciSeisCinco)
    EditText partidaDieciSeisCinco;
    @BindView(R.id.partidaDieciSeisSeis)
    EditText partidaDieciSeisSeis;
    @BindView(R.id.partidaDieciSeisSiete)
    EditText partidaDieciSeisSiete;

    @BindView(R.id.partidaDieciSieteUno)
    EditText partidaDieciSieteUno;
    @BindView(R.id.partidaDieciSieteDos)
    EditText partidaDieciSieteDos;
    @BindView(R.id.partidaDieciSieteTres)
    EditText partidaDieciSieteTres;
    @BindView(R.id.partidaDieciSieteCuatro)
    EditText partidaDieciSieteCuatro;
    @BindView(R.id.partidaDieciSieteCinco)
    EditText partidaDieciSieteCinco;
    @BindView(R.id.partidaDieciSieteSeis)
    EditText partidaDieciSieteSeis;
    @BindView(R.id.partidaDieciSieteSiete)
    EditText partidaDieciSieteSiete;

    @BindView(R.id.partidaDieciOchoUno)
    EditText partidaDieciOchoUno;
    @BindView(R.id.partidaDieciOchoDos)
    EditText partidaDieciOchoDos;
    @BindView(R.id.partidaDieciOchoTres)
    EditText partidaDieciOchoTres;
    @BindView(R.id.partidaDieciOchoCuatro)
    EditText partidaDieciOchoCuatro;
    @BindView(R.id.partidaDieciOchoCinco)
    EditText partidaDieciOchoCinco;
    @BindView(R.id.partidaDieciOchoSeis)
    EditText partidaDieciOchoSeis;
    @BindView(R.id.partidaDieciOchoSiete)
    EditText partidaDieciOchoSiete;

    @BindView(R.id.partidaDieciNueveUno)
    EditText partidaDieciNueveUno;
    @BindView(R.id.partidaDieciNueveDos)
    EditText partidaDieciNueveDos;
    @BindView(R.id.partidaDieciNueveTres)
    EditText partidaDieciNueveTres;
    @BindView(R.id.partidaDieciNueveCuatro)
    EditText partidaDieciNueveCuatro;
    @BindView(R.id.partidaDieciNueveCinco)
    EditText partidaDieciNueveCinco;
    @BindView(R.id.partidaDieciNueveSeis)
    EditText partidaDieciNueveSeis;
    @BindView(R.id.partidaDieciNueveSiete)
    EditText partidaDieciNueveSiete;

    @BindView(R.id.partidaVeinteUno)
    EditText partidaVeinteUno;
    @BindView(R.id.partidaVeinteDos)
    EditText partidaVeinteDos;
    @BindView(R.id.partidaVeinteTres)
    EditText partidaVeinteTres;
    @BindView(R.id.partidaVeinteCuatro)
    EditText partidaVeinteCuatro;
    @BindView(R.id.partidaVeinteCinco)
    EditText partidaVeinteCinco;
    @BindView(R.id.partidaVeinteSeis)
    EditText partidaVeinteSeis;
    @BindView(R.id.partidaVeinteSiete)
    EditText partidaVeinteSiete;

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
    TextView textViewPuntajeJugadorSeis;
    @BindView(R.id.textViewPuntajeJugadorSiete)
    TextView textViewPuntajeJugadorSiete;

    @BindView(R.id.byeJugadorUno)
    ImageView byeJugadorUno;
    @BindView(R.id.byeJugadorDos)
    ImageView byeJugadorDos;
    @BindView(R.id.byeJugadorTres)
    ImageView byeJugadorTres;
    @BindView(R.id.byeJugadorCuatro)
    ImageView byeJugadorCuatro;
    @BindView(R.id.byeJugadorCinco)
    ImageView byeJugadorCinco;
    @BindView(R.id.byeJugadorSeis)
    ImageView byeJugadorSeis;
    @BindView(R.id.byeJugadorSiete)
    ImageView byeJugadorSiete;


    private String jugadorUnoSevenMatch;
    private String jugadorDosSevenMatch;
    private String jugadorTresSevenMatch;
    private String jugadorCuatroSevenMatch;
    private String jugadorCincoSevenMatch;
    private String jugadorSeisSevenMatch;
    private String jugadorSieteSevenMatch;


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
                        if (checkEmptyNumbers(partidaUnoUno, partidaUnoDos, partidaUnoTres, partidaUnoCuatro, partidaUnoCinco,
                                partidaUnoSeis, partidaUnoSiete)) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUno);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDos);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTres);
                            puntajeJugadorCuatro = getNumeroParcial(partidaUnoCuatro);
                            puntajeJugadorCinco = getNumeroParcial(partidaUnoCinco);
                            puntajeJugadorSeis = getNumeroParcial(partidaUnoSeis);
                            puntajeJugadorSiete = getNumeroParcial(partidaUnoSiete);
                            setFreezeRonda(partidaUnoUno, partidaUnoDos, partidaUnoTres, partidaUnoCuatro, partidaUnoCinco, partidaUnoSeis, partidaUnoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDos.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUno, partidaDosDos, partidaDosTres, partidaDosCuatro, partidaDosCinco,
                                partidaDosSeis, partidaDosSiete)) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDosCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDosSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDosSiete);
                            setFreezeRonda(partidaDosUno, partidaDosDos, partidaDosTres, partidaDosCuatro, partidaDosCinco, partidaDosSeis, partidaDosSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTres.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUno, partidaTresDos, partidaTresTres, partidaTresCuatro, partidaTresCinco,
                                partidaTresSeis, partidaTresSiete)) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTresUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTresDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTresTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTresCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTresCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTresSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTresSiete);
                            setFreezeRonda(partidaTresUno, partidaTresDos, partidaTresTres, partidaTresCuatro, partidaTresCinco,
                                    partidaTresSeis, partidaTresSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatro.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUno, partidaCuatroDos, partidaCuatroTres, partidaCuatroCuatro,
                                partidaCuatroCinco, partidaCuatroSeis, partidaCuatroSiete)) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCuatroUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCuatroDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCuatroTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCuatroCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCuatroCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCuatroSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCuatroSiete);
                            setFreezeRonda(partidaCuatroUno, partidaCuatroDos, partidaCuatroTres, partidaCuatroCuatro,
                                    partidaCuatroCinco, partidaCuatroSeis, partidaCuatroSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCinco.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUno, partidaCincoDos, partidaCincoTres, partidaCincoCuatro,
                                partidaCincoCinco, partidaCincoSeis, partidaCincoSiete)) {
                            Toast.makeText(getContext(), "Debe completar todos los casilleros", Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCincoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCincoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCincoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCincoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCincoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCincoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCincoSiete);
                            setFreezeRonda(partidaCincoUno, partidaCincoDos, partidaCincoTres, partidaCincoCuatro,
                                    partidaCincoCinco, partidaCincoSeis, partidaCincoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeis.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                        }
                        break;

                }
            }
        });

        return view;

    }

    private void checkLimitePuntos() {
        if (puntajeJugadorUno > limiteDePuntos) {
            byeJugadorUno.setVisibility(View.VISIBLE);
            textViewJugadorUnoSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDos.setVisibility(View.VISIBLE);
            textViewJugadorDosSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTres.setVisibility(View.VISIBLE);
            textViewJugadorTresSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro < limiteDePuntos) {
            byeJugadorCuatro.setVisibility(View.VISIBLE);
            textViewJugadorCuatroSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCinco < limiteDePuntos) {
            byeJugadorCinco.setVisibility(View.VISIBLE);
            textViewJugadorCincoSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorSeis < limiteDePuntos) {
            byeJugadorSeis.setVisibility(View.VISIBLE);
            textViewJugadorSeisSevenMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorSiete < limiteDePuntos) {
            byeJugadorSiete.setVisibility(View.VISIBLE);
            textViewJugadorSieteSevenMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres, EditText partidaDosCuatro, EditText partidaDosCinco, EditText partidaDosSeis, EditText partidaDosSiete) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
        setFreeze(partidaDosCuatro);
        setFreeze(partidaDosCinco);
        setFreeze(partidaDosSeis);
        setFreeze(partidaDosSiete);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUno.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDos.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTres.setText(String.valueOf(puntajeJugadorTres));
        textViewPuntajeJugadorCuatro.setText(String.valueOf(puntajeJugadorCuatro));
        textViewPuntajeJugadorCinco.setText(String.valueOf(puntajeJugadorCinco));
        textViewPuntajeJugadorSeis.setText(String.valueOf(puntajeJugadorSeis));
        textViewPuntajeJugadorSiete.setText(String.valueOf(puntajeJugadorSiete));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres, EditText jugadorCuatro,
                                      EditText jugadorCinco, EditText jugadorSeis, EditText jugadorSiete) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString()) ||
                TextUtils.isEmpty(jugadorCuatro.getText().toString()) ||
                TextUtils.isEmpty(jugadorCinco.getText().toString()) ||
                TextUtils.isEmpty(jugadorSeis.getText().toString()) ||
                TextUtils.isEmpty(jugadorSiete.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }

}
