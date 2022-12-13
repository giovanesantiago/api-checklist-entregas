package entregas.api.checklist.controller;

import entregas.api.checklist.model.Tarefa;
import entregas.api.checklist.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    TarefaService service;

    @GetMapping("/{id}")
    public ResponseEntity<ArrayList<Tarefa>> findAll(@PathVariable Long id) {
        ArrayList<Tarefa> tarefasList = service.findAll(id);
        return ResponseEntity.ok(tarefasList);
    }

    @GetMapping("/{idCliente}/{idTarefa}")
    public ResponseEntity<Tarefa> findById(@PathVariable("idTarefa") int idTarefa,
                                           @PathVariable("idCliente") Long idCLiente){
        Tarefa tarefa = service.findById(idTarefa, idCLiente);
        return ResponseEntity.ok(tarefa);
    }

    @PostMapping("/editTarefa/{idCliente}/{idTarefa}")
    public String editTarefa(@PathVariable("idTarefa") int idTarefa,
                             @PathVariable("idCliente") Long idCliente,
                             @RequestBody Tarefa newTarefa){

        service.editTarefa(idTarefa, idCliente, newTarefa);
        return "ok";
    }

}
