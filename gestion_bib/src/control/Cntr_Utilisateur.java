/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import dao.DAO;
import model.* ;

public class Cntr_Utilisateur {
    
   private static DAO dao = null ; 
    static {
        dao  = new DAO(); 
    }
    
    
    public static void ajouter(Utilisateur u ){
       
        dao.ajouter_user(u);
    }
    
}
