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
    public String editCliente(@PathVariable("id") Long id, @RequestBody DtoCliente cliente){

        service.editCliente(id, cliente);
        return "ok";
    }


}
