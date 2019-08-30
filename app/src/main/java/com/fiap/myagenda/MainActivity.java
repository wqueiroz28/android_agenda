package com.fiap.myagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex" ,"Jose", "Felipe" , "Maria" ,"Ana"));

       ListView listaDeAlunos = findViewById(R.id.lista_de_alunos);

       listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, simple_list_item_1,alunos));


    }






}
