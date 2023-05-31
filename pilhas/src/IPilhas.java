public interface IPilhas {
    public boolean Push(Object info);
    public Object Pop();
    public Object top(); //retorna sem removê-lo
    public boolean isEmpty();
    public int size();
    }