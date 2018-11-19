package exampleapp.spec;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import exampleapp.Calculadora;

@RunWith(ConcordionRunner.class)
public class ConfigTest {
    public int getTestResult(int a, int b) {
        Calculadora calc = new Calculadora();
        return (calc.addTwoIntegers(a, b));
    }

    public int getSubstractTestResult(int a, int b) {
        Calculadora calc = new Calculadora();
        return (calc.substractTwoIntegers(a, b));
    }
}
