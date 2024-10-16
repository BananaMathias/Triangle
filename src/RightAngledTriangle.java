
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RightAngledTriangle extends Triangle{

    RightAngledTriangle(Point point1, Point point2, Point point3) throws Exception{
        super(point1, point2, point3);
        double[] sides = this.getSide(); // int a, int b, int c = getside()
        if(((sqrt(pow(sides[0], 2) + pow(sides[1],2)) != sides[2]) || (sqrt(pow(sides[1], 2) + pow(sides[2],2)) != sides[0]) || (sqrt((pow(sides[2], 2) + pow(sides[0],2))) != sides[1]))){ //Pythagoras theorem trying all sides
            throw new Exception("Not right angled");
        }


    }



}
