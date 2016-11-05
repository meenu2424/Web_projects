class fibonacciSeries
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c;
System.out.println("Please Enter value of n);
Scannar sc=new Scannar(System.in);
int n=sc.nextInt();
int i=0;
System.out.println("Fibonacci series for n is ");
System.out.print(a + " " +b+ " ");
while(i<n){
c=a+b;
a=b;
b=c;
System.out(c+"");
i++;

}

	}
}
