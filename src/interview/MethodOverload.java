package interview;

public class MethodOverload {
	public void empId(String name) {
		System.out.println("string name:"+name);
		

	}
	public void empId(int id,long mobile) {
		System.out.println("integer id:"+id+"long mobile:"+mobile);

	}

}
