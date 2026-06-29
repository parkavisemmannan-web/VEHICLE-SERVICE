package day12MiniProject;
import java.util.*;
abstract class VehicleService{
	String customerName;
	String vehicleNumber;
	String serviceType;
	VehicleService(String customerName,String vehicleNumber,String serviveType){
		this.customerName=customerName;
		this.vehicleNumber=vehicleNumber;
		this.serviceType=serviveType;
	}
	abstract double calculateServiceCharge();
	void displayServiceDetails() {
		System.out.println("CustomerName:"+customerName);
		System.out.println("VehicleNumber:"+vehicleNumber);
		System.out.println("ServiceType:"+serviceType);
	}
}
class CarService extends VehicleService{
	double sparePartsCost;
	CarService(String customerName,String vehicleNumber,String serviveType,double sparePartsCost){
		super( customerName,vehicleNumber,serviveType);
		this.sparePartsCost=sparePartsCost;
	}
    double calculateServiceCharge() {
	double serviceCharge=2000+sparePartsCost;
      displayServiceDetails();
      System.out.println("SparePartsCost:"+sparePartsCost);
	  System.out.println("ServiceCharge:"+serviceCharge);
		return serviceCharge;
	}
}
class BikeService extends VehicleService{
	double sparePartsCost;
	BikeService(String customerName,String vehicleNumber,String serviveType,double sparePartsCost){
		super(customerName,vehicleNumber,serviveType);
		this.sparePartsCost=sparePartsCost;
	}
	 double calculateServiceCharge() {
			double serviceCharge=800+sparePartsCost;
		    displayServiceDetails();
				System.out.println("SparePartsCost:"+sparePartsCost);
				System.out.println("ServiceCharge:"+serviceCharge);
				return serviceCharge;
			}
}

public class VehicleServiceSystem {
public static void main(String[]args) {
	VehicleService v;
	v=new CarService("PARKAVI","TN10AB1234","General Servive",3500.0);
	v.calculateServiceCharge(); 
	v=new BikeService("MANJU","TN11CD5678","Oil Service",1200.0);   
	v.calculateServiceCharge();
}
}
