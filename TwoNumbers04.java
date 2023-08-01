import java.util.Scanner;

public class TwoNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum= Integer.parseInt(scanner.nextLine());
        int secontNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean valid = false;
        int count = 0;
        for (int i = firstNum; i <= secontNum; i++) {
            for (int j = firstNum; j <= secontNum ; j++) {
                count++;
                int sum = i + j;

                if (sum == magicNum){
                    valid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",count, i, j , sum);
                }
            }
            if (valid){
                break;
            }
        }
        if (!valid){
            System.out.printf("%d combinations - neither equals %d%n",count, magicNum);
        }
    }
}
