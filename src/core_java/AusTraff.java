package core_java;

public class AusTraff implements Central_Traffice,ContinentalTraff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Central_Traffice a=new AusTraff();
		a.redStop();
		a.greenGo();
		a.yellowFlash();
		AusTraff at=new AusTraff();
		at.walkonGo();
		ContinentalTraff ct=new AusTraff();
		ct.trainS();
		

	}
	private void walkonGo()
	{
		System.out.println("Follow the walking guidline");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Follow the green guidline");
		
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Follow the yellow guidline");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Follow the red guidline");
		
	}
	@Override
	public void trainS() {
		// TODO Auto-generated method stub
		System.out.println("Follow the train guidline");
		
	}

}
