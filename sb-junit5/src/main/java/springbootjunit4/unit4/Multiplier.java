package springbootjunit4.unit4;

import org.springframework.stereotype.Component;

@Component
public class Multiplier {
	
	public Integer multiply(Integer a, Integer b) {
		return a*b;
	}

}
