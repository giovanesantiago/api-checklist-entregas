package entregas.api.checklist;
import static org.junit.jupiter.api.Assertions.*;

import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.service.ClienteService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TestCliente {

    @Test
    void validarNovoCliente(){
        Cliente cliente1 = new Cliente(1L, "Cliente1", "Moto 1", "005566");
        Cliente cliente2 = new Cliente(2L, "Cliente2", "Moto 2", "000067");

        // Testando criação de cliente
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        assertNotEquals(cliente1, cliente2);

        // Testando se cada cliente criado ja esta criando a lista de tarefas

        // Testando id
        // Cliente 1
        assertEquals(cliente1.getTarefas().get(0).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(1).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(2).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(3).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(4).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(5).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(6).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(7).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(8).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(9).getIdCliente(), 1L);
        assertEquals(cliente1.getTarefas().get(10).getIdCliente(), 1L);
        // Cliente 2
        assertEquals(cliente2.getTarefas().get(0).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(1).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(2).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(3).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(4).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(5).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(6).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(7).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(8).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(9).getIdCliente(), 2L);
        assertEquals(cliente2.getTarefas().get(10).getIdCliente(), 2L);

        // Testando nome
        // Cliente 1
        assertEquals(cliente1.getTarefas().get(0).getNome(), "Proposta");
        assertEquals(cliente1.getTarefas().get(1).getNome(), "Nota Fiscal");
        assertEquals(cliente1.getTarefas().get(2).getNome(), "Solitacao Estoque");
        assertEquals(cliente1.getTarefas().get(3).getNome(), "Bim e Gravame");
        assertEquals(cliente1.getTarefas().get(4).getNome(), "Moto na Loja");
        assertEquals(cliente1.getTarefas().get(5).getNome(), "Bateria Ativa");
        assertEquals(cliente1.getTarefas().get(6).getNome(), "Acessorios");
        assertEquals(cliente1.getTarefas().get(7).getNome(), "Teste fun. da moto");
        assertEquals(cliente1.getTarefas().get(8).getNome(), "Manual Preenchido");
        assertEquals(cliente1.getTarefas().get(9).getNome(), "Placa");
        assertEquals(cliente1.getTarefas().get(10).getNome(), "Termo de Entrega");
        // Cliente 2
        assertEquals(cliente2.getTarefas().get(0).getNome(), "Proposta");
        assertEquals(cliente2.getTarefas().get(1).getNome(), "Nota Fiscal");
        assertEquals(cliente2.getTarefas().get(2).getNome(), "Solitacao Estoque");
        assertEquals(cliente2.getTarefas().get(3).getNome(), "Bim e Gravame");
        assertEquals(cliente2.getTarefas().get(4).getNome(), "Moto na Loja");
        assertEquals(cliente2.getTarefas().get(5).getNome(), "Bateria Ativa");
        assertEquals(cliente2.getTarefas().get(6).getNome(), "Acessorios");
        assertEquals(cliente2.getTarefas().get(7).getNome(), "Teste fun. da moto");
        assertEquals(cliente2.getTarefas().get(8).getNome(), "Manual Preenchido");
        assertEquals(cliente2.getTarefas().get(9).getNome(), "Placa");
        assertEquals(cliente2.getTarefas().get(10).getNome(), "Termo de Entrega");

        // Testando Boolean
        // Cliente 1
        assertEquals(cliente1.getTarefas().get(0).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(0).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(1).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(1).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(2).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(2).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(3).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(3).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(4).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(4).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(5).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(5).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(6).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(6).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(7).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(7).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(8).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(8).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(9).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(9).getProcesso(), false);
        assertEquals(cliente1.getTarefas().get(10).getFinalizado(), false);
        assertEquals(cliente1.getTarefas().get(10).getProcesso(), false);
        // Cliente 2
        assertEquals(cliente2.getTarefas().get(0).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(0).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(1).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(1).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(2).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(2).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(3).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(3).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(4).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(4).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(5).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(5).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(6).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(6).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(7).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(7).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(8).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(8).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(9).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(9).getProcesso(), false);
        assertEquals(cliente2.getTarefas().get(10).getFinalizado(), false);
        assertEquals(cliente2.getTarefas().get(10).getProcesso(), false);

        // Testando Observação
        // Cliente 1
        assertEquals(cliente1.getTarefas().get(0).getObs(), "");
        assertEquals(cliente1.getTarefas().get(1).getObs(), "");
        assertEquals(cliente1.getTarefas().get(2).getObs(), "");
        assertEquals(cliente1.getTarefas().get(3).getObs(), "");
        assertEquals(cliente1.getTarefas().get(4).getObs(), "");
        assertEquals(cliente1.getTarefas().get(5).getObs(), "");
        assertEquals(cliente1.getTarefas().get(6).getObs(), "");
        assertEquals(cliente1.getTarefas().get(7).getObs(), "");
        assertEquals(cliente1.getTarefas().get(8).getObs(), "");
        assertEquals(cliente1.getTarefas().get(9).getObs(), "");
        assertEquals(cliente1.getTarefas().get(10).getObs(), "");
        // Cliente 2
        assertEquals(cliente2.getTarefas().get(0).getObs(), "");
        assertEquals(cliente2.getTarefas().get(1).getObs(), "");
        assertEquals(cliente2.getTarefas().get(2).getObs(), "");
        assertEquals(cliente2.getTarefas().get(3).getObs(), "");
        assertEquals(cliente2.getTarefas().get(4).getObs(), "");
        assertEquals(cliente2.getTarefas().get(5).getObs(), "");
        assertEquals(cliente2.getTarefas().get(6).getObs(), "");
        assertEquals(cliente2.getTarefas().get(7).getObs(), "");
        assertEquals(cliente2.getTarefas().get(8).getObs(), "");
        assertEquals(cliente2.getTarefas().get(9).getObs(), "");
        assertEquals(cliente2.getTarefas().get(10).getObs(), "");

    }

    @Test
    void testServiceCliente() {

        ClienteService service = new ClienteService();
        Cliente cliente1 = new Cliente(3L, "Cliente1", "Moto 1", "005566");
        Cliente cliente2 = new Cliente(4L, "Cliente2", "Moto 2", "000067");
        // Criando novos Cliente
        service.createCliente(cliente1);
        service.createCliente(cliente2);
        // Listando clientes
        ArrayList<Cliente> listCliente = service.findAll();
        // Testando lista de cadastro
        assertEquals(listCliente.get(0).getId(), 1L);
        assertEquals(listCliente.get(1).getId(), 2L);
        assertEquals(listCliente.get(2).getId(), cliente1.getId());
        assertEquals(listCliente.get(3).getId(), cliente2.getId());

        // Pesquisando pelo id
        Cliente clientePesquisa = service.findById(3L);
        // Testanto pesquisa
        assertEquals(clientePesquisa.getNome(), cliente1.getNome());

        // Deletando Cliente
        String resultado = service.deleteById(4L);
        // Testando delete
        assertEquals(resultado, "ok");
        assertEquals(service.findAll().size(), 3);

        // Editando nome
        cliente1.setNome("NovoNome");
        service.editCliente(3L, cliente1);
        // Testando Edição
        assertEquals(service.findById(3L).getNome(), "NovoNome");
        // Verificando se so editou o nome
        assertEquals(service.findById(3L).getMoto(), "Moto 1");
        assertEquals(service.findById(3L).getChassi(), "005566");
        assertNull(service.findById(3L).getDataVenda());
        assertNull(service.findById(3L).getDataEntrega());

        // Editando moto
        cliente1.setMoto("moto 2");
        service.editCliente(3L, cliente1);
        // Testando Edição
        assertEquals(service.findById(3L).getMoto(), "moto 2");
        // Verificando se so editou a moto
        assertEquals(service.findById(3L).getNome(), "NovoNome");
        assertEquals(service.findById(3L).getChassi(), "005566");
        assertNull(service.findById(3L).getDataVenda());
        assertNull(service.findById(3L).getDataEntrega());

        // Editando chassi
        cliente1.setChassi("11111");
        service.editCliente(3L, cliente1);
        // Testando Edição
        assertEquals(service.findById(3L).getChassi(), "11111");
        // Verificando se so editou a chassi
        assertEquals(service.findById(3L).getNome(), "NovoNome");
        assertEquals(service.findById(3L).getMoto(), "moto 2");
        assertNull(service.findById(3L).getDataVenda());
        assertNull(service.findById(3L).getDataEntrega());

    }

}
