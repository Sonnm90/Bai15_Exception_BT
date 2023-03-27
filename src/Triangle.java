public class Triangle{

    public static void main(String[] args) throws IllegalTriangleException {
        Triangle triangle =new Triangle();
        triangle.triangleSide(1,2,5);
    }
    public  String triangleSide(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1<=0||side2<=0||side3<=0)
        throw new IllegalTriangleException("Khong phai tam giac");
        else if (side1==side2&&side1==side3)
            return ("tam giac deu");
        else if (side1==side2||side1==side3||side2==side3) {
            return ("tam giac can");
        } else if ((side1+side2>side3)&&((side1+side3)>side2)&&((side2+side3)>side1)) {
            return ("tam giac thuong");
        } else {
           throw new IllegalTriangleException("Khong phai tam gian");
        }
    }

}
