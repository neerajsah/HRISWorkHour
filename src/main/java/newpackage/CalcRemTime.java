/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author neerajsah
 */
public class CalcRemTime {
    
    
  public void calcRemTime(int hh,int mm,String[] temp)
  {
      
      
      int temp_hh=8,temp_mm=0,mm1=0,hh1=0,hh2=0,mm2=0;
    if(hh<8){
      if(temp_mm<mm)
     {
       temp_mm+=60;
       temp_hh--;
       mm1+=temp_mm-mm;
      }
    else
    {
      mm1+=temp_mm-mm;
    }
    
    hh1+=temp_hh-hh;
    
    
    
    hh2=(Integer.parseInt(temp[0]))+hh1;
    mm2=(Integer.parseInt(temp[1]))+mm1;
    
    if(mm2>=60)
        {
          hh2+=mm2/60;
          mm2=mm2%60;
        }
    
    JOptionPane.showMessageDialog(null, "You have worked: "+hh+" hours "+mm+" minutes"+
            "\nYou have to work "+hh1+" hours "+mm1+" minutes more"
            +"\nYou can leave by: "+hh2+" "+mm2);
    
        System.out.println("\nYou have worked: "+hh+" hours "+mm+" minutes"+
            "\nYou have to work "+hh1+" hours "+mm1+" minutes more"
            +"\nYou can leave by: "+hh2+" "+mm2);
    }
    else{
     mm1+=mm-temp_mm;
     hh1+=hh-temp_hh;
        
    JOptionPane.showMessageDialog(null, "You have worked: "+hh+" hours "+mm+" minutes"+
            "\nYou are late by "+hh1+" hours "+mm1+" minutes");
    
        System.out.println("\nYou have worked: "+hh+" hours "+mm+" minutes"+
            "\nYou are late by "+hh1+" hours "+mm1+" minutes");
    }
  }
    
}
