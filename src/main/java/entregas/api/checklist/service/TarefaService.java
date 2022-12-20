package entregas.api.checklist.service;

import entregas.api.checklist.model.Tarefa;
import entregas.api.checklist.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {


    @Autowired
    TarefaRepository tarefaRepository;

    public String createTarefa(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return "ok";
    }

    public String deleteTarefa(Integer idTarefa) {
        tarefaRepository.deleteById(idTarefa);
        return "ok";
    }

    // pesquisar tarefa por id
    public Tarefa findByOne(Integer idTarefa, Integer idSequencia, Long idCliente) {
        List<Tarefa> listTarefa = tarefaRepository.findAll();
        for (Tarefa tarefa: listTarefa) {
            if(tarefa.getIdTarefa().equals(idTarefa) && tarefa.getIdSequencia().equals(idSequencia) && tarefa.getCliente().getId().equals(idCliente)){
                return tarefa;
            }
        }
        return null;
    }
    public List<Tarefa> findByAllCliente( Long idCliente) {
        List<Tarefa> listTodasTarefa = tarefaRepository.findAll();
        List<Tarefa> listTarefasCliente = new ArrayList<>();
        for (Tarefa tarefa: listTodasTarefa) {
            if(tarefa.getCliente().getId().equals(idCliente)){
                listTarefasCliente.add(tarefa);
            }
        }
        return listTarefasCliente;
    }


    // Editar tarefa
    public void editTarefa(Integer idTarefa, Integer idSequencia, Long idCliente, Tarefa newTarefa) {
        Tarefa tarefa = findByOne(idTarefa, idSequencia, idCliente);
        if(tarefa.getIdTarefa().equals(newTarefa.getIdTarefa())){
            if (!tarefa.getProcesso().equals(newTarefa.getProcesso()))
                tarefa.setProcesso(newTarefa.getProcesso());
            if (!tarefa.getFinalizado().equals(newTarefa.getFinalizado()))
                tarefa.setFinalizado(newTarefa.getFinalizado());
            if (!tarefa.getObs().equals(newTarefa.getObs()))
                tarefa.setObs(newTarefa.getObs());
        }

        tarefaRepository.save(tarefa);

    }

    // Retorna lista de tarefas
    /*public ArrayList<Tarefa> findAll(Long idCliente) {
        Cliente cliente = clienteService.findById(idCliente);

        return new ArrayList<>(cliente.getTarefas());
    }*/

}
