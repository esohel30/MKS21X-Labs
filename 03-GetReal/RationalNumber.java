public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if(deno == 0){
      numerator = 0;
      denominator =1;
    }
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (0.0 + numerator)/(0.0 + denominator);
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
    if(numerator == 0){
      numerator = 1;
    denominator = 0;
  }
    RationalNumber fillin = new RationalNumber(denominator, numerator);
    return fillin;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber secval){
    secval.reduce();
    reduce();
    return (secval.getNumerator() == this.numerator && secval.getDenominator() == this.denominator);
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
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int val1 =0;
    int val2 =0;
    int current =11111110;  // any number thats not 0

    if(a>b){
    val1 = a;
    val2 = b;
    }
    if(b<a){
    val2 = a;
    val1 = b;
    }
    if(b == a){
      return a;
    }

    while(current != 0){
      current = val1%val2;
      val1 = val2;
      val2 = current;
    }
      return val1;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int largefactor = gcd(numerator, denominator);
    numerator = numerator / largefactor;
    denominator = denominator / largefactor;
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
