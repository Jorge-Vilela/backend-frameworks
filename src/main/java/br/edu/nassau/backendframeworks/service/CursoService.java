package br.edu.nassau.backendframeworks.service;

import org.springframework.stereotype.Service;

@Service
public class CursoService {

    public String pegarDisciplina(){
        return "Back-End Frameworks";
    }
    public String retornarcurso( ){
        return "Ciência da Computação";
    }



}
