package entregas.api.checklist.controller;


import entregas.api.checklist.dto.DtoCliente;
import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> findAll() {
        ArrayList<Cliente> clienteList = service.findAll();
        return ResponseEntity.ok(clienteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DtoCliente> findById(@PathVariable Long id) {
        Cliente cliente = service.findById(id);
        DtoCliente clienteDto;
        if(cliente.getDataVenda() != null) {
            clienteDto = new DtoCliente(cliente.getId(), cliente.getNome(), cliente.getMoto(),
                    cliente.getChassi(), cliente.getDataVenda().format(formatador), cliente.getDataEntrega().format(formatador));
        }else {
            clienteDto = new DtoCliente(cliente.getId(), cliente.getNome(), cliente.getMoto(),
                    cliente.getChassi());
        }
        return ResponseEntity.ok(clienteDto);
    }

    @PostMapping("/addCliente")
    public ResponseEntity<Cliente> createClient(@RequestBody Cliente cliente) {
        service.createCliente(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Cliente> editCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){

        service.editCliente(id, cliente);
        return ResponseEntity.ok(cliente);
    }


}
