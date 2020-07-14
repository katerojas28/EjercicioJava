package Package1;

import java.util.StringTokenizer;

public class CaracteresClass {

    public void cadena (){
        String linea = "      1  2          3     .    14    5y5    5  y  u      6   7              ";
        String [] num = new String[100];
        int [] numeros = new int[100];
        int numero;
        int numer=0;
        int i;
        StringTokenizer tokens = new StringTokenizer(linea);

        while (tokens.hasMoreTokens()) {
            for (  i = 0; tokens.hasMoreTokens(); i++){
                num[i] = tokens.nextToken();

                try{
                    numero=Integer.parseInt(num[i]);
                    numeros[i] = numero;
                    numer=numer+numero;
                }catch(NumberFormatException ex){
                    System.out.println(num[i]+"  No es un número");
                }
            }
        }
        System.out.println("La suma de los números de la cadena es:  "+ numer);
    }
}
