
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    private static ConsoleProgress_Bar progressBar = new ConsoleProgress_Bar();
    static Scanner scanner = new Scanner(System.in);
    static int choixMenu = 0;
    static String produit;
    static int choixSucre = 0;
    static int nbSucre = 0;
    static boolean aUnGobelet = false;


    public static void main(String[] args) throws Exception {
        Bienvenue();
        Menu();

        
    }

    private static void Sucre() {
        System.out.println();
        System.out.println("Souhaitez vous du sucre dans votre '"+produit+"' ?");
        System.out.println("1- Oui.");
        System.out.println("2- Non.");
        System.out.println("****************************************************************");
        System.out.println();

        try {
            System.out.print(" Entrer votre choix : ");
            choixSucre = Integer.parseInt(scanner.nextLine());
            System.out.println();
            System.out.println("****************************************************************");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Veuillez entrer un nombre correct");
        }

        switch(choixSucre) {
            case 1:
                System.out.println();
                do {
                    try {
                        System.out.print(" Veuillez saisir un niveau de sucre entre 1 et 5 : ");
                        nbSucre = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Erreur : veuillez entrer un chiffre entre 1 et 5");
                    }
                }while( nbSucre > 5 || nbSucre < 1);
                System.out.println();
                System.out.println("Nombre de sucre(s) demandé(s) : " + nbSucre);
                System.out.println("****************************************************************");
                Gobelet();
                break;

            case 2 :
                Gobelet();
                break;
        }
    }

    private static void Gobelet() {
        int gobelet = 0; 
        System.out.println("Possédez vous votre propre gobelet, tasse, verre ?");
        System.out.println("1- Oui.");
        System.out.println("2- Non.");
        System.out.println("****************************************************************");
        System.out.println();

        do{
            try {
                System.out.print(" Entrer votre choix : ");
                gobelet = Integer.parseInt(scanner.nextLine());
                System.out.println("****************************************************************");
                System.out.println();
            } catch (Exception e) {
                System.out.println("Veuillez entrer un choix valide");
            }
        }while(gobelet > 2 || gobelet< 1);

        switch(gobelet) {
            case 1:
                aUnGobelet = true;
                System.out.println();
                System.out.println("Choix enregistré");
                System.out.println("****************************************************************");
                TemperatureDeLEau();
                break;

            case 2 :
                aUnGobelet = false;
                System.out.println();
                System.out.println("Choix enregistré");
                System.out.println("****************************************************************");
                TemperatureDeLEau();
                break;
        }
        
    }

    public static void TemperatureDeLEau() {
        System.out.println("Préparation de l'eau");
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


    public static void printMsgWithProgressBar(String message, int length, long timeInterval)
    {
        char incomplete = '░'; // U+2591 Unicode Character
        char complete = '█'; // U+2588 Unicode Character
        StringBuilder builder = new StringBuilder();
        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
        System.out.println(message);
        for(int i = 0; i < length; i++)
        {
            builder.replace(i,i+1,String.valueOf(complete));
            String progressBar = "\r"+builder;
            System.out.print(progressBar);
            try
            {
                Thread.sleep(timeInterval);
            }
            catch (InterruptedException ignored)
            {

            }
        }
    }

}
