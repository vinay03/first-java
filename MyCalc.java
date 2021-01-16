
class CalcFun
{
	public void run()
	{
		this.add();
	}

	public void add()
	{
		System.out.println("In Add()");
	}

	public void subtract()
	{}

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
