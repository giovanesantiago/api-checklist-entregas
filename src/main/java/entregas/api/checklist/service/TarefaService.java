package entregas.api.checklist.service;

import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.model.Tarefas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TarefaService {


    ClienteService service = new ClienteService();

    // pesquisar tarefa por id
    public Tarefas findById(int idTarefa, Long idCliente) {
        Cliente cliente = service.findById(idCliente);
        for (Tarefas tarefa: cliente.getTarefas()) {
            if (tarefa.getIdTarefa() == idTarefa) {
                return tarefa;
            }
        }
        return null;
    }

    // Editar tarefa
    public Tarefas editTarefa(int idTarefa, Long idCliente, Tarefas newTarefa) {
        Tarefas tarefa = findById(idTarefa, idCliente);
        if(tarefa.getIdTarefa() == newTarefa.getIdTarefa()){
            if (!tarefa.getProcesso().equals(newTarefa.getProcesso()))
                tarefa.setProcesso(newTarefa.getProcesso());
            if (!tarefa.getFinalizado().equals(newTarefa.getFinalizado()))
                tarefa.setFinalizado(newTarefa.getFinalizado());
            if (!tarefa.getObs().equals(newTarefa.getObs()))
                tarefa.setObs(newTarefa.getObs());
        }

        return tarefa;
    }

    // Retorna lista de tarefas
    public ArrayList<Tarefas> findAll(Long idCliente) {
        Cliente cliente = service.findById(idCliente);
        return new ArrayList<>(cliente.getTarefas());
    }

}
