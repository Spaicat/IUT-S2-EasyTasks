/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.util.ArrayList;

/**
 *
 * @author itsia
 */
public class Catalogue {
    private ArrayList<Matériel> materielList;
    private ArrayList<ActivitéType> activiteTypeList;
    
    public Catalogue(){
        this.materielList = new ArrayList<Matériel>();
        this.activiteTypeList = new ArrayList<ActivitéType>();
    }
}
