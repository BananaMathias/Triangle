import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public double x;
    public double y;
    int moveSide;
    int moveUp;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(){
        //Return distance from origin
        return sqrt(pow(this.x, 2) + pow(this.y, 2));
    }
    public void moveVertical(int moveUp){
        //Moves the point upwards, negative values = move down
        this.y = this.y + moveUp;
    }
    public void moveHorizontal(int moveSide){
        //Moves horizontally, negative values = move left
        this.x = this.x + moveSide;
    }

}

