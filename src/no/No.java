package no;

public class No<T> {
    private T elemento;
    private No<T> proximoNo;

    public No(T elemento){
        this.proximoNo = null;
        this.elemento  = elemento;
    }
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento='" + elemento + '\'' +
                '}';
    }
}
