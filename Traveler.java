
import java.util.Scanner;  
public class Traveler {
 String Name;
 int Age,current_lat,current_lon;
 private static int traveler_counter;
/**
 * @param name
 * @param age
 * @param current_lat
 * @param current_lon
 */
public Traveler(String name, int age, int current_lat, int current_lon) {
	
	this.Name = name;
	this.Age = age;
	this.current_lat = current_lat;
	this.current_lon = current_lon; 
	traveler_counter++;
	  
}
/**
 * @return the name
 */
public String getName() {
	return Name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return Age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	Age = age;
}
/**
 * @return the current_lat
 */
public int getCurrent_lat() {
	return current_lat;
}
/**
 * @param current_lat the current_lat to set
 */
public void setCurrent_lat(int current_lat) {
	this.current_lat = current_lat;
}
/**
 * @return the current_lon
 */
public int getCurrent_lon() {
	return current_lon;
}
/**
 * @param current_lon the current_lon to set
 */
public void setCurrent_lon(int current_lon) {
	this.current_lon = current_lon;
}
public void preference() {
	System.out.printf("what would like to visit the most : \r\n1)Museums\r\n2)Restaurants\r\n3)Cafe");
	 // Create a Scanner object
     String pr = new Scanner(System.in).nextLine();  // Read user input
}
public int getTraveler_counter() {
	return traveler_counter;
}
public void setTraveler_counter(int traveler_counter) {
	Traveler.traveler_counter++;
}
/*public  double Similarity(City ob) {
	
	return x;
	
}
 */
}
