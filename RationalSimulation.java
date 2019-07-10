
public class RationalSimulation {

	public static void main(String[] args) {
		Rational r1 = new Rational(5,7);
		Rational r2 = new Rational(2,3);
	    Rational add_result = r1.addition(r2);
		Rational sub_result = r1.subtraction(r2);
		Rational mul_result = r1.multiplication(r2);
		Rational div_result = r1.division(r2);
		System.out.println("Addition(+)       Result: "+r1.toString()+" + "+r2.toString()+" = " + add_result.toString());
		System.out.println("Subtraction(-)    Result: "+r1.toString()+" - "+r2.toString()+" = " + sub_result.toString());
		System.out.println("Multiplication(*) Result: "+r1.toString()+" * "+r2.toString()+" = " + mul_result.toString());
		System.out.println("Division(/)       Result: "+r1.toString()+" / "+r2.toString()+" = " + div_result.toString());
	}

}
