import java.time.LocalDate;

public class Tarefa {

    private String Titulo;
    private String Descricao;
    private LocalDate Prazo;
    private boolean concluida;
    private Respo respo;

    public Tarefa(String Titulo, String Descricao, LocalDate Prazo) { // Criado o construtor e dado 3 parametros
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.Prazo = Prazo;
        this.concluida = false;

    }
    // Gerando os Getters e Setters
    //Os Metodos: Titulo, Descrição, Prazo, Data, concluida, marcar como concluida e Responsável
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public LocalDate getPrazo() {
       return Prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.Prazo = prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Método para marcar a tarefa como concluída
    public void marcarComoConcluida() {
        this.concluida = true;
    }
    public Respo getRespo(){
        return respo;
    }
    public void setRespo(Respo respo){
        this.respo = respo;

    }
}