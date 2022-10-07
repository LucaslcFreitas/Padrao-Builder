import java.util.Date;

public class Tarefa {
    private String nome;
    private String descricao;
    private String categoria;
    private boolean finalizado;
    private Date dataCricao;
    private Date dataFim;

    public Tarefa(){
        this.nome = "";
        this.finalizado = false;
        this.dataCricao = new Date();
        this.dataCricao.setMonth(this.dataCricao.getMonth()+3);
        this.dataFim = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Date getDataCricao() {
        return dataCricao;
    }

    public void setDataCricao(Date dataCricao) {
        this.dataCricao = dataCricao;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
