package entregas.api.checklist.controller;

import entregas.api.checklist.model.Tarefa;
import entregas.api.checklist.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    TarefaService service;


    @GetMapping("/{id}")
    public ResponseEntity<List<Tarefa>> findAll(@PathVariable Long id) {
        List<Tarefa> tarefasList = service.findByAllCliente(id);
        return ResponseEntity.ok(tarefasList);
    }

    @GetMapping("/{idTarefa}/{idSequencia}/{idCliente}")
    public ResponseEntity<Tarefa> findByOne(@PathVariable("idTarefa") Integer idTarefa,
                                           @PathVariable("idSequencia") Integer idSequencia,
                                           @PathVariable("idCliente") Long idCLiente){
        Tarefa tarefa = service.findByOne(idTarefa, idSequencia, idCLiente);
        return ResponseEntity.ok(tarefa);
    }

    @PostMapping("/editTarefa//{idTarefa}/{idSequencia}/{idCliente}")
    public ResponseEntity<Tarefa> editTarefa(@PathVariable("idTarefa") Integer idTarefa,
                                             @PathVariable("idSequencia") Integer idSequencia,
                                             @PathVariable("idCliente") Long idCLiente,
                                             @RequestBody Tarefa newTarefa){

        service.editTarefa(idTarefa, idSequencia, idCLiente, newTarefa);
        return ResponseEntity.ok(newTarefa);
    }

}
