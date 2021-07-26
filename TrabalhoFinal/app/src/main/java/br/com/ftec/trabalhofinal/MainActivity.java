package br.com.ftec.trabalhofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogar = (Button)findViewById(R.id.btnLogar);
        btnLogar.setOnClickListener(this);

    }

    public void onClick(View v){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
