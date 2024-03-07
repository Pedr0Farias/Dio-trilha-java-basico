import java.util.Scanner;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero= scan.nextInt();
        
        final double pi = 3.14;

        Boolean resultado = numero>5 ? true : false;

        System.out.println(+pi+"\n"+resultado);
        
        scan.close();
    }
}
