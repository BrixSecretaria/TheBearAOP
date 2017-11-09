package bearaop.com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BearAspect {
	@Before("prepareToEat()")
	public void foodCaughtAdvice(){
		System.out.println("Bear is ready to eat."
				+ "\nFood is prepared.");
	}
}
