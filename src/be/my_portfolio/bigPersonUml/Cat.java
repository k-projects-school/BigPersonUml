package be.my_portfolio.bigPersonUml;

public class Cat extends Pet {
	
	private static final int AGE_MODIFIER = 9;

	@Override
	public void beCute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateRealAge() {
		this.setRealAge(this.getAge() * AGE_MODIFIER);
	}

}
