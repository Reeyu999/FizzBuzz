

public class FizzBuzz {

    public static void main(String[] args) {

        int number = 100;

        FizzBuzz test = new FizzBuzz();
        test.fizzbuzz(number);

    }


    public void fizzbuzz(int num) {
        boolean fizz = false;
        boolean buzz = false;
        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("FizzBuzz");
            } else if (((i % 3) == 0 || (i % 5) == 0)){
                if((i % 3) == 0){
                    System.out.println("Fizz");
                } else {
                    System.out.println("Buzz");
                }
            } else {
                System.out.println(i);
            }



        }
    }
}

