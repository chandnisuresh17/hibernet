package hiber.net;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
   private int id;
   private String name;
   @OneToOne
   private Employee e;
   
    public Employee getE() {
	return e;
}
public void setE(Employee e) {
	this.e = e;
}
	private String place;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
    
    
}
