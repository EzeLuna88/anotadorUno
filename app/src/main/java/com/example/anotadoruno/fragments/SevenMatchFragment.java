package com.example.anotadoruno.fragments;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

import com.example.anotadoruno.AnotadorActivity;
import com.example.anotadoruno.MainActivity;
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
    @BindView(R.id.rondaVeintiuno)
    LinearLayout rondaVeintiuno;
    @BindView(R.id.rondaVeintidos)
    LinearLayout rondaVeintidos;
    @BindView(R.id.rondaVeintitres)
    LinearLayout rondaVeintitres;
    @BindView(R.id.rondaVeinticuatro)
    LinearLayout rondaVeinticuatro;
    @BindView(R.id.rondaVeinticinco)
    LinearLayout rondaVeinticinco;
    @BindView(R.id.rondaVeintiseis)
    LinearLayout rondaVeintiseis;
    @BindView(R.id.rondaVeintisiete)
    LinearLayout rondaVeintisiete;
    @BindView(R.id.rondaVeintiocho)
    LinearLayout rondaVeintiocho;
    @BindView(R.id.rondaVeintinueve)
    LinearLayout rondaVeintinueve;
    @BindView(R.id.rondaTreinta)
    LinearLayout rondaTreinta;

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

    @BindView(R.id.partidaVeintiunoUno)
    EditText partidaVeintiunoUno;
    @BindView(R.id.partidaVeintiunoDos)
    EditText partidaVeintiunoDos;
    @BindView(R.id.partidaVeintiunoTres)
    EditText partidaVeintiunoTres;
    @BindView(R.id.partidaVeintiunoCuatro)
    EditText partidaVeintiunoCuatro;
    @BindView(R.id.partidaVeintiunoCinco)
    EditText partidaVeintiunoCinco;
    @BindView(R.id.partidaVeintiunoSeis)
    EditText partidaVeintiunoSeis;
    @BindView(R.id.partidaVeintiunoSiete)
    EditText partidaVeintiunoSiete;

    @BindView(R.id.partidaVeintidosUno)
    EditText partidaVeintidosUno;
    @BindView(R.id.partidaVeintidosDos)
    EditText partidaVeintidosDos;
    @BindView(R.id.partidaVeintidosTres)
    EditText partidaVeintidosTres;
    @BindView(R.id.partidaVeintidosCuatro)
    EditText partidaVeintidosCuatro;
    @BindView(R.id.partidaVeintidosCinco)
    EditText partidaVeintidosCinco;
    @BindView(R.id.partidaVeintidosSeis)
    EditText partidaVeintidosSeis;
    @BindView(R.id.partidaVeintidosSiete)
    EditText partidaVeintidosSiete;

    @BindView(R.id.partidaVeintitresUno)
    EditText partidaVeintitresUno;
    @BindView(R.id.partidaVeintitresDos)
    EditText partidaVeintitresDos;
    @BindView(R.id.partidaVeintitresTres)
    EditText partidaVeintitresTres;
    @BindView(R.id.partidaVeintitresCuatro)
    EditText partidaVeintitresCuatro;
    @BindView(R.id.partidaVeintitresCinco)
    EditText partidaVeintitresCinco;
    @BindView(R.id.partidaVeintitresSeis)
    EditText partidaVeintitresSeis;
    @BindView(R.id.partidaVeintitresSiete)
    EditText partidaVeintitresSiete;

    @BindView(R.id.partidaVeinticuatroUno)
    EditText partidaVeinticuatroUno;
    @BindView(R.id.partidaVeinticuatroDos)
    EditText partidaVeinticuatroDos;
    @BindView(R.id.partidaVeinticuatroTres)
    EditText partidaVeinticuatroTres;
    @BindView(R.id.partidaVeinticuatroCuatro)
    EditText partidaVeinticuatroCuatro;
    @BindView(R.id.partidaVeinticuatroCinco)
    EditText partidaVeinticuatroCinco;
    @BindView(R.id.partidaVeinticuatroSeis)
    EditText partidaVeinticuatroSeis;
    @BindView(R.id.partidaVeinticuatroSiete)
    EditText partidaVeinticuatroSiete;

    @BindView(R.id.partidaVeinticincoUno)
    EditText partidaVeinticincoUno;
    @BindView(R.id.partidaVeinticincoDos)
    EditText partidaVeinticincoDos;
    @BindView(R.id.partidaVeinticincoTres)
    EditText partidaVeinticincoTres;
    @BindView(R.id.partidaVeinticincoCuatro)
    EditText partidaVeinticincoCuatro;
    @BindView(R.id.partidaVeinticincoCinco)
    EditText partidaVeinticincoCinco;
    @BindView(R.id.partidaVeinticincoSeis)
    EditText partidaVeinticincoSeis;
    @BindView(R.id.partidaVeinticincoSiete)
    EditText partidaVeinticincoSiete;

    @BindView(R.id.partidaVeintiseisUno)
    EditText partidaVeintiseisUno;
    @BindView(R.id.partidaVeintiseisDos)
    EditText partidaVeintiseisDos;
    @BindView(R.id.partidaVeintiseisTres)
    EditText partidaVeintiseisTres;
    @BindView(R.id.partidaVeintiseisCuatro)
    EditText partidaVeintiseisCuatro;
    @BindView(R.id.partidaVeintiseisCinco)
    EditText partidaVeintiseisCinco;
    @BindView(R.id.partidaVeintiseisSeis)
    EditText partidaVeintiseisSeis;
    @BindView(R.id.partidaVeintiseisSiete)
    EditText partidaVeintiseisSiete;

    @BindView(R.id.partidaVeintisieteUno)
    EditText partidaVeintisieteUno;
    @BindView(R.id.partidaVeintisieteDos)
    EditText partidaVeintisieteDos;
    @BindView(R.id.partidaVeintisieteTres)
    EditText partidaVeintisieteTres;
    @BindView(R.id.partidaVeintisieteCuatro)
    EditText partidaVeintisieteCuatro;
    @BindView(R.id.partidaVeintisieteCinco)
    EditText partidaVeintisieteCinco;
    @BindView(R.id.partidaVeintisieteSeis)
    EditText partidaVeintisieteSeis;
    @BindView(R.id.partidaVeintisieteSiete)
    EditText partidaVeintisieteSiete;

    @BindView(R.id.partidaVeintiochoUno)
    EditText partidaVeintiochoUno;
    @BindView(R.id.partidaVeintiochoDos)
    EditText partidaVeintiochoDos;
    @BindView(R.id.partidaVeintiochoTres)
    EditText partidaVeintiochoTres;
    @BindView(R.id.partidaVeintiochoCuatro)
    EditText partidaVeintiochoCuatro;
    @BindView(R.id.partidaVeintiochoCinco)
    EditText partidaVeintiochoCinco;
    @BindView(R.id.partidaVeintiochoSeis)
    EditText partidaVeintiochoSeis;
    @BindView(R.id.partidaVeintiochoSiete)
    EditText partidaVeintiochoSiete;

    @BindView(R.id.partidaVeintinueveUno)
    EditText partidaVeintinueveUno;
    @BindView(R.id.partidaVeintinueveDos)
    EditText partidaVeintinueveDos;
    @BindView(R.id.partidaVeintinueveTres)
    EditText partidaVeintinueveTres;
    @BindView(R.id.partidaVeintinueveCuatro)
    EditText partidaVeintinueveCuatro;
    @BindView(R.id.partidaVeintinueveCinco)
    EditText partidaVeintinueveCinco;
    @BindView(R.id.partidaVeintinueveSeis)
    EditText partidaVeintinueveSeis;
    @BindView(R.id.partidaVeintinueveSiete)
    EditText partidaVeintinueveSiete;

    @BindView(R.id.partidaTreintaUno)
    EditText partidaTreintaUno;
    @BindView(R.id.partidaTreintaDos)
    EditText partidaTreintaDos;
    @BindView(R.id.partidaTreintaTres)
    EditText partidaTreintaTres;
    @BindView(R.id.partidaTreintaCuatro)
    EditText partidaTreintaCuatro;
    @BindView(R.id.partidaTreintaCinco)
    EditText partidaTreintaCinco;
    @BindView(R.id.partidaTreintaSeis)
    EditText partidaTreintaSeis;
    @BindView(R.id.partidaTreintaSiete)
    EditText partidaTreintaSiete;


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
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
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
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUno, partidaDosDos, partidaDosTres, partidaDosCuatro, partidaDosCinco,
                                    partidaDosSeis, partidaDosSiete);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUno, partidaDosDos, partidaDosTres, partidaDosCuatro, partidaDosCinco,
                                partidaDosSeis, partidaDosSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
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
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUno, partidaTresDos, partidaTresTres, partidaTresCuatro, partidaTresCinco,
                                    partidaTresSeis, partidaTresSiete);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUno, partidaTresDos, partidaTresTres, partidaTresCuatro, partidaTresCinco,
                                partidaTresSeis, partidaTresSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
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
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUno, partidaCuatroDos, partidaCuatroTres, partidaCuatroCuatro,
                                    partidaCuatroCinco, partidaCuatroSeis, partidaCuatroSiete);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUno, partidaCuatroDos, partidaCuatroTres, partidaCuatroCuatro,
                                partidaCuatroCinco, partidaCuatroSeis, partidaCuatroSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
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
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUno, partidaCincoDos, partidaCincoTres, partidaCincoCuatro,
                                    partidaCincoCinco, partidaCincoSeis, partidaCincoSiete);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUno, partidaCincoDos, partidaCincoTres, partidaCincoCuatro,
                                partidaCincoCinco, partidaCincoSeis, partidaCincoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
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
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUno, partidaSeisDos, partidaSeisTres, partidaSeisCuatro,
                                    partidaSeisCinco, partidaSeisSeis, partidaSeisSiete);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUno, partidaSeisDos, partidaSeisTres, partidaSeisCuatro,
                                partidaSeisCinco, partidaSeisSeis, partidaSeisSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSeisUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSeisDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSeisTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSeisCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSeisCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSeisSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaSeisSiete);
                            setFreezeRonda(partidaSeisUno, partidaSeisDos, partidaSeisTres, partidaSeisCuatro,
                                    partidaSeisCinco, partidaSeisSeis, partidaSeisSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSiete.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUno, partidaSieteDos, partidaSieteTres, partidaSieteCuatro,
                                    partidaSieteCinco, partidaSieteSeis, partidaSieteSiete);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUno, partidaSieteDos, partidaSieteTres, partidaSieteCuatro,
                                partidaSieteCinco, partidaSieteSeis, partidaSieteSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSieteUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSieteDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSieteTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSieteCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSieteCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSieteSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaSieteSiete);
                            setFreezeRonda(partidaSieteUno, partidaSieteDos, partidaSieteTres, partidaSieteCuatro,
                                    partidaSieteCinco, partidaSieteSeis, partidaSieteSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOcho.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUno, partidaOchoDos, partidaOchoTres, partidaOchoCuatro,
                                    partidaOchoCinco, partidaOchoSeis, partidaOchoSiete);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUno, partidaOchoDos, partidaOchoTres, partidaOchoCuatro,
                                partidaOchoCinco, partidaOchoSeis, partidaOchoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOchoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaOchoSiete);
                            setFreezeRonda(partidaOchoUno, partidaOchoDos, partidaOchoTres, partidaOchoCuatro,
                                    partidaOchoCinco, partidaOchoSeis, partidaOchoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueve.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUno, partidaNueveDos, partidaNueveTres, partidaNueveCuatro,
                                    partidaNueveCinco, partidaNueveSeis, partidaNueveSiete);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUno, partidaNueveDos, partidaNueveTres, partidaNueveCuatro,
                                partidaNueveCinco, partidaNueveSeis, partidaNueveSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaNueveUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaNueveDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaNueveTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaNueveCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaNueveCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaNueveSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaNueveSiete);
                            setFreezeRonda(partidaNueveUno, partidaNueveDos, partidaNueveTres, partidaNueveCuatro,
                                    partidaNueveCinco, partidaNueveSeis, partidaNueveSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiez.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUno, partidaDiezDos, partidaDiezTres, partidaDiezCuatro,
                                    partidaDiezCinco, partidaDiezSeis, partidaDiezSiete);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUno, partidaDiezDos, partidaDiezTres, partidaDiezCuatro,
                                partidaDiezCinco, partidaDiezSeis, partidaDiezSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiezUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiezDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDiezTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDiezCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDiezCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDiezSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDiezSiete);
                            setFreezeRonda(partidaDiezUno, partidaDiezDos, partidaDiezTres, partidaDiezCuatro,
                                    partidaDiezCinco, partidaDiezSeis, partidaDiezSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnce.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUno, partidaOnceDos, partidaOnceTres, partidaOnceCuatro,
                                    partidaOnceCinco, partidaOnceSeis, partidaOnceSiete);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUno, partidaOnceDos, partidaOnceTres, partidaOnceCuatro, partidaOnceCinco,
                                partidaOnceSeis, partidaOnceSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOnceUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOnceDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOnceTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOnceCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOnceCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOnceSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaOnceSiete);
                            setFreezeRonda(partidaOnceUno, partidaOnceDos, partidaOnceTres, partidaOnceCuatro, partidaOnceCinco,
                                    partidaOnceSeis, partidaOnceSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoce.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUno, partidaDoceDos, partidaDoceTres, partidaDoceCuatro, partidaDoceCinco,
                                    partidaDoceSeis, partidaDoceSiete);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUno, partidaDoceDos, partidaDoceTres, partidaDoceCuatro, partidaDoceCinco,
                                partidaDoceSeis, partidaDoceSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDoceUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDoceDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDoceTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDoceCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDoceCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDoceSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDoceSiete);
                            setFreezeRonda(partidaDoceUno, partidaDoceDos, partidaDoceTres, partidaDoceCuatro, partidaDoceCinco,
                                    partidaDoceSeis, partidaDoceSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTrece.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUno, partidaTreceDos, partidaTreceTres, partidaTreceCuatro,
                                    partidaTreceCinco,
                                    partidaTreceSeis, partidaTreceSiete);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUno, partidaTreceDos, partidaTreceTres, partidaTreceCuatro,
                                partidaTreceCinco,
                                partidaTreceSeis, partidaTreceSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreceUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreceDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTreceTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTreceCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTreceCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTreceSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTreceSiete);
                            setFreezeRonda(partidaTreceUno, partidaTreceDos, partidaTreceTres, partidaTreceCuatro, partidaTreceCinco,
                                    partidaTreceSeis, partidaTreceSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorce.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUno, partidaCatorceDos, partidaCatorceTres,
                                    partidaCatorceCuatro,
                                    partidaCatorceCinco, partidaCatorceSeis, partidaCatorceSiete);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUno, partidaCatorceDos, partidaCatorceTres, partidaCatorceCuatro,
                                partidaCatorceCinco, partidaCatorceSeis, partidaCatorceSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCatorceUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCatorceDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCatorceTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCatorceCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCatorceCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCatorceSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCatorceSiete);
                            setFreezeRonda(partidaCatorceUno, partidaCatorceDos, partidaCatorceTres, partidaCatorceCuatro,
                                    partidaCatorceCinco, partidaCatorceSeis, partidaCatorceSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuince.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUno, partidaQuinceDos, partidaQuinceTres, partidaQuinceCuatro,
                                    partidaQuinceCinco, partidaQuinceSeis, partidaQuinceSiete);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUno, partidaQuinceDos, partidaQuinceTres, partidaQuinceCuatro,
                                partidaQuinceCinco, partidaQuinceSeis, partidaQuinceSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaQuinceUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaQuinceDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaQuinceTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaQuinceCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaQuinceCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaQuinceSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaQuinceSiete);
                            setFreezeRonda(partidaQuinceUno, partidaQuinceDos, partidaQuinceTres, partidaQuinceCuatro,
                                    partidaQuinceCinco, partidaQuinceSeis, partidaQuinceSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSeis.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSeisUno, partidaDieciSeisDos, partidaDieciSeisTres,
                                    partidaDieciSeisCuatro,
                                    partidaDieciSeisCinco, partidaDieciSeisSeis, partidaDieciSeisSiete);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciSeisUno, partidaDieciSeisDos, partidaDieciSeisTres, partidaDieciSeisCuatro,
                                partidaDieciSeisCinco, partidaDieciSeisSeis, partidaDieciSeisSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSeisUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSeisDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciSeisTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciSeisCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciSeisCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciSeisSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciSeisSiete);
                            setFreezeRonda(partidaDieciSeisUno, partidaDieciSeisDos, partidaDieciSeisTres, partidaDieciSeisCuatro,
                                    partidaDieciSeisCinco, partidaDieciSeisSeis, partidaDieciSeisSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciSiete.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciSieteUno, partidaDieciSieteDos, partidaDieciSieteTres,
                                    partidaDieciSieteCuatro,
                                    partidaDieciSieteCinco, partidaDieciSieteSeis, partidaDieciSieteSiete);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDieciSieteUno, partidaDieciSieteDos, partidaDieciSieteTres, partidaDieciSieteCuatro,
                                partidaDieciSieteCinco, partidaDieciSieteSeis, partidaDieciSieteSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciSieteUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciSieteDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciSieteTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciSieteCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciSieteCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciSieteSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciSieteSiete);
                            setFreezeRonda(partidaDieciSieteUno, partidaDieciSieteDos, partidaDieciSieteTres, partidaDieciSieteCuatro,
                                    partidaDieciSieteCinco, partidaDieciSieteSeis, partidaDieciSieteSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciOcho.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciOchoUno, partidaDieciOchoDos, partidaDieciOchoTres, partidaDieciOchoCuatro,
                                    partidaDieciOchoCinco, partidaDieciOchoSeis, partidaDieciOchoSiete);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciOchoUno, partidaDieciOchoDos, partidaDieciOchoTres, partidaDieciOchoCuatro,
                                partidaDieciOchoCinco, partidaDieciOchoSeis, partidaDieciOchoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciOchoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciOchoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciOchoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciOchoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciOchoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciOchoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciOchoSiete);
                            setFreezeRonda(partidaDieciOchoUno, partidaDieciOchoDos, partidaDieciOchoTres, partidaDieciOchoCuatro,
                                    partidaDieciOchoCinco, partidaDieciOchoSeis, partidaDieciOchoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciNueve.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciNueveUno, partidaDieciNueveDos, partidaDieciNueveTres, partidaDieciNueveCuatro,
                                    partidaDieciNueveCinco, partidaDieciNueveSeis, partidaDieciNueveSiete);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDieciNueveUno, partidaDieciNueveDos, partidaDieciNueveTres, partidaDieciNueveCuatro,
                                partidaDieciNueveCinco, partidaDieciNueveSeis, partidaDieciNueveSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciNueveUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciNueveDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciNueveTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciNueveCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciNueveCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciNueveSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciNueveSiete);
                            setFreezeRonda(partidaDieciNueveUno, partidaDieciNueveDos, partidaDieciNueveTres, partidaDieciNueveCuatro,
                                    partidaDieciNueveCinco, partidaDieciNueveSeis, partidaDieciNueveSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinte.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUno, partidaVeinteDos, partidaVeinteTres, partidaVeinteCuatro,
                                    partidaVeinteCinco, partidaVeinteSeis, partidaVeinteSiete);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUno, partidaVeinteDos, partidaVeinteTres, partidaVeinteCuatro,
                                partidaVeinteCinco, partidaVeinteSeis, partidaVeinteSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinteUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinteDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinteTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinteCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinteCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinteSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinteSiete);
                            setFreezeRonda(partidaVeinteUno, partidaVeinteDos, partidaVeinteTres, partidaVeinteCuatro,
                                    partidaVeinteCinco, partidaVeinteSeis, partidaVeinteSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiuno.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiunoUno, partidaVeintiunoDos, partidaVeintiunoTres,
                                    partidaVeintiunoCuatro, partidaVeintiunoCinco, partidaVeintiunoSeis, partidaVeintiunoSiete);
                        }
                        break;
                    case 21:
                        if (checkEmptyNumbers(partidaVeintiunoUno, partidaVeintiunoDos, partidaVeintiunoTres,
                                partidaVeintiunoCuatro, partidaVeintiunoCinco,
                                partidaVeintiunoSeis, partidaVeintiunoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiunoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiunoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiunoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiunoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiunoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiunoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiunoSiete);
                            setFreezeRonda(partidaVeintiunoUno, partidaVeintiunoDos, partidaVeintiunoTres,
                                    partidaVeintiunoCuatro, partidaVeintiunoCinco,
                                    partidaVeintiunoSeis, partidaVeintiunoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintidos.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintidosUno, partidaVeintidosDos, partidaVeintidosTres,
                                    partidaVeintidosCuatro, partidaVeintidosCinco,
                                    partidaVeintidosSeis, partidaVeintidosSiete);
                        }
                        break;
                    case 22:
                        if (checkEmptyNumbers(partidaVeintidosUno, partidaVeintidosDos, partidaVeintidosTres,
                                partidaVeintidosCuatro, partidaVeintidosCinco,
                                partidaVeintidosSeis, partidaVeintidosSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintidosUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintidosDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintidosTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintidosCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintidosCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintidosSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintidosSiete);
                            setFreezeRonda(partidaVeintidosUno, partidaVeintidosDos, partidaVeintidosTres,
                                    partidaVeintidosCuatro, partidaVeintidosCinco,
                                    partidaVeintidosSeis, partidaVeintidosSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintitres.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintitresUno, partidaVeintitresDos, partidaVeintitresTres,
                                    partidaVeintitresCuatro,
                                    partidaVeintitresCinco,
                                    partidaVeintitresSeis, partidaVeintitresSiete);
                        }
                        break;
                    case 23:
                        if (checkEmptyNumbers(partidaVeintitresUno, partidaVeintitresDos, partidaVeintitresTres,
                                partidaVeintitresCuatro,
                                partidaVeintitresCinco,
                                partidaVeintitresSeis, partidaVeintitresSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintitresUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintitresDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintitresTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintitresCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintitresCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintitresSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintitresSiete);
                            setFreezeRonda(partidaVeintitresUno, partidaVeintitresDos, partidaVeintitresTres,
                                    partidaVeintitresCuatro, partidaVeintitresCinco,
                                    partidaVeintitresSeis, partidaVeintitresSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticuatro.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticuatroUno, partidaVeinticuatroDos,
                                    partidaVeinticuatroTres,
                                    partidaVeinticuatroCuatro,
                                    partidaVeinticuatroCinco, partidaVeinticuatroSeis, partidaVeinticuatroSiete);
                        }
                        break;
                    case 24:
                        if (checkEmptyNumbers(partidaVeinticuatroUno, partidaVeinticuatroDos, partidaVeinticuatroTres,
                                partidaVeinticuatroCuatro,
                                partidaVeinticuatroCinco, partidaVeinticuatroSeis, partidaVeinticuatroSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticuatroUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticuatroDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinticuatroTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinticuatroCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinticuatroCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinticuatroSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinticuatroSiete);
                            setFreezeRonda(partidaVeinticuatroUno, partidaVeinticuatroDos, partidaVeinticuatroTres,
                                    partidaVeinticuatroCuatro,
                                    partidaVeinticuatroCinco, partidaVeinticuatroSeis, partidaVeinticuatroSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticinco.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticincoUno, partidaVeinticincoDos,
                                    partidaVeinticincoTres, partidaVeinticincoCuatro,
                                    partidaVeinticincoCinco, partidaVeinticincoSeis, partidaVeinticincoSiete);
                        }
                        break;
                    case 25:
                        if (checkEmptyNumbers(partidaVeinticincoUno, partidaVeinticincoDos, partidaVeinticincoTres,
                                partidaVeinticincoCuatro,
                                partidaVeinticincoCinco, partidaVeinticincoSeis, partidaVeinticincoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticincoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticincoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinticincoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinticincoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinticincoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinticincoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinticincoSiete);
                            setFreezeRonda(partidaVeinticincoUno, partidaVeinticincoDos, partidaVeinticincoTres,
                                    partidaVeinticincoCuatro,
                                    partidaVeinticincoCinco, partidaVeinticincoSeis, partidaVeinticincoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiseis.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiseisUno, partidaVeintiseisDos, partidaVeintiseisTres,
                                    partidaVeintiseisCuatro,
                                    partidaVeintiseisCinco, partidaVeintiseisSeis, partidaVeintiseisSiete);
                        }
                        break;
                    case 26:
                        if (checkEmptyNumbers(partidaVeintiseisUno, partidaVeintiseisDos, partidaVeintiseisTres,
                                partidaVeintiseisCuatro,
                                partidaVeintiseisCinco, partidaVeintiseisSeis, partidaVeintiseisSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiseisUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiseisDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiseisTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiseisCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiseisCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiseisSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiseisSiete);
                            setFreezeRonda(partidaVeintiseisUno, partidaVeintiseisDos, partidaVeintiseisTres,
                                    partidaVeintiseisCuatro,
                                    partidaVeintiseisCinco, partidaVeintiseisSeis, partidaVeintiseisSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintisiete.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintisieteUno, partidaVeintisieteDos,
                                    partidaVeintisieteTres,
                                    partidaVeintisieteCuatro,
                                    partidaVeintisieteCinco, partidaVeintisieteSeis, partidaVeintisieteSiete);
                        }
                        break;
                    case 27:
                        if (checkEmptyNumbers(partidaVeintisieteUno, partidaVeintisieteDos, partidaVeintisieteTres,
                                partidaVeintisieteCuatro,
                                partidaVeintisieteCinco, partidaVeintisieteSeis, partidaVeintisieteSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintisieteUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintisieteDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintisieteTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintisieteCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintisieteCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintisieteSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintisieteSiete);
                            setFreezeRonda(partidaVeintisieteUno, partidaVeintisieteDos, partidaVeintisieteTres,
                                    partidaVeintisieteCuatro,
                                    partidaVeintisieteCinco, partidaVeintisieteSeis, partidaVeintisieteSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiocho.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiochoUno, partidaVeintiochoDos, partidaVeintiochoTres,
                                    partidaVeintiochoCuatro,
                                    partidaVeintiochoCinco, partidaVeintiochoSeis, partidaVeintiochoSiete);
                        }
                        break;
                    case 28:
                        if (checkEmptyNumbers(partidaVeintiochoUno, partidaVeintiochoDos, partidaVeintiochoTres,
                                partidaVeintiochoCuatro,
                                partidaVeintiochoCinco, partidaVeintiochoSeis, partidaVeintiochoSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiochoUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiochoDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiochoTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiochoCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiochoCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiochoSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiochoSiete);
                            setFreezeRonda(partidaVeintiochoUno, partidaVeintiochoDos, partidaVeintiochoTres,
                                    partidaVeintiochoCuatro,
                                    partidaVeintiochoCinco, partidaVeintiochoSeis, partidaVeintiochoSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintinueve.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintinueveUno, partidaVeintinueveDos,
                                    partidaVeintinueveTres, partidaVeintinueveCuatro,
                                    partidaVeintinueveCinco, partidaVeintinueveSeis, partidaVeintinueveSiete);
                        }
                        break;
                    case 29:
                        if (checkEmptyNumbers(partidaVeintinueveUno, partidaVeintinueveDos, partidaVeintinueveTres,
                                partidaVeintinueveCuatro,
                                partidaVeintinueveCinco, partidaVeintinueveSeis, partidaVeintinueveSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintinueveUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintinueveDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintinueveTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintinueveCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintinueveCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintinueveSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintinueveSiete);
                            setFreezeRonda(partidaVeintinueveUno, partidaVeintinueveDos, partidaVeintinueveTres,
                                    partidaVeintinueveCuatro,
                                    partidaVeintinueveCinco, partidaVeintinueveSeis, partidaVeintinueveSiete);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreinta.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreintaUno, partidaTreintaDos, partidaTreintaTres,
                                    partidaTreintaCuatro,
                                    partidaTreintaCinco, partidaTreintaSeis, partidaTreintaSiete);
                        }
                        break;
                    case 30:
                        if (checkEmptyNumbers(partidaTreintaUno, partidaTreintaDos, partidaTreintaTres,
                                partidaTreintaCuatro,
                                partidaTreintaCinco, partidaTreintaSeis, partidaTreintaSiete)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreintaUno);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreintaDos);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTreintaTres);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTreintaCuatro);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTreintaCinco);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTreintaSeis);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTreintaSiete);
                            setFreezeRonda(partidaTreintaUno, partidaTreintaDos, partidaTreintaTres, partidaTreintaCuatro,
                                    partidaTreintaCinco, partidaTreintaSeis, partidaTreintaSiete);
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
                                          EditText partidaCinco, EditText partidaSeis, EditText partidaSiete) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
        perdedorNoSumaMas(puntajeJugadorCuatro, partidaCuatro);
        perdedorNoSumaMas(puntajeJugadorCinco, partidaCinco);
        perdedorNoSumaMas(puntajeJugadorSeis, partidaSeis);
        perdedorNoSumaMas(puntajeJugadorSiete, partidaSiete);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }

    private void checkWinner() {
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, puntajeJugadorSeis, textViewJugadorSieteSevenMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, puntajeJugadorSiete, textViewJugadorSeisSevenMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorCincoSevenMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorCuatroSevenMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorTresSevenMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorDosSevenMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorUnoSevenMatch);
    }

    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, Integer jugadorTres, Integer jugadorCuatro,
                                   Integer jugadorCinco, Integer jugadorSeis, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos
                && jugadorTres > limiteDePuntos && jugadorCuatro > limiteDePuntos
                && jugadorCinco > limiteDePuntos && jugadorSeis > limiteDePuntos) {
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
            byeJugadorUno.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUno.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDos.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDos.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTres.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTres.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro > limiteDePuntos) {
            byeJugadorCuatro.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCuatro.setVisibility(View.GONE);
        }
        if (puntajeJugadorCinco > limiteDePuntos) {
            byeJugadorCinco.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCinco.setVisibility(View.GONE);
        }
        if (puntajeJugadorSeis > limiteDePuntos) {
            byeJugadorSeis.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorSeis.setVisibility(View.GONE);
        }
        if (puntajeJugadorSiete > limiteDePuntos) {
            byeJugadorSiete.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorSiete.setVisibility(View.GONE);
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
