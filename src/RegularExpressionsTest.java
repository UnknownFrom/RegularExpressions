import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionsTest {

    @Test
    public void isIP1_1() {
        Assert.assertEquals(true,RegularExpressions.isIP("127.0.0.1"));
    }

    @Test
    public void isIP1_2() {
        Assert.assertEquals(true,RegularExpressions.isIP("255.255.255.0"));
    }

    @Test
    public void isIP1_3() {
        Assert.assertEquals(false,RegularExpressions.isIP("1300.6.7.8"));
    }

    @Test
    public void isIP1_4() {
        Assert.assertEquals(false,RegularExpressions.isIP("abc.def.gha.bcd"));
    }

    @Test
    public void isIP1_5() {
        Assert.assertEquals(false,RegularExpressions.isIP("abc.127.0.0"));
    }

    @Test
    public void isIP1_6() {
        Assert.assertEquals(false,RegularExpressions.isIP("010.200.1.0"));
    }

    @Test
    public void isIP1_7() {
        Assert.assertEquals(false,RegularExpressions.isIP("01.200.1.0"));
    }

    @Test
    public void isGUID2_1() {
        Assert.assertEquals(true,RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void isGUID2_2() {
        Assert.assertEquals(false,RegularExpressions.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void isGUID2_3() {
        Assert.assertEquals(true,RegularExpressions.isGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void isGUID2_4() {
        Assert.assertEquals(false,RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void isURL3_1() {
        Assert.assertEquals(true,RegularExpressions.isURL("http://www.example.com"));
    }

    @Test
    public void isURL3_2() {
        Assert.assertEquals(true,RegularExpressions.isURL("http://example.com"));
    }

    @Test
    public void isURL3_3() {
        Assert.assertEquals(false,RegularExpressions.isURL("Just Text"));
    }

    @Test
    public void isURL3_4() {
        Assert.assertEquals(false,RegularExpressions.isURL("http://a.com"));
    }

    @Test
    public void isPassword4_1() {
        Assert.assertEquals(true,RegularExpressions.isPassword("C00l_Pass"));
    }

    @Test
    public void isPassword4_2() {
        Assert.assertEquals(true,RegularExpressions.isPassword("SupperPas1"));
    }

    @Test
    public void isPassword4_3() {
        Assert.assertEquals(false,RegularExpressions.isPassword("Cool_pass"));
    }

    @Test
    public void isPassword4_4() {
        Assert.assertEquals(false,RegularExpressions.isPassword("C001"));
    }

    @Test
    public void isPassword4_5() {
        Assert.assertEquals(false,RegularExpressions.isPassword("___8934ERGHERH___"));
    }
}