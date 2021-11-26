import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionsTest {

    @Test
    public void isIP1() {
        Assert.assertEquals(true,RegularExpressions.isIP("127.0.0.1"));
    }

    @Test
    public void isIP2() {
        Assert.assertEquals(true,RegularExpressions.isIP("255.255.255.0"));
    }

    @Test
    public void isIP3() {
        Assert.assertEquals(false,RegularExpressions.isIP("1300.6.7.8"));
    }

    @Test
    public void isIP4() {
        Assert.assertEquals(false,RegularExpressions.isIP("abc.def.gha.bcd"));
    }

    @Test
    public void isIP5() {
        Assert.assertEquals(false,RegularExpressions.isIP("abc.127.0.0"));
    }

    @Test
    public void isIP6() {
        Assert.assertEquals(false,RegularExpressions.isIP("010.200.1.0"));
    }

    @Test
    public void isIP7() {
        Assert.assertEquals(false,RegularExpressions.isIP("01.200.1.0"));
    }

    @Test
    public void isIP8() {
        Assert.assertEquals(true,RegularExpressions.isIP("0.0.0.0"));
    }

    @Test
    public void isIP9() {
        Assert.assertEquals(true,RegularExpressions.isIP("1.1.1.1"));
    }

    @Test
    public void isIP10() {
        Assert.assertEquals(false,RegularExpressions.isIP("..."));
    }

    @Test
    public void isIP11() {
        Assert.assertEquals(true,RegularExpressions.isIP("255.255.255.255"));
    }

    @Test
    public void isGUID1() {
        Assert.assertEquals(true,RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void isGUID2() {
        Assert.assertEquals(false,RegularExpressions.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void isGUID3() {
        Assert.assertEquals(true,RegularExpressions.isGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void isGUID4() {
        Assert.assertEquals(false,RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void isGUID5() {
        Assert.assertEquals(false,RegularExpressions.isGUID("{}{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void isGUID6() {
        Assert.assertEquals(false,RegularExpressions.isGUID("{}e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void isGUID7() {
        Assert.assertEquals(false,RegularExpressions.isGUID("{e02fd0e4-00fd}-{090A-ca30}-{0d00a0038ba0}"));
    }

    @Test
    public void isGUID8() {
        Assert.assertEquals(false,RegularExpressions.isGUID("e02fd0e4-00f-090j-ca30-0d00a0038ba0"));
    }

    @Test
    public void isGUID9() {
        Assert.assertEquals(true,RegularExpressions.isGUID("12345678-1234-1234-1234-123412341234"));
    }

    @Test
    public void isGUID10() {
        Assert.assertEquals(true,RegularExpressions.isGUID("{12345678-1234-1234-1234-123412341234}"));
    }

    @Test
    public void isURL1() {
        Assert.assertEquals(true,RegularExpressions.isURL("http://www.example.com"));
    }

    @Test
    public void isURL2() {
        Assert.assertEquals(true,RegularExpressions.isURL("http://example.com"));
    }

    @Test
    public void isURL3() {
        Assert.assertEquals(false,RegularExpressions.isURL("Just Text"));
    }

    @Test
    public void isURL4() {
        Assert.assertEquals(false,RegularExpressions.isURL("http://a.com"));
    }

    @Test
    public void isURL5() {
        Assert.assertEquals(true,RegularExpressions.isURL("https://www.youtube.com/watch?v=erhe6/"));
    }

    @Test
    public void isURL6() {
        Assert.assertEquals(true,RegularExpressions.isURL("http://www.youtube.com/watch?v=erhe6"));
    }

    @Test
    public void isURL7() {
        Assert.assertEquals(true,RegularExpressions.isURL("www.youtube.com/watch?v=erhe6"));
    }

    @Test
    public void isURL8() {
        Assert.assertEquals(true,RegularExpressions.isURL("youtube.com:8080"));
    }

    @Test
    public void isURL9() {
        Assert.assertEquals(true,RegularExpressions.isURL("youtube.com:8080/eth45"));
    }

    @Test
    public void isURL10() {
        Assert.assertEquals(false,RegularExpressions.isURL("-youtube.com"));
    }

    @Test
    public void isURL11() {
        Assert.assertEquals(false,RegularExpressions.isURL("youtube-.com"));
    }

    @Test
    public void isURL12() {
        Assert.assertEquals(false,RegularExpressions.isURL("you_tube.com"));
    }

    @Test
    public void isURL13() {
        Assert.assertEquals(false,RegularExpressions.isURL("youtube.com:9242324"));
    }

    @Test
    public void isPassword1() {
        Assert.assertEquals(true,RegularExpressions.isPassword("C00l_Pass"));
    }

    @Test
    public void isPassword2() {
        Assert.assertEquals(true,RegularExpressions.isPassword("SupperPas1"));
    }

    @Test
    public void isPassword3() {
        Assert.assertEquals(false,RegularExpressions.isPassword("Cool_pass"));
    }

    @Test
    public void isPassword4() {
        Assert.assertEquals(false,RegularExpressions.isPassword("C001"));
    }

    @Test
    public void isPassword5() {
        Assert.assertEquals(false,RegularExpressions.isPassword("___8934ERGHERH___"));
    }

    @Test
    public void isPassword6() {
        Assert.assertEquals(true,RegularExpressions.isPassword("fgnS232462"));
    }

    @Test
    public void isPassword7() {
        Assert.assertEquals(true,RegularExpressions.isPassword("2354sdfSDG"));
    }

    @Test
    public void isPassword8() {
        Assert.assertEquals(false,RegularExpressions.isPassword("Ch3"));
    }
}