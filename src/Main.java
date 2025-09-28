import model.Tarefa;
import service.GerenciadorDeTarefas;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Criando uma instancia do nosso gerenciador
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        System.out.println("Gerenciador de tarefas iniciado para teste.");

        // 2. Testando o metodo adicionarTarefa()
        System.out.println("\n>>> Testando: Adicionar 3 tarefas...");
        gerenciador.adicionarTarefa("Estudar para a prova de Java");
        gerenciador.adicionarTarefa("Enviar o trabalho no ULife");
        gerenciador.adicionarTarefa("Ver GOT com a madu");
        System.out.println("Tarefas adicionadas...");

        // 3. Testando o metodo listarTarefa()
        System.out.println("\n>>> Testando: Listar tarefas...");
        List<Tarefa> tarefasAtuais = gerenciador.listarTarefas();
        for (int i = 0; i < tarefasAtuais.size(); i++) {
            System.out.println("Índice " + i + ": " + tarefasAtuais.get(i));
        }
        System.out.println("Total de tarefas na lista: " + tarefasAtuais.size());

        // 4. Testanto o metodo concluirTarefa
        System.out.println("\n>>> Testando: Concluir tarefa de indice 1...");
        gerenciador.concluirTarefa(1);
        System.out.println("Tarefa no indice 1 apos concluir: " + gerenciador.listarTarefas().get(1));

        // 5. Testa o metodo removerTarefa()
        System.out.println("\n>>> Testando: Remover a tarefa de indice 0...");
        gerenciador.removerTarefa(0);
        System.out.println("Tarefa removida");

        // 6. Lista as tarefas novamente para ver o estado final
        System.out.println("\n>>> Resultado final: Listando tarefas restantes...");
        List<Tarefa> tarefasFinais = gerenciador.listarTarefas();
        for (int i = 0; i < tarefasFinais.size() ; i++) {
            System.out.println("Índice " + i + ": " + tarefasFinais.get(i));
        }
        System.out.println("Total de tarefas na lista: " + tarefasFinais.size());
    }
}