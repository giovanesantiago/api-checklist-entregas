package entregas.api.checklist.dto;

public class DtoCliente {

    private Long id;
    private String nome;
    private String moto;
    private String chassi;
    private String dataVenda;
    private String dataEntrega;

    public DtoCliente() {
    }

    public DtoCliente(Long id, String nome, String moto, String chassi) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
    }

    public DtoCliente(Long id, String nome, String moto, String chassi, String dataVenda) {
        this.id = id;
        this.nome = nome;
        this.moto = moto;
        this.chassi = chassi;
        this.dataVenda = dataVenda;
    }

    public DtoCliente(Long id, String nome, String moto, String chassi, String dataVenda, String dataEntrega) {
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

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
