package entregas.api.checklist.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Cliente {

    private Long id;
    private String nome;
    private String moto;
    private String chassi;
    private LocalDate dataVenda;
    private LocalDate dataEntrega;
    private ArrayList<Tarefas> tarefas;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String moto, String chassi) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.tarefas = this.createListaTarefas(id);
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

    public ArrayList<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefas> tarefas) {
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
    public ArrayList<Tarefas> createListaTarefas(Long idCliente) {
        ArrayList<Tarefas> listTarefas = new ArrayList<Tarefas>();
        Tarefas prosposta = new Tarefas(1, idCliente, "Proposta", false, false, "");
        listTarefas.add(prosposta);
        Tarefas notaFiscal = new Tarefas(2 ,idCliente, "Nota Fiscal", false, false, "");
        listTarefas.add(notaFiscal);
        Tarefas solitacaoEstoque = new Tarefas(3 ,idCliente, "Solitacao Estoque", false, false, "");
        listTarefas.add(solitacaoEstoque);
        Tarefas bimEgravame = new Tarefas(4, idCliente, "Bim e Gravame", false, false, "");
        listTarefas.add(bimEgravame);
        Tarefas motoLoja = new Tarefas(5 ,idCliente, "Moto na Loja", false, false, "");
        listTarefas.add(motoLoja);
        Tarefas bateria = new Tarefas(6 ,idCliente, "Bateria Ativa", false, false, "");
        listTarefas.add(bateria);
        Tarefas acessorios = new Tarefas(7, idCliente, "Acessorios", false, false, "");
        listTarefas.add(acessorios);
        Tarefas teste = new Tarefas(8 ,idCliente, "Teste fun. da moto", false, false, "");
        listTarefas.add(teste);
        Tarefas manual = new Tarefas(9, idCliente, "Manual Preenchido", false, false, "");
        listTarefas.add(manual);
        Tarefas placa = new Tarefas(10 ,idCliente, "Placa", false, false, "");
        listTarefas.add(placa);
        Tarefas termoEntrega = new Tarefas(11 ,idCliente, "Termo de Entrega", false, false, "");
        listTarefas.add(termoEntrega);

        return listTarefas;
    }
}
