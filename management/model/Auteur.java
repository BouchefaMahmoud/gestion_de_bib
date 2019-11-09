class Auteur {
    private int id_auteur;
    private String nom;
    private String prenom;
    

    public Auteur(){

    }

    public Auteur(int id_auteur,String nom, String prenom) {
        this.id_auteur = id_auteur;
        this.nom = nom;
        this.prenom = prenom;
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

    public String toString(){
        return nam + prenom;
    }
    
}