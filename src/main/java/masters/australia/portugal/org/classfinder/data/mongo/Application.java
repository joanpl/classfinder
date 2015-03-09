package masters.australia.portugal.org.classfinder.data.mongo;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// implements CommandLineRunner
@SpringBootApplication
public class Application{
	
	@Autowired
	private VenueRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.deleteAll();
//		
//		
//		//save a couple of Venues
//		
//		repository.save(new Venue("gym balham"));
//		repository.save(new Venue("gym melbourne"));
//		
//		//fetch venues
//		System.out.println(" --- findall() --- ");
//		for (Venue venue : repository.findAll()) {
//			
//			System.out.println(venue);
//		}
//		
//		System.out.println();
//		
//		// fecht an individual venue
//		
//		System.out.println("Venue found with findByName('gym balham')");
//		System.out.println(" ------------------------------------ ");
//		
//		
//	}
	
}