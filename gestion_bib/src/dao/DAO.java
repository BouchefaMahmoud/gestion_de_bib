/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Utilisateur;

public class DAO implements DAO_Interface{

    
    private Connection con = null; 


    @Override
    public void ajouter_user(Utilisateur u) {
           con =  Connexion.getConnection();
      
        try {
            //nom	prenom	adresse	tel	email	mdp	type

            PreparedStatement req =  con.prepareStatement("insert into utilisateur(nom,prenom,adresse,tel,email,mdp,type) values (?,?,?,?,?,?,?); ");
            req.setString(1, u.getNom());
            req.setString(2, u.getPrenom());
            req.setString(3, u.getAdresse());
            req.setString(4, u.getTel());
            req.setString(5, u.getEmail());
            req.setString(6, u.getMdp());
            req.setString(7,String.valueOf(u.getType()));
           req.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            
            
          
        
        
    }


  
    
}
