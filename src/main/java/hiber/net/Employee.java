package hiber.net;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
 private int id;
 private String name;
 private String place;
 @Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
 
 
}
