package ch06._07_override;
class Human {
	int weight = 50;
	void smile() {
		System.out.println("Hi, ���ݩ�" + getClass().getName()+"���O");
	};
}
class OrdinaryPeople extends Human {
	protected void smile() {
		System.out.println("OrdinaryPeople: :)");
	};
}
class HappyMary extends OrdinaryPeople {
	protected void smile() {
		System.out.println("HappyMary :)");
	};
}
public class OverridingWhenExtends {
	public static void main(String args[]) {
		HappyMary hm = new HappyMary();
		hm.smile();
	}
}