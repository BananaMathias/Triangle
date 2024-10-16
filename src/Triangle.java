import static java.lang.Math.sqrt;

public class Triangle {
     Point point1;
     Point point2;
     Point point3;

    Triangle(Point point1, Point point2, Point point3) throws Exception {
        if ((point1 == point2) || (point1 == point3) || (point2 == point3)) {
            throw new Exception("same point value");
        }
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    double[] getSide() {
        //Get the length of all sides in an array
        Line a = new Line(this.point1, this.point2);
        double aValue = a.distanceBetween();
        Line b = new Line(this.point2, this.point3);
        double bValue = b.distanceBetween();
        Line c = new Line(this.point3, point1);
        double cValue = c.distanceBetween();

        double[] sideArray = {aValue, bValue, cValue};
        return sideArray;
    }
    public double getArea(){
        //Get the area of the triangle using the formula Edvin showed during the class
        double[] sideArray = this.getSide();
        double halfCircumference = (sideArray[0] + sideArray[1] + sideArray[2])/2;
        return sqrt(halfCircumference*((halfCircumference-sideArray[0])*(halfCircumference-sideArray[1])*(halfCircumference-sideArray[2])));
    }

    public double getCircumference(){
        //Get the circumference
        double[] sideArray = this.getSide();
        return sideArray[0] + sideArray[1] + sideArray[2];
    }

    public double[][] getCorners(){
        //Get all corners of the triangle (point coordinates)
        double[] point1Coordinates = {point1.x, point1.y};
        double[] point2Coordinates = {point2.x, point2.y};
        double[] point3Coordinates = {point3.x, point3.y};

        double[][] allCorners = {point1Coordinates, point2Coordinates, point3Coordinates};
        return allCorners;
    }
    //public changeCorner(int cornerToChange) Which corner to change, 1, 2, or 3

    public boolean isUniform(Triangle triangleIn){
        //Return true if the input triangle is uniform to object
        double[] sideArray = this.getSide();
        double[] sideArrayIn = triangleIn.getSide();

        if((sideArray[0]/sideArrayIn[0] == 1) && (sideArray[1]/sideArrayIn[1] == 1) && (sideArray[2]/sideArrayIn[2] == 1)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        //print coordinates of points
        System.out.println("(" + point1.x + ", " + point1.y + ")(" + point2.x + ", " + point2.y + ")(" + point3.x + ", " +  point3.y + ")");
        return null;
    }

}

