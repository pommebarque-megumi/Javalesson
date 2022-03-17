public class 算数{
	public static void main(String[] args){
		int candy=48;
		String name="megumi";
		System.out.println( name + "さんはキャンディを" + candy + "個持っています");
		int children=9;
		System.out.println(children + "人の子どもたちに分けることにしました");
		System.out.println("1人に何個ずつあげられますか");
		System.out.println("式　" + candy + "÷" + children + "=" + candy / children);
		System.out.println("また、あまりはいくつになりますか？");
		System.out.println(candy % children);
	}
}
