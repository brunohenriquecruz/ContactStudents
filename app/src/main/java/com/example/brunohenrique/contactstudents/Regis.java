package com.example.brunohenrique.contactstudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Regis extends AppCompatActivity implements Toolbar.OnMenuItemClickListener{

    ListView lvCompetencias, lvContatos;
    TextView tvMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);


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
}
