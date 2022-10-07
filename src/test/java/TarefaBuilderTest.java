import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TarefaBuilderTest {

    @Test
    void deveRetornarExcecaoParaTarefaCriadaComDataFimNoPassado() {
        try {
            Date dataFim = new Date();
            dataFim.setMonth(dataFim.getMonth()-3);
            TarefaBuilder tarefaBuilder = new TarefaBuilder();
            Tarefa tarefa = tarefaBuilder
                    .setNome("Estudar para a prova")
                    .setCategoria("UFJF")
                    .setDescricao("Estudar para aspectos avançados de engenharia de software")
                    .setFinalizado(false)
                    .setDataCriacao(new Date())
                    .setDataFim(dataFim)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tarefa com data limite inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTarefaCriadaNoFuturo() {
        try {
            Date dataAux = new Date();
            dataAux.setMonth(dataAux.getMonth()+3);
            TarefaBuilder tarefaBuilder = new TarefaBuilder();
            Tarefa tarefa = tarefaBuilder
                    .setNome("Estudar para a prova")
                    .setCategoria("UFJF")
                    .setDescricao("Estudar para aspectos avançados de engenharia de software")
                    .setFinalizado(false)
                    .setDataCriacao(dataAux)
                    .setDataFim(dataAux)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tarefa com data de criação inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTarefaCriadaComoEncerrada() {
        try {
            Date dataFim = new Date();
            dataFim.setMonth(dataFim.getMonth()+3);
            TarefaBuilder tarefaBuilder = new TarefaBuilder();
            Tarefa tarefa = tarefaBuilder
                    .setNome("Estudar para a prova")
                    .setCategoria("UFJF")
                    .setDescricao("Estudar para aspectos avançados de engenharia de software")
                    .setFinalizado(true)
                    .setDataCriacao(new Date())
                    .setDataFim(dataFim)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tarefa criada como encerrada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTarefaSemNome() {
        try {
            Date dataFim = new Date();
            dataFim.setMonth(dataFim.getMonth()+3);
            TarefaBuilder tarefaBuilder = new TarefaBuilder();
            Tarefa tarefa = tarefaBuilder
                    .setCategoria("UFJF")
                    .setDescricao("Estudar para aspectos avançados de engenharia de software")
                    .setFinalizado(false)
                    .setDataCriacao(new Date())
                    .setDataFim(dataFim)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTarefaValida() {
        Date dataFim = new Date();
        dataFim.setMonth(dataFim.getMonth()+3);
        TarefaBuilder tarefaBuilder = new TarefaBuilder();
        Tarefa tarefa = tarefaBuilder
                .setNome("Estudar para a prova")
                .setCategoria("UFJF")
                .setDescricao("Estudar para aspectos avançados de engenharia de software")
                .setFinalizado(false)
                .setDataCriacao(new Date())
                .setDataFim(dataFim)
                .build();
        assertNotNull(tarefa);
    }

}