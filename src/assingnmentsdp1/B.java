/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnmentsdp1;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
class B {
    ArrayList<Request> requests=new ArrayList<>();
     
    void addID(Request request) {
        requests.add(request);
    }
    boolean find(Request request){
        for(Request r: requests) {
             if(r.ID.equals(request.ID)==true)
                 return false;
        }
        return true;
    }
    //call it after fixed time    
    void Requestpass(D d) {
         
        //if(System.currentTimeMillis()-SDP.startTime > 5000)
            d.start(requests);
    }
    
}