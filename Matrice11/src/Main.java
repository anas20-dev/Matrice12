import java.util.Scanner;
public class Main {
public static void main() {
	Matrice11 m1 = new Matrice11( 2 ,4 );
        System.out.println("Matrice 1");
      m1.Afficher();
        
        Scanner p = new Scanner(System.in);
        
      Matrice11 m2 = new Matrice11(2, 4);
        System.out.println("Matrice 2");
      m2.Afficher();
        
        m1.somme(m2).Afficher();
System.out.println("entrez un nombre: ");
        int p1 = p.nextInt();
        m1.Produit(p1).Afficher();
m1.soustraction(m1).Afficher();
}

    }
