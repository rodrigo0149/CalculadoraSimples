
package calculadora;

import java.util.Scanner;
/**
 *
 * @author Rodrigo Cardoso
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        float valor1 = teclado.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float valor2 = teclado.nextFloat();
        float mostrar;
        int operacao;
       
        System.out.println("####################################");
        System.out.println("*****CALCULADORA*****");
        System.out.println("[ 1 ] Somar\n"
             + "[ 2 ] Diminuir\n"
             + "[ 3 ] Multiplicar\n"
             + "[ 4 ] Dividir");        
        System.out.println("####################################");
        System.out.print("Qual operação quer fazer: ");
        operacao = teclado.nextInt();
        System.out.println("====================================");
        
        Operacoes c1 = new Operacoes();
        switch (operacao){
            case 1:
                mostrar = c1.soma(valor1, valor2);
                System.out.printf("A soma entre %.2f e %.2f é de %.2f\n", valor1, valor2, mostrar);
                break;
            case 2:
                mostrar = c1.subtrai(valor1, valor2);
                System.out.printf("A subtração entre %.2f e %.2f é de %.2f\n", valor1, valor2, mostrar);
                break;
            case 3:
                mostrar = c1.multiplica(valor1, valor2);
                System.out.printf("A multiplicação entre %.2f e %.2f é de %.2f\n", valor1, valor2, mostrar);
                break;
            case 4:
                mostrar = c1.divide(valor1, valor2);
                System.out.printf("A divisão entre %.2f e %.2f é de %.2f\n", valor1, valor2, mostrar);
                break;
            default:
                System.out.println("Opção inválida...");
                break;
        }
               
    }
    
    
}
