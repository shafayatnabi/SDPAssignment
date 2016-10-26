/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnmentsdp1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class Student extends Thread{
    String name, ID, password;
    int sleep;
    Advisor t;
    long start;
    int pos;
    int[] a={500,700,900};
    Random r=new Random();
    public Student(String name, String ID,Advisor t) {
        this.name = name;
        this.ID = ID;
        this.t=t;
        pos=r.nextInt(3)+0;
        
    }
    
    void submit(Advisor t) {
        
        synchronized(t){
            start = System.currentTimeMillis();
        boolean res= t.accept(new Request(ID, start));
        if(res==false) System.out.println(name+ " Request is denied from "+t.getName());
        else System.out.println(name+ " Request is accepted by "+t.getName());
        }
    }
    
    void checkforpassword(D d) {
        
        Token student_pass=d.processRequest(ID);
        if(student_pass!=null) {
            System.out.println("Received password: name="+name+" ID="+ID+" password: "+student_pass.password);
            System.out.println("requesting on "+(start-SDP.time)+"ms request completed on: " +(student_pass.completion_time-SDP.time)+ "ms" );
        }
       
        else {
            System.out.println("No password data for name="+name+" ID="+ID);
        }
    }
    @Override
    public void run(){
        try {
            Thread.sleep (a[pos]);
        } catch (InterruptedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        submit(t);
    }
   public String getname(){
       return name;
   }
     public String getID(){
       return name;
   }
     
} 

