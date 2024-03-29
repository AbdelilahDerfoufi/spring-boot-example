package com.derAb.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/customer")
public class SpringBootExampleApplication {

	private final CustomerRepository customerRepository;

	public SpringBootExampleApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
//
//	@GetMapping("/greet")
//	public GreetResponse greeting(){
//		return new GreetResponse("Hello Everyone",List.of("C++","Php","Java"), new Person("Der Ab", 26, 1000));
//	}
//
//	record Person(String name, int age, double savings){}
//
//	record GreetResponse(String greet,
//						 List<String> favProgrammingLanguages,
//						 Person person){}

//	class GreetResponse {
//		private final String greet;
//
//		GreetResponse(String greet) {
//			this.greet = greet;
//		}
//
//		public String getGreet() {
//			return greet;
//		}
//
//		@Override
//		public String toString() {
//			return "GreetResponse{" +
//					"greet='" + greet + '\'' +
//					'}';
//		}
//
//		@Override
//		public boolean equals(Object o) {
//			if (this == o) return true;
//			if (o == null || getClass() != o.getClass()) return false;
//			GreetResponse that = (GreetResponse) o;
//			return Objects.equals(greet, that.greet);
//		}
//
//		@Override
//		public int hashCode() {
//			return Objects.hash(greet);
//		}
//	}

	@GetMapping
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}
