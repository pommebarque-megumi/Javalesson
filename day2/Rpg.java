public class Rpg{
	public static void main(String[] args){
    String name="ユーリ";
		int hp=100;
		System.out.println("スライムが出てきた！");
		System.out.println("スライムの先制攻撃！");
		System.out.println(name+"は30のダメージを受けた");
		hp=hp-30;
    System.out.println(name+"("+ hp +")");
		System.out.println("スライムの連続攻撃！");
		System.out.println(name+"は70のダメージを受けた");
		hp=hp-30;
    System.out.println(name+"("+ hp +")");
		System.out.println(name+"は力尽きて倒れた");
		System.out.println("GAME OVER");
	}
}
