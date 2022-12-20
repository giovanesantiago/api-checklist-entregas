package entregas.api.checklist.model;


import javax.persistence.*;

@Entity
@Table(name = "tab_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarefa;
    private Integer idSequencia;
    private String nome;
    private Boolean processo;
    private Boolean finalizado;
    private String obs;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Tarefa() {
    }



    public Tarefa(Integer idSequencia, String nome, Boolean processo, Boolean finalizado, String obs, Cliente cliente) {
        this.idSequencia = idSequencia;
        this.nome = nome;
        this.processo = processo;
        this.finalizado = finalizado;
        this.obs = obs;
        this.cliente = cliente;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Integer getIdSequencia() {
        return idSequencia;
    }

    public void setIdSequencia(Integer idSequencia) {
        this.idSequencia = idSequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getProcesso() {
        return processo;
    }

    public void setProcesso(Boolean processo) {
        this.processo = processo;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", idSequencia=" + idSequencia +
                ", nome='" + nome + '\'' +
                ", processo=" + processo +
                ", finalizado=" + finalizado +
                ", obs='" + obs + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
