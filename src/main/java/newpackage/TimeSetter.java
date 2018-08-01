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
public class TimeSetter 
{
   
    private final int hour;
    private final int minute;

    public TimeSetter(int hour, int minute) 
    {
        this.hour = hour;
        this.minute = minute;
    }
    
    public int getHour() 
    {
        return hour;
    }

    public int getMinute() 
    {
        return minute;
    }
    
}
