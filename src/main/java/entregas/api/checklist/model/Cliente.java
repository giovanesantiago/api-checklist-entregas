package entregas.api.checklist.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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



    public Cliente() {
    }

    public Cliente(Long id, String nome, String moto, String chassi) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        /*this.tarefas = this.createListaTarefas(id);*/
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



    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", moto='" + moto + '\'' +
                ", chassi=" + chassi +
                ", dataVenda=" + dataVenda +
                ", dataEntrega=" + dataEntrega +
                '}';
    }


}
