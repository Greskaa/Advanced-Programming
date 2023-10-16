import java.math.BigDecimal;
import java.util.Scanner;

//BigComplex is used for precise decimal calculations which the double or other data variable can't give us
//Gives exact result
public class BigComplex
{
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplex() {}
    public BigComplex(BigDecimal realPart, BigDecimal imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public BigComplex add(BigComplex complexNumber)
    {
        return new BigComplex(this.realPart.add(complexNumber.realPart), this.imaginaryPart.add(complexNumber.imaginaryPart));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real number (1): ");
        BigDecimal num1 = scanner.nextBigDecimal();
        System.out.println("Enter the imaginary number (1): ");
        BigDecimal num2 = scanner.nextBigDecimal();

        BigComplex complex1 = new BigComplex(num1, num2);

        System.out.println("Enter the real number (2): ");
        BigDecimal num3 = scanner.nextBigDecimal();
        System.out.println("Enter the imaginary number (2): ");
        BigDecimal num4 = scanner.nextBigDecimal();

        BigComplex complex2 = new BigComplex(num3, num4);

        BigComplex sum = complex1.add(complex2);

        System.out.println("The sum of the numbers is: " + sum.realPart + " + " + sum.imaginaryPart + "i");
    }
}
