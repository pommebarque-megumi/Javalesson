import java.util.*;
public class Sort{
	public static void main(String[] args){
		int[] data = {5,2,1,6,7,3,8,4,9};
		System.out.println(Arrays.toString(data));
★昇順ソート
		for(int t=0 ; i<data.length ; i++){//ここのfor文で基準値(昇順なら最小値・降順なら最大値)を決める
			for(int j=i-1 ; j<data.length ; j++){//このfor文で基準値と他の数値を比べる
				if(data[i]>data[j]){//条件に当てはまった時、2つの値を置き換える
					int temp=data[i];
					data[i]=data[j];
					data[j]=data[i];
				}
			}
		}
	}
}
