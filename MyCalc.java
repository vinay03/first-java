
class CalcFun
{
	public void run()
	{
		this.add();
		this.multiply();
		this.subtract();
	}

	public void add()
	{
		System.out.println("In Add()");
	}

	public void subtract()
	{
		int a = 10 , b = 5;
		int c = a - b;
		System.out.println("Subtraction is "+ c);
	
	}


	public void multiply()
	{
		int a = 5, b = 10;
		System.out.println("Multiplication is = " + (a*b));
	}
}


class MyCalc 
{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
		  CalcFun obj = new CalcFun();
		  obj.run();
    }


}
