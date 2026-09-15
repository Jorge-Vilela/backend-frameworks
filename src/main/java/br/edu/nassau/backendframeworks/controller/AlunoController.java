package br.edu.nassau.backendframeworks.controller;

import br.edu.nassau.backendframeworks.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }
@GetMapping("/Aluno")
    public String getAluno(){
        return alunoService.pegarMatricula();
}

}
