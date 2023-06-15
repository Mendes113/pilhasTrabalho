import java.util.*;

public class MapaHashLSE {
    private LinkedList<Entry>[] mapa;
    private int tamanho;

    public MapaHashLSE(int tamanho) {
        this.tamanho = tamanho;
        this.mapa = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            mapa[i] = new LinkedList<>();
        }
    }

    private int calcularChave(int matricula) {
        return matricula % tamanho;
    }

    public void adicionarAluno(Aluno aluno) {
        int chave = calcularChave(aluno.getMatricula());
        LinkedList<Entry> lista = mapa[chave];
        for (Entry entry : lista) {
            if (entry.getAluno().getMatricula() == aluno.getMatricula()) {
                // Atualiza o valor do aluno caso a matrícula já exista na lista
                entry.setAluno(aluno);
                return;
            }
        }
        // Adiciona um novo elemento na lista
        lista.add(new Entry(aluno));
    }

    public void removerAluno(int matricula) {
        int chave = calcularChave(matricula);
        LinkedList<Entry> lista = mapa[chave];
        for (Entry entry : lista) {
            if (entry.getAluno().getMatricula() == matricula) {
                // Remove o elemento da lista caso a matrícula seja encontrada
                lista.remove(entry);
                return;
            }
        }
    }

    public Aluno buscarAluno(int matricula) {
        int chave = calcularChave(matricula);
        LinkedList<Entry> lista = mapa[chave];
        for (Entry entry : lista) {
            if (entry.getAluno().getMatricula() == matricula) {
                // Retorna o aluno caso a matrícula seja encontrada na lista
                return entry.getAluno();
            }
        }
        return null; // Retorna null caso a matrícula não seja encontrada
    }

    private static class Entry {
        private Aluno aluno;

        public Entry(Aluno aluno) {
            this.aluno = aluno;
        }

        public Aluno getAluno() {
            return aluno;
        }

        public void setAluno(Aluno aluno) {
            this.aluno = aluno;
        }
    }
}
