package entregas.api.checklist.model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

    private Long id;
    private String nome;
    private String moto;
    private Integer chassi;
    private Date dataVenda;
    private Date dataEntrega;
    private ArrayList<Tarefas> tarefas;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String moto, Integer chassi) {
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

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
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

    public ArrayList<Tarefas> createListaTarefas(Long idCliente) {
        ArrayList<Tarefas> listTarefas = new ArrayList<Tarefas>();
        Tarefas prosposta = new Tarefas(idCliente, "Proposta", false, false);
        listTarefas.add(prosposta);
        Tarefas notaFiscal = new Tarefas(idCliente, "Nota Fiscal", false, false);
        listTarefas.add(notaFiscal);
        Tarefas solitacaoEstoque = new Tarefas(idCliente, "Solitacao Estoque", false, false);
        listTarefas.add(solitacaoEstoque);
        Tarefas bimEgravame = new Tarefas(idCliente, "Bim e Gravame", false, false);
        listTarefas.add(bimEgravame);
        Tarefas motoLoja = new Tarefas(idCliente, "Moto na Loja", false, false);
        listTarefas.add(motoLoja);
        Tarefas bateria = new Tarefas(idCliente, "Bateria Ativa", false, false);
        listTarefas.add(bateria);
        Tarefas acessorios = new Tarefas(idCliente, "Acessorios", false, false);
        listTarefas.add(acessorios);
        Tarefas teste = new Tarefas(idCliente, "Teste fun. da moto", false, false);
        listTarefas.add(teste);
        Tarefas manual = new Tarefas(idCliente, "Manual Preenchido", false, false);
        listTarefas.add(manual);
        Tarefas placa = new Tarefas(idCliente, "Placa", false, false);
        listTarefas.add(placa);
        Tarefas termoEntrega = new Tarefas(idCliente, "Termo de Entrega", false, false);
        listTarefas.add(termoEntrega);

        return listTarefas;
    }
}
