package com.cyllac.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String [] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião",
            "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };

    private String [] perfis = {
            "Arianos são animados, independentes, individualistas, dinâmicos, corajosos e aventureiros",
            "Taurinos são positivos, pacientes, determinados, noturnos, leais e românticos",
            "Geminianos são positivos, mutáveis, racionais e bastante voláteis",
            "Cancerianos possuem uma personalidade sensível, dócil, gentis e amorosos",
            "Leoninos são carismáticos, charmosos e possuem uma personalidade forte e decisiva",
            "Virginianos são dedicados, detalhistas, perfeccionistas, críticos, exigentes, e tímidos",
            "Librianos são diplomáticos, justiceiros, pacíficos e sociáveis",
            "Escorpianos são introspectivos, pensadores, sensíveis, orgulhosos, determinados, obstinados e lógicos",
            "Sagitarianos são otimistas, autoconfiantes, leais, generosos e alegres",
            "Capricornianos são trabalhadores, persistentes, obstinados, ambiciosos e astutos",
            "Aquarianos são criativos, inteligentes e mentalmente dinâmicos",
            "Peixes são como as águas, fluidos, adaptáveis, subjetivos e muito sutis"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);
        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codigoPosicao = i;

                Toast.makeText(getApplicationContext(),perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });
    }
}