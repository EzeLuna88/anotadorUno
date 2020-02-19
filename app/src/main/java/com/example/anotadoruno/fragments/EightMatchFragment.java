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
public class EightMatchFragment extends Fragment {

    public static final String NOMBRE_JUGADOR_UNO = "jugador uno";
    public static final String NOMBRE_JUGADOR_DOS = "jugador dos";
    public static final String NOMBRE_JUGADOR_TRES = "jugador tres";
    public static final String NOMBRE_JUGADOR_CUATRO = "jugador cuatro";
    public static final String NOMBRE_JUGADOR_CINCO = "jugador cinco";
    public static final String NOMBRE_JUGADOR_SEIS = "jugador seis";
    public static final String NOMBRE_JUGADOR_SIETE = "jugador siete";
    public static final String NOMBRE_JUGADOR_OCHO = "jugador ocho";
    public static final String LIMITE_DE_PUNTOS = "limite de puntos";

    @BindView(R.id.rondaUnoEightMatch)
    LinearLayout rondaUnoEightMatch;
    @BindView(R.id.rondaDosEightMatch)
    LinearLayout rondaDosEightMatch;
    @BindView(R.id.rondaTresEightMatch)
    LinearLayout rondaTresEightMatch;
    @BindView(R.id.rondaCuatroEightMatch)
    LinearLayout rondaCuatroEightMatch;
    @BindView(R.id.rondaCincoEightMatch)
    LinearLayout rondaCincoEightMatch;
    @BindView(R.id.rondaSeisEightMatch)
    LinearLayout rondaSeisEightMatch;
    @BindView(R.id.rondaSieteEightMatch)
    LinearLayout rondaSieteEightMatch;
    @BindView(R.id.rondaOchoEightMatch)
    LinearLayout rondaOchoEightMatch;
    @BindView(R.id.rondaNueveEightMatch)
    LinearLayout rondaNueveEightMatch;
    @BindView(R.id.rondaDiezEightMatch)
    LinearLayout rondaDiezEightMatch;
    @BindView(R.id.rondaOnceEightMatch)
    LinearLayout rondaOnceEightMatch;
    @BindView(R.id.rondaDoceEightMatch)
    LinearLayout rondaDoceEightMatch;
    @BindView(R.id.rondaTreceEightMatch)
    LinearLayout rondaTreceEightMatch;
    @BindView(R.id.rondaCatorceEightMatch)
    LinearLayout rondaCatorceEightMatch;
    @BindView(R.id.rondaQuinceEightMatch)
    LinearLayout rondaQuinceEightMatch;
    @BindView(R.id.rondaDieciseisEightMatch)
    LinearLayout rondaDieciseisEightMatch;
    @BindView(R.id.rondaDiecisieteEightMatch)
    LinearLayout rondaDiecisieteEightMatch;
    @BindView(R.id.rondaDieciochoEightMatch)
    LinearLayout rondaDieciochoEightMatch;
    @BindView(R.id.rondaDiecinueveEightMatch)
    LinearLayout rondaDiecinueveEightMatch;
    @BindView(R.id.rondaVeinteEightMatch)
    LinearLayout rondaVeinteEightMatch;
    @BindView(R.id.rondaVeintiunoEightMatch)
    LinearLayout rondaVeintiunoEightMatch;
    @BindView(R.id.rondaVeintidosEightMatch)
    LinearLayout rondaVeintidosEightMatch;
    @BindView(R.id.rondaVeintitresEightMatch)
    LinearLayout rondaVeintitresEightMatch;
    @BindView(R.id.rondaVeinticuatroEightMatch)
    LinearLayout rondaVeinticuatroEightMatch;
    @BindView(R.id.rondaVeinticincoEightMatch)
    LinearLayout rondaVeinticincoEightMatch;
    @BindView(R.id.rondaVeintiseisEightMatch)
    LinearLayout rondaVeintiseisEightMatch;
    @BindView(R.id.rondaVeintisieteEightMatch)
    LinearLayout rondaVeintisieteEightMatch;
    @BindView(R.id.rondaVeintiochoEightMatch)
    LinearLayout rondaVeintiochoEightMatch;
    @BindView(R.id.rondaVeintinueveEightMatch)
    LinearLayout rondaVeintinueveEightMatch;
    @BindView(R.id.rondaTreintaEightMatch)
    LinearLayout rondaTreintaEightMatch;


    @BindView(R.id.partidaUnoUnoEightMatch)
    EditText partidaUnoUnoEightMatch;
    @BindView(R.id.partidaUnoDosEightMatch)
    EditText partidaUnoDosEightMatch;
    @BindView(R.id.partidaUnoTresEightMatch)
    EditText partidaUnoTresEightMatch;
    @BindView(R.id.partidaUnoCuatroEightMatch)
    EditText partidaUnoCuatroEightMatch;
    @BindView(R.id.partidaUnoCincoEightMatch)
    EditText partidaUnoCincoEightMatch;
    @BindView(R.id.partidaUnoSeisEightMatch)
    EditText partidaUnoSeisEightMatch;
    @BindView(R.id.partidaUnoSieteEightMatch)
    EditText partidaUnoSieteEightMatch;
    @BindView(R.id.partidaUnoOchoEightMatch)
    EditText partidaUnoOchoEightMatch;

    @BindView(R.id.partidaDosUnoEightMatch)
    EditText partidaDosUnoEightMatch;
    @BindView(R.id.partidaDosDosEightMatch)
    EditText partidaDosDosEightMatch;
    @BindView(R.id.partidaDosTresEightMatch)
    EditText partidaDosTresEightMatch;
    @BindView(R.id.partidaDosCuatroEightMatch)
    EditText partidaDosCuatroEightMatch;
    @BindView(R.id.partidaDosCincoEightMatch)
    EditText partidaDosCincoEightMatch;
    @BindView(R.id.partidaDosSeisEightMatch)
    EditText partidaDosSeisEightMatch;
    @BindView(R.id.partidaDosSieteEightMatch)
    EditText partidaDosSieteEightMatch;
    @BindView(R.id.partidaDosOchoEightMatch)
    EditText partidaDosOchoEightMatch;

    @BindView(R.id.partidaTresUnoEightMatch)
    EditText partidaTresUnoEightMatch;
    @BindView(R.id.partidaTresDosEightMatch)
    EditText partidaTresDosEightMatch;
    @BindView(R.id.partidaTresTresEightMatch)
    EditText partidaTresTresEightMatch;
    @BindView(R.id.partidaTresCuatroEightMatch)
    EditText partidaTresCuatroEightMatch;
    @BindView(R.id.partidaTresCincoEightMatch)
    EditText partidaTresCincoEightMatch;
    @BindView(R.id.partidaTresSeisEightMatch)
    EditText partidaTresSeisEightMatch;
    @BindView(R.id.partidaTresSieteEightMatch)
    EditText partidaTresSieteEightMatch;
    @BindView(R.id.partidaTresOchoEightMatch)
    EditText partidaTresOchoEightMatch;

    @BindView(R.id.partidaCuatroUnoEightMatch)
    EditText partidaCuatroUnoEightMatch;
    @BindView(R.id.partidaCuatroDosEightMatch)
    EditText partidaCuatroDosEightMatch;
    @BindView(R.id.partidaCuatroTresEightMatch)
    EditText partidaCuatroTresEightMatch;
    @BindView(R.id.partidaCuatroCuatroEightMatch)
    EditText partidaCuatroCuatroEightMatch;
    @BindView(R.id.partidaCuatroCincoEightMatch)
    EditText partidaCuatroCincoEightMatch;
    @BindView(R.id.partidaCuatroSeisEightMatch)
    EditText partidaCuatroSeisEightMatch;
    @BindView(R.id.partidaCuatroSieteEightMatch)
    EditText partidaCuatroSieteEightMatch;
    @BindView(R.id.partidaCuatroOchoEightMatch)
    EditText partidaCuatroOchoEightMatch;

    @BindView(R.id.partidaCincoUnoEightMatch)
    EditText partidaCincoUnoEightMatch;
    @BindView(R.id.partidaCincoDosEightMatch)
    EditText partidaCincoDosEightMatch;
    @BindView(R.id.partidaCincoTresEightMatch)
    EditText partidaCincoTresEightMatch;
    @BindView(R.id.partidaCincoCuatroEightMatch)
    EditText partidaCincoCuatroEightMatch;
    @BindView(R.id.partidaCincoCincoEightMatch)
    EditText partidaCincoCincoEightMatch;
    @BindView(R.id.partidaCincoSeisEightMatch)
    EditText partidaCincoSeisEightMatch;
    @BindView(R.id.partidaCincoSieteEightMatch)
    EditText partidaCincoSieteEightMatch;
    @BindView(R.id.partidaCincoOchoEightMatch)
    EditText partidaCincoOchoEightMatch;

    @BindView(R.id.partidaSeisUnoEightMatch)
    EditText partidaSeisUnoEightMatch;
    @BindView(R.id.partidaSeisDosEightMatch)
    EditText partidaSeisDosEightMatch;
    @BindView(R.id.partidaSeisTresEightMatch)
    EditText partidaSeisTresEightMatch;
    @BindView(R.id.partidaSeisCuatroEightMatch)
    EditText partidaSeisCuatroEightMatch;
    @BindView(R.id.partidaSeisCincoEightMatch)
    EditText partidaSeisCincoEightMatch;
    @BindView(R.id.partidaSeisSeisEightMatch)
    EditText partidaSeisSeisEightMatch;
    @BindView(R.id.partidaSeisSieteEightMatch)
    EditText partidaSeisSieteEightMatch;
    @BindView(R.id.partidaSeisOchoEightMatch)
    EditText partidaSeisOchoEightMatch;

    @BindView(R.id.partidaSieteUnoEightMatch)
    EditText partidaSieteUnoEightMatch;
    @BindView(R.id.partidaSieteDosEightMatch)
    EditText partidaSieteDosEightMatch;
    @BindView(R.id.partidaSieteTresEightMatch)
    EditText partidaSieteTresEightMatch;
    @BindView(R.id.partidaSieteCuatroEightMatch)
    EditText partidaSieteCuatroEightMatch;
    @BindView(R.id.partidaSieteCincoEightMatch)
    EditText partidaSieteCincoEightMatch;
    @BindView(R.id.partidaSieteSeisEightMatch)
    EditText partidaSieteSeisEightMatch;
    @BindView(R.id.partidaSieteSieteEightMatch)
    EditText partidaSieteSieteEightMatch;
    @BindView(R.id.partidaSieteOchoEightMatch)
    EditText partidaSieteOchoEightMatch;

