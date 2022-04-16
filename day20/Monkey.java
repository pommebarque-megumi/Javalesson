import java.util.*;
public class Monkey{
	String name;
	int age;
	public void greeting(){
		System.out.printf("こんにちは%s(%d)です。よろしくね！%n",this.name,this.age);
	}
	public void takeuma(){
		System.out.printf("%sは上手に竹馬に乗った！%n",this.name);
	}
	public void sakadachi(){
		System.out.printf("%sは上手に逆立ちした！%n",this.name);
	}
}
