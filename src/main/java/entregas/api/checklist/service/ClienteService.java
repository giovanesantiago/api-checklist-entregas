package entregas.api.checklist.service;

import entregas.api.checklist.exception.ClienteNotFoundException;
import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ListTarefas listTarefas;


    // Adicionar novo Cliente
    public String createCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        listTarefas.createListaTarefas(cliente);
        return "ok";
    }

    public Cliente findById(Long idCliente) {

        return clienteRepository.findById(idCliente).orElseThrow(() -> new ClienteNotFoundException(idCliente));
    }

    // Deletar Cliente
    public String deleteById(Long idCliente) {
        listTarefas.deleteTarefasCliente(idCliente);
        clienteRepository.deleteById(idCliente);
        return "nao ok";
    }

    // Editar cliente
    public String editCliente(Long idCliente, Cliente client) {
        Cliente cliente = findById(idCliente);
        System.out.println(cliente.toString());
        System.out.println(client.toString());
        if (cliente.getId().equals(client.getId())){
            if (!cliente.getNome().equals(client.getNome()))
                cliente.setNome(client.getNome());
            if (!cliente.getMoto().equals(client.getMoto()))
                cliente.setMoto(client.getMoto());
            if (!cliente.getChassi().equals(client.getChassi()))
                cliente.setChassi(client.getChassi());
            if (client.getDataVenda() != null) {
                cliente.setDataVenda(client.getDataVenda());
                if (client.getDataEntrega() != null) {
                    cliente.setDataEntrega(client.getDataEntrega());
                }else {
                    cliente.setDataEntrega(cliente.getDataVenda().plusDays(10));
                }
            }
        }
        clienteRepository.save(cliente);

        return "ok";
    }

    // Retornar Clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }



}
