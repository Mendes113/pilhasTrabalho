import java.util.Map;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;
    private Map<Integer, Aluno> mapa;

    public Aluno(String nome, int matricula, double nota, Map<Integer, Aluno> mapa) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
        this.mapa = mapa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    private int hash(int matricula) {
        int chave = matricula % 10;

        // Tratar colisões
        while (mapa.containsKey(chave)) {
            chave = rehash(chave);
        }

        return chave;
    }

    public int hashCode() {
        return hash(matricula);
    }

    private int rehash(int matricula) {
        return (matricula + 1) % 10;
    }


   
}
