
package Auditoria;

import java.util.Scanner;

public class Auditoria {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produccion = sc.nextInt();
        int palmira =  produccion;
        int cali = palmira * 2;
        cali = cali + 4;
        int yumbo = palmira + cali;
        yumbo = yumbo / 5;
        System.out.println(palmira+" "+cali+" "+yumbo);
        
        String grupo;
        if (yumbo >= 0 && yumbo <= 20) {
            grupo = "uno";
        } else if (yumbo >= 21 && yumbo <= 30) {
            grupo = "dos";
        } else if (yumbo >= 31 && yumbo <= 50) {
            grupo = "tres";
        } else {
            grupo = "cuatro";
        }
        System.out.println(grupo);
    }
    
}
