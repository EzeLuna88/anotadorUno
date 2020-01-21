package com.example.anotadoruno.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.anotadoruno.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class AmistosoCrearJugadoresFragment extends Fragment {

    @BindView(R.id.editTextJugadorUno)
    TextInputEditText editTextJugadorUno;
    @BindView(R.id.editTextJugadorDos)
    TextInputEditText editTextJugadorDos;
    @BindView(R.id.editTextJugadorTres)
    TextInputEditText editTextJugadorTres;
    @BindView(R.id.editTextJugadorCuatro)
    TextInputEditText editTextJugadorCuatro;
    @BindView(R.id.editTextJugadorCinco)
    TextInputEditText editTextJugadorCinco;
    @BindView(R.id.editTextJugadorSeis)
    TextInputEditText editTextJugadorSeis;
    @BindView(R.id.editTextJugadorSiete)
    TextInputEditText editTextJugadorSiete;
    @BindView(R.id.editTextJugadorOcho)
    TextInputEditText editTextJugadorOcho;
    @BindView(R.id.editTextJugadorNueve)
    TextInputEditText editTextJugadorNueve;
    @BindView(R.id.editTextJugadorDiez)
    TextInputEditText editTextJugadorDiez;
    @BindView(R.id.botonEmpezarPartida)
    Button botonEmpezarPartida;
    @BindView(R.id.spinnerCantidadDeJugadores)
    Spinner spinnerCantidadDeJugadores;
    @BindView(R.id.jugadorUno)
    TextInputLayout jugadorUno;
    @BindView(R.id.jugadorDos)
    TextInputLayout jugadorDos;
    @BindView(R.id.jugadorTres)
    TextInputLayout jugadorTres;
    @BindView(R.id.jugadorCuatro)
    TextInputLayout jugadorCuatro;
    @BindView(R.id.jugadorCinco)
    TextInputLayout jugadorCinco;
    @BindView(R.id.jugadorSeis)
    TextInputLayout jugadorSeis;
    @BindView(R.id.jugadorSiete)
    TextInputLayout jugadorSiete;
    @BindView(R.id.jugadorOcho)
    TextInputLayout jugadorOcho;
    @BindView(R.id.jugadorNueve)
    TextInputLayout jugadorNueve;
    @BindView(R.id.jugadorDiez)
    TextInputLayout jugadorDiez;
    private String nombreJugadorUno;
    private String nombreJugadorDos;
    private String nombreJugadorTres;
    private String nombreJugadorCuatro;
    private String nombreJugadorCinco;
    private String nombreJugadorSeis;
    private String nombreJugadorSiete;
    private String nombreJugadorOcho;
    private String nombreJugadorNueve;
    private String nombreJugadorDiez;
    @BindView(R.id.editTextLimiteDePuntos)
    EditText editTextLimiteDePuntos;
    private Integer limiteDePuntos;

    public AmistosoCrearJugadoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_amistoso_crear_jugadores, container, false);
        ButterKnife.bind(this, view);

        setSpinnerPlayers();

        setEditTextJugadorUno();
        setEditTextJugadorDos();
        setEditTextJugadorTres();
        setEditTextJugadorCuatro();
        setEditTextJugadorCinco();
        setEditTextJugadorSeis();
        setEditTextJugadorSiete();
        setEditTextJugadorOcho();
        setEditTextJugadorNueve();
        setEditTextJugadorDiez();

        editTextLimiteDePuntos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value = editTextLimiteDePuntos.getText().toString();
                limiteDePuntos = Integer.parseInt(value);
            }
        });


        botonEmpezarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (spinnerCantidadDeJugadores.getSelectedItem().toString()) {
                    case "2":
                        if (nombreJugadorUno == null || nombreJugadorDos == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {


                            TwoMatchFragment twoMatchFragment = new TwoMatchFragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, twoMatchFragment).commit();
                            break;
                        }
                    case "3":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            Bundle args = new Bundle();
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_UNO, nombreJugadorUno);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_DOS, nombreJugadorDos);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_TRES, nombreJugadorTres);
                            args.putSerializable(FiveMatchFragment.LIMITE_DE_PUNTOS, limiteDePuntos);
                            ThreeMatchFragment threeMatchFragment = new ThreeMatchFragment();
                            threeMatchFragment.setArguments(args);
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, threeMatchFragment).commit();
                            break;
                        }
                    case "4":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null || nombreJugadorCuatro == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            Bundle args = new Bundle();
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_UNO, nombreJugadorUno);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_DOS, nombreJugadorDos);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_TRES, nombreJugadorTres);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_CUATRO, nombreJugadorCuatro);
                            args.putSerializable(FiveMatchFragment.LIMITE_DE_PUNTOS, limiteDePuntos);
                            FourMatchFragment fourMatchFragment = new FourMatchFragment();
                            fourMatchFragment.setArguments(args);
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, fourMatchFragment).commit();
                            break;
                        }
                    case "5":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            Bundle args = new Bundle();
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_UNO, nombreJugadorUno);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_DOS, nombreJugadorDos);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_TRES, nombreJugadorTres);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_CUATRO, nombreJugadorCuatro);
                            args.putSerializable(FiveMatchFragment.NOMBRE_JUGADOR_CINCO, nombreJugadorCinco);
                            args.putSerializable(FiveMatchFragment.LIMITE_DE_PUNTOS, limiteDePuntos);
                            FiveMatchFragment fiveMatchFragment = new FiveMatchFragment();
                            fiveMatchFragment.setArguments(args);
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, fiveMatchFragment).commit();
                            break;
                        }
                    case "6":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null || nombreJugadorSeis == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            Bundle args = new Bundle();
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_UNO, nombreJugadorUno);
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_DOS, nombreJugadorDos);
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_TRES, nombreJugadorTres);
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_CUATRO, nombreJugadorCuatro);
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_CINCO, nombreJugadorCinco);
                            args.putSerializable(SixMatchFragment.NOMBRE_JUGADOR_SEIS, nombreJugadorSeis);
                            args.putSerializable(SixMatchFragment.LIMITE_DE_PUNTOS, limiteDePuntos);
                            SixMatchFragment sixMatchFragment = new SixMatchFragment();
                            sixMatchFragment.setArguments(args);
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, sixMatchFragment).commit();
                            break;
                        }
                    case "7":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null
                                || nombreJugadorSeis == null || nombreJugadorSiete == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            Bundle args = new Bundle();
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_UNO, nombreJugadorUno);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_DOS, nombreJugadorDos);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_TRES, nombreJugadorTres);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_CUATRO, nombreJugadorCuatro);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_CINCO, nombreJugadorCinco);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_SEIS, nombreJugadorSeis);
                            args.putSerializable(SevenMatchFragment.NOMBRE_JUGADOR_SIETE, nombreJugadorSiete);
                            args.putSerializable(SevenMatchFragment.LIMITE_DE_PUNTOS, limiteDePuntos);
                            SevenMatchFragment sevenMatchFragment = new SevenMatchFragment();
                            sevenMatchFragment.setArguments(args);
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, sevenMatchFragment).commit();
                            break;
                        }
                    case "8":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null
                                || nombreJugadorSeis == null || nombreJugadorSiete == null
                                || nombreJugadorOcho == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            EightMatchFragment eightMatchFragment = new EightMatchFragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, eightMatchFragment).commit();
                            break;
                        }
                    case "9":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null
                                || nombreJugadorSeis == null || nombreJugadorSiete == null
                                || nombreJugadorOcho == null || nombreJugadorNueve == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            NineMatchFragment nineMatchFragment = new NineMatchFragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, nineMatchFragment).commit();
                            break;
                        }
                    case "10":
                        if (nombreJugadorUno == null || nombreJugadorDos == null || nombreJugadorTres == null ||
                                nombreJugadorCuatro == null || nombreJugadorCinco == null
                                || nombreJugadorSeis == null || nombreJugadorSiete == null
                                || nombreJugadorOcho == null || nombreJugadorNueve == null || nombreJugadorDiez == null) {
                            Toast.makeText(getContext(), R.string.faltan_nombres, Toast.LENGTH_SHORT).show();
                        }
                        if (limiteDePuntos == null) {
                            Toast.makeText(getContext(), "debe poner un limite de puntos", Toast.LENGTH_SHORT).show();
                        } else {
                            TenMatchFragment tenMatchFragment = new TenMatchFragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.contenedorDeFragment, tenMatchFragment).commit();
                            break;
                        }


                }

            }
        });


        return view;
    }

    private void setEditTextJugadorNueve() {
        editTextJugadorNueve.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorNueve = editTextJugadorNueve.getText().toString();
            }
        });
    }

    private void setEditTextJugadorOcho() {
        editTextJugadorOcho.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorOcho = editTextJugadorOcho.getText().toString();
            }
        });
    }

    private void setEditTextJugadorSiete() {
        editTextJugadorSiete.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorSiete = editTextJugadorSiete.getText().toString();
            }
        });
    }

    private void setEditTextJugadorSeis() {
        editTextJugadorSeis.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorSeis = editTextJugadorSeis.getText().toString();
            }
        });
    }

    private void setEditTextJugadorCinco() {
        editTextJugadorCinco.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorCinco = editTextJugadorCinco.getText().toString();
            }
        });
    }

    private void setEditTextJugadorCuatro() {
        editTextJugadorCuatro.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorCuatro = editTextJugadorCuatro.getText().toString();
            }
        });
    }

    private void setEditTextJugadorTres() {
        editTextJugadorTres.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorTres = editTextJugadorTres.getText().toString();
            }
        });
    }

    private void setEditTextJugadorDiez() {
        editTextJugadorDiez.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorDiez = editTextJugadorDiez.getText().toString();
            }
        });
    }

    private void setEditTextJugadorDos() {
        editTextJugadorDos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorDos = editTextJugadorDos.getText().toString();
            }
        });
    }

    private void setEditTextJugadorUno() {
        editTextJugadorUno.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nombreJugadorUno = editTextJugadorUno.getText().toString();
            }
        });
    }

    private void setSpinnerPlayers() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.numeros, R.layout.textview_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCantidadDeJugadores.setAdapter(adapter);
        spinnerCantidadDeJugadores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Object item = adapterView.getItemAtPosition(i);
                if (item != null) {
                    switch (item.toString()) {
                        case "2":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.GONE);
                            jugadorCuatro.setVisibility(View.GONE);
                            jugadorCinco.setVisibility(View.GONE);
                            jugadorSeis.setVisibility(View.GONE);
                            jugadorSiete.setVisibility(View.GONE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "3":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.GONE);
                            jugadorCinco.setVisibility(View.GONE);
                            jugadorSeis.setVisibility(View.GONE);
                            jugadorSiete.setVisibility(View.GONE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "4":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.GONE);
                            jugadorSeis.setVisibility(View.GONE);
                            jugadorSiete.setVisibility(View.GONE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "5":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.GONE);
                            jugadorSiete.setVisibility(View.GONE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "6":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.VISIBLE);
                            jugadorSiete.setVisibility(View.GONE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "7":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.VISIBLE);
                            jugadorSiete.setVisibility(View.VISIBLE);
                            jugadorOcho.setVisibility(View.GONE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "8":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.VISIBLE);
                            jugadorSiete.setVisibility(View.VISIBLE);
                            jugadorOcho.setVisibility(View.VISIBLE);
                            jugadorNueve.setVisibility(View.GONE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "9":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.VISIBLE);
                            jugadorSiete.setVisibility(View.VISIBLE);
                            jugadorOcho.setVisibility(View.VISIBLE);
                            jugadorNueve.setVisibility(View.VISIBLE);
                            jugadorDiez.setVisibility(View.GONE);
                            break;
                        case "10":
                            jugadorUno.setVisibility(View.VISIBLE);
                            jugadorDos.setVisibility(View.VISIBLE);
                            jugadorTres.setVisibility(View.VISIBLE);
                            jugadorCuatro.setVisibility(View.VISIBLE);
                            jugadorCinco.setVisibility(View.VISIBLE);
                            jugadorSeis.setVisibility(View.VISIBLE);
                            jugadorSiete.setVisibility(View.VISIBLE);
                            jugadorOcho.setVisibility(View.VISIBLE);
                            jugadorNueve.setVisibility(View.VISIBLE);
                            jugadorDiez.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public interface NotificadorBotonEmpezarPartida {
        public void hicieronClickBotonEmpezarPartida();
    }

}
