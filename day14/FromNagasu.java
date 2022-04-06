public class FromNagasu{
	public static void main(String[] args){

		System.out.printf("%d円%n",100);//[100円]
		System.out.printf("好きな文字は\"です%n");//[好きな文字は"です]
		System.out.printf("%010d%n",12345);//[0000012345]
		System.out.printf("%06.2f%n",12.345);//[012.35]
/*
"%d円,100"                       /    【　　    　　】
"好きな文字は￥"です”　/　【　　　   　】
"%010d",12345"   /【                                  】
"%06.2f%n",12.345"/【　　　　　　   　 
*/
	}
}
