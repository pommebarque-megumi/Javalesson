import java.util.*;
public class Method3{
	public static void main(String[] args){
//メインメソッド
		/*【１】*/
		int max = maxof(10,5,8);
		System.out.printf("【１】10,5,8の中で1番大きいのは%dです%n",max);
		
		/*【２】*/
		hello();
		hello("【２】megumi");//hello(String name)Method

		/*【３】*/
		int[] data = new int[]{3,4,5};
		System.out.println("【３】これを２倍↓"+Arrays.toString(data));
		arrTwice(data);
		System.out.println("２倍したら→"+Arrays.toString(data));

		/*【４】*/
		int[] nums ={1,2,3,4,5,6,7,8,9};
		System.out.println("【４】これをシャッフル↓"+Arrays.toString(nums));
		arrShuffle(nums);
		System.out.println("シャッフルしたら→"+Arrays.toString(nums));
	}

//ここからメソッド
	/*【１】*/
	public static int maxof(int a,int b,int c){
		return Math.max(a,Math.max(b,c));
	}
	/*【２】*/
	public static void hello(){//void=【例外】何も返さない・()引数もいらない
		System.out.println("hello");//
	}
	public static void hello(String name){//仮引数は変数であること。
		hello();
		System.out.println(name);
	}//メソッドのオーバーロード引数の型に違いがあれば、同じ名前のメソッドを２つ以上作ることができる。(Javaのみ)

	/*【３】*/
	public static void arrTwice(int[] arr){
		for(int i= 0 ; i<arr.length ; i++){
			arr[i]*=2;
		}
	}
	/*【４】*/
	public static void arrShuffle(int[] arr){
		for(int i=0 ; i<arr.length-1 ; i++){
			int idx = new Random().nextInt(arr.length-i)+i;
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}

}
