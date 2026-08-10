/*5. Smart Home Automation System
A company develops a smart home application.
Requirements:
•	Create an abstract class SmartDevice. 
•	Create child classes SmartLight, SmartFan, and SmartAC. 
•	Every device performs its own operation. 
•	Every device supports Wi-Fi connectivity. 
•	Device serial number cannot be modified. 
•	Initialize device details using the parent constructor. 
•	Control devices through a common SmartDevice reference. 
•	The manufacturer's security policy method must not be overridden. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Method Overriding 
•	Dynamic Polymorphism 
•	super() Constructor 
•	final Method 
•	Loose Coupling*/

import java.util.*;
interface Wifi
{
	void wifi();
}
abstract class SmartDevice implements Wifi
{
	int serialNo;
	String deviceName;
	SmartDevice(int serialNo,String deviceName)
	{
		this.serialNo = serialNo;
		this.deviceName = deviceName;
	}
	void display()
	{
		System.out.println("Seial Number: "+serialNo);
		System.out.println("Device Name: "+deviceName);
	}
	final void securityPolicy()
	{
		System.out.println("Security Policy Applied");
	}
	abstract void operate();
}
class SmartLight extends SmartDevice
{
	SmartLight(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	void operate()
	{
		System.out.println("Smart Light is ON");
	}
	public void wifi()
	{
		System.out.println("Wifi is connected");
	}
}
class SmartFan extends SmartDevice
{
	SmartFan(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	void operate()
	{
		System.out.println("Smart Fan is Running");
	}
	public void wifi()
	{
		System.out.println("Wifi is connected");
	}
}
class SmartAC extends SmartDevice
{
	SmartAC(int serialNo,String deviceName)
	{
		super(serialNo,deviceName);
	}
	void operate()
	{
		System.out.println("Smart AC Cooling Started");
	}
	public void wifi()
	{
		System.out.println("Wifi is connected");
	}
}
class Q5ScenarioSmartdevice
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Serial Number");
		int serialNo = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Device Name");
		String deviceName = xyz.nextLine();
		
		System.out.println("1.SmartLight");
		System.out.println("2.SmartFan");
		System.out.println("3.SmartAC");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		SmartDevice s;
		
		switch(choice)
		{
			case 1:
				s = new SmartLight(serialNo,deviceName);
				s.display();
				s.operate();
				s.wifi();
				break;
				
			case 2:
				s = new SmartFan(serialNo,deviceName);
				s.display();
				s.operate();
				s.wifi();
				break;
				
			case 3:
				s = new SmartAC(serialNo,deviceName);
				s.display();
				s.operate();
				s.wifi();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}