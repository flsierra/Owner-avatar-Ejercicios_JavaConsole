package evidenciag1;

import java.util.Scanner;

public class EvidenciaG1 {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int caja[] = new int[3];
        int v = 0;
        do {
            System.out.println("-------------------------");
            System.out.println("|          MENU          |");
            System.out.println("|------------------------|");
            System.out.println("| 1) Cargar vectores     |");
            System.out.println("|------------------------|");
            System.out.println("| 2) Leer vectores       |");
            System.out.println("|------------------------|");
            System.out.println("| 3) Suma vectores       |");
            System.out.println("|------------------------|");
            System.out.println("| 4) cuadrdo vectores    |");
            System.out.println("|------------------------|");
            System.out.println("| 5) Salir               |");
            System.out.println("--------------------------");
            v = lee.nextInt();
            switch (v) {
                case 1:
                    Mate m=new Mate();
                    for (v = 0; v < caja.length; v++) {
                        m.CargaV(caja, v, v);
                        System.out.println(" Digite los vctores ");
                        if (v < caja.length) {
                            caja[v] = lee.nextInt();
                        } else {
                            System.out.println("estoy llenito");
                        }
                    }
                    break;
                case 2:
                    for (v = 0; v < caja.length; v++) {
                        System.out.println("posicion de " + v + " es " + caja[v]);
                    }
                    break;
                case 3:
                    SumaVector su = new SumaVector();
                    int sumita;
                    sumita = su.suma(caja[0], caja[1], caja[2]);
                    System.out.println("la suma de " + caja[0] + " mas " + caja[1] + " mas " + caja[2] + " es igal a " + sumita);

                    break;
                case 4:
                    CuadradoVector cu = new CuadradoVector();
                    int cuadra;
                    cuadra = cu.cuadrado(caja[0]);
                   CuadradoVec cd= new CuadradoVec();
                   int cdra;
                   cdra=cd.cuadra(caja[1]);
                   CuadradoVect cdr= new CuadradoVect();
                   int cdrad;
                   cdrad=cdr.cuadrad(caja[2]);
                    System.out.println("el cuadrado de " + caja[0] + " es igal a " + cuadra);
                    System.out.println("el cuadrado de " + caja[1] + " es igal a " + cdra);
                    System.out.println("el cuadrado de " + caja[2] + " es igal a " + cdrad);

                    break;

            }

        } while (v < 5);
    }

}
