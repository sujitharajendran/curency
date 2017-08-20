package guviproject;
import java.util.*;
public class currency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int k=n;
		int m=0;
		int money=0;
		int a[]={500,100,50,10,1};
		for(int i=0;i<a.length;i++){
			if(k>=a[i]){
			rem=k%a[i];
			money=k/a[i];
		
			}
			else{
				rem=k;
			}
			m=m+money;
			money=0;
			k=rem;
		}
		System.out.println(m);
	}

}
