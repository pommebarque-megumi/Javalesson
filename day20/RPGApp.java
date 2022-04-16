import java.util.*;
public class RPGApp{
	public static void main(String[] args){
		Hero hero1 = new Hero();
		hero1.name="ジェシカ";
		hero1.hp=100;
		hero1.slip();
		System.out.println("HP"+hero1.hp);
		hero1.sleep();
		hero1.slip();
		hero1.sit(3);
		System.out.println("HP"+hero1.hp);

		Hero hero2 = new Hero();
		hero2.name="ククル";
		hero2.hp=100;
		hero2.slip();

		Matango m1 = new Matango();
		m1.suffix='A';
		Matango m2 = new Matango();
		m2.suffix='B';
		m1.run();
		m2.run();

		Cleric cleric=new Cleric();
		cleric.name="クリフト";
		cleric.selfAid();
		int recover = cleric.pray(3);

		hero2.run();
		hero1.run();
	}
}
