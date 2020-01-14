package com.example.anotadoruno.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.anotadoruno.R;

import butterknife.BindView;

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


    public SixMatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_six_match, container, false);
    }

}
