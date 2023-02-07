package application;
import recette.Ingredient;
import recette.Recette;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Bienvenu dans le logiciel du robot de cuisine
                    Créez des recettes en toute simplicité:
                    
                    quel nom souhaitez vous donner à votre recette ?
                    nom : """);
        Scanner sc = new Scanner(System.in);
        Recette recette = new Recette(sc.nextLine());
        String choix = "";
        while(!choix.toLowerCase().equals("n")){
            System.out.print("ingrédient n°"+recette.getNbIngredients()+1+" : \nnom de l'ingrédient : ");
            String nom = sc.nextLine();
            System.out.print("quantité de l'ingredient : ");
            Double quantite = sc.nextDouble();
            sc.nextLine();
            System.out.print("unité de l'ingrédient : ");
            String unite = sc.nextLine();
            recette.ajouterIngredient(new Ingredient(nom,quantite,unite));
            System.out.print("souhaitez vous ajouter un autre ingrédient ? (O/n)\n choix : ");
            choix = sc.nextLine();
        }
        System.out.println("\n\n"+recette.afficheRecette()+"("+recette.getNbIngredients()+" ingrédients)");
    }
}