    @BindView(R.id.partidaOchoUnoEightMatch)
    EditText partidaOchoUnoEightMatch;
    @BindView(R.id.partidaOchoDosEightMatch)
    EditText partidaOchoDosEightMatch;
    @BindView(R.id.partidaOchoTresEightMatch)
    EditText partidaOchoTresEightMatch;
    @BindView(R.id.partidaOchoCuatroEightMatch)
    EditText partidaOchoCuatroEightMatch;
    @BindView(R.id.partidaOchoCincoEightMatch)
    EditText partidaOchoCincoEightMatch;
    @BindView(R.id.partidaOchoSeisEightMatch)
    EditText partidaOchoSeisEightMatch;
    @BindView(R.id.partidaOchoSieteEightMatch)
    EditText partidaOchoSieteEightMatch;
    @BindView(R.id.partidaOchoOchoEightMatch)
    EditText partidaOchoOchoEightMatch;

    @BindView(R.id.partidaNueveUnoEightMatch)
    EditText partidaNueveUnoEightMatch;
    @BindView(R.id.partidaNueveDosEightMatch)
    EditText partidaNueveDosEightMatch;
    @BindView(R.id.partidaNueveTresEightMatch)
    EditText partidaNueveTresEightMatch;
    @BindView(R.id.partidaNueveCuatroEightMatch)
    EditText partidaNueveCuatroEightMatch;
    @BindView(R.id.partidaNueveCincoEightMatch)
    EditText partidaNueveCincoEightMatch;
    @BindView(R.id.partidaNueveSeisEightMatch)
    EditText partidaNueveSeisEightMatch;
    @BindView(R.id.partidaNueveSieteEightMatch)
    EditText partidaNueveSieteEightMatch;
    @BindView(R.id.partidaNueveOchoEightMatch)
    EditText partidaNueveOchoEightMatch;

    @BindView(R.id.partidaDiezUnoEightMatch)
    EditText partidaDiezUnoEightMatch;
    @BindView(R.id.partidaDiezDosEightMatch)
    EditText partidaDiezDosEightMatch;
    @BindView(R.id.partidaDiezTresEightMatch)
    EditText partidaDiezTresEightMatch;
    @BindView(R.id.partidaDiezCuatroEightMatch)
    EditText partidaDiezCuatroEightMatch;
    @BindView(R.id.partidaDiezCincoEightMatch)
    EditText partidaDiezCincoEightMatch;
    @BindView(R.id.partidaDiezSeisEightMatch)
    EditText partidaDiezSeisEightMatch;
    @BindView(R.id.partidaDiezSieteEightMatch)
    EditText partidaDiezSieteEightMatch;
    @BindView(R.id.partidaDiezOchoEightMatch)
    EditText partidaDiezOchoEightMatch;

    @BindView(R.id.partidaOnceUnoEightMatch)
    EditText partidaOnceUnoEightMatch;
    @BindView(R.id.partidaOnceDosEightMatch)
    EditText partidaOnceDosEightMatch;
    @BindView(R.id.partidaOnceTresEightMatch)
    EditText partidaOnceTresEightMatch;
    @BindView(R.id.partidaOnceCuatroEightMatch)
    EditText partidaOnceCuatroEightMatch;
    @BindView(R.id.partidaOnceCincoEightMatch)
    EditText partidaOnceCincoEightMatch;
    @BindView(R.id.partidaOnceSeisEightMatch)
    EditText partidaOnceSeisEightMatch;
    @BindView(R.id.partidaOnceSieteEightMatch)
    EditText partidaOnceSieteEightMatch;
    @BindView(R.id.partidaOnceOchoEightMatch)
    EditText partidaOnceOchoEightMatch;

    @BindView(R.id.partidaDoceUnoEightMatch)
    EditText partidaDoceUnoEightMatch;
    @BindView(R.id.partidaDoceDosEightMatch)
    EditText partidaDoceDosEightMatch;
    @BindView(R.id.partidaDoceTresEightMatch)
    EditText partidaDoceTresEightMatch;
    @BindView(R.id.partidaDoceCuatroEightMatch)
    EditText partidaDoceCuatroEightMatch;
    @BindView(R.id.partidaDoceCincoEightMatch)
    EditText partidaDoceCincoEightMatch;
    @BindView(R.id.partidaDoceSeisEightMatch)
    EditText partidaDoceSeisEightMatch;
    @BindView(R.id.partidaDoceSieteEightMatch)
    EditText partidaDoceSieteEightMatch;
    @BindView(R.id.partidaDoceOchoEightMatch)
    EditText partidaDoceOchoEightMatch;

    @BindView(R.id.partidaTreceUnoEightMatch)
    EditText partidaTreceUnoEightMatch;
    @BindView(R.id.partidaTreceDosEightMatch)
    EditText partidaTreceDosEightMatch;
    @BindView(R.id.partidaTreceTresEightMatch)
    EditText partidaTreceTresEightMatch;
    @BindView(R.id.partidaTreceCuatroEightMatch)
    EditText partidaTreceCuatroEightMatch;
    @BindView(R.id.partidaTreceCincoEightMatch)
    EditText partidaTreceCincoEightMatch;
    @BindView(R.id.partidaTreceSeisEightMatch)
    EditText partidaTreceSeisEightMatch;
    @BindView(R.id.partidaTreceSieteEightMatch)
    EditText partidaTreceSieteEightMatch;
    @BindView(R.id.partidaTreceOchoEightMatch)
    EditText partidaTreceOchoEightMatch;

    @BindView(R.id.partidaCatorceUnoEightMatch)
    EditText partidaCatorceUnoEightMatch;
    @BindView(R.id.partidaCatorceDosEightMatch)
    EditText partidaCatorceDosEightMatch;
    @BindView(R.id.partidaCatorceTresEightMatch)
    EditText partidaCatorceTresEightMatch;
    @BindView(R.id.partidaCatorceCuatroEightMatch)
    EditText partidaCatorceCuatroEightMatch;
    @BindView(R.id.partidaCatorceCincoEightMatch)
    EditText partidaCatorceCincoEightMatch;
    @BindView(R.id.partidaCatorceSeisEightMatch)
    EditText partidaCatorceSeisEightMatch;
    @BindView(R.id.partidaCatorceSieteEightMatch)
    EditText partidaCatorceSieteEightMatch;
    @BindView(R.id.partidaCatorceOchoEightMatch)
    EditText partidaCatorceOchoEightMatch;

    @BindView(R.id.partidaQuinceUnoEightMatch)
    EditText partidaQuinceUnoEightMatch;
    @BindView(R.id.partidaQuinceDosEightMatch)
    EditText partidaQuinceDosEightMatch;
    @BindView(R.id.partidaQuinceTresEightMatch)
    EditText partidaQuinceTresEightMatch;
    @BindView(R.id.partidaQuinceCuatroEightMatch)
    EditText partidaQuinceCuatroEightMatch;
    @BindView(R.id.partidaQuinceCincoEightMatch)
    EditText partidaQuinceCincoEightMatch;
    @BindView(R.id.partidaQuinceSeisEightMatch)
    EditText partidaQuinceSeisEightMatch;
    @BindView(R.id.partidaQuinceSieteEightMatch)
    EditText partidaQuinceSieteEightMatch;
    @BindView(R.id.partidaQuinceOchoEightMatch)
    EditText partidaQuinceOchoEightMatch;

    @BindView(R.id.partidaDieciseisUnoEightMatch)
    EditText partidaDieciseisUnoEightMatch;
    @BindView(R.id.partidaDieciseisDosEightMatch)
    EditText partidaDieciseisDosEightMatch;
    @BindView(R.id.partidaDieciseisTresEightMatch)
    EditText partidaDieciseisTresEightMatch;
    @BindView(R.id.partidaDieciseisCuatroEightMatch)
    EditText partidaDieciseisCuatroEightMatch;
    @BindView(R.id.partidaDieciseisCincoEightMatch)
    EditText partidaDieciseisCincoEightMatch;
    @BindView(R.id.partidaDieciseisSeisEightMatch)
    EditText partidaDieciseisSeisEightMatch;
    @BindView(R.id.partidaDieciseisSieteEightMatch)
    EditText partidaDieciseisSieteEightMatch;
    @BindView(R.id.partidaDieciseisOchoEightMatch)
    EditText partidaDieciseisOchoEightMatch;

    @BindView(R.id.partidaDiecisieteUnoEightMatch)
    EditText partidaDiecisieteUnoEightMatch;
    @BindView(R.id.partidaDiecisieteDosEightMatch)
    EditText partidaDiecisieteDosEightMatch;
    @BindView(R.id.partidaDiecisieteTresEightMatch)
    EditText partidaDiecisieteTresEightMatch;
    @BindView(R.id.partidaDiecisieteCuatroEightMatch)
    EditText partidaDiecisieteCuatroEightMatch;
    @BindView(R.id.partidaDiecisieteCincoEightMatch)
    EditText partidaDiecisieteCincoEightMatch;
    @BindView(R.id.partidaDiecisieteSeisEightMatch)
    EditText partidaDiecisieteSeisEightMatch;
    @BindView(R.id.partidaDiecisieteSieteEightMatch)
    EditText partidaDiecisieteSieteEightMatch;
    @BindView(R.id.partidaDiecisieteOchoEightMatch)
    EditText partidaDiecisieteOchoEightMatch;

    @BindView(R.id.partidaDieciochoUnoEightMatch)
    EditText partidaDieciochoUnoEightMatch;
    @BindView(R.id.partidaDieciochoDosEightMatch)
    EditText partidaDieciochoDosEightMatch;
    @BindView(R.id.partidaDieciochoTresEightMatch)
    EditText partidaDieciochoTresEightMatch;
    @BindView(R.id.partidaDieciochoCuatroEightMatch)
    EditText partidaDieciochoCuatroEightMatch;
    @BindView(R.id.partidaDieciochoCincoEightMatch)
    EditText partidaDieciochoCincoEightMatch;
    @BindView(R.id.partidaDieciochoSeisEightMatch)
    EditText partidaDieciochoSeisEightMatch;
    @BindView(R.id.partidaDieciochoSieteEightMatch)
    EditText partidaDieciochoSieteEightMatch;
    @BindView(R.id.partidaDieciochoOchoEightMatch)
    EditText partidaDieciochoOchoEightMatch;

