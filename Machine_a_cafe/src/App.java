
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    // Déclaration du Scanner pour les inputs de l'utilisateur
    static Scanner scanner = new Scanner(System.in);

    // Déclaration de toutes les variables utilisées par les différentes fonctions
    static int choixMenu = 0;

    static int dosetteCafeCourt = 10;
    static int dosetteCafeLong = 10;
    static int dosetteExpresso = 10;
    static int dosetteCafeCourtEnGrain = 10;
    static int dosetteCafeLongEnGrain = 10;
    static int dosetteCappuccino = 10;

    static double prixCafe = 0.30;
    static double prixCafeGrain = 0.40;
    static double prixCappuccino = 0.35;
    static double argentInsere = 0; 
    static double argentRendu = 0;

    static String produit;

    static int choixSucre = 0;
    static int nbSucre = 0;

    static boolean aUnGobelet = false;


    public static void main(String[] args) throws Exception {
        // main qui lance le programme 
        Bienvenue(); // fonction du message de bienvenue
        Menu(); // enchaine avec la fonction du menu 

        
    }

    private static void Sucre() {
        // affichage du message demandant du sucre 
        System.out.println();
        System.out.println("Souhaitez vous du sucre dans votre '"+produit+"' ?");
        System.out.println("1- Oui.");
        System.out.println("2- Non.");
        System.out.println();

        // try catch pour empêcher l'utilisation de lettre ou autres
        try {
            System.out.print(" Entrer votre choix : ");
            choixSucre = Integer.parseInt(scanner.nextLine());
            System.out.println();
            System.out.println("****************************************************************");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Veuillez entrer un nombre correct");
        }

        // switch pour chacun des cas (rajouter des cas si besoin)
        switch(choixSucre) {
            case 1:
                do {
                    try {
                        System.out.print("Veuillez saisir un niveau de sucre entre 1 et 5 : ");
                        nbSucre = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Erreur : veuillez entrer un chiffre entre 1 et 5");
                    }
                }while( nbSucre > 5 || nbSucre < 1);               // on s'assure que les valeurs entrées par le user sont valides
                System.out.println();
                System.out.println("Nombre de sucre(s) demandé(s) : " + nbSucre);
                System.out.println("****************************************************************");
                System.out.println();
                Gobelet(); // Appel de la fonction Gobelet()
                break;

            case 2 :
                Gobelet(); // Appel de la fonction Gobelet()
                break;
        }
    }

    private static void Gobelet() {
        int gobelet = 0;  // initialisation interne pour le choix du user
        System.out.println("Possédez vous votre propre gobelet, tasse, verre ?");
        System.out.println("1- Oui.");
        System.out.println("2- Non.");
        System.out.println();

        do{
            try {
                System.out.print(" Entrer votre choix : ");
                gobelet = Integer.parseInt(scanner.nextLine());
                System.out.println();
            } catch (Exception e) {
                System.out.println("Veuillez entrer un choix valide");
            }
        }while(gobelet > 2 || gobelet< 1);                // on s'assure que les valeurs entrées par le user sont valides

        // switch pour chacun des cas (rajouter des cas si besoin)
        switch(gobelet) {
            case 1:
                aUnGobelet = true;
                System.out.println();
                System.out.println("Choix enregistré : OK");
                System.out.println("****************************************************************");
                TemperatureDeLEau();
                break;

            case 2 :
                aUnGobelet = false;
                System.out.println();
                System.out.println("Choix enregistré : OK");
                System.out.println("****************************************************************");
                System.out.println();

                // affichage d'une barre de progression en appelant la fonction printMsgWithProgressBar
                System.out.println("         -------------------------------------------");
                System.out.println("         |  Mis en place du gobelet recyclable...  |");
                System.out.println("         -------------------------------------------");
                System.out.println();
                printMsgWithProgressBar("Veuillez patienter...", 25, 60);
                TemperatureDeLEau();
                break;
        }
        
    }

    public static void TemperatureDeLEau() {
        System.out.println();
        System.out.println("         -------------------------------------------");
        System.out.println("         |         Préparation de l'eau            |");
        System.out.println("         -------------------------------------------");
        System.out.println();
        printMsgWithProgressBar("Veuillez patienter...", 100, 100);
        System.out.println();
        System.out.println();
        System.out.println("                           ------");
        System.out.println("La temperature de l'eau : | 85°C |");
        System.out.println("                           ------");
        System.out.println();
        System.out.println("****************************************************************");
        versementDuProduit();
    }

    private static void versementDuProduit() {
        System.out.println("         -------------------------------------------");
        System.out.println("         |    Versement de la boisson en cours     |");
        System.out.println("         -------------------------------------------");
        System.out.println();
        // affichage d'une barre de progression en appelant la fonction printMsgWithProgressBar
        printMsgWithProgressBar("Veuillez patienter...", 100, 120);
        System.out.println();
        System.out.println();
        System.out.println("Veuillez récupérer votre boisson");
        System.out.println();
        voirLesStocks();
        System.out.println("****************************************************************");


    }

    public static void Menu() {
        int choix=0;
        System.out.println("                                         -------------");
        System.out.println("                                       /             /|");
        System.out.println("                                      /             / |");
        System.out.println("                                      -------------   |");
        System.out.println("1- Café court                        | 0,30 euros  |  |");
        System.out.println("2- Café long                         | 0,30 euros  |  |");
        System.out.println("3- Expresso                          | 0,30 euros  |  |");
        System.out.println("4- Café court en grain               | 0,40 euros  |  |");
        System.out.println("5- Café long en grain                | 0,40 euros  |  |");
        System.out.println("6- Cappuccino                        | 0,35 euros  | /");
        System.out.println("7- Voir les stocks                    -------------");
        System.out.println("8- Quitter");
        System.out.println();
        
        do{
            try {
                System.out.print("Entrer votre choix : ");
                choix = Integer.parseInt(scanner.nextLine());
                System.out.println();
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre correct");
            }
        }while(choix < 1 || choix > 8);

        switch(choix) {
            case 1 :
                produit = "Cafe court";
                System.out.println("****************************************************************");
                System.out.println("Le prix du '" + produit + "' est : " + prixCafe +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCafe) {
                    argentRendu = argentInsere - prixCafe;
                    if(argentRendu > 0.01){
                        System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                        System.out.println();
                    }
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteCafeCourt = dosetteCafeCourt - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteCafeCourt);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();
                break;
            case 2 :
                produit = "Cafe long";
                System.out.println("Le prix du '" + produit + "' est : " + prixCafe +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCafe) {
                    argentRendu = argentInsere - prixCafe;
                    System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                    System.out.println();
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteCafeLong = dosetteCafeLong - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteCafeLong);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();
                break;
            case 3 :
                produit = "Expresso";
                System.out.println("Le prix du '" + produit + "' est : " + prixCafe +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCafe) {
                    argentRendu = argentInsere - prixCafe;
                    System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                    System.out.println();
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteExpresso = dosetteExpresso - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteExpresso);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();
                break;
            case 4 :
                produit = "Cafe court en grain";
                System.out.println("Le prix du '" + produit + "' est : " + prixCafeGrain +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCafeGrain) {
                    argentRendu = argentInsere - prixCafeGrain;
                    System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                    System.out.println();
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteCafeCourtEnGrain = dosetteCafeCourtEnGrain - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteCafeCourtEnGrain);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();                
                break;
            case 5 :
                produit = "Cafe long en grain";
                System.out.println("Le prix du '" + produit + "' est : " + prixCafeGrain +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCafeGrain) {
                    argentRendu = argentInsere - prixCafeGrain;
                    System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                    System.out.println();
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteCafeLongEnGrain = dosetteCafeLongEnGrain - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteCafeLongEnGrain);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();
                break;
            case 6 :
                produit = "Cappuccino";
                System.out.println("Le prix du '" + produit + "' est : " + prixCappuccino +" euros.");

                do{
                    try {
                        System.out.print("Insérez votre monnaire : ");
                        argentInsere = Double.parseDouble(scanner.nextLine());
                        System.out.println("Vous avez inséré : " + argentInsere + " euros.");
                    } catch (Exception e) {
                        System.out.println("Veuillez entrer une valeur de monnaie correct");
                    }
                }while(argentInsere <=0);

                if(argentInsere >= prixCappuccino) {
                    argentRendu = argentInsere - prixCappuccino;
                    System.out.println("Veuillez prendre votre monnaie : " + argentRendu + " euros.");
                    System.out.println();
                } else{
                    System.out.println("Montant inférieur au prix du produit choisit.");
                    System.out.println("Retour au menu...");
                    Menu();
                    }
                
                choixMenu = choix;
                dosetteCappuccino = dosetteCappuccino - 1;
                System.out.println("****************************************************************");
                System.out.println("Vous avez séléctionné : "+ produit);
                System.out.println("Dosettes restantes : " + dosetteCappuccino);
                System.out.println();
                System.out.println("****************************************************************");
                Sucre();
                break;
            case 7 :
                voirLesStocks(); // Appel de la fonction des stocks
                break;
            case 8 :
                System.out.println("Merci pour votre visite, Java Bucks vous remercie pour votre fidélité !");
                break;

        }
    }
        
    private static void voirLesStocks() {

        /*
         * Fonction qui va nous retourner les stocks des dosettes restantes 
         * 
         */
        int retourMenu = 0;
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println(" - Café court :                   " + dosetteCafeCourt +" dosettes restantes.");
        System.out.println(" - Café long :                    " + dosetteCafeLong +" dosettes restantes.");
        System.out.println(" - Expresso :                     " + dosetteExpresso +" dosettes restantes.");
        System.out.println(" - café court en grain :          " + dosetteCafeCourtEnGrain + " dosettes restantes.");
        System.out.println(" - Café long en grain :           " + dosetteCafeLongEnGrain + " dosettes restantes.");
        System.out.println(" - Cappuccino :                   " + dosetteCappuccino + " dosettes restantes.");
        System.out.println("****************************************************************");
        System.out.println(" Retourner au menu ?");
        System.out.println("1- Oui.");
        System.out.println("2- Quitter.");
        System.out.println();
        

        do {
            try {
                System.out.print("Entrez votre choix : ");
                retourMenu = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Erreur : veuillez entrer un choix valide.");
                voirLesStocks();
            }
        }while(retourMenu > 2 || retourMenu < 0);
        
        switch(retourMenu) {
            case 1:
                System.out.println();
                System.out.println("Retour au menu principal.");
                System.out.println("****************************************************************");
                Menu();
                break;
            case 2:
            System.out.println("Merci pour votre visite, Java Bucks vous remercie pour votre fidélité !");
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
