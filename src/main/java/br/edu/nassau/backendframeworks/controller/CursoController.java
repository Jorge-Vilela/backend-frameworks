package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CursoService;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

@GetMapping("/disciplina")
    public String getDisciplina(){
        return cursoService.pegarDisciplina();
    }
@GetMapping("/curso")
public String getCurso(){
        return cursoService.retornarcurso();
}



}
