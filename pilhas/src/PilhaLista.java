import java.util.Map;
import java.util.HashMap;

public class PilhaLista implements IPilhas {
    private Noh topo;
    private Map<Integer, Aluno> mapa;

    public PilhaLista() {
        this.topo = null;
        this.mapa = new HashMap<>();
    }

    @Override
    public boolean Push(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        
        if (info instanceof Aluno) {
            Aluno aluno = (Aluno) info;
            mapa.put(aluno.getMatricula(), aluno);
        }
        
        return true;
    }

    @Override
    public Object Pop() {
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProx();
            mapa.remove(info); // Remove a chave-valor do mapa
        }
        return info;
    }

    @Override
    public Object top() {
        Noh aux = topo;
        if (this.isEmpty())
            return null;
        else {
            return aux.getInfo();
        }
    }

    @Override
    public boolean isEmpty() {
        return (topo == null);
    }

    @Override
    public int size() {
        int cont = 0;
        Noh aux = topo;
        while (aux != null) {
            cont++;
            aux = aux.getProx();
        }
        return cont;
    }


    public void print() {
        Noh aux = topo;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }



    public boolean palindromo(String palavra) {
        PilhaLista p = new PilhaLista();
        for (int i = 0; i < palavra.length(); i++) {
            p.Push(palavra.charAt(i));
        }
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != (char) p.Pop())
                return false;
        }
        return true;
    }


    public boolean printAluno() {
        if (topo != null && topo.getInfo() instanceof Aluno) {
            Aluno a = (Aluno) topo.getInfo();
            System.out.println(a.getNome()); // Imprime o nome do aluno

            return true;
        } else {
            return false;
        }
    }
    
    public boolean printAlunos() {
        Noh aux = topo;
        while (aux != null) {
            if (aux.getInfo() instanceof Aluno) {
                Aluno a = (Aluno) aux.getInfo();
                System.out.println(a.getNome()); // Imprime o nome do aluno
                System.out.println(a.getMatricula()); // Imprime a matricula do aluno
                System.out.println(a.getNota()); // Imprime a média do aluno
                System.out.println(" ----------------------------------");
            }
            aux = aux.getProx();
        }
        return true;
    }


    public boolean inverteOrdem() {
        PilhaLista p = new PilhaLista();
        Noh aux = topo;
        while (aux != null) {
            p.Push(aux.getInfo());
            aux = aux.getProx();
        }
        topo = p.topo;
        return true;
    }




    public Map<Integer,Aluno> getMapa() {
        return mapa;
    }

    public Aluno encontrarAlunoPorMatricula(int matricula) {
        return mapa.get(matricula);
    }


    public void printaMapa() {
        for (Map.Entry<Integer, Aluno> entry : mapa.entrySet()) {
            System.out.println("Matricula: " + entry.getKey() + " Aluno: " + entry.getValue().getNome() + " Nota: " + entry.getValue().getNota()+ "Hash: " + entry.getValue().hashCode()) ;

        }
    }


}
