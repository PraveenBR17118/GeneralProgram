package SeleniumPrograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotCls 
{
	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("calc");
		Thread.sleep(1000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		for(int i=0;i<100;i++)
		{
			r.mouseMove(200,150);
			Thread.sleep(500);
		}
		
	}

}
