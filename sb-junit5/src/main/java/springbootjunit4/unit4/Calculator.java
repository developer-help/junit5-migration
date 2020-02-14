package springbootjunit4.unit4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Autowired
	Adder adder;
	
	@Autowired
	Subtractor subtractor;
	
	@Autowired
	Multiplier multiplier;
	
	
	public Integer subtract(Integer a, Integer b) {
		if( a < b) {
			throw new IllegalArgumentException("first argument cannot be less than second");
			
		}
		
		return subtractor.subtract(a, b);
	}
	
	public Integer multiplier(Integer a, Integer b) {
		if(a == 0 || b == 0) {
			throw new IllegalArgumentException("Input cannot be zero");
		}
		
		return multiplier(a, b);
	}

	public Integer add(Integer a, Integer b) {
		if(a <0 || b < 0) {
			throw new IllegalArgumentException("Invalid input positive integers only");
		}
		return adder.add(a, b);
	}

}
