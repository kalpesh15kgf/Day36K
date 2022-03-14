abstract class ShopAcc{
	private int accNO;
	private String accNo;
	private float charges;

  public void setNo(int i) {
	accNO = 1;
}
  public int getNo() {
	  return accNO;
  }
  
  public Void setNm(String j) {
	   accNo = j;
	return null;
  }
  public String getNm(){
	  return accNo;
  }
  public void setch(float k) {
	  charges = k;
  }
  public float getch() {
	 return charges; 
  }
 public void bookproduct() {
	 
}
  
  public void items() {
	  
  }
  
  public String toString() {
	return toString();
  }
  abstract class PrimeAcc extends ShopAcc{
	  private boolean isPrime;
	  private float deliverycharge;
	  
	 public void setPr(boolean l) {
		 isPrime = l ;
	 }
	 
	 public boolean getPr() {
		 return isPrime;
	 }
	 
	 public void setd(float m) {
		 deliverycharge = m;
	 }
	 public float getd() {
		 return deliverycharge;
	 }
	 abstract public void bookProdcut();
	 
	 abstract public String toString();
  }
  abstract class NormalAcc extends ShopAcc{
	  private float deliverycharge;
	  abstract public void bookproduct();
	  abstract public String toString();
  }
  
 abstract class GSNormalAcc extends NormalAcc{
	 public void bookprodcut() {
		 
	 }
	 
	 public String toString() {
		 String demo2 = "demo_2";
		 return demo2;
	 }
 }
 class GSShopfactory extends ShopFactory{
	 public PrimeAcc getNewPrimeAcc() {
		return null;
		 
	 }
	 public NormalAcc getNewNormalAcc() {
		return null;
		 
	 }
 }
 
 abstract public static class ShopFactory{
	 abstract public PrimeAcc getNewPrimeAcc();
	 abstract public NormalAcc getNewNormalAcc();


	public static void main(String[] args) {
		// TODO Auto-generated method kalpesh stub 
	
	}

}
 }
