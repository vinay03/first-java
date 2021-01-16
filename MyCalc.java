
class CalcFun
{
	public void run()
	{
		this.add();
		this.subtract();
	}

	public void add()
	{
		System.out.println("In Add()");
	}

	public void subtract()
	{
		int a=10,b=5;
		int c=a-b;
		System.out.println("Subtraction is "+ c);
	}

	public void multiply()
	{}
}


class MyCalc 
{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
		  CalcFun obj = new CalcFun();
		  obj.run();
    }


}
