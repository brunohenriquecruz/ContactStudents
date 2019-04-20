package com.example.brunohenrique.contactstudents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Renan extends AppCompatActivity implements Toolbar.OnMenuItemClickListener{

    ListView lvCompetencias, lvContatos;
    TextView tvMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renan);


        tvMenu = (TextView) findViewById(R.id.tvMenu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        lvCompetencias = (ListView) findViewById(R.id.lvComp);
        String[] competencias = {"Back-End", "API", "Front-End"};
        ArrayAdapter<String> adapterCompetencias = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, competencias);
        lvCompetencias.setAdapter(adapterCompetencias);

        lvContatos = (ListView) findViewById(R.id.lvCont);
        String[] contatos = {"Coordenador", "Líder", "Professor"};
        ArrayAdapter<String> adapterContatos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);
        lvContatos.setAdapter(adapterContatos);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String texto = "";
        Intent i;
        switch (item.getItemId()) {
            case R.id.menu_add:
                texto = "EM BREVE";
                i = new Intent(this, NextScreen.class);
                startActivity(i);
                return false;
            case R.id.menu_ed:
                texto = "LISTAR";
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                return false;
            case R.id.menu_del:
                i = new Intent(this, NextScreen.class);
                startActivity(i);
                return false;
            case R.id.menu_help:
                texto = "AJUDA";
                i = new Intent(this, Bruno.class);
                startActivity(i);
                return false;
            case android.R.id.home:
                texto = "ICONE";
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;
        }
        tvMenu.setText(texto);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        String texto = "";
        Intent i;
        switch (menuItem.getItemId()) {
            case R.id.menu_add:
                texto = "ADICIONAR";
                i = new Intent(this, NextScreen.class);
                startActivity(i);
                return false;
            case R.id.menu_ed:
                texto = "LISTAR";
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                return false;
            case R.id.menu_del:
                i = new Intent(this, NextScreen.class);
                startActivity(i);
                return false;
            case R.id.menu_help:
                texto = "AJUDA";
                i = new Intent(this, Bruno.class);
                startActivity(i);
                return false;
            case android.R.id.home:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                return false;
        }
        tvMenu.setText(texto);
        return false;
    }
}
