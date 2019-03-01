package com.example.juan.proyectofinal;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        FragmentoPrincipal mifragmento=new FragmentoPrincipal();
        mitransaccion.add(R.id.ContenedorFragmento,mifragmento);
        mitransaccion.commit();

    }


    public void cambiarfragmento(View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        FragmentoAgregar mifragmento1=new FragmentoAgregar();
        mitransaccion.replace(R.id.ContenedorFragmento,mifragmento1);
        mitransaccion.commit();
    }

    public void cambiarfragmento1(View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        FragmentoPrincipal mifragmento1=new FragmentoPrincipal();
        mitransaccion.replace(R.id.ContenedorFragmento,mifragmento1);
        mitransaccion.commit();
    }

    public void cambiarfragmento2(View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        FragmentoBuscar mifragmento1=new FragmentoBuscar();
        mitransaccion.replace(R.id.ContenedorFragmento,mifragmento1);
        mitransaccion.commit();
    }

    public void cambiarfragmento3(View v){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        FragmentoEncontrar mifragmento1=new FragmentoEncontrar();
        mitransaccion.replace(R.id.ContenedorFragmento,mifragmento1);
        mitransaccion.commit();
    }

}
