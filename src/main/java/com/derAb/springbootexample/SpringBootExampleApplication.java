package com.derAb.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@GetMapping("/greet")
	public GreetResponse greeting(){
		return new GreetResponse("Hello Everyone");
	}

	// record GreetResponse(String greet){}

	class GreetResponse {
		private final String greet;

		GreetResponse(String greet) {
			this.greet = greet;
		}

		public String getGreet() {
			return greet;
		}

		@Override
		public String toString() {
			return "GreetResponse{" +
					"greet='" + greet + '\'' +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			GreetResponse that = (GreetResponse) o;
			return Objects.equals(greet, that.greet);
		}

		@Override
		public int hashCode() {
			return Objects.hash(greet);
		}
	}

}
