import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        //Taking values of 10 integers
        System.out.println("Input your 10 arrays: ");
        for(int i =0;i<10;i++){
            array[i] = input.nextInt();
        }
        //Printing the values
        System.out.println("Your inputed 10 arrays are: ");
        for(int i =0;i<10;i++){
            System.out.println(array[i]);
        }
        //Finding Average
        double sum = 0;
        for(int i =0;i<10;i++){
            sum = sum + array[i];
        }
        double avg = sum / 10;
        //Printing the Average
        System.out.println("The average is: "+avg);

        //Counting the numbers that are above Average
        int count = 0;
        for(int i =0;i<10;i++){
            if(array[i]>avg){
                count++;
            }
        }
        System.out.println("There are "+count+" numbers that are above of average");

        //Checking the percentage of the numbers greater than Average
        int avg_count = (count*100)/10;

        System.out.println("The percentage of greater numbers above average: "+avg_count+"%");

    }
}
