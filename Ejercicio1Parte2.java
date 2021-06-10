import java.util.Scanner;

/*
202030799 Manuel Rojas
Solicitar al usuario que ingrese un n�mero entero N, luego generar en forma aleatoria 
N n�meros enteros comprendidos entre 1 y 100 y determinar cu�ntos son pares y cu�ntos impares.
*/
public class Ejercicio1Parte2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, contadorPar = 0, contadorImpar = 0;
        System.out.print("Ingrese un numero entero: ");
        num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            int aleatorio = (int) Math.floor(Math.random()*(100-1+1)+1);
            if ((aleatorio%2) == 0){
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
        System.out.println("Se generaron " + contadorPar + " numeros pares, y " + contadorImpar + " numeros impares.");
    }
}