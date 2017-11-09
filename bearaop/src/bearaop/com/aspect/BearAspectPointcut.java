package bearaop.com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BearAspectPointcut {
	
	//PolarBear Pointcuts
	
	@Pointcut("execution(* bearaop.com.PolarBear.eat(..))")
	public void polarBearEatPointCut(){}
	
	@Before("polarBearEatPointCut()")
	public void beforePolarBearEat(){
		System.out.println("BEFORE POLAR BEAR EATS:"
				+ "\n\tPolar Bear hunts for food."
				+ "\n\tPolar Bear is ready to eat.");
	}
	
	@After("polarBearEatPointCut()")
	public void afterPolarBearEat(){
		System.out.println("AFTER POLAR BEAT EATS:"
				+ "\n\tFood is devoured.");
	}
	
	@Pointcut("execution (* bearaop.com.PolarBear.bath(..))")
	public void polarBearBathPointCut(){}
	
	@Before("polarBearBathPointCut()")
	public void beforePolarBearBath(){
		System.out.println("BEFORE POLAR BEAR BATHES:"
				+ "\n\tPolar Bear secures area."
				+ "\n\tPolar Bear goes to cold water.");
	}
	
	@After("polarBearBathPointCut()")
	public void afterPolarBearBath(){
		System.out.println("AFTER POLAR BEAR BATHES:"
				+ "\n\tPolar Bear goes out of the water."
				+ "\n\tPolar Bear is fresh.");
	}
	
	@Pointcut("execution (* bearaop.com.PolarBear.sleep(..))")
	public void polarBearSleepPointCut(){}
	
	@Before("polarBearSleepPointCut()")
	public void beforePolarBearSleep(){
		System.out.println("BEFORE POLAR BEAR SLEEPS:"
				+ "\n\tPolar Bear goes to cold area.");
	}
	
	@After("polarBearSleepPointCut()")
	public void afterPolarBearSleep(){
		System.out.println("AFTER POLAR BEAR SLEEPS:");
	}
	
	//MountainBear Pointcuts
	
	@Pointcut("execution (* bearaop.com.MountainBear.eat(..))")
	public void mountainBearEatPointCut(){}
	
	@Before("mountainBearEatPointCut()")
	public void beforeMountainBearEat(){
		System.out.println("BEFORE MOUNTAIN BEAR EATS:"
				+ "\n\tMountain Bear hunts for food.");
	}
	
	@After("mountainBearEatPointCut()")
	public void afterMountainBearEat(){
		System.out.println("AFTER MOUNTAIN BEAR EATS:"
				+ "\n\tMountain Bear walks away.");
	}
	
	@Pointcut("execution (* bearaop.com.MountainBear.bath(..))")
	public void mountainBearBathPointCut(){}
	
	@Before("mountainBearBathPointCut()")
	public void beforeMountainBearBathPointCut(){
		System.out.println("BEFORE MOUNTAIN BEAR BATHES:"
				+ "\n\tMountain Bear goes to the river."
				+ "\n\tMountain Bear goes to warm water.");
	}
	
	@After("mountainBearBathPointCut()")
	public void afterMountainBearBathPointCut(){
		System.out.println("AFTER MOUNTAIN BEAR BATHES:"
				+ "\n\tMountain Bear goes out of warm water.");
	}
	
	@Pointcut("execution (* bearaop.com.MountainBear.sleep(..))")
	public void mountainBearSleepPointCut(){}
	
	@Before("mountainBearSleepPointCut()")
	public void beforeMountainBearSleepPointCut(){
		System.out.println("BEFORE MOUNTAIN BEAR SLEEPS:"
				+ "\n\tMountain Bear goes to warm area."
				+ "\n\tMountain Bear secures area.");
	}
	
	@After("mountainBearSleepPointCut()")
	public void afterMountainBearSleepPointCut(){
		System.out.println("AFTER MOUNTAIN BEAR SLEEPS:"
				+ "\n\tMountain Bear takes a walk.");
	}

	//Pointcut for all method eat() (PolarBear and Mountain Bear)

	@Pointcut("execution(* bearaop.com.BearServiceLive.eat(..))")
	public void allBearServiceLiveMethodEatPointCut(){}
	
	@Before("allBearServiceLiveMethodEatPointCut()")
	public void beforeServiceLiveMethodEatExecute(){
		System.out.println(" !Bear is hungry");
	}
	
	@After("allBearServiceLiveMethodEatPointCut()")
	public void afterServiceLiveMethodEatExecute(){
		System.out.println(" !Bear is full");
	}
	
	//Pointcut for all method bath() (PolarBear and MountainBear)
	
	@Pointcut("execution (* bearaop.com.BearServiceLive.bath(..))")
	public void allBearServiceLiveMethodBathPointCut(){}
	
	@Before("allBearServiceLiveMethodBathPointCut()")
	public void beforeAllBearServiceLiveMethodBathPointCut(){
		System.out.println(" !Bear is smelly.");
	}
	
	@After("allBearServiceLiveMethodBathPointCut()")
	public void afterAllBearServiceLiveMethodBathPointCut(){
		System.out.println(" !Bear shakes the water off.");
	}
	
	//Pointcut for all method sleep() (PolarBear and MountainBear)
	
	@Pointcut("execution(* bearaop.com.BearServiceLive.sleep(..))")
	public void allBearServiceLiveMethodSleepPointCut(){}
	
	@Before("allBearServiceLiveMethodSleepPointCut()")
	public void beforeAllBearServiceLiveMethodSleepPointCut(){
		System.out.println(" !Bear is sleepy.");
	}
	
	@After("allBearServiceLiveMethodSleepPointCut()")
	public void afterAllBearServiceLiveMethodSleepPointCut(){
		System.out.println(" !Bear wakes up.");
	}
}
