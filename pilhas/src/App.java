import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando um objeto PilhaLista
        PilhaLista pilha = new PilhaLista();
        

        // Instanciando um objeto Aluno e adicionando ao mapa
        Aluno aluno1 = new Aluno("João", 123456, 9.5, pilha.getMapa());
        Aluno aluno2 = new Aluno("Maria", 654321, 8.5, pilha.getMapa());
        Aluno aluno3 = new Aluno("José", 456789, 7.5, pilha.getMapa());
        Aluno aluno4 = new Aluno("Ana", 987654, 6.5, pilha.getMapa());
        Aluno aluno5 = new Aluno("Pedro", 321654, 5.5, pilha.getMapa());
        pilha.Push(aluno1);
        pilha.Push(aluno2);
        pilha.Push(aluno3);
        pilha.Push(aluno4);
        pilha.Push(aluno5);
        


        pilha.printAlunos();
        System.out.println("Tamanho da pilha: " + pilha.size());
         //busca aluno pela matricula

                        int hash = aluno1.hashCode();
                System.out.println("Hash do aluno: " + hash);   
        

        // Acessando informações do aluno
       
                    int matriculaDesejada = 123456;
            Aluno alunoEncontrado = pilha.encontrarAlunoPorMatricula(matriculaDesejada);
            if (alunoEncontrado != null) {
                System.out.println("Aluno encontrado: " + alunoEncontrado.getNome());
            } else {
                System.out.println("Aluno não encontrado");
}




        pilha.printaMapa();

    }


    
}
