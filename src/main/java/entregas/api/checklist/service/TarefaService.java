package entregas.api.checklist.service;

import entregas.api.checklist.model.Cliente;
import entregas.api.checklist.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TarefaService {


    @Autowired
    ClienteService service;

    // pesquisar tarefa por id
    public Tarefa findById(int idTarefa, Long idCliente) {
        Cliente cliente = service.findById(idCliente);
        for (Tarefa tarefa: cliente.getTarefas()) {
            if (tarefa.getIdTarefa() == idTarefa) {
                return tarefa;
            }
        }
        return null;
    }

    // Editar tarefa
    public void editTarefa(int idTarefa, Long idCliente, Tarefa newTarefa) {
        Tarefa tarefa = findById(idTarefa, idCliente);
        if(tarefa.getIdTarefa() == newTarefa.getIdTarefa()){
            if (!tarefa.getProcesso().equals(newTarefa.getProcesso()))
                tarefa.setProcesso(newTarefa.getProcesso());
            if (!tarefa.getFinalizado().equals(newTarefa.getFinalizado()))
                tarefa.setFinalizado(newTarefa.getFinalizado());
            if (!tarefa.getObs().equals(newTarefa.getObs()))
                tarefa.setObs(newTarefa.getObs());
        }
        service.atualizarTarefas(idCliente, idTarefa, tarefa);

    }

    // Retorna lista de tarefas
    public ArrayList<Tarefa> findAll(Long idCliente) {
        Cliente cliente = service.findById(idCliente);
        return new ArrayList<>(cliente.getTarefas());
    }

}
