import java.util.Date;

public class TarefaBuilder {
    private Tarefa tarefa;

    public TarefaBuilder() {
        tarefa = new Tarefa();
    }

    public Tarefa build() {
        if (tarefa.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (tarefa.isFinalizado()) {
            throw new IllegalArgumentException("Tarefa criada como encerrada");
        }
        if (tarefa.getDataCricao().after(new Date())) {
            throw new IllegalArgumentException("Tarefa com data de criação inválida");
        }
        if (tarefa.getDataFim().before(new Date())) {
            throw new IllegalArgumentException("Tarefa com data limite inválida");
        }

        return tarefa;
    }

    public TarefaBuilder setNome(String nome) {
        tarefa.setNome(nome);
        return this;
    }

    public  TarefaBuilder setDescricao(String descricao) {
        tarefa.setDescricao(descricao);
        return this;
    }

    public TarefaBuilder setCategoria(String categoria) {
        tarefa.setCategoria(categoria);
        return this;
    }

    public TarefaBuilder setFinalizado(boolean finalizado) {
        tarefa.setFinalizado(finalizado);
        return this;
    }

    public TarefaBuilder setDataCriacao(Date dataCriacao) {
        tarefa.setDataCricao(dataCriacao);
        return this;
    }

    public TarefaBuilder setDataFim(Date dataFim) {
        tarefa.setDataFim(dataFim);
        return this;
    }
}
