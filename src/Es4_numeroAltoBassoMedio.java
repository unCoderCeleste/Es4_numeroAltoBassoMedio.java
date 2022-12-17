/*
Esercizio 4:
Si supponga che sia stato assegnato un certo numero alla variabile di tipo int chiamata
numero. Si scriva un'istruzione if-else multi-ramo che mostri la parola
Alto se la variabile numero ha un valore maggiore di 10,
Basso se numero è minore di 5,
Medio se numero assume un qualsiasi altro valore
*/
import java.util.Scanner;
public class Es4_numeroAltoBassoMedio {
    public static void main(String[] args) {
        Scanner abm= new Scanner(System.in);
        System.out.println("NUMERO ALTO BASSO MEDIO.\nQuesto programmino determina che se\nnumero>10 è Alto,\nnumero<5 è Basso,\nqualsiasi altro numero è Medio");
        System.out.print("Si ingressi un valore di tipo intero: ");
        int numero= abm.nextInt();
        System.out.print("\nIl numero: "+numero +" è ");
        if(numero>10){
            System.out.print("Alto");
        }
        else if(numero<5) {
            System.out.print("Basso");
        }
            else{
                System.out.print("Medio");
            }
    }
}