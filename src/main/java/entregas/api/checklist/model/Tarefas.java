package entregas.api.checklist.model;

public class Tarefas {

    private Long idCliente;
    private String nome;
    private Boolean processo;
    private Boolean finalizado;

    public Tarefas() {
    }

    public Tarefas(Long idCliente, String nome, Boolean processo, Boolean finalizado) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.processo = processo;
        this.finalizado = finalizado;
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
}
