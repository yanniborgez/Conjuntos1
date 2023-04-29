//Importar librería
import java.util.*;

/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción práctica de conjuntos 1
*/

public class Main {
    public static void main(String[] args) {
        //Inicializar variables
        //Variable tipo char con código de primera letra en ASCII
        char letrasAlfabeto = 65;
        //Variable tipo int con valor 1
        int numerosPares = 1;
        //Variable tipo int con límite inferior
        int limInferior = -300;
        //Variable tipo int con límite superior
        int limSuperior = 400;

        //Inicializar conjunto A
        Set<Character> A = new HashSet<>();
        //Agregar letras del abecedario al conjunto A mediante ciclo for
        for (int i=0; i<26; i++){
            A.add((char) (letrasAlfabeto +i));
        }

        //Emplear iterador e imprimir valores del conjunto A
        Iterator<Character> valA = A.iterator();
        System.out.println("Los elementos del conjunto A");
        while (valA.hasNext()) {
            System.out.println(valA.next());
        }
        //Imprimir espacio en blanco
        System.out.println();

        //Inicializar conjunto B
        SortedSet<Integer> B = new TreeSet<>();
        //Agregar números pares al conjunto B con ciclo while
        while(numerosPares < 400){
            //Solo si el número es par
            if(numerosPares % 2 == 0){
                B.add(numerosPares);
            }
            numerosPares++;
        }

        //Emplear iterador e imprimir valores del conjunto B
        Iterator<Integer> valB = B.iterator();
        System.out.println("Los elementos del conjunto B son: ");
        while (valB.hasNext()) {
            System.out.println(valB.next());
        }
        //Imprimir espacio en blanco
        System.out.println();

        //Inicializar conjunto C
        SortedSet<Integer> C = new TreeSet<>();
        //Agregar números pares al conjunto B con ciclo while
        for (int j=0; j<=limSuperior; j++){
            C.add(limInferior+j);
        }

        //Emplear iterador e imprimir valores del conjunto C
        Iterator<Integer> valC = C.iterator();
        System.out.println("Los elementos del conjunto C son: ");
        while (valC.hasNext()) {
            System.out.println(valC.next());
        }
        //Imprimir espacio en blanco
        System.out.println();

        //Unión de B y C
        var BunionC = new TreeSet<>(B);
        BunionC.addAll(C);
        System.out.println("Los elementos de B union C son: " + BunionC);

        //Intersección de B y C
        var BinterseccionC = new TreeSet<>(B);
        BunionC.retainAll(C);
        System.out.println("Los elementos de B interseccion C son: " + BinterseccionC);

        //B subconjunto de C
        System.out.println("Los elementos B subconjunto de C son" + C.subSet(-20,100));
    }
}
