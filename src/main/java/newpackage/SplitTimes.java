/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author neerajsah
 */
public class SplitTimes 
{
    public String[][] splitTimes(String toolTipText,int count)
  {
      
     String[] punches = toolTipText.split(",");
        punches[0]=punches[0].substring(9);
        
        for(int i=0;i<count+1;i++)
        {
            punches[i] = punches[i].trim();
        }
        
    String[][] time=new String[count+2][3];
       
        for(int i=0;i<count+1;i++)
        {
          for(int j=0;j<3;j++)
          {
             time[i]=punches[i].split(":"); 
             
//            System.out.print(time[i][j]+" ");
          }
        }
//        System.out.println();
        
        return time;     
  }  
     
}
