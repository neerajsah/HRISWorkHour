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
public class CountPunches 
{
    int count=0;
    
    public int countPunches(String toolTipText)
  {
      
     for(int i=0;i<toolTipText.length();i++)
        {
          if(toolTipText.charAt(i)==',')
          {
             count++;  
          }  
        }
    
     return count;
  }
    
}
