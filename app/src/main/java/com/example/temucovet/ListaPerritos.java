package com.example.temucovet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPerritos extends AppCompatActivity {
    daoContacto dao;
    Adaptador adapter;
    ArrayList<Contacto>lista;
    Contacto c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_perritos);

        dao = new daoContacto(ListaPerritos.this);
        lista=dao.verTodo();
        adapter=new Adaptador(this, lista, dao);
        ListView list = findViewById(R.id.lista);
        Button insertar = findViewById(R.id.btn_insertar);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Dialogo para ver vista previa de registro
            }
        });
        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(ListaPerritos.this);
                dialog.setTitle("Nuevo registro");
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialogo);
                dialog.show();

                final EditText nombreperro = dialog.findViewById(R.id.et_nombreperro);
                final EditText raza = dialog.findViewById(R.id.et_razaperro);
                final EditText nombredueno = dialog.findViewById(R.id.et_nombredueno);
                final EditText telefono = dialog.findViewById(R.id.et_telefono);
                final EditText historialclinico = dialog.findViewById(R.id.et_historialclinico);

                Button guardar = dialog.findViewById(R.id.btn_agregar);
                guardar.setText("Agregar");
                Button cancelar = dialog.findViewById(R.id.btn_cancelar);

                guardar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            c = new Contacto(nombreperro.getText().toString(),
                                    raza.getText().toString(),
                                    nombredueno.getText().toString(),
                                    telefono.getText().toString(),
                                    historialclinico.getText().toString());
                            dao.insertar(c);
                            lista=dao.verTodo();
                            adapter.notifyDataSetChanged();
                            dialog.dismiss();
                        }catch (Exception e){
                            Toast.makeText(getApplication(),"ERROR", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                cancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }
public void volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
}
}