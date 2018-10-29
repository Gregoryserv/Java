import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos KG vocẽ tem?");
        int kg = leia.nextInt();
        int porcentagem = 15;
        int porcentagem2 = 20;
        int novoPeso;
        int novoPeso2;
        
        System.out.println("\u000C");
        
        porcentagem = (kg*porcentagem)/100;
        porcentagem2 = (kg*porcentagem2)/100;
        novoPeso = kg+porcentagem;
        novoPeso2 = kg+porcentagem2;
        
        System.out.println("...RESULTADO...");
        System.out.println("Se você engorda 15% você ficará com: "+novoPeso);
        System.out.println("Se vocẽ engordar 20% vocẽ ficará com: "+novoPeso2);
    }
}