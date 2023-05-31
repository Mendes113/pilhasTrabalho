public class PilhaVet implements IPilhas {
    private Object[] pilha;
    private int numElem;
    public PilhaVet (int tamanhoVetor){ //construtor
    this.pilha = new Object[tamanhoVetor];
    this.numElem = 0;

    }
    @Override
    public boolean Push(Object info) {
        if(this.numElem == this.pilha.length){
            return false;
        }
        else{
            this.pilha[this.numElem] = info;
            this.numElem++;
            return true;
        }
    }
    @Override
    public Object Pop() {
        if(this.isEmpty()){
            return null;
        }
        else{
            this.numElem--;
            return this.pilha[this.numElem];
        }
    }
    @Override
    public Object top() {
        if(this.isEmpty()){
            return null;
        }
        else{
            return this.pilha[this.numElem-1];
        }
    }
    @Override
    public boolean isEmpty() {
        return (this.numElem == 0);
    }
    @Override
    public int size() {
        return this.numElem;
    }


    public void print() {
        for (int i = 0; i < this.numElem; i++) {
            System.out.println(this.pilha[i]);
        }
    }

    public boolean palindromo(String palavra) {
        PilhaVet p = new PilhaVet(palavra.length());
        for (int i = 0; i < palavra.length(); i++) {
            p.Push(palavra.charAt(i));
        }
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != (char) p.Pop())
                return false;
        }
        return true;
    }

}