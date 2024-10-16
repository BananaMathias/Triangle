import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point point1;
    private Point point2;
    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public double distanceBetween(){
        //Gets the length of the line
        return sqrt(pow(point2.x-point1.x,2) + pow(point2.y-point1.y,2));
    }
    public void extend(int scalar){
        //extends the vector Line with a scalar
        point2.x = point2.x - point1.x;
        point2.y = point2.y - point1.y;
        double point1Tempx = point1.x;
        double point1Tempy = point1.y;
        point1.x = 0;
        point1.y = 0;
        point2.x = scalar * point2.x;
        point2.y = scalar * point2.y;
        point2.x = point2.x + point1Tempx;
        point2.y = point2.y + point1Tempy;
        point1.x = point1Tempx;
        point1.y = point1Tempy;

    }
    public boolean isParallel(Line line1){
        //Checks if the line is parallel to input Line
        double kOriginal = (this.point2.x - this.point1.x)/(this.point2.y - this.point1.y);
        double kline1 = (line1.point2.x - line1.point1.x)/(line1.point2.y - line1.point1.y);
        if (kOriginal == kline1){
            return true;
        }
        else{
            return false;
        }
    }
}
