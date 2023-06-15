import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // PilhaLista p = new PilhaLista();
        // System.out.println("tamanho da lista " + p.size()); // mostra o tamanho da lista
        // System.out.println("Está vazio? " + p.isEmpty()); //verifica se a lista está vazia
        // p.Push(1);
        // p.Push(2);
        // p.Push(3);

        // System.out.println("topo da lista " + p.top());
        
        // p.Pop();
        // System.out.println("topo da lita depois de remover " + p.top());
        // System.out.println("tamanho da lista " + p.size()); // mostra o tamanho da lista
        // System.out.println("Está vazio? " + p.isEmpty()); //verifica se a lista está vazia
        // System.out.println("elementos da lista do topo para o fim");
        // p.print(); // mostra os elementos da lista do topo para o fim
        // String palavra = "arara";
        // System.out.println( p.palindromo(palavra)); // parte do codigo para palindromo em lse
        // String palavra2 = "orava o avaro";
        // System.out.println( p.palindromo(palavra2));
        // String palavra3 = "radar";
        // System.out.println( p.palindromo(palavra3));



        // Aluno a1 = new Aluno("João", 123, 9.5);
        // Aluno a2 = new Aluno("Maria", 456, 8.5);
        // Aluno a3 = new Aluno("José", 789, 7.5);

        // PilhaLista p2 = new PilhaLista();
        // p2.Push(a1);
        // p2.Push(a2);
        // p2.Push(a3);
        // System.out.println("topo da lista " + p2.top());
        // p2.Pop();
        // System.out.println("topo da lista " + p2.top()); // Imprime  aluno no topo da pilha Errado pois o
        //                                                   // método top retorna um Object
        // p2.printAluno();                                // Imprime o nome do aluno no topo da pilha
        // System.out.println("tamanho da lista " + p2.size()); 
        // System.out.println("elementos da lista do topo para o fim");
        // p2.printAlunos(); // imprime a pilha, atributos do objeto, nome, matricula e nota
        // // poderia ter sido feito junto do método print mas foi separado para melhor entendimento

        // PilhaVet pilhaVet = new PilhaVet(10);
        // pilhaVet.Push("arara");

        // System.out.println(pilhaVet.palindromo(pilhaVet.top().toString())); // parte do codigo para palindromo em vetor 
        // pilhaVet.Push("orava o avaro");
        // System.out.println(pilhaVet.palindromo(pilhaVet.top().toString()));  // usa pilhaVet.top().toString() para converter o tipo Object para String
        // //precisa converter o tipo Object para String pq palindromo recebe uma String como parametro
        // p2.inverteOrdem(); // inverte a ordem dos elementos da pilha
        // System.out.println("elementos da lista do topo para o fim"); 
        // p2.printAlunos(); // imprime a pilha invertida, atributos do objeto, nome, matricula e nota
            MapaHashLSE mapaHashLSE = new MapaHashLSE(10);

        // Adicionar alunos ao mapa hash
        Aluno aluno1 = new Aluno("Joao", 123, 9.5);
        Aluno aluno2 = new Aluno("Maria", 456, 8.5);
        Aluno aluno3 = new Aluno("Pedro", 789, 7.5);

        mapaHashLSE.adicionarAluno(aluno1);
        mapaHashLSE.adicionarAluno(aluno2);
        mapaHashLSE.adicionarAluno(aluno3);

        // Buscar aluno pelo número de matrícula
        int matriculaBusca = 456;
        Aluno alunoEncontrado = mapaHashLSE.buscarAluno(matriculaBusca);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado - Nome: " + alunoEncontrado.getNome() + ", Matrícula: " + alunoEncontrado.getMatricula() + ", Nota: " + alunoEncontrado.getNota());
        } else {
            System.out.println("Aluno não encontrado");
        }

        // Remover aluno pelo número de matrícula
        int matriculaRemocao = 123;
        mapaHashLSE.removerAluno(matriculaRemocao);

        // Tentar buscar aluno removido
        alunoEncontrado = mapaHashLSE.buscarAluno(matriculaRemocao);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado - Nome: " + alunoEncontrado.getNome() + ", Matrícula: " + alunoEncontrado.getMatricula() + ", Nota: " + alunoEncontrado.getNota());
        } else {
            System.out.println("Aluno não encontrado");
        }

    }
}
