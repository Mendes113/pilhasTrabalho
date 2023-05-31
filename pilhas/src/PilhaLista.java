public class PilhaLista implements IPilhas {
    private Noh topo; // referência ao topo da pilha

    public PilhaLista() { // construtor
        this.topo = null;
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
        return true;
    }

    

    @Override
    public Object Pop() {
        Object info = null;
        if (!this.isEmpty()){
        info = topo.getInfo();
        topo = topo.getProx();
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
}
