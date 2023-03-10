package recette;

public class Ingredient {
    private String nom;
    private Double quantite;
    private String unite;

    public Ingredient(String nom, Double quantite, String unite){
        setNom(nom);
        setQuantite(quantite);
        setUnite(unite);
    }

    public String afficher(){
        return this.quantite+" "+this.unite+"\t|\t"+this.nom;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public Double getQuantite() {return quantite;}
    public void setQuantite(Double quantite) {this.quantite = quantite;}
    public String getUnite() {return unite;}
    public void setUnite(String unite) {this.unite = unite;}
}
