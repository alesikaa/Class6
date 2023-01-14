package Class6;

public class WhileLoop7 {
    public static void main(String[] args) {

        int number=0;
        while (number<10){
           if (number%2==0){
               System.out.println("Even "+number);
           }
           number++;
        }
        //print bellow sequence with the help of loop
        // 1 2 3 4  5 6 7 8 9 11 12 13 14 16
        System.out.println("**********");
        int number1=1;
        while (number1<=16){
            if(number1==5 ||number1==10 || number1==15) { //(number1%5==0   or number1!=5 && number1!=10 && number1!=15)
            } else {
                System.out.println(number1);
            }
            number1++;
        }

    }
}
