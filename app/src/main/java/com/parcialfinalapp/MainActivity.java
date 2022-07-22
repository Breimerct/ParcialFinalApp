package com.parcialfinalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Program> programList;
    RecyclerView programRecyclerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        programList = new ArrayList<>();
        programRecyclerList = findViewById(R.id.rvProgramList);
        programRecyclerList.setLayoutManager(new LinearLayoutManager(this));

        addPrograms();

        Adaptador adapterPrograms = new Adaptador(programList);
        programRecyclerList.setAdapter(adapterPrograms);
    }

    private void addPrograms() {
        programList.add(new Program("Ing. De Software", "El graduado de la carrera en Software estará en capacidad de: Aplicar teorías, metodologías, estándares y tecnologías apropiadas, para crear soluciones de software, mediante el análisis, diseño, desarrollo, implementación, verificación, documentación, y gestión.", R.drawable.ing_de_software));
        programList.add(new Program("Ing. De Sistemas", "Los titulados en esta rama de la ingeniería adquieren las siguientes responsabilidades: Diseñar, programar, aplicar y mantener sistemas informáticos. Administrar redes y sistemas de información. Optimizar los datos que maneja una empresa", R.drawable.ing_de_sistemas));
        programList.add(new Program("Ing. De Alimentos", "El Ingeniero en Alimentos diseña, supervisa y controla procesos de fabricación y conservación de productos alimenticios. Determina las condiciones óptimas de operación del equipo utilizados en el proceso de producción. Realiza control de calidad de productos alimenticios.", R.drawable.ing_de_alimentos));
        programList.add(new Program("Ing. Quimica", "Esta disciplina reúne conocimientos y habilidades de la química y las aplica al ámbito de la ingeniería. En otras palabras, estudia los materiales para después transformarlos en productos de consumo. También se dedican a diseñar nuevos procesos que faciliten la producción y costos de manufactura.", R.drawable.ing_quimica));
        programList.add(new Program("Ing. Civil", "Un Ingeniero Civil es un profesionista que cuenta con los conocimientos y habilidades para resolver problemas que tienen que ver con el desarrollo de la infraestructura de grandes poblaciones urbanas así como de algunas comunidades rurales para eficientar las vías de comunicación de la población.", R.drawable.ing_civil));
        programList.add(new Program("Administracion De Empresas", "El administrador de empresas puede trabajar en cualquier tipo de empresa, ya sea que se trate del sector público, privado o social (ONG o fundaciones), siempre que exista un equipo con un proyecto y con recursos que se deban gestionar para ayudar a alcanzar el fin de esa organización, la labor de un administrador será vigente y este podrá coordinar, organizar, planear y dirigir estrategias que impacten la manera de lograr los objetivos propuestos.", R.drawable.admin_de_empresas));
        programList.add(new Program("Historia", "La Carrera de Historia forma profesionales capaces de entender el contexto actual en función al conocimiento que adquirieron sobre pasados acontecimientos culturales y sociales. Es la profesión ideal para quienes sientan curiosidad sobre por qué los fenómenos de masas actúan como lo hacen.", R.drawable.historia));
        programList.add(new Program("Filosofía", "La función de la filosofía es aclararnos sobre lo que es el mundo en su integridad y el hombre en su integridad vital. \"El problema radical de la filosofía es definir ese modo de ser, esa realidad primaria que llamamos nuestra vida\".", R.drawable.filosofia));
        programList.add(new Program("Medicina", "La carrera de medicina es una licenciatura mejor conocida como medicina general, desarrollando a un profesionista capaz de realizar diagnósticos, tratar, cuidar y atender clínicamente al ser humano. ¿Cuánto dura? La carrera de medicina puede durar entre 6 y 8 años dependiendo la universidad donde se estudie.", R.drawable.medicina));
        programList.add(new Program("Economía", "Al hacer estudios de Economía, además de aprender sobre la producción y distribución de bienes, servicios y medios para satisfacer los requerimientos de la población. También recibirás una amplia perspectiva social sobre los vínculos e intercambios, y un razonamiento lógico que podrás aplicar en diversos ámbitos.", R.drawable.economia));
    }
}