    @BindView(R.id.partidaDiecinueveUnoEightMatch)
    EditText partidaDiecinueveUnoEightMatch;
    @BindView(R.id.partidaDiecinueveDosEightMatch)
    EditText partidaDiecinueveDosEightMatch;
    @BindView(R.id.partidaDiecinueveTresEightMatch)
    EditText partidaDiecinueveTresEightMatch;
    @BindView(R.id.partidaDiecinueveCuatroEightMatch)
    EditText partidaDiecinueveCuatroEightMatch;
    @BindView(R.id.partidaDiecinueveCincoEightMatch)
    EditText partidaDiecinueveCincoEightMatch;
    @BindView(R.id.partidaDiecinueveSeisEightMatch)
    EditText partidaDiecinueveSeisEightMatch;
    @BindView(R.id.partidaDiecinueveSieteEightMatch)
    EditText partidaDiecinueveSieteEightMatch;
    @BindView(R.id.partidaDiecinueveOchoEightMatch)
    EditText partidaDiecinueveOchoEightMatch;

    @BindView(R.id.partidaVeinteUnoEightMatch)
    EditText partidaVeinteUnoEightMatch;
    @BindView(R.id.partidaVeinteDosEightMatch)
    EditText partidaVeinteDosEightMatch;
    @BindView(R.id.partidaVeinteTresEightMatch)
    EditText partidaVeinteTresEightMatch;
    @BindView(R.id.partidaVeinteCuatroEightMatch)
    EditText partidaVeinteCuatroEightMatch;
    @BindView(R.id.partidaVeinteCincoEightMatch)
    EditText partidaVeinteCincoEightMatch;
    @BindView(R.id.partidaVeinteSeisEightMatch)
    EditText partidaVeinteSeisEightMatch;
    @BindView(R.id.partidaVeinteSieteEightMatch)
    EditText partidaVeinteSieteEightMatch;
    @BindView(R.id.partidaVeinteOchoEightMatch)
    EditText partidaVeinteOchoEightMatch;

    @BindView(R.id.partidaVeintiunoUnoEightMatch)
    EditText partidaVeintiunoUnoEightMatch;
    @BindView(R.id.partidaVeintiunoDosEightMatch)
    EditText partidaVeintiunoDosEightMatch;
    @BindView(R.id.partidaVeintiunoTresEightMatch)
    EditText partidaVeintiunoTresEightMatch;
    @BindView(R.id.partidaVeintiunoCuatroEightMatch)
    EditText partidaVeintiunoCuatroEightMatch;
    @BindView(R.id.partidaVeintiunoCincoEightMatch)
    EditText partidaVeintiunoCincoEightMatch;
    @BindView(R.id.partidaVeintiunoSeisEightMatch)
    EditText partidaVeintiunoSeisEightMatch;
    @BindView(R.id.partidaVeintiunoSieteEightMatch)
    EditText partidaVeintiunoSieteEightMatch;
    @BindView(R.id.partidaVeintiunoOchoEightMatch)
    EditText partidaVeintiunoOchoEightMatch;

    @BindView(R.id.partidaVeintidosUnoEightMatch)
    EditText partidaVeintidosUnoEightMatch;
    @BindView(R.id.partidaVeintidosDosEightMatch)
    EditText partidaVeintidosDosEightMatch;
    @BindView(R.id.partidaVeintidosTresEightMatch)
    EditText partidaVeintidosTresEightMatch;
    @BindView(R.id.partidaVeintidosCuatroEightMatch)
    EditText partidaVeintidosCuatroEightMatch;
    @BindView(R.id.partidaVeintidosCincoEightMatch)
    EditText partidaVeintidosCincoEightMatch;
    @BindView(R.id.partidaVeintidosSeisEightMatch)
    EditText partidaVeintidosSeisEightMatch;
    @BindView(R.id.partidaVeintidosSieteEightMatch)
    EditText partidaVeintidosSieteEightMatch;
    @BindView(R.id.partidaVeintidosOchoEightMatch)
    EditText partidaVeintidosOchoEightMatch;

    @BindView(R.id.partidaVeintitresUnoEightMatch)
    EditText partidaVeintitresUnoEightMatch;
    @BindView(R.id.partidaVeintitresDosEightMatch)
    EditText partidaVeintitresDosEightMatch;
    @BindView(R.id.partidaVeintitresTresEightMatch)
    EditText partidaVeintitresTresEightMatch;
    @BindView(R.id.partidaVeintitresCuatroEightMatch)
    EditText partidaVeintitresCuatroEightMatch;
    @BindView(R.id.partidaVeintitresCincoEightMatch)
    EditText partidaVeintitresCincoEightMatch;
    @BindView(R.id.partidaVeintitresSeisEightMatch)
    EditText partidaVeintitresSeisEightMatch;
    @BindView(R.id.partidaVeintitresSieteEightMatch)
    EditText partidaVeintitresSieteEightMatch;
    @BindView(R.id.partidaVeintitresOchoEightMatch)
    EditText partidaVeintitresOchoEightMatch;

    @BindView(R.id.partidaVeinticuatroUnoEightMatch)
    EditText partidaVeinticuatroUnoEightMatch;
    @BindView(R.id.partidaVeinticuatroDosEightMatch)
    EditText partidaVeinticuatroDosEightMatch;
    @BindView(R.id.partidaVeinticuatroTresEightMatch)
    EditText partidaVeinticuatroTresEightMatch;
    @BindView(R.id.partidaVeinticuatroCuatroEightMatch)
    EditText partidaVeinticuatroCuatroEightMatch;
    @BindView(R.id.partidaVeinticuatroCincoEightMatch)
    EditText partidaVeinticuatroCincoEightMatch;
    @BindView(R.id.partidaVeinticuatroSeisEightMatch)
    EditText partidaVeinticuatroSeisEightMatch;
    @BindView(R.id.partidaVeinticuatroSieteEightMatch)
    EditText partidaVeinticuatroSieteEightMatch;
    @BindView(R.id.partidaVeinticuatroOchoEightMatch)
    EditText partidaVeinticuatroOchoEightMatch;

    @BindView(R.id.partidaVeinticincoUnoEightMatch)
    EditText partidaVeinticincoUnoEightMatch;
    @BindView(R.id.partidaVeinticincoDosEightMatch)
    EditText partidaVeinticincoDosEightMatch;
    @BindView(R.id.partidaVeinticincoTresEightMatch)
    EditText partidaVeinticincoTresEightMatch;
    @BindView(R.id.partidaVeinticincoCuatroEightMatch)
    EditText partidaVeinticincoCuatroEightMatch;
    @BindView(R.id.partidaVeinticincoCincoEightMatch)
    EditText partidaVeinticincoCincoEightMatch;
    @BindView(R.id.partidaVeinticincoSeisEightMatch)
    EditText partidaVeinticincoSeisEightMatch;
    @BindView(R.id.partidaVeinticincoSieteEightMatch)
    EditText partidaVeinticincoSieteEightMatch;
    @BindView(R.id.partidaVeinticincoOchoEightMatch)
    EditText partidaVeinticincoOchoEightMatch;

    @BindView(R.id.partidaVeintiseisUnoEightMatch)
    EditText partidaVeintiseisUnoEightMatch;
    @BindView(R.id.partidaVeintiseisDosEightMatch)
    EditText partidaVeintiseisDosEightMatch;
    @BindView(R.id.partidaVeintiseisTresEightMatch)
    EditText partidaVeintiseisTresEightMatch;
    @BindView(R.id.partidaVeintiseisCuatroEightMatch)
    EditText partidaVeintiseisCuatroEightMatch;
    @BindView(R.id.partidaVeintiseisCincoEightMatch)
    EditText partidaVeintiseisCincoEightMatch;
    @BindView(R.id.partidaVeintiseisSeisEightMatch)
    EditText partidaVeintiseisSeisEightMatch;
    @BindView(R.id.partidaVeintiseisSieteEightMatch)
    EditText partidaVeintiseisSieteEightMatch;
    @BindView(R.id.partidaVeintiseisOchoEightMatch)
    EditText partidaVeintiseisOchoEightMatch;

    @BindView(R.id.partidaVeintisieteUnoEightMatch)
    EditText partidaVeintisieteUnoEightMatch;
    @BindView(R.id.partidaVeintisieteDosEightMatch)
    EditText partidaVeintisieteDosEightMatch;
    @BindView(R.id.partidaVeintisieteTresEightMatch)
    EditText partidaVeintisieteTresEightMatch;
    @BindView(R.id.partidaVeintisieteCuatroEightMatch)
    EditText partidaVeintisieteCuatroEightMatch;
    @BindView(R.id.partidaVeintisieteCincoEightMatch)
    EditText partidaVeintisieteCincoEightMatch;
    @BindView(R.id.partidaVeintisieteSeisEightMatch)
    EditText partidaVeintisieteSeisEightMatch;
    @BindView(R.id.partidaVeintisieteSieteEightMatch)
    EditText partidaVeintisieteSieteEightMatch;
    @BindView(R.id.partidaVeintisieteOchoEightMatch)
    EditText partidaVeintisieteOchoEightMatch;

    @BindView(R.id.partidaVeintiochoUnoEightMatch)
    EditText partidaVeintiochoUnoEightMatch;
    @BindView(R.id.partidaVeintiochoDosEightMatch)
    EditText partidaVeintiochoDosEightMatch;
    @BindView(R.id.partidaVeintiochoTresEightMatch)
    EditText partidaVeintiochoTresEightMatch;
    @BindView(R.id.partidaVeintiochoCuatroEightMatch)
    EditText partidaVeintiochoCuatroEightMatch;
    @BindView(R.id.partidaVeintiochoCincoEightMatch)
    EditText partidaVeintiochoCincoEightMatch;
    @BindView(R.id.partidaVeintiochoSeisEightMatch)
    EditText partidaVeintiochoSeisEightMatch;
    @BindView(R.id.partidaVeintiochoSieteEightMatch)
    EditText partidaVeintiochoSieteEightMatch;
    @BindView(R.id.partidaVeintiochoOchoEightMatch)
    EditText partidaVeintiochoOchoEightMatch;

