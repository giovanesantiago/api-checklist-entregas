package entregas.api.checklist;
import static org.junit.jupiter.api.Assertions.*;

import entregas.api.checklist.model.Cliente;
import org.junit.jupiter.api.Test;


public class TestCliente {

    @Test
    void validarNovoCliente(){
        Cliente cliente1 = new Cliente(1L, "Cliente1", "Moto 1", 005566);
        Cliente cliente2 = new Cliente(2L, "Cliente2", "Moto 2", 000067);

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

    }

}
