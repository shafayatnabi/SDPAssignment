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
public class Advisor  extends Teacher{

    private B faculty;
     
    public Advisor(String name,B b) {
        super(name);
        this.faculty=b;
    }
    boolean  accept(Request request) {
       synchronized(faculty){
        //check if exists in the global buffer already
        if(faculty.find(request)==false)
            return false;
         
       
        faculty.addID(request);
        return true;
       }
       
       
    }
    public void setFaculty(B faculty) {
        this.faculty = faculty;
    }
    public void add(Teacher t) {
    //this is leaf node so this method is not applicable to this class.
  } 
    public void remove(Teacher t){
      //this is leaf node so this method is not applicable to this class.   
    }
    
}
