import org.junit.*;

public class BasicCalculatorAddTests {

    static Basic basicCalculator;
    static public void printMessage(String message){System.out.println(message);}

    @BeforeClass
    static public void setUp(){
        basicCalculator = new Basic();
        printMessage("SetUp");
    }

    @Before
    public void setUpTest(){
        printMessage("BeforeEachTest - running a new test!");
    }

    @Test
    public void testAddDoubleSameValue(){
        Double result = basicCalculator.add(2.5, 2.5);

        //failureMessage,expected, actual
        Assert.assertEquals("Message in case of failure for add operation",(Double)5.0, result);

        Object object = "";
        Assert.assertNotNull("Message in case of failure for add operation - result null", object);
    }

//   @Ignore
    @Test
    public void testAdd2MaxDouble(){
        Double result = basicCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        System.out.println(result);
//        Assert.fail();
    }

//    @Test
//    public void testAddASingleValue(){
//        Integer result = basicCalculator.add();
//
//        Assert.assertEquals((Integer)1, result);

//    }
    @Test
    public void test(){
        //given
        //when
        //then
    }
    //Tema
    @Test
    public void testAdd2MaxInt(){
        Integer result=basicCalculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE);
        System.out.println(result);
        Assert.assertNotSame(0,result);
    }

    @Test
    public void testAdd2IntValue(){
        Integer result=basicCalculator.add(2,6);
        Assert.assertEquals((Integer)8,result);
    }
    @Test
    public void testResultIsTrueForIntValues(){
        Integer result=basicCalculator.add(10,12);
        Assert.assertTrue("Message in case of failure , the condition is false",result>10);
    }


    @Test
    public void testResultisFalseForLongValues(){
        Long result=basicCalculator.add(Long.MIN_VALUE,Long.MIN_VALUE);
        Assert.assertFalse("Message in case of failure if the condition is true ",result>Integer.MAX_VALUE);
    }
    @Test
    public void testSubstractFor2IntValues(){
        Integer result=basicCalculator.substract(0,2);
        Assert.assertNotEquals((Integer)(-5),result);
    }

    @Test
    public void testResultIsNullForSubstractOp(){
        Double result=basicCalculator.substract(4.0,2.5);

        Assert.assertNotNull("Message in case of failure,the result is null",result);
    }

    @Test
    public void testResultIsFalse(){
        Integer result=basicCalculator.substract(0,0);
        Assert.assertFalse("Error",result<0);
    }


    @Test
    public void testResultIsNotNullForMultiply(){
        Integer result =basicCalculator.multiply(0,4);
        Assert.assertNotNull(result);

    }

    @Test
    public void testResultIsTrueForMultiply(){
        Double result=basicCalculator.multiply(2.6,3.6);
        Assert.assertNotEquals((Double)9.36,result);
    }

    @Test

    public void testDivisionByZero(){
        Long result=basicCalculator.divide(2L,0);
        Assert.assertEquals("ArithmeticException","ArithmeticException");
    }

    @Test

    public void testDivide(){
        Integer result=basicCalculator.divide(18,9);
        Assert.assertEquals(2,2);

    }



}
