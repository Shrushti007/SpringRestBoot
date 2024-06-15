package example.spring.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Marks this class as a REST controller
public class SpringRestController {
	@RequestMapping("/doGreet")
	public String sayGreeting() {
		return "Hellooooo,Spring REST welcomes you all!!!";
	}
	@RequestMapping("/one-Person")
	public Person getOnePerson() {
		Person personObj= new Person("Bhushan", "Pradhan", 30, "Actor");
		return personObj;
	}
	@RequestMapping("/All-Person")
	public Collection<Person> getAllPerson(){
		Person personObj1= new Person("Monika", "xyz", 28, "Java");
		
		Person personObj2= new Person("Chetana", "srt", 25, "AJava");
		
		Person personObj3= new Person("Shreya", "pqr", 22, "C++");
		
		Person personObj4= new Person("Pallavi", "abc", 24, "Ds");
		
	
		
		List<Person> allPersons = List.of(personObj1,personObj2,personObj3,personObj4);
		return allPersons;
	}
}
