package studio7;

public class Die {
	private int sides;
	public Die(int nums) {
		// TODO Auto-generated constructor stub
		sides = nums;
	}
	
	public int randomSide() {
		
		return (int)(Math.random()*sides+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dice = new Die(7);
		System.out.println(dice.randomSide());
	}

}
