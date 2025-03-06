package exerc.rodrigo.SistemaTv;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 35; 

    public void desligarTv(){
        ligada = false;
    }

    public void ligarTv(){
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
