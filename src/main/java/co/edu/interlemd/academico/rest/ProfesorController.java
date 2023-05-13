package co.edu.interlemd.academico.rest;
import java.util.List;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.interlemd.academico.Entidades.Profesor;
@RestController

public class ProfesorController {
  private List<Profesor> lista = new  ArrayList<Profesor>();

    @GetMapping("/api/profesores/prueba")
    public List<Profesor> getTodos(){
      return lista;
 }
}
