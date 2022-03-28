import java.util.*;
public class Color{
	public static void main(String[] args){
		System.out.print("何色>");
		String color = new Scanner(System.in).next();
		switch(color){
			case "赤":
				System.out.print("Red");
				break;
			case "青":
				System.out.print("Blue");
				break;
			case "黄":
			case "黄色":
				System.out.print("Yellow");
				break;
			default:
				System.out.print("Unknown");
		}
	}
}