    @BindView(R.id.partidaVeintinueveUnoEightMatch)
    EditText partidaVeintinueveUnoEightMatch;
    @BindView(R.id.partidaVeintinueveDosEightMatch)
    EditText partidaVeintinueveDosEightMatch;
    @BindView(R.id.partidaVeintinueveTresEightMatch)
    EditText partidaVeintinueveTresEightMatch;
    @BindView(R.id.partidaVeintinueveCuatroEightMatch)
    EditText partidaVeintinueveCuatroEightMatch;
    @BindView(R.id.partidaVeintinueveCincoEightMatch)
    EditText partidaVeintinueveCincoEightMatch;
    @BindView(R.id.partidaVeintinueveSeisEightMatch)
    EditText partidaVeintinueveSeisEightMatch;
    @BindView(R.id.partidaVeintinueveSieteEightMatch)
    EditText partidaVeintinueveSieteEightMatch;
    @BindView(R.id.partidaVeintinueveOchoEightMatch)
    EditText partidaVeintinueveOchoEightMatch;

    @BindView(R.id.partidaTreintaUnoEightMatch)
    EditText partidaTreintaUnoEightMatch;
    @BindView(R.id.partidaTreintaDosEightMatch)
    EditText partidaTreintaDosEightMatch;
    @BindView(R.id.partidaTreintaTresEightMatch)
    EditText partidaTreintaTresEightMatch;
    @BindView(R.id.partidaTreintaCuatroEightMatch)
    EditText partidaTreintaCuatroEightMatch;
    @BindView(R.id.partidaTreintaCincoEightMatch)
    EditText partidaTreintaCincoEightMatch;
    @BindView(R.id.partidaTreintaSeisEightMatch)
    EditText partidaTreintaSeisEightMatch;
    @BindView(R.id.partidaTreintaSieteEightMatch)
    EditText partidaTreintaSieteEightMatch;
    @BindView(R.id.partidaTreintaOchoEightMatch)
    EditText partidaTreintaOchoEightMatch;

    @BindView(R.id.buttonSiguienteRondaEightMatch)
    Button buttonSiguienteRondaEightMatch;

    @BindView(R.id.textViewJugadorUnoEightMatch)
    TextView textViewJugadorUnoEightMatch;
    @BindView(R.id.textViewJugadorDosEightMatch)
    TextView textViewJugadorDosEightMatch;
    @BindView(R.id.textViewJugadorTresEightMatch)
    TextView textViewJugadorTresEightMatch;
    @BindView(R.id.textViewJugadorCuatroEightMatch)
    TextView textViewJugadorCuatroEightMatch;
    @BindView(R.id.textViewJugadorCincoEightMatch)
    TextView textViewJugadorCincoEightMatch;
    @BindView(R.id.textViewJugadorSeisEightMatch)
    TextView textViewJugadorSeisEightMatch;
    @BindView(R.id.textViewJugadorSieteEightMatch)
    TextView textViewJugadorSieteEightMatch;
    @BindView(R.id.textViewJugadorOchoEightMatch)
    TextView textViewJugadorOchoEightMatch;


    @BindView(R.id.textViewPuntajeJugadorUnoEightMatch)
    TextView textViewPuntajeJugadorUnoEightMatch;
    @BindView(R.id.textViewPuntajeJugadorDosEightMatch)
    TextView textViewPuntajeJugadorDosEightMatch;
    @BindView(R.id.textViewPuntajeJugadorTresEightMatch)
    TextView textViewPuntajeJugadorTresEightMatch;
    @BindView(R.id.textViewPuntajeJugadorCuatroEightMatch)
    TextView textViewPuntajeJugadorCuatroEightMatch;
    @BindView(R.id.textViewPuntajeJugadorCincoEightMatch)
    TextView textViewPuntajeJugadorCincoEightMatch;
    @BindView(R.id.textViewPuntajeJugadorSeisEightMatch)
    TextView textViewPuntajeJugadorSeisEightMatch;
    @BindView(R.id.textViewPuntajeJugadorSieteEightMatch)
    TextView textViewPuntajeJugadorSieteEightMatch;
    @BindView(R.id.textViewPuntajeJugadorOchoEightMatch)
    TextView textViewPuntajeJugadorOchoEightMatch;


    @BindView(R.id.byeJugadorUnoEightMatch)
    ImageView byeJugadorUnoEightMatch;
    @BindView(R.id.byeJugadorDosEightMatch)
    ImageView byeJugadorDosEightMatch;
    @BindView(R.id.byeJugadorTresEightMatch)
    ImageView byeJugadorTresEightMatch;
    @BindView(R.id.byeJugadorCuatroEightMatch)
    ImageView byeJugadorCuatroEightMatch;
    @BindView(R.id.byeJugadorCincoEightMatch)
    ImageView byeJugadorCincoEightMatch;
    @BindView(R.id.byeJugadorSeisEightMatch)
    ImageView byeJugadorSeisEightMatch;
    @BindView(R.id.byeJugadorSieteEightMatch)
    ImageView byeJugadorSieteEightMatch;
    @BindView(R.id.byeJugadorOchoEightMatch)
    ImageView byeJugadorOchoEightMatch;

    private String jugadorUnoEightMatch;
    private String jugadorDosEightMatch;
    private String jugadorTresEightMatch;
    private String jugadorCuatroEightMatch;
    private String jugadorCincoEightMatch;
    private String jugadorSeisEightMatch;
    private String jugadorSieteEightMatch;
    private String jugadorOchoEightMatch;


    private Integer limiteDePuntos;

    private Integer puntajeJugadorUno = 0;
    private Integer puntajeJugadorDos = 0;
    private Integer puntajeJugadorTres = 0;
    private Integer puntajeJugadorCuatro = 0;
    private Integer puntajeJugadorCinco = 0;
    private Integer puntajeJugadorSeis = 0;
    private Integer puntajeJugadorSiete = 0;
    private Integer puntajeJugadorOcho = 0;

    private Integer contadorDeRonda = 1;


