/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Metier;

import java.util.ArrayList;

/**
 *
 * @author itsia
 */
public class Catalogue {
    private ArrayList<Materiel> materielList;
    private ArrayList<ActiviteType> activiteTypeList;
    
    public Catalogue(){
        this.materielList = new ArrayList<Materiel>();
        this.activiteTypeList = new ArrayList<ActiviteType>();
    }
}
