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
    }
}
