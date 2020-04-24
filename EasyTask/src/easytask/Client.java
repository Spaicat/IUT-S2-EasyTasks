/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

/**
 *
 * @author itsia
 */
public class Client extends Utilisateur{
    private String login;
    private String password;
    
    public Client(String log, String psw){
        super(log, psw);
    }
}
