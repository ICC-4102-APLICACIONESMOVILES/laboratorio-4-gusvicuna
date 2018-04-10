package com.example.lab4;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gustavo on 10/04/2018.
 */

public class FragAgregarFormulario extends Fragment{

    public FragAgregarFormulario() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_agregar_formulario, container, false);
    }
}
