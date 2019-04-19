package com.example.brunohenrique.contactstudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.BreakIterator;

public class NextScreen extends AppCompatActivity implements OnMenuItemClickListener {

    TextView tvMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        tvMenu = (TextView) findViewById(R.id.tvMenu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbBack);
        toolbar.inflateMenu(R.menu.activity_menu);
        toolbar.setTitle("Atalho");
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setOnMenuItemClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String texto = "";
        switch (item.getItemId()) {
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
                texto = "Redirecionado";
                break;
        }
        tvMenu.setText(texto);

        return super.onOptionsItemSelected(item);
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
