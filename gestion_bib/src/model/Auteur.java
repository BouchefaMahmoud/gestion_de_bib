package model;

import java.util.Collection;



public class Auteur {
    private int id_auteur;
    private String nom;
    private String prenom;
    private Collection<Livre> livres ;  

   
    // constructor without books
    public Auteur(int id_auteur,String nom, String prenom) {
        this.id_auteur = id_auteur;
        this.nom = nom;
        this.prenom = prenom;
    }

    // constructor with books
    public Auteur(int id_auteur, String nom, String prenom, Collection<Livre> livres) {
        this.id_auteur = id_auteur;
        this.nom = nom;
        this.prenom = prenom;
        this.livres = livres;
    }
    
    

    public int getId_auteur(){
        return this.id_auteur; 
    }
    
    public String getNom(){
        return this.nom; 
    }

    public String getPrenom(){
        return this.prenom; 
    }

    public void setId_auteur(int id_auteur){
        this.id_auteur = id_auteur;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public Collection<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Collection<Livre> livres) {
        this.livres = livres;
    }

    
    @Override
    public String toString() {
        return "Auteur{" + "id_auteur=" + id_auteur + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

   
}