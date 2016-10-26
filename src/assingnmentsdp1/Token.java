/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnmentsdp1;

/**
 *
 * @author USER
 */
class Token {
    String ID, password;
    long completion_time;

    public Token(String ID, String password, long time) {
        this.ID = ID;
        this.password = password;
        completion_time = time;
    }
}
