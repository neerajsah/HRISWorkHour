/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author neerajsah
 */
public class CalcTime 
{
    
          
  WebDriver driver;
  TimeSetter timesetter;
  String toolTipText,currentTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
  String[][] time;
  String[] temp=currentTime.split(":");
  int count=0,mm=0,hh=0;
  
  public CalcTime(WebDriver driver,String toolTipText)
  {  this.driver=driver;
     this.toolTipText=toolTipText;
  }
  

  
  public void addCurrentTime()
  {
    if((count+1)%2!=0)
    {
      int len=time.length;
        System.arraycopy(temp, 0, time[len-1], 0, 3);//        System.out.print(time[len-1][i]+" ");
    }
  }
  
  public TimeSetter calcWork(int temp_hh1,int temp_hh2,int temp_mm1,int temp_mm2)
  {
      int hour=0,minute=0;
             if(temp_mm2<temp_mm1)
             {
               temp_mm2+=60;
               temp_hh2--;
               minute+=temp_mm2-temp_mm1;
             }
             else
             {
                 minute+=temp_mm2-temp_mm1;
             }
             
             hour+=temp_hh2-temp_hh1;

     return new TimeSetter(hour,minute);
  }
   
  
  
  public TimeSetter convMMToHH(int hour,int minute)
  {
    if(minute>=60)
        {
          hour+=minute/60;
          minute=minute%60;
        }
    
    return new TimeSetter(hour,minute);
  }
 
  
  
  public void calcTime()
  {  
         CalcRemTime calcRemTime=new CalcRemTime();
         CountPunches countPunches=new CountPunches();
         SplitTimes splitTimes=new SplitTimes(); 
    
        count=countPunches.countPunches(toolTipText);
//        System.out.println(toolTipText);
        time=splitTimes.splitTimes(toolTipText, count);
        addCurrentTime();
        int temp_hh1=0,temp_hh2=0,temp_mm1=0,temp_mm2=0;
        
        for(int i=0;i<time.length;)
        {
            if(i%2==0)
            {
                i++;
            }
            else if((i+1)!=time.length+1)
            {
             temp_hh1=Integer.parseInt(time[i-1][0]);
             temp_mm1=Integer.parseInt(time[i-1][1]);
             
             temp_hh2=Integer.parseInt(time[i][0]);
             temp_mm2=Integer.parseInt(time[i][1]);
             
             TimeSetter result=calcWork(temp_hh1,temp_hh2,temp_mm1,temp_mm2);
             hh+=result.getHour();
             mm+=result.getMinute();
            
             i++;
            }
        }
        
        TimeSetter result=convMMToHH(hh,mm);
        hh=result.getHour();
        mm=result.getMinute();    
        
        calcRemTime.calcRemTime(hh, mm, temp);
        

  }
}
