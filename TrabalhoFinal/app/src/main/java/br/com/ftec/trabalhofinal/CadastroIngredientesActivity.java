package br.com.ftec.trabalhofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastroIngredientesActivity extends AppCompatActivity implements View.OnClickListener{

    Spinner spnCadIngUnidadeMedida;
    EditText txtCadIngNome;
    Button btnCadIngLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ingredientes);


        spnCadIngUnidadeMedida = (Spinner)findViewById(R.id.spnCadIngUnidadeMedida);
        String[] items = new String[]{"g", "mg", "kg", "ml", "l"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spnCadIngUnidadeMedida.setAdapter(adapter);


        txtCadIngNome = (EditText)findViewById(R.id.txtCadIngNome);

        btnCadIngLimpar = (Button)findViewById(R.id.btnCadIngLimpar);
        btnCadIngLimpar.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnCadIngLimpar:
                LimpaCadastro();
                break;

        }
    }

    private void LimpaCadastro(){
        txtCadIngNome.setText("");
        spnCadIngUnidadeMedida.setSelection(0);
    }

}
