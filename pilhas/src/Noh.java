public class Noh {
    private Object info;
    private Noh prox;
    public Noh (Object info){
    this.info = info;
    this.prox = null;
    }
   
    public Noh getProx() { 
        return this.prox;
    }
    public void setProx(Noh prox) 
    { this.prox = prox; }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Object getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}