package fila;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enfileirar(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No primeiro(){
        if (!this.listaVasia()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No desenfileirar(){
        if (!this.listaVasia()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar =refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

        public boolean listaVasia(){
        return refNoEntradaFila == null? true : false;
        }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject()+ "}]--->";
                if (noAuxiliar.getRefNo()!= null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno =  "null";
        }
        return stringRetorno;
    }
}
