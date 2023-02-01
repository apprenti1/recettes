package recette;

import java.util.ArrayList;
import java.util.Arrays;

public class Recette {
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private String title;
    public void Recette(String titre){setTitle(titre);}
    public void ajouterIngredient(Ingredient ingredient){this.ingredients.add(ingredient);}
    public int getNbIngredients(){return this.ingredients.size();}
    public void changeQuantiteIngredient(int position, Double quantite){this.ingredients.get(position).setQuantite(quantite);}
    public ArrayList afficheIngredient(int position){return new ArrayList(Arrays.asList(this.ingredients.get(position).getNom(),this.ingredients.get(position).getQuantite(),this.ingredients.get(position).getUnite()));}


    //------getters&setters------//
    public ArrayList getIngredients() {return ingredients;}
    public void setIngredients(ArrayList ingredients) {this.ingredients = ingredients;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
}
