import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionsTest {

    @Test
    public void task1_1() {
        Assert.assertEquals(true,RegularExpressions.Task1("127.0.0.1"));
    }

    @Test
    public void task1_2() {
        Assert.assertEquals(true,RegularExpressions.Task1("255.255.255.0"));
    }

    @Test
    public void task1_3() {
        Assert.assertEquals(false,RegularExpressions.Task1("1300.6.7.8"));
    }

    @Test
    public void task1_4() {
        Assert.assertEquals(false,RegularExpressions.Task1("abc.def.gha.bcd"));
    }

    @Test
    public void task1_5() {
        Assert.assertEquals(false,RegularExpressions.Task1("abc.127.0.0"));
    }

    @Test
    public void task1_6() {
        Assert.assertEquals(false,RegularExpressions.Task1("010.200.1.0"));
    }

    @Test
    public void task2_1() {
        Assert.assertEquals(true,RegularExpressions.Task2("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void task2_2() {
        Assert.assertEquals(false,RegularExpressions.Task2("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void task2_3() {
        Assert.assertEquals(true,RegularExpressions.Task2("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void task2_4() {
        Assert.assertEquals(false,RegularExpressions.Task2("e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
    }

    @Test
    public void task3_1() {
        Assert.assertEquals(true,RegularExpressions.Task3("http://www.example.com"));
    }

    @Test
    public void task3_2() {
        Assert.assertEquals(true,RegularExpressions.Task3("http://example.com"));
    }

    @Test
    public void task3_3() {
        Assert.assertEquals(false,RegularExpressions.Task3("Just Text"));
    }

    @Test
    public void task3_4() {
        Assert.assertEquals(false,RegularExpressions.Task3("http://a.com"));
    }

    @Test
    public void task4_1() {
        Assert.assertEquals(true,RegularExpressions.Task4("C00l_Pass"));
    }

    @Test
    public void task4_2() {
        Assert.assertEquals(true,RegularExpressions.Task4("SupperPas1"));
    }

    @Test
    public void task4_3() {
        Assert.assertEquals(false,RegularExpressions.Task4("Cool_pass"));
    }

    @Test
    public void task4_4() {
        Assert.assertEquals(false,RegularExpressions.Task4("C001"));
    }

    @Test
    public void task4_5() {
        Assert.assertEquals(false,RegularExpressions.Task4("___8934ERGHERH___"));
    }
}