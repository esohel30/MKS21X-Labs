public class SuperArrayExceptionTester {
    public static SuperArray init() {
        SuperArray res = new SuperArray(4);
        String[] values = {
            "one",
            "fish",
            "two",
            "fish",
            "red",
            "fish",
            "blue",
            "fish"
        };
        for (int i = 0; i < values.length; i++) {
            res.add(values[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        /*test ALL method calls that SHOULD throw an exception.*/
        int testNum = 0;
        String testName;
        SuperArray list1;
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test1: get -1
        testNum++;
        testName = "The get is out of bounds -1";
        list1 = init();
        try {
            list1.get(-1);
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test2: get size
        testNum++;
        int testCase = 0;
        testName = "The get is out of bounds size()";
        list1 = init();

        try {
            list1.get(list1.size());
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test3: set -1
        testNum++;
        testCase = -1;
        testName = "The set is out of bound " + testCase;
        list1 = init();

        try {
            list1.set(testCase, "whatthehekisupmyman");
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test4: set size()
        testNum++;
        testCase = 0;
        testName = "The size is set out of bounds ";
        list1 = init();

        try {
            list1.set(list1.size(), "avcdefghijklmnopqrstuvwxyzs");
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test5: add(-1,value)
        testNum++;
        testCase = -1;
        testName = "The add is out of bound" + testCase;
        list1 = init();

        try {
            list1.add(testCase, "");
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test6: add(size()+1,value)
        testNum++;
        testCase = 1;
        testName = "The add is out of bounds size() plus " + testCase;
        list1 = init();

        try {
            list1.add(list1.size() + testCase, "bananahead");
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(testNum + ". PASS " + testName);
        }
        //--------------------------------------------------------------
        //--------------------------------------------------------------

        //Test7: constructor(-1 size)
        //BE CAREFUL! Which exception is expected?
        testNum++;
        testCase = -1;
        testName = "The constructor size is out of bounds" + testCase;
        list1 = init();
        try {
            list1 = new SuperArray(testCase);
            System.out.println(testNum + ". FAIL! No exception thrown " + testName);
        }
         catch (IllegalArgumentException e) {
            System.out.println(testNum + ". PASS " + testName);
        }

    }
}
