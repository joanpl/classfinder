package masters.australia.portugal.org.classfinder.data.mongo;

//import java.util.List;

import org.joda.time.LocalDate;
//import org.opengis.geometry.primitive.Point;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


public class Venue {
	
	@Id private String id;
	
	private String name;
	
	private String description;
	
	private LocalDate insertionDate;
		
	//private Point location;
	
	//private List<ClassType> classTypes;
	
	private String contact;

	
	public Venue(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(LocalDate insertionDate) {
		this.insertionDate = insertionDate;
	}

//	public Point getLocation() {
//		return location;
//	}
//
//	public void setLocation(Point location) {
//		this.location = location;
//	}

//	public List<ClassType> getClassTypes() {
//		return classTypes;
//	}
//
//	public void setClassTypes(List<ClassType> classTypes) {
//		this.classTypes = classTypes;
//	}
	

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	@Override
	public String toString() {
		return String.format("Venue [id=%s, name='%s']" );
	}

}
