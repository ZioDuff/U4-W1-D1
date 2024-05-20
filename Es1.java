import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {

        System.out.println(moltiplicazione(6,5));
        System.out.println(concatena("ciao ", 6));
        String[] brasilianArray=new String[5];
        System.out.println(Arrays.toString(insericiInArray(brasilianArray, "direttamente")));
        }
        public static int moltiplicazione(int num1, int num2){
            return num1 * num2;
            //dichiariamo il metodo che avra come parametri due numeri interi e dovra ritornare un intero
        }
public static String concatena(String str,int num2){
        return  str + num2;
}

public static String[] insericiInArray(String[] myArray, String str2){


return   myArray= new String[]{"brasiliano", "trembolone",str2, "ceres", "pietralata", "marmitta"};
}


}
