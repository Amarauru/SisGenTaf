import java.time.LocalDate;

public class Main{
    public static void main(String[] args){

        // tarefas
        Tarefa tarefa1 = new Tarefa("Realizar estudo em Advpl", "Necessário Aprofundar conhecimento na linguagem advpl",
                LocalDate.of(2023, 07, 05));
        Tarefa tarefa2 = new Tarefa("Estudar Java",
                "Aprofundar em Java e em breve em Spring para aperfeiçoamento profissional", LocalDate.of(2023, 8, 21));

        // projetos
        Projeto projeto = new Projeto("ProjetoTeste",
                "Projeto teste, verificando se foi criado as tarefas e se consegui atribuir os responsáveis");

        // responsável
        Respo respo = new Respo("Pedro Almeida", "xxxxpedro@xxx.com");
        Respo respo2 = new Respo("Pedro Amaral", "xxxxpedro22@xxx.com");

        // Definindo o responsável a tarefa
        tarefa1.setRespo(respo);
        tarefa2.setRespo(respo2);
        
        // Adicionando a tarefa ao projeto
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);

        // setando e testando o metodo de concluida
        tarefa1.setConcluida(true);

        // Imprimindo informações do projeto e das tarefas
        System.out.println("Projeto" + projeto.getNome());
        System.out.println("Descrição" + projeto.getDescricao());
        System.out.println("Tarefas");

        for (Tarefa tarefa : projeto.getTarefas()){
            System.out.println(" - "+ tarefa.getTitulo()+ "(Prazo: " + tarefa.getPrazo() + ", Concluida: " + tarefa.isConcluida() + ")") ;
        }

    }
}