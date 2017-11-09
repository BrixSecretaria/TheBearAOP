package bearaop.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/AppContext.xml");
		PolarBear polarBear = (PolarBear) context.getBean("polarBearBean", BearServiceLive.class);
		System.out.println("\nPolar Bear\n");
		polarBear.eat();
		polarBear.bath();
		polarBear.sleep();
		System.out.println("\nMountain Bear\n");
		MountainBear mountainBear = (MountainBear) context.getBean("mountainBearBean", BearServiceLive.class);
		mountainBear.eat();
		mountainBear.bath();
		mountainBear.sleep();
		context.close();
	}

}
