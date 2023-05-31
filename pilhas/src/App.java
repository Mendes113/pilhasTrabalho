public class App {
    public static void main(String[] args) throws Exception {
        PilhaLista p = new PilhaLista();
        System.out.println("tamanho da lista " + p.size());
        System.out.println("Está vazio? " + p.isEmpty());
        p.Push(1);
        p.Push(2);
        p.Push(3);

        System.out.println("topo da lista " + p.top());
        
        p.Pop();
        System.out.println("topo da lita depois de remover " + p.top());
        System.out.println("tamanho da lista " + p.size());
        System.out.println("elementos da lista do topo para o fim");
        p.print();
        String palavra = "arara";
        System.out.println( p.palindromo(palavra));
        String palavra2 = "0110";
        System.out.println( p.palindromo(palavra2));
        String palavra3 = "radar";
        System.out.println( p.palindromo(palavra3));



        Aluno a1 = new Aluno("João", 123, 9.5);
        Aluno a2 = new Aluno("Maria", 456, 8.5);
        Aluno a3 = new Aluno("José", 789, 7.5);

        PilhaLista p2 = new PilhaLista();
        p2.Push(a1);
        p2.Push(a2);
        p2.Push(a3);
        System.out.println("topo da lista " + p2.top());
        p2.Pop();
        System.out.println("topo da lista " + p2.top()); // Imprime  aluno no topo da pilha Errado pois o
                                                          // método top retorna um Object
        p2.printAluno();                                // Imprime o nome do aluno no topo da pilha
        System.out.println("tamanho da lista " + p2.size()); 
        System.out.println("elementos da lista do topo para o fim");
        p2.printAlunos();

        PilhaVet pilhaVet = new PilhaVet(10);
        pilhaVet.Push("arara");

        System.out.println(pilhaVet.palindromo(pilhaVet.top().toString()));
        

    }
}
