import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Point point1 = new Point(0, 1);
    Point point2 = new Point(1, 0);
    Point point3 = new Point(0, 0);

    RightAngledTriangle triangle = new RightAngledTriangle(point1, point2, point3);
    double[] side = triangle.getSide();
    System.out.println(side[0]);
    System.out.println(side[1]);
    System.out.println(side[2]);


        /*System.out.println(point.distance());
        point.moveVertical(1);
        point.moveHorizontal(2);
        System.out.println(point.y);
        System.out.println(point.x);
        Line line = new Line(point1, new Point(1,2));
        System.out.println(line.distanceBetween());
        line.extend(10);
        System.out.println(line.distanceBetween());*/




        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter security number");

        String SSN = scanner.nextLine();

        char[] seperateNumbers = SSN.toCharArray();
        System.out.println(seperateNumbers[0]);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length, width, thickness");

        int[] numbers = new int[3];

        int i = 0;
        while(i < 3) {
            numbers[i] = scanner.nextInt();
            i++;
        }
        int lMax = 600;
       int tMax = 100;

       int lMin = 140;
       int bMin = 90;

       if((numbers[0] > lMax) || (lMin > numbers[0])){
            System.out.println("Not acceptable");
        }else if(bMin > numbers[1]){
            System.out.println("Not acceptable");
        }else if(tMax < numbers[2]){
           System.out.println("Not Acceptable");
       }else if(numbers[0] + numbers[1] + numbers[2] > 900){
           System.out.println("Not acceptable");
       }else{
           System.out.println("Acceptable");
       }*/

        }
    }
