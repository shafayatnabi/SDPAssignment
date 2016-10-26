/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnmentsdp1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author USER
 */
class D {
    
    ArrayList<Request> requests;
    Queue<Token> tokens;

    public void start(ArrayList<Request> buffer) {
        this.requests = buffer;
        this.tokens = new LinkedList<>();
        genarate();
    }
    
    void genarate() {
        
        for(Request request: requests) {
            request.password = passGen(request);
            tokens.add(new Token(request.ID, request.password, System.currentTimeMillis()));
        }
        
    }
    
    Token processRequest(String ID) {
        for(Token token: tokens) {
            if(token.ID.equals(ID))
                return token;
        }
        return null;
    }
    
    String passGen(Request request) {
        return "CSE"+request.ID+new Random().nextInt(100)+1;
    }
    
}
