package model;

public class Utilisateur {

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;
    private String mdp;
    private char type;
    

    public Utilisateur(){

    }


    public Utilisateur(String nom, String prenom,String adresse,String tel,String email,String mdp,char type) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.type = type;
        this.mdp = mdp;
    }
    // geters

    
    public String getNom(){
        return this.nom; 
    }

    public String getPrenom(){
        return this.prenom; 
    }

    public String getAdresse(){
        return this.adresse; 
    }

    public String getTel(){
        return this.tel; 
    }

    public String getEmail(){
        return this.email; 
    }

    public char getType(){
        return this.type; 
    }

    // seters

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setType(char type){
        this.type = type;
    }
}