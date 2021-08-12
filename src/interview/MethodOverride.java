package interview;

public class MethodOverride extends MethodOverload {
	@Override
	public void empId(String name) {
		System.out.println("String name:"+name);
		
		super.empId(name);
		
	}
  @Override
public void empId(int id, long mobile) {
	  System.out.println("int id:"+id+"long mobile:"+mobile);
	
	super.empId(id, mobile);
}
  
  public MethodOverride() {
	System.out.println("default");
}
  public static void meaning() {
	System.out.println();

}
  public static void main(String[] args) {
	MethodOverride m = new MethodOverride();
	m.empId("rama");
	m.empId(123, 936051057);

}

}
