/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnmentsdp1;

import java.util.ArrayList;
import java.util.Queue;

class Teacher {
    private String name;
    private ArrayList <Teacher> teacher;
    

    public Teacher(String name) {
        
        this.name=name;
    }
    public void add(Teacher t){
        teacher.add(t);
    }
    public void remove(Teacher t){
        teacher.remove(t);
    }
    
    

    

    public void setName(String name) {
        this.name = name;
    }
       
    public String getName() {
        return name;
    }
    
}

