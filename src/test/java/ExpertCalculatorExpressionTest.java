import org.junit.Assert;
import org.junit.Test;

public class ExpertCalculatorExpressionTest {

    static public Expert expertCalculator = new Expert();

    @Test
    public void callAddFromExpertCalculator(){
        Assert.assertNotNull(expertCalculator);

        Integer result = expertCalculator.add((Integer)3);

        Assert.assertEquals((Integer)3, result);
//        Assert.assertTrue(Conditie);
    }
//tema
    @Test
    public void callPowFromExpertCalculator(){
        Integer result = expertCalculator.pow((Integer)2, (Integer)10);
        Assert.assertNotEquals((Integer)1024, result);
    }



    @Test
    public void callPowFromExpertCalculat(){
        Integer result=expertCalculator.pow(698,0);
        Assert.assertTrue("Message in case of failure",result==1);
    }

    @Test
    public void callPowFromExpertCalcul(){
        Integer result=expertCalculator.pow(5,3);
        Assert.assertNotNull(125);
    }

    @Test
    public void callPowFromExpertCalculNotNull(){
        Integer result=expertCalculator.pow(0,100);
        Assert.assertNotEquals(10,0);
    }

    @Test
    public void callRootFromExpertCalculator(){
        Float result=expertCalculator.root(123465758);
        Assert.assertFalse(result<0);
    }

    @Test
    public void callRootFromExpertCalculat(){
        Float result=expertCalculator.root(0);
        Assert.assertEquals((Object)0.0f,result);

    }

    @Test
    public void callRootFromExpertCalc(){
        Float result=expertCalculator.root(-18);
        Assert.assertNotNull(result);
    }

    @Test
    public void callFactorialFromExpertCalculator(){
        Integer result=expertCalculator.factorial(5);
        Assert.assertEquals((Integer)120,result);
    }

    @Test
   public void callFactorialFromExpertCalculat(){
        Integer result=expertCalculator.factorial(4);
        Assert.assertNotEquals((Integer)4,result);
    }


    @Test
    public void callFactFromExpertCalculator(){
        Integer result=expertCalculator.fact(0);
        Assert.assertTrue(result==1);
    }

    @Test
    public void callFactFromExpertCalculat(){
        Integer result=expertCalculator.fact(0);
        Assert.assertNotNull(result);
    }



}
