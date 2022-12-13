package entregas.api.checklist;

import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.model.Tarefa;
import entregas.api.checklist.service.ClienteService;
import entregas.api.checklist.service.TarefaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTarefas {

    @Test
    void testTarefaService(){

        TarefaService serviceTarefas = new TarefaService();
        ClienteService serviceCliente = new ClienteService();
        Cliente cliente1 = new Cliente(3L, "Cliente1", "Moto 1", "005566");
        Cliente cliente2 = new Cliente(4L, "Cliente2", "Moto 2", "000067");
        serviceCliente.createCliente(cliente1);
        serviceCliente.createCliente(cliente2);

        // Testando pesquisa de tarefas
        assertEquals(serviceTarefas.findById(1, 3L).getNome(), "Proposta");
        assertEquals(serviceTarefas.findById(2, 3L).getNome(), "Nota Fiscal");
        assertEquals(serviceTarefas.findById(3, 3L).getNome(), "Solitacao Estoque");
        assertEquals(serviceTarefas.findById(4, 3L).getNome(), "Bim e Gravame");
        assertEquals(serviceTarefas.findById(5, 3L).getNome(), "Moto na Loja");
        assertEquals(serviceTarefas.findById(6, 3L).getNome(), "Bateria Ativa");
        assertEquals(serviceTarefas.findById(7, 3L).getNome(), "Acessorios");
        assertEquals(serviceTarefas.findById(8, 3L).getNome(), "Teste fun. da moto");
        assertEquals(serviceTarefas.findById(9, 3L).getNome(), "Manual Preenchido");
        assertEquals(serviceTarefas.findById(10, 3L).getNome(), "Placa");
        assertEquals(serviceTarefas.findById(11, 3L).getNome(), "Termo de Entrega");
        // Cliente 2
        assertEquals(serviceTarefas.findById(1, 4L).getNome(), "Proposta");
        assertEquals(serviceTarefas.findById(2, 4L).getNome(), "Nota Fiscal");
        assertEquals(serviceTarefas.findById(3, 4L).getNome(), "Solitacao Estoque");
        assertEquals(serviceTarefas.findById(4, 4L).getNome(), "Bim e Gravame");
        assertEquals(serviceTarefas.findById(5, 4L).getNome(), "Moto na Loja");
        assertEquals(serviceTarefas.findById(6, 4L).getNome(), "Bateria Ativa");
        assertEquals(serviceTarefas.findById(7, 4L).getNome(), "Acessorios");
        assertEquals(serviceTarefas.findById(8, 4L).getNome(), "Teste fun. da moto");
        assertEquals(serviceTarefas.findById(9, 4L).getNome(), "Manual Preenchido");
        assertEquals(serviceTarefas.findById(10, 4L).getNome(), "Placa");
        assertEquals(serviceTarefas.findById(11, 4L).getNome(), "Termo de Entrega");

        // Teste de edição
        Long idCliente;
        // Cliente 1
        // Fazendo um for para testar todas as tarefas
        for (int i = 0; i < 11; i++) {
            idCliente = 3L;
            Tarefa newtarefa = serviceTarefas.findById(i+1, idCliente);
            // Editando processo
            newtarefa.setProcesso(true);
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getProcesso(), true);
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getProcesso(), true);
            // Editando finalizado
            newtarefa.setFinalizado(true);
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getFinalizado(), true);
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getFinalizado(), true);
            // Editando OBS
            newtarefa.setObs("ok");
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getObs(), "ok");
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getObs(), "ok");

        }

        // Cliente 2
        // Fazendo um for para testar todas as tarefas
        for (int i = 0; i < 11; i++) {
            idCliente = 4L;
            Tarefa newtarefa = serviceTarefas.findById(i+1, idCliente);
            // Editando processo
            newtarefa.setProcesso(true);
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getProcesso(), true);
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getProcesso(), true);
            // Editando finalizado
            newtarefa.setFinalizado(true);
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getFinalizado(), true);
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getFinalizado(), true);
            // Editando OBS
            newtarefa.setObs("ok");
            serviceTarefas.editTarefa(i+1, idCliente, newtarefa);
            // Testando edição
            assertEquals(serviceTarefas.findById(i+1, idCliente).getObs(), "ok");
            assertEquals(serviceCliente.findById(idCliente).getTarefas().get(i).getObs(), "ok");
        }

        // testando retorno de lista de tarefas - Conferir no console
        System.out.println(serviceTarefas.findAll(3L));
        System.out.println(serviceTarefas.findAll(4L));

    }
}
