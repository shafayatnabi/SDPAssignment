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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SDP {
    
    
    
    public static long time;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        time=System.currentTimeMillis();
        
        FileReader file=new FileReader("input.txt");
        Scanner s=new Scanner(file);
        D d= new D();
        
        B b= new B();
        
        
        //Student student1 = new Student("Shafayat", "22");
        Student[] std=new Student[30];
        String name,id,line;
        name="";id="";line="";
        Advisor[] advisor=new Advisor[3];        
        advisor[0]=new Advisor("x",b);
        advisor[1]=new Advisor("y",b);
        advisor[2]=new Advisor("z",b);
        int j=0;
        Random r=new Random();
       
        while(s.hasNextLine())
        {   
           line=s.nextLine();
            //System.out.println(line);
           int i;
           for( i=0;i<line.length();i++){
               if(line.charAt(i)==' ')
                    break;
               name+=line.charAt(i);
           }
           
           id=line.substring(i+1,line.length());
           int x=r.nextInt(3)+0;
            //System.out.println(name +" "+id);
           std[j]=new Student(name, id,advisor[x]);
           std[j].start();
           //std[j].submit(teacher[x]);
           j++;
          name="";
        }
        
        for(int i=0;i<j;i++) {
            std[i].join();
        } 
      
        
        b.Requestpass(d);
        
       for(int i=0;i<j;i++) {
            std[i].checkforpassword(d);
        } 
        
    }
    

    
}
