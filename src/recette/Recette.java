package recette;

import java.util.ArrayList;
import java.util.Arrays;

public class Recette {
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private String title;
    public Recette(String titre){setTitle(titre);}
    public void ajouterIngredient(Ingredient ingredient){this.ingredients.add(ingredient);}
    public void supprimerIngredient(int pos){this.ingredients.remove(pos);}
    public int getNbIngredients(){return this.ingredients.size();}
    public void changeQuantiteIngredient(int position, Double quantite){this.ingredients.get(position).setQuantite(quantite);}
    public String afficheIngredient(int position){return this.ingredients.get(position).afficher();}
    public String afficheRecette(){
        String recette = this.title+" :\n";
        for (Ingredient ingredient:this.ingredients) {
            recette += "\t- "+ingredient.afficher()+"\n";
        }
        return recette;
    }


    //------getters&setters------//
    public ArrayList<Ingredient> getIngredients() {return ingredients;}
    public void setIngredients(ArrayList<Ingredient> ingredients) {this.ingredients = ingredients;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
}
