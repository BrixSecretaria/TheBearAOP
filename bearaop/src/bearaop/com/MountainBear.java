package bearaop.com;

public class MountainBear extends BearServiceLive{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat warm food."  
				 + "\n\tEat:"
				 + "\n\t*Wild Animals"
				 + "\n\t*Plants");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleep in warm bed.");
		System.out.println(" Read me branch mountain bear.");
	}
	@Override
	public void bath() {
		// TODO Auto-generated method stub
		System.out.println("Bath in warm shallow water.");
	}

}
