public class tester {
    public static void main(String[] args) {
        RealNumber testCase1 = new RealNumber(235);
        RealNumber testCase2 = new RealNumber(12);
        RealNumber testCase3 = new RealNumber(-1.22);
        RationalNumber testCase4 = new RationalNumber(2, 3);
        RationalNumber testCase5 = new RationalNumber(2, 4);
        RationalNumber testCase6 = new RationalNumber(1, 2);

        System.out.println("Add, sub, mul, div, get w real nums ");
        System.out.println(testCase1.add(testCase2));
        System.out.println(testCase1.subtract(testCase2));
        System.out.println(testCase1.multiply(testCase2));
        System.out.println(testCase1.divide(testCase2));
        System.out.println(testCase1.getValue());

        System.out.println();
        System.out.println();

        System.out.println("Add, sub, mul, div, getnume, getdemo w rational nums ");
        System.out.println(testCase4.add(testCase5));
        System.out.println(testCase4.subtract(testCase5));
        System.out.println(testCase4.multiply(testCase5));
        System.out.println(testCase4.divide(testCase5));
        System.out.println(testCase4.compareTo(testCase5));
        System.out.println(testCase4.getValue());
        System.out.println(testCase4.getNumerator());
        System.out.println(testCase4.getDenominator());
        System.out.println(testCase4.reciprocal());

        System.out.println();
        System.out.println();

        System.out.println("more rational nums");
        System.out.println(testCase5.equals(testCase6));
        System.out.println(testCase5.add(testCase6));
        System.out.println(testCase5.subtract(testCase6));
        System.out.println(testCase5.multiply(testCase6));
        System.out.println(testCase5.divide(testCase6));
        System.out.println(testCase5.compareTo(testCase6));
        System.out.println(testCase5.getValue());
        System.out.println(testCase5.getNumerator());
        System.out.println(testCase5.getDenominator());
        System.out.println(testCase5.reciprocal());

        System.out.println();
        System.out.println();

        System.out.println("random tests");
        for (int i = 0; i < 20; i = i + 1) {

            RealNumber rando1 = new RealNumber((int)(
                (Math.random() * (15 - 3 + 1)) + 3));
            RealNumber rando2 = new RealNumber((int)
                ((Math.random() * (10 - 3 + 1)) + 3));

            System.out.println("rando1: " + rando1.getValue());
            System.out.println("rando2: " + rando2.getValue());
            System.out.println("divide");
            System.out.println(rando1.divide(rando2));
            System.out.println("add");
            System.out.println(rando1.add(rando2));



        }
    }
}
