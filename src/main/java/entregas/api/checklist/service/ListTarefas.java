package entregas.api.checklist.service;

import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListTarefas {

    @Autowired
    TarefaService tarefaService;

    public void createListaTarefas(Cliente cliente) {
        Tarefa prosposta = new Tarefa(1,  "Proposta", false, false,"", cliente);
        tarefaService.createTarefa(prosposta);
        Tarefa notaFiscal = new Tarefa(2 , "Nota Fiscal", false, false, "", cliente);
        tarefaService.createTarefa(notaFiscal);
        Tarefa solitacaoEstoque = new Tarefa(3 , "Solitacao Estoque", false, false, "", cliente);
        tarefaService.createTarefa(solitacaoEstoque);
        Tarefa bimEgravame = new Tarefa(4, "Bim e Gravame", false, false, "", cliente);
        tarefaService.createTarefa(bimEgravame);
        Tarefa motoLoja = new Tarefa(5 , "Moto na Loja", false, false, "", cliente);
        tarefaService.createTarefa(motoLoja);
        Tarefa bateria = new Tarefa(6 , "Bateria Ativa", false, false, "", cliente);
        tarefaService.createTarefa(bateria);
        Tarefa acessorios = new Tarefa(7, "Acessorios", false, false, "", cliente);
        tarefaService.createTarefa(acessorios);
        Tarefa teste = new Tarefa(8 , "Teste fun. da moto", false, false, "", cliente);
        tarefaService.createTarefa(teste);
        Tarefa manual = new Tarefa(9, "Manual Preenchido", false, false, "", cliente);
        tarefaService.createTarefa(manual);
        Tarefa placa = new Tarefa(10 , "Placa", false, false, "", cliente);
        tarefaService.createTarefa(placa);
        Tarefa termoEntrega = new Tarefa(11 , "Termo de Entrega", false, false, "", cliente);
        tarefaService.createTarefa(termoEntrega);

    }

    public void deleteTarefasCliente(Long idCliente) {
        List<Tarefa> ListTarefasCliente = tarefaService.findByAllCliente(idCliente);

        for (Tarefa tarefa: ListTarefasCliente ) {
            tarefaService.deleteTarefa(tarefa.getIdTarefa());
        }
    }

}
