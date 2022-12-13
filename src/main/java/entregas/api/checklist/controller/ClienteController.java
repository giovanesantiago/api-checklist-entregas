package entregas.api.checklist.controller;


import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> findAll() {
        ArrayList<Cliente> clienteList = service.findAll();
        return ResponseEntity.ok(clienteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente cliente = service.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping("/addCliente")
    public String createClient(@RequestBody Cliente cliente) {
        service.createCliente(cliente);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return "ok";
    }

    @PostMapping("/edit/{id}")
    public String editCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        service.editCliente(id, cliente);
        return "ok";
    }


}
