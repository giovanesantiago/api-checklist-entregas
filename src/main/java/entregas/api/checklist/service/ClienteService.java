package entregas.api.checklist.service;

import entregas.api.checklist.dto.DtoCliente;
import entregas.api.checklist.exception.ClienteNotFoundException;
import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.model.Tarefa;
import entregas.api.checklist.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    private static final List<Cliente> listaClientes = new ArrayList<>();

    static {
        Cliente cliente1 = new Cliente(1L, "Giovane Santiago",
                "Meteor Fireball Red", "005858");
        Cliente cliente2 = new Cliente(2L, "Ana Clara", "Himalayan Preta", "505050");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
    }

    // Adicionar novo Cliente
    public String createCliente(Cliente cliente) {
        Cliente clienteAdd = new Cliente(cliente.getId(), cliente.getNome(),
                cliente.getMoto(), cliente.getChassi());
        clienteRepository.save(cliente);
        return "ok";
    }

    public Cliente findById(Long idCliente) {

        return clienteRepository.findById(idCliente).orElseThrow(() -> new ClienteNotFoundException(idCliente));
    }

    // Deletar Cliente
    public String deleteById(Long idCliente) {
        clienteRepository.deleteById(idCliente);
        return "nao ok";
    }

    // Editar cliente
    public String editCliente(Long idCliente, Cliente client) {
        Cliente cliente = findById(idCliente);
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

    public String atualizarTarefas(Long idCliente, int idTarefa, Tarefa tarefa) {
        Cliente cliente = findById(idCliente);
        int index = listaClientes.indexOf(cliente);
        Tarefa tarefaEdit = tarefa;
        listaClientes.get(index).getTarefas().get(idTarefa - 1).setNome(tarefaEdit.getNome());
        listaClientes.get(index).getTarefas().get(idTarefa - 1).setProcesso(tarefaEdit.getProcesso());
        listaClientes.get(index).getTarefas().get(idTarefa - 1).setFinalizado(tarefaEdit.getFinalizado());
        listaClientes.get(index).getTarefas().get(idTarefa - 1).setObs(tarefaEdit.getObs());
        return "ok";
    }

}
