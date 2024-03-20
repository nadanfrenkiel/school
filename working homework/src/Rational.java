public class Rational 
{
	private int x;
	private int y;	
	//-------------------------------------------------
    public Rational (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//-------------------------------------------------
	public int getNumerator()
	{
		return this.x;
	}
	
	public int getDenominator()
	{
		return this.y;
	}
	
	//-------------------------------------------------
	public Rational multiply (Rational num)
	{
		Rational rat = new Rational (this.x * num.x, this.y * num.y);
		return rat;
	}
	
	public Rational divide(Rational num)
	{
		if (num.x == 0|| this.x == 0) {
			return null;
		}
		Rational rat = new Rational (this.x *num.y, num.x * this.y);
		return rat;	
	}


	public boolean isEqual (Rational num) {
		double temp = this.x/this.y;
		double temp2 = num.x/num.y;
		if (temp2 == temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString()
	{
		return "The current rational num stored is (numerator + denominator)" + this.x + ", " + this.y;
	}
}//class

