public class Es3 {
    public static void main(String[] args) {
System.out.println(perimetroRettangolo(1.5,2.4));
System.out.println(pariDispari(5));
System.out.println(perimetroTrinagolo(1.5,2,1.8));
    }
    public static double perimetroRettangolo(double num1, double num2){
        return (num1 *2)+(num2*2);
    }
    public static int pariDispari(int num1){
        if (num1 %2 ==0){
        return     0;

        }else {
            return 1;
        }
    }
    public static double perimetroTrinagolo(double  num1, double num2, double num3){
        double sP= (num1+num2+num3)/2;
        return Math.sqrt(sP*(sP-num1)*((sP-num2)*(sP-num3)));
    }
}
