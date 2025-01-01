package sample;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.prod(10, 4);
		obj.add(10, 4);
				

	}
	public  int prod(int a,int b)
	{
		int  c =  a*b;
		System.out.println(c);
		return c;
	}
	public  int add(int a,int b)
	{
		int  c =  a+b;
		System.out.println(c);
		return c;
	}
	

}
