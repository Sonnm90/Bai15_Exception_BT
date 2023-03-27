import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        int side1=0, side2 = 0, side3=0;
        try {
            System.out.println("Nhap side 1");
            side1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhap side 2");
            side2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhap side 3");
            side3 = Integer.parseInt(scanner.nextLine());
//            if (side3<=0||side2<=0||side1<=0){
//                throw new IllegalTriangleException("Gia tri nhap vao k hop le");
//            }
        } catch (NumberFormatException numberFormatException) {

            numberFormatException.printStackTrace();
        }


        try {
            triangle.triangleSide(side1, side2, side3);

        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println("Error: " + illegalTriangleException.getMessage());
        }
        System.out.println("continue!");
    }

    public String triangleSide(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalTriangleException("Khong phai tam giac");
        else if (side1 == side2 && side1 == side3)
            return ("tam giac deu");
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return ("tam giac can");
        } else if ((side1 + side2 > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
            return ("tam giac thuong");
        } else {
            throw new IllegalTriangleException("Khong phai tam gian");
        }
    }

}
