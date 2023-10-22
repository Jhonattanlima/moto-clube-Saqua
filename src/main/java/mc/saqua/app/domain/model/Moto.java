package mc.saqua.app.domain.model;


import jakarta.persistence.Table;

@Table(name = "tb_moto")
public class Moto {
    private String modelo;
    private Integer ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
