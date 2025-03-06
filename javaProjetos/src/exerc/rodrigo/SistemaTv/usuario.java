package exerc.rodrigo.SistemaTv;

public class usuario {

    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();

        tv1.ligarTv();
        System.out.println(tv1.canal);
        System.out.println(tv1.ligada);
        System.out.println(tv1.volume);

        tv1.aumentarCanal();
        System.out.println("Canal Atualizado: "+tv1.canal);

        tv1.aumentarVolume();
        System.out.println("Volume Atualizado: "+tv1.volume);

        tv1.diminuirCanal();
        System.out.println("Canal Atualizado: "+tv1.canal);
        
        tv1.diminuirVolume();
        System.out.println("Volume Atualizado: "+tv1.volume);

        tv1.mudarCanal(65);
        System.out.println("Canal escolhido: "+tv1.canal);
    }
}

