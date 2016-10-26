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
class Request {
    String ID, password;
    long sub_time; 

    public Request(String ID, long sub_time) {
        this.ID = ID;
        this.sub_time = sub_time;
    }
}