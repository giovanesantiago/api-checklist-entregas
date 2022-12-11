package entregas.api.checklist.model;

public class Tarefas {

    private int idTarefa;
    private Long idCliente;
    private String nome;
    private Boolean processo;
    private Boolean finalizado;
    private String obs;

    public Tarefas() {
    }

    public Tarefas(int idTarefa,Long idCliente, String nome, Boolean processo, Boolean finalizado, String obs) {
        this.idTarefa = idTarefa;
        this.idCliente = idCliente;
        this.nome = nome;
        this.processo = processo;
        this.finalizado = finalizado;
        this.obs = obs;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

    @Override
    public String toString() {
        return "Tarefas{" +
                "idTarefa=" + idTarefa +
                ", idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", processo=" + processo +
                ", finalizado=" + finalizado +
                ", obs='" + obs + '\'' +
                '}';
    }
}
