package service;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> listarTarefas() {
        return this.tarefas;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        this.tarefas.add(novaTarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            this.tarefas.remove(indice);
        } else {
            System.out.println("ERRO: Índice inválido. Nenhuma tarefa foi removida.");
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefaParaConcluir = this.tarefas.get(indice);
            tarefaParaConcluir.setConcluida(true);
        } else {
            System.out.println("Erro: Índice inválido. Nenhuma tarefa foi concluída.");
        }
    }
}
