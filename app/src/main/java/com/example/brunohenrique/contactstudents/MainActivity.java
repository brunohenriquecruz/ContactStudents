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

        btnAm = (Button) findViewById(R.id.btnAm);
        btnAm.setOnClickListener(this);

        btnB = (Button) findViewById(R.id.btnB);
        btnB.setOnClickListener(this);

        btnBh = (Button) findViewById(R.id.btnBh);
        btnBh.setOnClickListener(this);

        btnC = (Button) findViewById(R.id.btnC);
        btnC.setOnClickListener(this);

        btnL = (Button) findViewById(R.id.btnL);
        btnL.setOnClickListener(this);

        btnLf = (Button) findViewById(R.id.btnLf);
        btnLf.setOnClickListener(this);

        btnM = (Button) findViewById(R.id.btnM);
        btnM.setOnClickListener(this);

        btnR = (Button) findViewById(R.id.btnR);
        btnR.setOnClickListener(this);

        btnRg = (Button) findViewById(R.id.btnRn);
        btnRg.setOnClickListener(this);

        btnV = (Button) findViewById(R.id.btnV);
        btnV.setOnClickListener(this);

        btnS = (Button) findViewById(R.id.btnS);
        btnS.setOnClickListener(this);

        btnP = (Button) findViewById(R.id.btnP);
        btnP.setOnClickListener(this);

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

            case R.id.btnB:
                i = new Intent(MainActivity.this, Breno.class);
                startActivity(i);
                break;

            case R.id.btnBh:
                i = new Intent(MainActivity.this, Bruno.class);
                startActivity(i);
                break;

            case R.id.btnLf:
                i = new Intent(MainActivity.this, luis.class);
                startActivity(i);
                break;

            case R.id.btnL:
                i = new Intent(MainActivity.this, Lauro.class);
                startActivity(i);
                break;

            case R.id.btnV:
                i = new Intent(MainActivity.this, Vinicius.class);
                startActivity(i);
                break;

            case R.id.btnS:
                i = new Intent(MainActivity.this, Samuel.class);
                startActivity(i);
                break;

            case R.id.btnC:
                i = new Intent(MainActivity.this, Camilo.class);
                startActivity(i);
                break;

            case R.id.btnR:
                i = new Intent(MainActivity.this, Regis.class);
                startActivity(i);
                break;

            case R.id.btnRn:
                i = new Intent(MainActivity.this, Renan.class);
                startActivity(i);
                break;

            case R.id.btnP:
                i = new Intent(MainActivity.this, Pedro.class);
                startActivity(i);
                break;

            case R.id.btnAm:
                i = new Intent(MainActivity.this, Angelo.class);
                startActivity(i);
                break;

            case R.id.btnM:
                i = new Intent(MainActivity.this, Marcello.class);
                startActivity(i);
                break;
        }






    }
}
