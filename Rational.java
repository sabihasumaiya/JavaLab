
public class Rational {


	private int numerator = 0;
	private int denominator = 1;
		
	public Rational(int numerator, int denominator) {

		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String toString(){
		 return this.numerator+"/"+this.denominator;
	}
	
	/*private int[] getValues(Rational r){
	  int[] numbers = new int[4];
	  numbers[0] = this.numerator;
	  numbers[1] = this.denominator;
	  numbers[2] = r.numerator;
	  numbers[3] = r.denominator;
	  return numbers;
	}*/
	
	public Rational addition(Rational r){
		//int[] values = getValues(r);
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d+b*c;
		int newDenominator = b*d;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}
	
	public Rational subtraction(Rational r){
			
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d-b*c;
		int newDenominator = b*d;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;	
	}
	
	public Rational multiplication(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*c;
		int newDenominator = b*d;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;	
	}
	
    public Rational division(Rational r){
		
		int a = this.numerator;
		int b = this.denominator;
		int c = r.numerator;
		int d = r.denominator;
		int newNumerator = a*d;
		int newDenominator = b*c;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;	
	}
	//return new Task1_RationalNumber((this.numerator*r.denominator)+(this.denominator*r.numerator),(this.denominator*r.denominator));
}

