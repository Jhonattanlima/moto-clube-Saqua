package mc.saqua.app.domain.model;


import jakarta.persistence.*;

@Entity(name = "tb_dados")
public class Dado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "idade", columnDefinition = "INT")
    private Integer idade;
    @Column(name = "estado", columnDefinition = "VARCHAR(255)")
    private String estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
