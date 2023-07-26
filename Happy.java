package Dynamic;

public class Happy {
	public static void main(String[] args) {
		int[] str={73837,1735,86768,9134};
		for(int i=0;i<str.length;i++)
		{
			int no=str[i];
			int copy=no;
			int rev=0;
			while(no!=0)
			{
				int rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			if(copy==rev)
			{
				System.out.println(copy+"is a palindrome");
				while(copy>9)
				{
					copy=num(copy);
					
				}
				if((copy==1)||(copy==7))
				{
					System.out.println(copy+" is a happy number");
				}else
				{
					System.out.println(copy+" is not a happy number");
				}
			  }else
			  {
				  System.out.println(copy+" is not a palindrome");
				  while(copy>9)
				  {
					  copy=num(copy);
				  }
					int fact=1;
					while(copy!=0)
					{
						int rem=copy%10;
						fact=fact*rem;
						copy=copy/10;
						
					}
					System.out.println(fact+"is factorial of"+copy);
				  }
			  }
		}
   static int num(int no)
   {
	   int sum=0;
	   while(no!=0)
	   {
		   int rem=no%10;
		   sum=sum+rem;
		   no=no/10;
		   
	   }
	return sum;
   }
}
