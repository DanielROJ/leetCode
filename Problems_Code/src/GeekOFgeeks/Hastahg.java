/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeekOFgeeks;

/**
 *
 * @author Daniel Rojas  danielRoj
 */
public class Hastahg {
    public static void main(String[] args) {
       
     int value = 73;
     
     int base = ((value/10) * 10) + 10;
     
   
   if(value>40){
   
       if(value%5 == 0){
           System.out.println("Aprobo no Se reliza redondeo");
       }else
   if(value<(base-5)){
       if((base-5)-value <3){
           System.out.println("Redondeo: "+(value+= (base-5-value)));
       }else{
           System.out.println("Aprobo no Se reliza redondeo:" + value);
       }
   }else{
       if(base - value <3){
             System.out.println("Redondeo: "+(value+= (base-value)));
       }else{
           System.out.println("Aprobo no Se reliza redondeo :" + value);
       }
   }
     
     
   }else{
       System.out.println("reprobo");
   }
        
        
        
    }
}