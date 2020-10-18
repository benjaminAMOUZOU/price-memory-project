package com.benjamin.pricememory.modele;

public class Article {

    private String libelle;
    private Double prix;
    private String Description;
    private String image;

    public Article() {
    }

    public Article(String libelle, Double prix, String description, String image) {
        this.libelle = libelle;
        this.prix = prix;
        Description = description;
        this.image = image;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
