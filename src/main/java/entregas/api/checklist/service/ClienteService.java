package entregas.api.checklist.service;

import entregas.api.checklist.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {

    private static final List<Cliente> listaClientes = new ArrayList<>();

    static {
        Cliente cliente1 = new Cliente(1L, "Giovane", "Meteor Fireball Red", "005858");
        Cliente cliente2 = new Cliente(2L, "Ana Clara", "Himalayan Preta", "505050");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
    }

    // Adicionar novo Cliente
    public String createCliente(Cliente cliente) {
        Cliente clienteAdd = new Cliente(cliente.getId(), cliente.getNome(),
                cliente.getMoto(), cliente.getChassi());
        listaClientes.add(clienteAdd);
        return "ok";
    }

    public Cliente findById(Long idCliente) {
        for (Cliente entry: listaClientes) {
            if(entry.getId().equals(idCliente)){
                return entry;
            }
        }
        return null;
    }

    // Deletar Cliente
    public String deleteById(Long idCliente) {
        Cliente clienteDelete = new Cliente();
        clienteDelete = findById(idCliente);
        if (clienteDelete != null){
            listaClientes.remove(clienteDelete);
            return "ok";
        }
        return "nao ok";
    }

    // Editar cliente
    public Cliente editCliente(Long idCliente, Cliente client) {
        Cliente cliente = findById(idCliente);
        int index = listaClientes.indexOf(cliente);
        if (cliente.getId().equals(client.getId())){
            if (!cliente.getNome().equals(client.getNome()))
                cliente.setNome(client.getNome());
            if (!cliente.getMoto().equals(client.getMoto()))
                cliente.setMoto(client.getMoto());
            if (!cliente.getChassi().equals(client.getChassi()))
                cliente.setChassi(client.getChassi());
            if(cliente.getDataVenda() != null){
                if (!cliente.getDataVenda().equals(client.getDataVenda())) {
                    cliente.setDataEntrega(client.getDataEntrega());
                    cliente.setDataEntrega(cliente.getDataVenda().plusDays(10));
                }
            }
        }

        listaClientes.remove(index);
        listaClientes.add(cliente);
        return cliente;
    }

    // Retornar Clientes
    public ArrayList<Cliente> findAll() {
        return new ArrayList<>(listaClientes);
    }



}
