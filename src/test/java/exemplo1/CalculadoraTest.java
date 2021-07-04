package exemplo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
         calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisNumeros() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(5, calculadora.somar(num1,num2));
    }

    @Test
    public void deveDividirDoisNumeros() {
        int num1 = 6;
        int num2 = 3;
        assertEquals(2, calculadora.dividir(num1, num2));
    }

    @Test
    public void naoDeveDividirPorZero() {
        int num1 = 6;
        int num2 = 0;
        assertEquals(0, calculadora.dividir(num1, num2));
    }

    @Test
    public void deveMultiplicarDoisNumeros() {
        int num1 = 3;
        int num2 = 2;
        assertEquals(6, calculadora.multiplicar(num1, num2));
    }

    @Test
    public void deveSubtrairDoisNumeros() {
        int num1 = 5;
        int num2 = 4;
        assertEquals(1, calculadora.subtrair(num1, num2));
    }
}
