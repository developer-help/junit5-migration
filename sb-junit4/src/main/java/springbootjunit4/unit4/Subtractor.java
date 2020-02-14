package springbootjunit4.unit4;

import org.springframework.stereotype.Component;

@Component
public class Subtractor {

	
	public Integer subtract(Integer a, Integer b) {
		return a - b;
	}
	
	
}
