package no;

public class No {
    private String elemento;
    private No proximoNo;

    public No(String elemento){
        this.proximoNo = null;
        this.elemento  = elemento;
    }


    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento='" + elemento + '\'' +
                '}';
    }
}
