import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os valores a serem relacionados: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite os valores a serem relacionados: ");
        int numero2 = scan.nextInt();
        boolean simNao;

        simNao = numero1==numero2; // numero1==numero2 ? true:false;

        System.out.println("numeroUm é igual ao numeroDois? "+simNao);
   
        simNao = numero1!=numero2; // numero1!=numero2 ? true:false;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);
       
        simNao = numero1>numero2; // numero1>numero2 ? true:false;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        
        simNao = numero1<numero2; // numero1<numero2 ? true:false;
    
        System.out.println("numeroUm é menor que numeroDois? " + simNao);
        
        scan.close();
    }      

}
