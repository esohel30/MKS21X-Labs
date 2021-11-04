public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int numerator, int denominator){
    super(0.0);//this value is ignored!
    this.numerator = numerator;
    this.denominator = denominator;

    if(denominator == 0) {
      this.numerator = 0;
      this.denominator = 1;
    }
  }

  public double getValue(){
    return ( (double)numerator )/( (double)denominator );
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);

  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return  ( other.getDenominator() == getNumerator() && other.getNumerator() == getNumerator() );
    }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int val1 = a;
    int val2 =b;
    int holder =1000; // any number that is not 0. 
    if (val2 > val1) {
      val2 = a;
      val1 = b;
    }

    while (val2 != 0){
     holder = val1%val2;
     val1 = val2;
     val2 = holder;
   }

   return val1;



  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

    numerator = numerator / gcd(numerator, denominator);
    denominator = denominator / gcd(numerator, denominator);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber secval){
    RationalNumber fillin = new RationalNumber(this.numerator * secval.getNumerator() , secval.getDenominator() * this.denominator);
    fillin.reduce();
    return fillin;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber secval){
    RationalNumber fillin = new RationalNumber(this.denominator * secval.getNumerator(), secval.getDenominator() * this.numerator);
    fillin.reduce();
    return fillin;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber secval){
    RationalNumber fillin = new RationalNumber(secval.getNumerator() * this.denominator + this.numerator * secval.getDenominator(), secval.getDenominator() * this.denominator);
    fillin.reduce();
    return fillin;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber secval){  //cross multiplication but not really then subtract
    RationalNumber fillin = new RationalNumber(this.denominator * secval.getNumerator()- this.numerator * secval.getDenominator(), this.denominator * secval.getDenominator());
    fillin.reduce();
    return fillin;
  }
}
