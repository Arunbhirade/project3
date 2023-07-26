package Dynamic;

public class mixsumhappy {
public static void main(String[] args) {
	int[] arr={73837,5439,1735,86768,9134,9731379,32123,89798};
	for(int i=0;i<arr.length;i++){
		int no=arr[i];
		int copy=no;
		int rev=0;
		while(no!=0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(copy==rev){
			happysum(copy);
		}else{
			factsum((copy));
		}
		
	}
 }
static void happysum(int a){
	int sum=0;
	while(a!=0){
		int rem=a%10;
		sum=sum+rem;
		a=a/10;
	}
	singledigit(sum);
}
static void singledigit(int b){
	while(b>0){
		b=happysum(b);
	}
}
}
