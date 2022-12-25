package Polimorfizm;

public class Main {

	public static void main(String[] args) {
		Employee Ahmet=new Employee("ahmet","selçuk");
		Employee Hasan=new Employee("Hasan","Hüseyin",6500);
		Employee Leyla=new Engineer("Leyla","Mecnun");
		Employee Ali=new Engineer("Ali","Veli",15001);
		Engineer Yasar =new Engineer("Yasar","Yasamaz");
		Ahmet.info();
		Hasan.info();
		Leyla.info();
		Ali.info();
		Yasar.info();
	}

}
