package exerc.rodrigo.primeirasemana;
public class MinhaClasse {
    
    public static void main(String[] args) throws Exception {
        String primeiroNome = "rodrigo";
        String segundoroNome = "martins";
        System.out.println(nomeCompleto(primeiroNome, segundoroNome));
    }
    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
