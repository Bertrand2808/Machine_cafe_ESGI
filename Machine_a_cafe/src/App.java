import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int choixMenu = 0;
    static String produit;
    public static void main(String[] args) throws Exception {
        Bienvenue();
        Menu();

        
    }

    private static void Sucre() {
        System.out.println();
        System.out.println("Souhaitez vous du sucre dans votre '"+produit+"' ?" );
        System.out.println();
        System.out.println("****************************************************************");
    }

    public static void Menu() {
        int choix=0;
        System.out.println("1- Café court ");
        System.out.println("2- Café long ");
        System.out.println("3- Expresso ");
        System.out.println("4- Café court en grain ");
        System.out.println("5- Café long en grain ");
        System.out.println("6- Cappuccino ");
        System.out.println();
        
        try {
            System.out.print(" Entrer votre choix : ");
            choix = Integer.parseInt(scanner.nextLine());
            System.out.println();
            System.out.println("****************************************************************");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Veuillez entrer un nombre correct");
        }
        
        switch(choix){

            case 1:
            choixMenu = choix;
            produit = "Cafe court";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;
            case 2:
            choixMenu = choix;
            produit = "Cafe long";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;
            case 3:
            choixMenu = choix;
            produit = "Expresso";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;
            case 4:
            choixMenu = choix;
            produit = "Cafe court en grain";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;
            case 5:
            choixMenu = choix;
            produit = "Cafe long en grain";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;
            case 6:
            choixMenu = choix;
            produit = "Cappuccino";
            System.out.println(" Vous avez séléctionné : "+ produit);
            System.out.println();
            System.out.println("****************************************************************");
            Sucre();
            break;


        }
    }

    private static void Bienvenue() {
        // Affichage de bienvenue
        System.out.println();
        System.out.println();
        System.out.println("Bienvenue dans votre service de machine à café interactive !");
        System.out.println();
        System.out.println("*************************************************************");
        System.out.println("*  ***********    ***********   ***********   ***********   *");
        System.out.println("*  *              *         *   *             *             *");
        System.out.println("*  *              *         *   *             *             *");
        System.out.println("*  *              ***********   *******       ***********   *");
        System.out.println("*  *              *         *   *             *             *");
        System.out.println("*  *              *         *   *             *             *");
        System.out.println("*  ***********    *         *   *             ***********   *");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("Veuillez faire votre choix parmis les produits disponibles : ");
        System.out.println();
    }

}
