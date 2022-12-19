package entregas.api.checklist.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "tab_cliente")
public class Cliente {

    @Id
    @Column(name = "idCliente")
    private Long id;
    private String nome;
    private String moto;
    private String chassi;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataVenda;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataEntrega;
    private ArrayList<Tarefa> tarefas;



    public Cliente() {
    }

    public Cliente(Long id, String nome, String moto, String chassi) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.tarefas = this.createListaTarefas(id);
    }

    public Cliente(Long id, String nome, String moto, String chassi, LocalDate dataVenda) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.dataVenda = dataVenda;
    }

    public Cliente(Long id, String nome, String moto, String chassi, LocalDate dataVenda, LocalDate dataEntrega) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.dataVenda = dataVenda;
        this.dataEntrega = dataEntrega;
    }

    public Cliente(Long id, String nome, String moto, String chassi, LocalDate dataVenda, LocalDate dataEntrega, ArrayList<Tarefa> tarefas) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.dataVenda = dataVenda;
        this.dataEntrega = dataEntrega;
        this.tarefas = tarefas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", moto='" + moto + '\'' +
                ", chassi=" + chassi +
                ", dataVenda=" + dataVenda +
                ", dataEntrega=" + dataEntrega +
                ", tarefas=" + tarefas +
                '}';
    }


    // Metodo para criar lista de Tarefas assim que criar um usuario
    public ArrayList<Tarefa> createListaTarefas(Long idCliente) {
        ArrayList<Tarefa> listTarefas = new ArrayList<Tarefa>();
        Tarefa prosposta = new Tarefa(1, idCliente, "Proposta", false, false, "");
        listTarefas.add(prosposta);
        Tarefa notaFiscal = new Tarefa(2 ,idCliente, "Nota Fiscal", false, false, "");
        listTarefas.add(notaFiscal);
        Tarefa solitacaoEstoque = new Tarefa(3 ,idCliente, "Solitacao Estoque", false, false, "");
        listTarefas.add(solitacaoEstoque);
        Tarefa bimEgravame = new Tarefa(4, idCliente, "Bim e Gravame", false, false, "");
        listTarefas.add(bimEgravame);
        Tarefa motoLoja = new Tarefa(5 ,idCliente, "Moto na Loja", false, false, "");
        listTarefas.add(motoLoja);
        Tarefa bateria = new Tarefa(6 ,idCliente, "Bateria Ativa", false, false, "");
        listTarefas.add(bateria);
        Tarefa acessorios = new Tarefa(7, idCliente, "Acessorios", false, false, "");
        listTarefas.add(acessorios);
        Tarefa teste = new Tarefa(8 ,idCliente, "Teste fun. da moto", false, false, "");
        listTarefas.add(teste);
        Tarefa manual = new Tarefa(9, idCliente, "Manual Preenchido", false, false, "");
        listTarefas.add(manual);
        Tarefa placa = new Tarefa(10 ,idCliente, "Placa", false, false, "");
        listTarefas.add(placa);
        Tarefa termoEntrega = new Tarefa(11 ,idCliente, "Termo de Entrega", false, false, "");
        listTarefas.add(termoEntrega);

        return listTarefas;
    }
}
