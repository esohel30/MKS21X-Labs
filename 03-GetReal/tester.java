public class tester{
  public static void main(String[] args) {
    RationalNumber testcase1 = new RationalNumber(21, 4);
    RationalNumber testcase2 = new RationalNumber(23, 8);

      System.out.println(testcase1.getValue());
      System.out.println(testcase1.getNumerator());
      System.out.println(testcase1.getDenominator());
      System.out.println(testcase1.reciprocal());
      System.out.println(testcase1.reciprocal());

      System.out.println(testcase2.getValue());
      System.out.println(testcase2.getNumerator());
      System.out.println(testcase2.getDenominator());
      System.out.println(testcase2.reciprocal());
      System.out.println(testcase2.reciprocal());


      System.out.println(testcase1.add(testcase2));
      System.out.println(testcase1.subtract(testcase2));
      System.out.println(testcase1.multiply(testcase2));
      System.out.println(testcase1.divide(testcase2));

}
}
