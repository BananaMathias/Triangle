public class ScaleneTriangle extends Triangle{

    ScaleneTriangle(Point point1, Point point2, Point point3) throws Exception{
        super(point1, point2, point3);
        double[] sides = this.getSide();

        if((sides[0] == sides[1]) || (sides[0] == sides[2]) || (sides[1] == sides[2])){ //if any side is equal to another throw exception
            throw new Exception("No sides can be equal");
        }


    }

}
