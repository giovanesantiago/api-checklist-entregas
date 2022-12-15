package entregas.api.checklist.service;

import entregas.api.checklist.dto.DtoCliente;
import entregas.api.checklist.model.Cliente;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {

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
    public String editCliente(Long idCliente, DtoCliente client) {
        System.out.println(client);
        Cliente cliente = findById(idCliente);
        int index = listaClientes.indexOf(cliente);
        if (cliente.getId().equals(client.getId())){
            if (!cliente.getNome().equals(client.getNome()))
                cliente.setNome(client.getNome());
            if (!cliente.getMoto().equals(client.getMoto()))
                cliente.setMoto(client.getMoto());
            if (!cliente.getChassi().equals(client.getChassi()))
                cliente.setChassi(client.getChassi());
            if (client.getDataVenda() != null) {
                cliente.setDataVenda(LocalDate.parse(client.getDataVenda(),
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                if (client.getDataEntrega() != null) {
                    cliente.setDataEntrega(LocalDate.parse(client.getDataEntrega(),
                            DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }else {
                    cliente.setDataEntrega(cliente.getDataVenda().plusDays(10));
                }
            }


        }
        System.out.println(cliente);
        listaClientes.remove(index);
        listaClientes.add(cliente);

        return "ok";
    }

    // Retornar Clientes
    public ArrayList<Cliente> findAll() {
        return new ArrayList<>(listaClientes);
    }



}
