


import java.util.Scanner;
public class Matrice11 {
    

    private int ligne;
    private int colonne;
    
    private int[][] matrice;
    private Scanner number = new Scanner(System.in);

    
    public Matrice11(int ligne, int colonne) {

        this.ligne = ligne;
        this.colonne = colonne;
       
        matrice = new int[ligne][colonne];
        
            System.out.println("entrez " + (ligne * colonne) + " valeurs");
            for (int i = 0; i < ligne; i++) {
                for (int j = 0; j < colonne; j++) {
                    matrice[i][j] = number.nextInt();
                }
            }
        }


    //affichage
    public void Afficher() {
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }
    //getteNbligne

    public int getNbligne() {
        return matrice.length;
    }

    //getNbcolonne
    public int getNbcolonne() {
        return matrice[0].length;
    }

    //pour la somme
    public Matrice11 somme(Matrice11 s) {
        Matrice11 som = new Matrice11(ligne, colonne);
        if (ligne == s.getNbligne() && colonne == s.getNbcolonne()) {
            for (int i = 0; i < ligne; i++) {
                for (int j = 0; j < colonne; j++) {
                    som.matrice[i][j] = matrice[i][j] + s.matrice[i][j];
                }
            }

        } else {
            System.out.println("on ne peut pas effectue l'addition");
            System.exit(1);
        }
        return som;
    }

    //pour le produit avec nombre
    public Matrice11 Produit(int nombre) {

        Matrice11 produit = new Matrice11(ligne, colonne);
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                produit.matrice[i][j] = nombre * matrice[i][j];

            }
        }
        System.out.println("le produit de la matrice et un nombre :");
        return produit;
    }


    public Matrice11 soustraction(Matrice11 d) {
        Matrice11 diff = new Matrice11(ligne, colonne);
        if (ligne == d.getNbligne() && colonne == d.getNbcolonne()) {
            for (int i = 0; i < ligne; i++) {
                for (int j = 0; j < colonne; j++) {
                    diff.matrice[i][j] = matrice[i][j] - d.matrice[i][j];
                }
            }

        } else {
            System.out.println("on ne peut pas effectue l'addition");
            System.exit(1);
        }
        return diff;
    }

    public static void main(String[] args) {
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


    