package com.example.brunohenrique.contactstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener, View.OnClickListener {


        TextView tvMenu;
        Button btnA, btnR, btnRg, btnB, btnBh, btnG, btnV, btnL, btnLf, btnAm;
        Button btnP, btnS, btnC, btnM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        tvMenu = (TextView) findViewById(R.id.tvMenu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbBack);
        toolbar.inflateMenu(R.menu.activity_menu);
        toolbar.setTitle("Atalho");
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setOnMenuItemClickListener(this);

        btnA = (Button) findViewById(R.id.btnPlus);
        btnA.setOnClickListener(this);

        btnG = (Button) findViewById(R.id.btnG);
        btnG.setOnClickListener(this);



    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        String texto = "";
        switch (menuItem.getItemId()) {
            case R.id.menu_add:
                texto = "CADASTRAR";
                break;
            case R.id.menu_ed:
                texto = "EDITAR";
                break;
            case R.id.menu_del:
                texto = "APAGAR";
                break;
            case R.id.menu_help:
                texto = "AJUDA";
                break;
            case android.R.id.home:
                texto = "ICONE";
                break;
        }
        tvMenu.setText(texto);
        return false;
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch(v.getId()) {
            case R.id.btnPlus:
                i = new Intent(MainActivity.this, Anderson.class);
                startActivity(i);
                break;

            case R.id.btnG:
                i = new Intent(MainActivity.this, Gabriel.class);
                startActivity(i);
                break;
        }



//
//            case R.id.btnBruno:
//                Intent br = new Intent(MainActivity.this, verMaisBruno_activity.class);
//                startActivity(br);
//                break;
//
//            case R.id.btnCamilo:
//                Intent c = new Intent(MainActivity.this, verMaisCamilo_activity.class);
//                startActivity(c);
//                break;
//
//            case R.id.btnGabriel:
//                Intent g = new Intent(MainActivity.this, verMaisGabriel_activity.class);
//                startActivity(g);
//                break;
//
//            case R.id.btnLauro:
//                Intent l = new Intent(MainActivity.this, verMaisLauro_activity.class);
//                startActivity(l);
//                break;
//
//            case R.id.btnLuis:
//                Intent lu = new Intent(MainActivity.this, verMaisLuis_activity.class);
//                startActivity(lu);
//                break;
//
//            case R.id.btnMarcelo:
//                Intent m = new Intent(MainActivity.this, verMaisMarcelo_activity.class);
//                startActivity(m);
//                break;
//
//            case R.id.btnPedro:
//                Intent p = new Intent(MainActivity.this, verMaisPedro_activity.class);
//                startActivity(p);
//                break;
//
//            case R.id.btnRegis:
//                Intent r = new Intent(MainActivity.this, verMaisRegis_activity.class);
//                startActivity(r);
//                break;
//
//            case R.id.btnRenan:
//                Intent re = new Intent(MainActivity.this, verMaisRenan_activity.class);
//                startActivity(re);
//                break;
//
//            case R.id.btnSamuel:
//                Intent s = new Intent(MainActivity.this, verMaisSamuel_activity.class);
//                startActivity(s);
//                break;
//
//            case R.id.btnVinicius:
//                Intent vi = new Intent(MainActivity.this, verMaisVinicius_activity.class);
//                startActivity(vi);
//                break;

        btnAm = (Button) findViewById(R.id.btnAm);
        btnB = (Button) findViewById(R.id.btnB);
        btnBh = (Button) findViewById(R.id.btnBh);
        btnC = (Button) findViewById(R.id.btnC);

        btnL = (Button) findViewById(R.id.btnL);
        btnLf = (Button) findViewById(R.id.btnLf);
        btnM = (Button) findViewById(R.id.btnM);
        btnR = (Button) findViewById(R.id.btnR);
        btnRg = (Button) findViewById(R.id.btnRn);
        btnV = (Button) findViewById(R.id.btnV);
        btnS = (Button) findViewById(R.id.btnS);
        btnP = (Button) findViewById(R.id.btnP);
    }
}
