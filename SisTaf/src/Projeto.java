import java.util.List;
import java.util.ArrayList;

public class Projeto {
    
    private String Nome;
    private String Descricao;
    private List<Tarefa> tarefas;

    public Projeto(String Nome, String Descricao) {
    this.Nome = Nome;
    this.Descricao = Descricao;
    this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    
    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }

    public List<Tarefa> getTarefasConcluidas() {
        List<Tarefa> tarefasConcluidas = new ArrayList<>();
        for (Tarefa tarefa : tarefas){
            if (tarefa.isConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;

    }




}

