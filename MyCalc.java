
class CalcFun
{
	public void run()
	{
		this.add();
		this.multiply();
	}

	public void add()
	{
		System.out.println("In Add()");
	}

	public void subtract()
	{}

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