    public EightMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eight_match, container, false);

        ButterKnife.bind(this, view);
        Bundle bundle = getArguments();

        jugadorUnoEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_UNO);
        jugadorDosEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_DOS);
        jugadorTresEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_TRES);
        jugadorCuatroEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CUATRO);
        jugadorCincoEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_CINCO);
        jugadorSeisEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_SEIS);
        jugadorSieteEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_SIETE);
        jugadorOchoEightMatch = (String) bundle.getSerializable(NOMBRE_JUGADOR_OCHO);

        limiteDePuntos = (Integer) bundle.getSerializable(LIMITE_DE_PUNTOS);

        textViewJugadorUnoEightMatch.setText(jugadorUnoEightMatch);
        textViewJugadorDosEightMatch.setText(jugadorDosEightMatch);
        textViewJugadorTresEightMatch.setText(jugadorTresEightMatch);
        textViewJugadorCuatroEightMatch.setText(jugadorCuatroEightMatch);
        textViewJugadorCincoEightMatch.setText(jugadorCincoEightMatch);
        textViewJugadorSeisEightMatch.setText(jugadorSeisEightMatch);
        textViewJugadorSieteEightMatch.setText(jugadorSieteEightMatch);
        textViewJugadorOchoEightMatch.setText(jugadorOchoEightMatch);

        buttonSiguienteRondaEightMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (contadorDeRonda) {
                    case 1:
                        if (checkEmptyNumbers(partidaUnoUnoEightMatch, partidaUnoDosEightMatch, partidaUnoTresEightMatch,
                                partidaUnoCuatroEightMatch, partidaUnoCincoEightMatch, partidaUnoSeisEightMatch,
                                partidaUnoSieteEightMatch, partidaUnoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = getNumeroParcial(partidaUnoUnoEightMatch);
                            puntajeJugadorDos = getNumeroParcial(partidaUnoDosEightMatch);
                            puntajeJugadorTres = getNumeroParcial(partidaUnoTresEightMatch);
                            puntajeJugadorCuatro = getNumeroParcial(partidaUnoCuatroEightMatch);
                            puntajeJugadorCinco = getNumeroParcial(partidaUnoCincoEightMatch);
                            puntajeJugadorSeis = getNumeroParcial(partidaUnoSeisEightMatch);
                            puntajeJugadorSiete = getNumeroParcial(partidaUnoSieteEightMatch);
                            puntajeJugadorOcho = getNumeroParcial(partidaUnoOchoEightMatch);
                            setFreezeRonda(partidaUnoUnoEightMatch, partidaUnoDosEightMatch, partidaUnoTresEightMatch,
                                    partidaUnoCuatroEightMatch, partidaUnoCincoEightMatch, partidaUnoSeisEightMatch, partidaUnoSieteEightMatch, partidaUnoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDosEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDosUnoEightMatch, partidaDosDosEightMatch,
                                    partidaDosTresEightMatch, partidaDosCuatroEightMatch, partidaDosCincoEightMatch,
                                    partidaDosSeisEightMatch, partidaDosSieteEightMatch, partidaDosOchoEightMatch);
                        }
                        break;
                    case 2:
                        if (checkEmptyNumbers(partidaDosUnoEightMatch, partidaDosDosEightMatch, partidaDosTresEightMatch,
                                partidaDosCuatroEightMatch, partidaDosCincoEightMatch, partidaDosSeisEightMatch, partidaDosSieteEightMatch, partidaDosOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDosUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDosDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDosTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDosCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDosCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDosSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDosSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDosOchoEightMatch);
                            setFreezeRonda(partidaDosUnoEightMatch, partidaDosDosEightMatch, partidaDosTresEightMatch,
                                    partidaDosCuatroEightMatch, partidaDosCincoEightMatch, partidaDosSeisEightMatch, partidaDosSieteEightMatch, partidaDosOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTresEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTresUnoEightMatch, partidaTresDosEightMatch,
                                    partidaTresTresEightMatch, partidaTresCuatroEightMatch, partidaTresCincoEightMatch,
                                    partidaTresSeisEightMatch, partidaTresSieteEightMatch, partidaTresOchoEightMatch);
                        }
                        break;
                    case 3:
                        if (checkEmptyNumbers(partidaTresUnoEightMatch, partidaTresDosEightMatch, partidaTresTresEightMatch,
                                partidaTresCuatroEightMatch, partidaTresCincoEightMatch, partidaTresSeisEightMatch, partidaTresSieteEightMatch, partidaTresOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTresUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTresDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTresTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTresCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTresCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTresSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTresSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaTresOchoEightMatch);
                            setFreezeRonda(partidaTresUnoEightMatch, partidaTresDosEightMatch, partidaTresTresEightMatch,
                                    partidaTresCuatroEightMatch, partidaTresCincoEightMatch, partidaTresSeisEightMatch, partidaTresSieteEightMatch, partidaTresOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCuatroEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCuatroUnoEightMatch, partidaCuatroDosEightMatch,
                                    partidaCuatroTresEightMatch, partidaCuatroCuatroEightMatch,
                                    partidaCuatroCincoEightMatch, partidaCuatroSeisEightMatch, partidaCuatroSieteEightMatch, partidaCuatroOchoEightMatch);
                        }
                        break;
                    case 4:
                        if (checkEmptyNumbers(partidaCuatroUnoEightMatch, partidaCuatroDosEightMatch,
                                partidaCuatroTresEightMatch, partidaCuatroCuatroEightMatch,
                                partidaCuatroCincoEightMatch, partidaCuatroSeisEightMatch, partidaCuatroSieteEightMatch, partidaCuatroOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCuatroUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCuatroDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCuatroTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCuatroCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCuatroCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCuatroSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCuatroSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaCuatroOchoEightMatch);
                            setFreezeRonda(partidaCuatroUnoEightMatch, partidaCuatroDosEightMatch,
                                    partidaCuatroTresEightMatch, partidaCuatroCuatroEightMatch,
                                    partidaCuatroCincoEightMatch, partidaCuatroSeisEightMatch, partidaCuatroSieteEightMatch, partidaCuatroOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCincoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCincoUnoEightMatch, partidaCincoDosEightMatch,
                                    partidaCincoTresEightMatch, partidaCincoCuatroEightMatch,
                                    partidaCincoCincoEightMatch, partidaCincoSeisEightMatch, partidaCincoSieteEightMatch, partidaCincoOchoEightMatch);
                        }
                        break;
                    case 5:
                        if (checkEmptyNumbers(partidaCincoUnoEightMatch, partidaCincoDosEightMatch,
                                partidaCincoTresEightMatch, partidaCincoCuatroEightMatch,
                                partidaCincoCincoEightMatch, partidaCincoSeisEightMatch, partidaCincoSieteEightMatch, partidaCincoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCincoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCincoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCincoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCincoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCincoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCincoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCincoSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaCincoOchoEightMatch);
                            setFreezeRonda(partidaCincoUnoEightMatch, partidaCincoDosEightMatch,
                                    partidaCincoTresEightMatch, partidaCincoCuatroEightMatch,
                                    partidaCincoCincoEightMatch, partidaCincoSeisEightMatch, partidaCincoSieteEightMatch, partidaCincoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSeisEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSeisUnoEightMatch, partidaSeisDosEightMatch,
                                    partidaSeisTresEightMatch, partidaSeisCuatroEightMatch,
                                    partidaSeisCincoEightMatch, partidaSeisSeisEightMatch, partidaSeisSieteEightMatch, partidaSeisOchoEightMatch);
                        }
                        break;
                    case 6:
                        if (checkEmptyNumbers(partidaSeisUnoEightMatch, partidaSeisDosEightMatch,
                                partidaSeisTresEightMatch,
                                partidaSeisCuatroEightMatch, partidaSeisCincoEightMatch, partidaSeisSeisEightMatch, partidaSeisSieteEightMatch, partidaSeisOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSeisUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSeisDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSeisTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSeisCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSeisCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSeisSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaSeisSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaSeisOchoEightMatch);
                            setFreezeRonda(partidaSeisUnoEightMatch, partidaSeisDosEightMatch, partidaSeisTresEightMatch,
                                    partidaSeisCuatroEightMatch, partidaSeisCincoEightMatch, partidaSeisSeisEightMatch, partidaSeisSieteEightMatch, partidaSeisOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaSieteEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaSieteUnoEightMatch, partidaSieteDosEightMatch,
                                    partidaSieteTresEightMatch, partidaSieteCuatroEightMatch, partidaSieteCincoEightMatch,
                                    partidaSieteSeisEightMatch, partidaSieteSeisEightMatch, partidaSieteOchoEightMatch);
                        }
                        break;
                    case 7:
                        if (checkEmptyNumbers(partidaSieteUnoEightMatch, partidaSieteDosEightMatch,
                                partidaSieteTresEightMatch, partidaSieteCuatroEightMatch,
                                partidaSieteCincoEightMatch, partidaSieteSeisEightMatch, partidaSieteSeisEightMatch, partidaSieteOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaSieteUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaSieteDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaSieteTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaSieteCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaSieteCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaSieteSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaSieteSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaSieteOchoEightMatch);
                            setFreezeRonda(partidaSieteUnoEightMatch, partidaSieteDosEightMatch,
                                    partidaSieteTresEightMatch, partidaSieteCuatroEightMatch,
                                    partidaSieteCincoEightMatch, partidaSieteSeisEightMatch, partidaSieteSieteEightMatch, partidaSieteOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOchoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOchoUnoEightMatch, partidaOchoDosEightMatch,
                                    partidaOchoTresEightMatch, partidaOchoCuatroEightMatch,
                                    partidaOchoCincoEightMatch, partidaOchoSeisEightMatch, partidaOchoSieteEightMatch, partidaOchoOchoEightMatch);
                        }
                        break;
                    case 8:
                        if (checkEmptyNumbers(partidaOchoUnoEightMatch, partidaOchoDosEightMatch,
                                partidaOchoTresEightMatch,
                                partidaOchoCuatroEightMatch, partidaOchoCincoEightMatch, partidaOchoSeisEightMatch, partidaOchoSieteEightMatch, partidaOchoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOchoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOchoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOchoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOchoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOchoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOchoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaOchoSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaOchoOchoEightMatch);
                            setFreezeRonda(partidaOchoUnoEightMatch, partidaOchoDosEightMatch, partidaOchoTresEightMatch,
                                    partidaOchoCuatroEightMatch, partidaOchoCincoEightMatch, partidaOchoSeisEightMatch, partidaOchoSieteEightMatch, partidaOchoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaNueveEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaNueveUnoEightMatch, partidaNueveDosEightMatch,
                                    partidaNueveTresEightMatch, partidaNueveCuatroEightMatch,
                                    partidaNueveCincoEightMatch, partidaNueveSeisEightMatch, partidaNueveSieteEightMatch, partidaNueveOchoEightMatch);
                        }
                        break;
                    case 9:
                        if (checkEmptyNumbers(partidaNueveUnoEightMatch, partidaNueveDosEightMatch,
                                partidaNueveTresEightMatch, partidaNueveCuatroEightMatch,
                                partidaNueveCincoEightMatch, partidaNueveSeisEightMatch, partidaNueveSieteEightMatch, partidaNueveOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaNueveUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaNueveDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaNueveTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaNueveCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaNueveCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaNueveSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaNueveSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaNueveOchoEightMatch);
                            setFreezeRonda(partidaNueveUnoEightMatch, partidaNueveDosEightMatch, partidaNueveTresEightMatch,
                                    partidaNueveCuatroEightMatch, partidaNueveCincoEightMatch, partidaNueveSeisEightMatch,
                                    partidaNueveSieteEightMatch, partidaNueveOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiezEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiezUnoEightMatch, partidaDiezDosEightMatch,
                                    partidaDiezTresEightMatch, partidaDiezCuatroEightMatch,
                                    partidaDiezCincoEightMatch, partidaDiezSeisEightMatch, partidaDiezSieteEightMatch, partidaDiezOchoEightMatch);
                        }
                        break;
                    case 10:
                        if (checkEmptyNumbers(partidaDiezUnoEightMatch, partidaDiezDosEightMatch,
                                partidaDiezTresEightMatch,
                                partidaDiezCuatroEightMatch, partidaDiezCincoEightMatch, partidaDiezSeisEightMatch, partidaDiezSieteEightMatch, partidaDiezOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiezUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiezDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDiezTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDiezCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDiezCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDiezSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDiezSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDiezOchoEightMatch);
                            setFreezeRonda(partidaDiezUnoEightMatch, partidaDiezDosEightMatch, partidaDiezTresEightMatch,
                                    partidaDiezCuatroEightMatch, partidaDiezCincoEightMatch, partidaDiezSeisEightMatch, partidaDiezSieteEightMatch, partidaDiezOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaOnceEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaOnceUnoEightMatch, partidaOnceDosEightMatch,
                                    partidaOnceTresEightMatch, partidaOnceCuatroEightMatch,
                                    partidaOnceCincoEightMatch, partidaOnceSeisEightMatch, partidaOnceSieteEightMatch, partidaOnceOchoEightMatch);
                        }
                        break;
                    case 11:
                        if (checkEmptyNumbers(partidaOnceUnoEightMatch, partidaOnceDosEightMatch,
                                partidaOnceTresEightMatch,
                                partidaOnceCuatroEightMatch, partidaOnceCincoEightMatch,
                                partidaOnceSeisEightMatch, partidaOnceSieteEightMatch, partidaOnceOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaOnceUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaOnceDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaOnceTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaOnceCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaOnceCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaOnceSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaOnceSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaOnceOchoEightMatch);
                            setFreezeRonda(partidaOnceUnoEightMatch, partidaOnceDosEightMatch, partidaOnceTresEightMatch,
                                    partidaOnceCuatroEightMatch, partidaOnceCincoEightMatch,
                                    partidaOnceSeisEightMatch, partidaOnceSieteEightMatch, partidaOnceOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDoceEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDoceUnoEightMatch, partidaDoceDosEightMatch,
                                    partidaDoceTresEightMatch, partidaDoceCuatroEightMatch, partidaDoceCincoEightMatch,
                                    partidaDoceSeisEightMatch, partidaDoceSieteEightMatch, partidaDoceOchoEightMatch);
                        }
                        break;
                    case 12:
                        if (checkEmptyNumbers(partidaDoceUnoEightMatch, partidaDoceDosEightMatch,
                                partidaDoceTresEightMatch, partidaDoceCuatroEightMatch, partidaDoceCincoEightMatch,
                                partidaDoceSeisEightMatch, partidaDoceSieteEightMatch, partidaDoceOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDoceUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDoceDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDoceTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDoceCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDoceCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDoceSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDoceSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDoceOchoEightMatch);
                            setFreezeRonda(partidaDoceUnoEightMatch, partidaDoceDosEightMatch, partidaDoceTresEightMatch,
                                    partidaDoceCuatroEightMatch, partidaDoceCincoEightMatch,
                                    partidaDoceSeisEightMatch, partidaDoceSieteEightMatch, partidaDoceOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreceEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreceUnoEightMatch, partidaTreceDosEightMatch,
                                    partidaTreceTresEightMatch, partidaTreceCuatroEightMatch, partidaTreceCincoEightMatch,
                                    partidaTreceSeisEightMatch, partidaTreceSieteEightMatch, partidaTreceOchoEightMatch);
                        }
                        break;
                    case 13:
                        if (checkEmptyNumbers(partidaTreceUnoEightMatch, partidaTreceDosEightMatch,
                                partidaTreceTresEightMatch, partidaTreceCuatroEightMatch, partidaTreceCincoEightMatch,
                                partidaTreceSeisEightMatch, partidaTreceSieteEightMatch, partidaTreceOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreceUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreceDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTreceTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTreceCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTreceCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTreceSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTreceSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaTreceOchoEightMatch);
                            setFreezeRonda(partidaTreceUnoEightMatch, partidaTreceDosEightMatch, partidaTreceTresEightMatch,
                                    partidaTreceCuatroEightMatch, partidaTreceCincoEightMatch,
                                    partidaTreceSeisEightMatch, partidaTreceSieteEightMatch, partidaTreceOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaCatorceEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaCatorceUnoEightMatch, partidaCatorceDosEightMatch,
                                    partidaCatorceTresEightMatch, partidaCatorceCuatroEightMatch,
                                    partidaCatorceCincoEightMatch, partidaCatorceSeisEightMatch, partidaCatorceSieteEightMatch, partidaCatorceOchoEightMatch);
                        }
                        break;
                    case 14:
                        if (checkEmptyNumbers(partidaCatorceUnoEightMatch, partidaCatorceDosEightMatch,
                                partidaCatorceTresEightMatch, partidaCatorceCuatroEightMatch,
                                partidaCatorceCincoEightMatch, partidaCatorceSeisEightMatch, partidaCatorceSieteEightMatch, partidaCatorceOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaCatorceUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaCatorceDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaCatorceTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaCatorceCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaCatorceCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaCatorceSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaCatorceSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaCatorceOchoEightMatch);
                            setFreezeRonda(partidaCatorceUnoEightMatch, partidaCatorceDosEightMatch,
                                    partidaCatorceTresEightMatch, partidaCatorceCuatroEightMatch,
                                    partidaCatorceCincoEightMatch, partidaCatorceSeisEightMatch, partidaCatorceSieteEightMatch, partidaCatorceOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaQuinceEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaQuinceUnoEightMatch, partidaQuinceDosEightMatch,
                                    partidaQuinceTresEightMatch, partidaQuinceCuatroEightMatch,
                                    partidaQuinceCincoEightMatch, partidaQuinceSeisEightMatch, partidaQuinceSieteEightMatch, partidaQuinceOchoEightMatch);
                        }
                        break;
                    case 15:
                        if (checkEmptyNumbers(partidaQuinceUnoEightMatch, partidaQuinceDosEightMatch,
                                partidaQuinceTresEightMatch, partidaQuinceCuatroEightMatch,
                                partidaQuinceCincoEightMatch, partidaQuinceSeisEightMatch, partidaQuinceSieteEightMatch, partidaQuinceOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaQuinceUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaQuinceDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaQuinceTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaQuinceCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaQuinceCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaQuinceSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaQuinceSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaQuinceOchoEightMatch);
                            setFreezeRonda(partidaQuinceUnoEightMatch, partidaQuinceDosEightMatch,
                                    partidaQuinceTresEightMatch, partidaQuinceCuatroEightMatch,
                                    partidaQuinceCincoEightMatch, partidaQuinceSeisEightMatch, partidaQuinceSieteEightMatch, partidaQuinceOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciseisEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciseisUnoEightMatch, partidaDieciseisDosEightMatch,
                                    partidaDieciseisTresEightMatch, partidaDieciseisCuatroEightMatch,
                                    partidaDieciseisCincoEightMatch, partidaDieciseisSeisEightMatch, partidaDieciseisSieteEightMatch, partidaDieciseisOchoEightMatch);
                        }
                        break;
                    case 16:
                        if (checkEmptyNumbers(partidaDieciseisUnoEightMatch, partidaDieciseisDosEightMatch,
                                partidaDieciseisTresEightMatch, partidaDieciseisCuatroEightMatch,
                                partidaDieciseisCincoEightMatch, partidaDieciseisSeisEightMatch, partidaDieciseisSieteEightMatch, partidaDieciseisOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciseisUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciseisDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciseisTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciseisCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciseisCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciseisSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciseisSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDieciseisOchoEightMatch);
                            setFreezeRonda(partidaDieciseisUnoEightMatch, partidaDieciseisDosEightMatch,
                                    partidaDieciseisTresEightMatch, partidaDieciseisCuatroEightMatch,
                                    partidaDieciseisCincoEightMatch, partidaDieciseisSeisEightMatch, partidaDieciseisSieteEightMatch, partidaDieciseisOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiecisieteEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiecisieteUnoEightMatch, partidaDiecisieteDosEightMatch,
                                    partidaDiecisieteTresEightMatch, partidaDiecisieteCuatroEightMatch,
                                    partidaDiecisieteCincoEightMatch, partidaDiecisieteSeisEightMatch, partidaDiecisieteSieteEightMatch, partidaDiecisieteOchoEightMatch);
                        }
                        break;
                    case 17:
                        if (checkEmptyNumbers(partidaDiecisieteUnoEightMatch, partidaDiecisieteDosEightMatch,
                                partidaDiecisieteTresEightMatch, partidaDiecisieteCuatroEightMatch,
                                partidaDiecisieteCincoEightMatch, partidaDiecisieteSeisEightMatch, partidaDiecisieteSieteEightMatch, partidaDiecisieteOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiecisieteUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiecisieteDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDiecisieteTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDiecisieteCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDiecisieteCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDiecisieteSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDiecisieteSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDiecisieteOchoEightMatch);
                            setFreezeRonda(partidaDiecisieteUnoEightMatch, partidaDiecisieteDosEightMatch,
                                    partidaDiecisieteTresEightMatch, partidaDiecisieteCuatroEightMatch,
                                    partidaDiecisieteCincoEightMatch, partidaDiecisieteSeisEightMatch, partidaDiecisieteSieteEightMatch, partidaDiecisieteOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDieciochoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDieciochoUnoEightMatch, partidaDieciochoDosEightMatch,
                                    partidaDieciochoTresEightMatch, partidaDieciochoCuatroEightMatch,
                                    partidaDieciochoCincoEightMatch, partidaDieciochoSeisEightMatch, partidaDieciochoSieteEightMatch, partidaDieciochoOchoEightMatch);
                        }
                        break;
                    case 18:
                        if (checkEmptyNumbers(partidaDieciochoUnoEightMatch, partidaDieciochoDosEightMatch,
                                partidaDieciochoTresEightMatch, partidaDieciochoCuatroEightMatch,
                                partidaDieciochoCincoEightMatch, partidaDieciochoSeisEightMatch, partidaDieciochoSieteEightMatch, partidaDieciochoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDieciochoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDieciochoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDieciochoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDieciochoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDieciochoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDieciochoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDieciochoSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDieciochoOchoEightMatch);
                            setFreezeRonda(partidaDieciochoUnoEightMatch, partidaDieciochoDosEightMatch,
                                    partidaDieciochoTresEightMatch, partidaDieciochoCuatroEightMatch,
                                    partidaDieciochoCincoEightMatch, partidaDieciochoSeisEightMatch, partidaDieciochoSieteEightMatch, partidaDieciochoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaDiecinueveEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaDiecinueveUnoEightMatch, partidaDiecinueveDosEightMatch,
                                    partidaDiecinueveTresEightMatch, partidaDiecinueveCuatroEightMatch,
                                    partidaDiecinueveCincoEightMatch, partidaDiecinueveSeisEightMatch, partidaDiecinueveSieteEightMatch, partidaDiecinueveOchoEightMatch);
                        }
                        break;
                    case 19:
                        if (checkEmptyNumbers(partidaDiecinueveUnoEightMatch, partidaDiecinueveDosEightMatch,
                                partidaDiecinueveTresEightMatch, partidaDiecinueveCuatroEightMatch,
                                partidaDiecinueveCincoEightMatch, partidaDiecinueveSeisEightMatch, partidaDiecinueveSieteEightMatch, partidaDiecinueveOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaDiecinueveUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaDiecinueveDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaDiecinueveTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaDiecinueveCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaDiecinueveCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaDiecinueveSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaDiecinueveSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaDiecinueveOchoEightMatch);
                            setFreezeRonda(partidaDiecinueveUnoEightMatch, partidaDiecinueveDosEightMatch,
                                    partidaDiecinueveTresEightMatch, partidaDiecinueveCuatroEightMatch,
                                    partidaDiecinueveCincoEightMatch, partidaDiecinueveSeisEightMatch, partidaDiecinueveSieteEightMatch, partidaDiecinueveOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinteEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinteUnoEightMatch, partidaVeinteDosEightMatch,
                                    partidaVeinteTresEightMatch, partidaVeinteCuatroEightMatch,
                                    partidaVeinteCincoEightMatch, partidaVeinteSeisEightMatch, partidaVeinteSieteEightMatch, partidaVeinteOchoEightMatch);
                        }
                        break;
                    case 20:
                        if (checkEmptyNumbers(partidaVeinteUnoEightMatch, partidaVeinteDosEightMatch,
                                partidaVeinteTresEightMatch, partidaVeinteCuatroEightMatch,
                                partidaVeinteCincoEightMatch, partidaVeinteSeisEightMatch, partidaVeinteSieteEightMatch, partidaVeinteOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinteUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinteDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinteTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinteCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinteCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinteSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinteSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeinteOchoEightMatch);
                            setFreezeRonda(partidaVeinteUnoEightMatch, partidaVeinteDosEightMatch,
                                    partidaVeinteTresEightMatch, partidaVeinteCuatroEightMatch,
                                    partidaVeinteCincoEightMatch, partidaVeinteSeisEightMatch, partidaVeinteSieteEightMatch, partidaVeinteOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiunoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiunoUnoEightMatch, partidaVeintiunoDosEightMatch,
                                    partidaVeintiunoTresEightMatch, partidaVeintiunoCuatroEightMatch, partidaVeintiunoCincoEightMatch,
                                    partidaVeintiunoSeisEightMatch, partidaVeintiunoSieteEightMatch, partidaVeintiunoOchoEightMatch);
                        }
                        break;
                    case 21:
                        if (checkEmptyNumbers(partidaVeintiunoUnoEightMatch, partidaVeintiunoDosEightMatch,
                                partidaVeintiunoTresEightMatch,
                                partidaVeintiunoCuatroEightMatch, partidaVeintiunoCincoEightMatch,
                                partidaVeintiunoSeisEightMatch, partidaVeintiunoSieteEightMatch, partidaVeintiunoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiunoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiunoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiunoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiunoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiunoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiunoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiunoSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintiunoOchoEightMatch);
                            setFreezeRonda(partidaVeintiunoUnoEightMatch, partidaVeintiunoDosEightMatch,
                                    partidaVeintiunoTresEightMatch,
                                    partidaVeintiunoCuatroEightMatch, partidaVeintiunoCincoEightMatch,
                                    partidaVeintiunoSeisEightMatch, partidaVeintiunoSieteEightMatch, partidaVeintiunoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintidosEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintidosUnoEightMatch, partidaVeintidosDosEightMatch,
                                    partidaVeintidosTresEightMatch, partidaVeintidosCuatroEightMatch, partidaVeintidosCincoEightMatch,
                                    partidaVeintidosSeisEightMatch, partidaVeintidosSieteEightMatch, partidaVeintidosOchoEightMatch);
                        }
                        break;
                    case 22:
                        if (checkEmptyNumbers(partidaVeintidosUnoEightMatch, partidaVeintidosDosEightMatch,
                                partidaVeintidosTresEightMatch, partidaVeintidosCuatroEightMatch, partidaVeintidosCincoEightMatch,
                                partidaVeintidosSeisEightMatch, partidaVeintidosSieteEightMatch, partidaVeintidosOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintidosUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintidosDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintidosTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintidosCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintidosCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintidosSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintidosSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintidosOchoEightMatch);
                            setFreezeRonda(partidaVeintidosUnoEightMatch, partidaVeintidosDosEightMatch,
                                    partidaVeintidosTresEightMatch,
                                    partidaVeintidosCuatroEightMatch, partidaVeintidosCincoEightMatch,
                                    partidaVeintidosSeisEightMatch, partidaVeintidosSieteEightMatch, partidaVeintidosOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintitresEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintitresUnoEightMatch, partidaVeintitresDosEightMatch,
                                    partidaVeintitresTresEightMatch, partidaVeintitresCuatroEightMatch, partidaVeintitresCincoEightMatch,
                                    partidaVeintitresSeisEightMatch, partidaVeintitresSieteEightMatch, partidaVeintitresOchoEightMatch);
                        }
                        break;
                    case 23:
                        if (checkEmptyNumbers(partidaVeintitresUnoEightMatch, partidaVeintitresDosEightMatch,
                                partidaVeintitresTresEightMatch, partidaVeintitresCuatroEightMatch, partidaVeintitresCincoEightMatch,
                                partidaVeintitresSeisEightMatch, partidaVeintitresSieteEightMatch, partidaVeintitresOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintitresUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintitresDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintitresTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintitresCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintitresCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintitresSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintitresSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintitresOchoEightMatch);
                            setFreezeRonda(partidaVeintitresUnoEightMatch, partidaVeintitresDosEightMatch,
                                    partidaVeintitresTresEightMatch,
                                    partidaVeintitresCuatroEightMatch, partidaVeintitresCincoEightMatch,
                                    partidaVeintitresSeisEightMatch, partidaVeintitresSieteEightMatch, partidaVeintitresOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticuatroEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticuatroUnoEightMatch, partidaVeinticuatroDosEightMatch,
                                    partidaVeinticuatroTresEightMatch, partidaVeinticuatroCuatroEightMatch,
                                    partidaVeinticuatroCincoEightMatch, partidaVeinticuatroSeisEightMatch, partidaVeinticuatroSieteEightMatch, partidaVeinticuatroOchoEightMatch);
                        }
                        break;
                    case 24:
                        if (checkEmptyNumbers(partidaVeinticuatroUnoEightMatch, partidaVeinticuatroDosEightMatch,
                                partidaVeinticuatroTresEightMatch, partidaVeinticuatroCuatroEightMatch,
                                partidaVeinticuatroCincoEightMatch, partidaVeinticuatroSeisEightMatch, partidaVeinticuatroSieteEightMatch, partidaVeinticuatroOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticuatroUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticuatroDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinticuatroTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinticuatroCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinticuatroCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinticuatroSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinticuatroSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeinticuatroOchoEightMatch);
                            setFreezeRonda(partidaVeinticuatroUnoEightMatch, partidaVeinticuatroDosEightMatch,
                                    partidaVeinticuatroTresEightMatch, partidaVeinticuatroCuatroEightMatch,
                                    partidaVeinticuatroCincoEightMatch, partidaVeinticuatroSeisEightMatch, partidaVeinticuatroSieteEightMatch, partidaVeinticuatroOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeinticincoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeinticincoUnoEightMatch, partidaVeinticincoDosEightMatch,
                                    partidaVeinticincoTresEightMatch, partidaVeinticincoCuatroEightMatch,
                                    partidaVeinticincoCincoEightMatch, partidaVeinticincoSeisEightMatch, partidaVeinticincoSieteEightMatch, partidaVeinticincoOchoEightMatch);
                        }
                        break;
                    case 25:
                        if (checkEmptyNumbers(partidaVeinticincoUnoEightMatch, partidaVeinticincoDosEightMatch,
                                partidaVeinticincoTresEightMatch, partidaVeinticincoCuatroEightMatch,
                                partidaVeinticincoCincoEightMatch, partidaVeinticincoSeisEightMatch, partidaVeinticincoSieteEightMatch, partidaVeinticincoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeinticincoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeinticincoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeinticincoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeinticincoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeinticincoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeinticincoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeinticincoOchoEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeinticincoOchoEightMatch);
                            setFreezeRonda(partidaVeinticincoUnoEightMatch, partidaVeinticincoDosEightMatch,
                                    partidaVeinticincoTresEightMatch, partidaVeinticincoCuatroEightMatch,
                                    partidaVeinticincoCincoEightMatch, partidaVeinticincoSeisEightMatch, partidaVeinticincoSieteEightMatch, partidaVeinticincoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiseisEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiseisUnoEightMatch, partidaVeintiseisDosEightMatch,
                                    partidaVeintiseisTresEightMatch, partidaVeintiseisCuatroEightMatch,
                                    partidaVeintiseisCincoEightMatch, partidaVeintiseisSeisEightMatch, partidaVeintiseisSieteEightMatch, partidaVeintiseisOchoEightMatch);
                        }
                        break;
                    case 26:
                        if (checkEmptyNumbers(partidaVeintiseisUnoEightMatch, partidaVeintiseisDosEightMatch,
                                partidaVeintiseisTresEightMatch, partidaVeintiseisCuatroEightMatch,
                                partidaVeintiseisCincoEightMatch, partidaVeintiseisSeisEightMatch, partidaVeintiseisSieteEightMatch, partidaVeintiseisOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiseisUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiseisDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiseisTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiseisCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiseisCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiseisSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiseisSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintiseisOchoEightMatch);
                            setFreezeRonda(partidaVeintiseisUnoEightMatch, partidaVeintiseisDosEightMatch,
                                    partidaVeintiseisTresEightMatch, partidaVeintiseisCuatroEightMatch,
                                    partidaVeintiseisCincoEightMatch, partidaVeintiseisSeisEightMatch, partidaVeintiseisSieteEightMatch, partidaVeintiseisOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintisieteEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintisieteUnoEightMatch, partidaVeintisieteDosEightMatch,
                                    partidaVeintisieteTresEightMatch, partidaVeintisieteCuatroEightMatch,
                                    partidaVeintisieteCincoEightMatch, partidaVeintisieteSeisEightMatch, partidaVeintisieteSieteEightMatch, partidaVeintisieteOchoEightMatch);
                        }
                        break;
                    case 27:
                        if (checkEmptyNumbers(partidaVeintisieteUnoEightMatch, partidaVeintisieteDosEightMatch,
                                partidaVeintisieteTresEightMatch, partidaVeintisieteCuatroEightMatch,
                                partidaVeintisieteCincoEightMatch, partidaVeintisieteSeisEightMatch, partidaVeintisieteSieteEightMatch, partidaVeintisieteOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintisieteUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintisieteDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintisieteTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintisieteCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintisieteCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintisieteSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintisieteSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintisieteOchoEightMatch);
                            setFreezeRonda(partidaVeintisieteUnoEightMatch, partidaVeintisieteDosEightMatch,
                                    partidaVeintisieteTresEightMatch, partidaVeintisieteCuatroEightMatch,
                                    partidaVeintisieteCincoEightMatch, partidaVeintisieteSeisEightMatch, partidaVeintisieteSieteEightMatch, partidaVeintisieteOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintiochoEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintiochoUnoEightMatch, partidaVeintiochoDosEightMatch,
                                    partidaVeintiochoTresEightMatch, partidaVeintiochoCuatroEightMatch,
                                    partidaVeintiochoCincoEightMatch, partidaVeintiochoSeisEightMatch, partidaVeintiochoSieteEightMatch, partidaVeintiochoOchoEightMatch);
                        }
                        break;
                    case 28:
                        if (checkEmptyNumbers(partidaVeintiochoUnoEightMatch, partidaVeintiochoDosEightMatch,
                                partidaVeintiochoTresEightMatch, partidaVeintiochoCuatroEightMatch,
                                partidaVeintiochoCincoEightMatch, partidaVeintiochoSeisEightMatch, partidaVeintiochoSieteEightMatch, partidaVeintiochoOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintiochoUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintiochoDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintiochoTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintiochoCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintiochoCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintiochoSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintiochoSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintiochoOchoEightMatch);
                            setFreezeRonda(partidaVeintiochoUnoEightMatch, partidaVeintiochoDosEightMatch,
                                    partidaVeintiochoTresEightMatch, partidaVeintiochoCuatroEightMatch,
                                    partidaVeintiochoCincoEightMatch, partidaVeintiochoSeisEightMatch, partidaVeintiochoSieteEightMatch, partidaVeintiochoOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaVeintinueveEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaVeintinueveUnoEightMatch, partidaVeintinueveDosEightMatch,
                                    partidaVeintinueveTresEightMatch, partidaVeintinueveCuatroEightMatch,
                                    partidaVeintinueveCincoEightMatch, partidaVeintinueveSeisEightMatch, partidaVeintinueveSieteEightMatch, partidaVeintinueveOchoEightMatch);
                        }
                        break;
                    case 29:
                        if (checkEmptyNumbers(partidaVeintinueveUnoEightMatch, partidaVeintinueveDosEightMatch,
                                partidaVeintinueveTresEightMatch, partidaVeintinueveCuatroEightMatch,
                                partidaVeintinueveCincoEightMatch, partidaVeintinueveSeisEightMatch, partidaVeintinueveSieteEightMatch, partidaVeintinueveOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaVeintinueveUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaVeintinueveDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaVeintinueveTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaVeintinueveCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaVeintinueveCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaVeintinueveSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaVeintinueveSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaVeintinueveOchoEightMatch);
                            setFreezeRonda(partidaVeintinueveUnoEightMatch, partidaVeintinueveDosEightMatch,
                                    partidaVeintinueveTresEightMatch, partidaVeintinueveCuatroEightMatch,
                                    partidaVeintinueveCincoEightMatch, partidaVeintinueveSeisEightMatch, partidaVeintinueveSieteEightMatch, partidaVeintinueveOchoEightMatch);
                            contadorDeRonda = contadorDeRonda + 1;
                            rondaTreintaEightMatch.setVisibility(View.VISIBLE);
                            actualizarPuntajes();
                            checkLimitePuntos();
                            checkWinner();
                            generalPerdedorNoSumaMas(partidaTreintaUnoEightMatch, partidaTreintaDosEightMatch,
                                    partidaTreintaTresEightMatch, partidaTreintaCuatroEightMatch,
                                    partidaTreintaCincoEightMatch, partidaTreintaSeisEightMatch, partidaTreintaSieteEightMatch, partidaTreintaOchoEightMatch);
                        }
                        break;
                    case 30:
                        if (checkEmptyNumbers(partidaTreintaUnoEightMatch, partidaTreintaDosEightMatch,
                                partidaTreintaTresEightMatch, partidaTreintaCuatroEightMatch,
                                partidaTreintaCincoEightMatch, partidaTreintaSeisEightMatch, partidaTreintaSieteEightMatch, partidaTreintaOchoEightMatch)) {
                            Toast.makeText(getContext(), R.string.llenar_todos_los_casilleros, Toast.LENGTH_SHORT).show();
                        } else {
                            puntajeJugadorUno = puntajeJugadorUno + getNumeroParcial(partidaTreintaUnoEightMatch);
                            puntajeJugadorDos = puntajeJugadorDos + getNumeroParcial(partidaTreintaDosEightMatch);
                            puntajeJugadorTres = puntajeJugadorTres + getNumeroParcial(partidaTreintaTresEightMatch);
                            puntajeJugadorCuatro = puntajeJugadorCuatro + getNumeroParcial(partidaTreintaCuatroEightMatch);
                            puntajeJugadorCinco = puntajeJugadorCinco + getNumeroParcial(partidaTreintaCincoEightMatch);
                            puntajeJugadorSeis = puntajeJugadorSeis + getNumeroParcial(partidaTreintaSeisEightMatch);
                            puntajeJugadorSiete = puntajeJugadorSiete + getNumeroParcial(partidaTreintaSieteEightMatch);
                            puntajeJugadorOcho = puntajeJugadorOcho + getNumeroParcial(partidaTreintaOchoEightMatch);
                            setFreezeRonda(partidaTreintaUnoEightMatch, partidaTreintaDosEightMatch,
                                    partidaTreintaTresEightMatch, partidaTreintaCuatroEightMatch,
                                    partidaTreintaCincoEightMatch, partidaTreintaSeisEightMatch, partidaTreintaSieteEightMatch, partidaTreintaOchoEightMatch);
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

    private void generalPerdedorNoSumaMas(EditText partidaUno, EditText partidaDos, EditText partidaTres,
                                          EditText partidaCuatro, EditText partidaCinco, EditText partidaSeis,
                                          EditText partidaSiete, EditText partidaOcho) {
        perdedorNoSumaMas(puntajeJugadorUno, partidaUno);
        perdedorNoSumaMas(puntajeJugadorDos, partidaDos);
        perdedorNoSumaMas(puntajeJugadorTres, partidaTres);
        perdedorNoSumaMas(puntajeJugadorCuatro, partidaCuatro);
        perdedorNoSumaMas(puntajeJugadorCinco, partidaCinco);
        perdedorNoSumaMas(puntajeJugadorSeis, partidaSeis);
        perdedorNoSumaMas(puntajeJugadorSiete, partidaSiete);
        perdedorNoSumaMas(puntajeJugadorOcho, partidaOcho);
    }

    private void perdedorNoSumaMas(Integer puntajeJugador, EditText partida) {
        if (puntajeJugador > limiteDePuntos) {
            partida.setText("0");
            partida.setEnabled(false);
        }
    }

    private void checkWinner() {
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, puntajeJugadorSeis, puntajeJugadorSiete, textViewJugadorOchoEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, puntajeJugadorSeis, puntajeJugadorOcho, textViewJugadorSieteEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorCinco, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorSeisEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro,
                puntajeJugadorSeis, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorCincoEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorCuatroEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorDos, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorTresEightMatch);
        checkWinnerPlayer(puntajeJugadorUno, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorDosEightMatch);
        checkWinnerPlayer(puntajeJugadorDos, puntajeJugadorTres, puntajeJugadorCuatro, puntajeJugadorCinco,
                puntajeJugadorSeis, puntajeJugadorSiete, puntajeJugadorOcho, textViewJugadorUnoEightMatch);


    }

    private void checkWinnerPlayer(Integer jugadorUno, Integer jugadorDos, Integer jugadorTres, Integer jugadorCuatro,
                                   Integer jugadorCinco, Integer jugadorSeis, Integer jugadorSiete, TextView nombreJugadorGanador) {
        if (jugadorUno > limiteDePuntos && jugadorDos > limiteDePuntos
                && jugadorTres > limiteDePuntos && jugadorCuatro > limiteDePuntos
                && jugadorCinco > limiteDePuntos && jugadorSeis > limiteDePuntos && jugadorSiete > limiteDePuntos) {
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
            byeJugadorUnoEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorUnoEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorDos > limiteDePuntos) {
            byeJugadorDosEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorDosEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorTres > limiteDePuntos) {
            byeJugadorTresEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorTresEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCuatro > limiteDePuntos) {
            byeJugadorCuatroEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCuatroEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorCinco > limiteDePuntos) {
            byeJugadorCincoEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorCincoEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorSeis > limiteDePuntos) {
            byeJugadorSeisEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorSeisEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorSiete > limiteDePuntos) {
            byeJugadorSieteEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorSieteEightMatch.setVisibility(View.GONE);
        }
        if (puntajeJugadorOcho > limiteDePuntos) {
            byeJugadorOchoEightMatch.setVisibility(View.VISIBLE);
            textViewPuntajeJugadorOchoEightMatch.setVisibility(View.GONE);
        }
    }

    private void setFreezeRonda(EditText partidaDosUno, EditText partidaDosDos, EditText partidaDosTres,
                                EditText partidaDosCuatro, EditText partidaDosCinco, EditText partidaDosSeis,
                                EditText partidaDosSiete, EditText partidaDosOcho) {
        setFreeze(partidaDosUno);
        setFreeze(partidaDosDos);
        setFreeze(partidaDosTres);
        setFreeze(partidaDosCuatro);
        setFreeze(partidaDosCinco);
        setFreeze(partidaDosSeis);
        setFreeze(partidaDosSiete);
        setFreeze(partidaDosOcho);
    }

    private int getNumeroParcial(EditText partidaDosUno) {
        return Integer.parseInt(partidaDosUno.getText().toString());
    }

    private void actualizarPuntajes() {
        textViewPuntajeJugadorUnoEightMatch.setText(String.valueOf(puntajeJugadorUno));
        textViewPuntajeJugadorDosEightMatch.setText(String.valueOf(puntajeJugadorDos));
        textViewPuntajeJugadorTresEightMatch.setText(String.valueOf(puntajeJugadorTres));
        textViewPuntajeJugadorCuatroEightMatch.setText(String.valueOf(puntajeJugadorCuatro));
        textViewPuntajeJugadorCincoEightMatch.setText(String.valueOf(puntajeJugadorCinco));
        textViewPuntajeJugadorSeisEightMatch.setText(String.valueOf(puntajeJugadorSeis));
        textViewPuntajeJugadorSieteEightMatch.setText(String.valueOf(puntajeJugadorSiete));
        textViewPuntajeJugadorOchoEightMatch.setText(String.valueOf(puntajeJugadorOcho));
    }

    private boolean checkEmptyNumbers(EditText jugadorUno, EditText jugadorDos, EditText jugadorTres,
                                      EditText jugadorCuatro, EditText jugadorCinco, EditText jugadorSeis,
                                      EditText jugadorSiete, EditText jugadorOcho) {
        return TextUtils.isEmpty(jugadorUno.getText().toString()) ||
                TextUtils.isEmpty(jugadorDos.getText().toString()) ||
                TextUtils.isEmpty(jugadorTres.getText().toString()) ||
                TextUtils.isEmpty(jugadorCuatro.getText().toString()) ||
                TextUtils.isEmpty(jugadorCinco.getText().toString()) ||
                TextUtils.isEmpty(jugadorSeis.getText().toString()) ||
                TextUtils.isEmpty(jugadorSiete.getText().toString()) ||
                TextUtils.isEmpty(jugadorOcho.getText().toString());
    }


    private void setFreeze(EditText partidaUnoUno) {
        partidaUnoUno.setEnabled(false);
        partidaUnoUno.setCursorVisible(false);
        partidaUnoUno.setKeyListener(null);
        partidaUnoUno.setBackgroundColor(Color.TRANSPARENT);
    }

}
