package br.com.ftec.trabalhofinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCadastrarReceita;
    private Button btnCadastrarIngrediente;
    private Button btnProcurarPrato;

    private Button btnLogout;
    private Button btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnCadastrarReceita = (Button)findViewById(R.id.btnCadastrarReceita);
        btnCadastrarReceita.setOnClickListener(this);

        btnCadastrarIngrediente = (Button)findViewById(R.id.btnCadastrarIngrediente);
        btnCadastrarIngrediente.setOnClickListener(this);

        btnProcurarPrato = (Button)findViewById(R.id.btnProcurarPratos);
        btnProcurarPrato.setOnClickListener(this);

        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

        btnSair = (Button)findViewById(R.id.btnSair);
        btnSair.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnCadastrarReceita:
                CadastrarReceita();
                break;
            case R.id.btnCadastrarIngrediente:
                CadastrarIngrediente();
                break;
            case R.id.btnProcurarPratos:
                ProcurarPratos();
                break;


            case R.id.btnLogout:
                Logout();
                break;
            case R.id.btnSair:
                Sair();
                break;
        }



    }

    private void CadastrarReceita(){

    }

    private void CadastrarIngrediente(){

        Intent intent = new Intent(this, CadastroIngredientesActivity.class);
        startActivity(intent);

    }

    private void ProcurarPratos(){

    }

    private void Logout(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Atenção")
            .setMessage("Deseja realmente fazer logout?")
            .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    // n sei pq n ta funcionando o intent pro main...

                    //Intent intent = new Intent(this, MainActivity.class);
                    //startActivity(intent);
                }
            })
            .setNegativeButton("Nao", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void Sair(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Atenção")
                .setMessage("Deseja realmente sair?")
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Nao", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}

