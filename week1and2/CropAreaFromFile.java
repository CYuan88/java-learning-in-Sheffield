import sheffield.
*;
public class CropAreaFromFile {
public static void main(String[] args) {
EasyReader fileInput = new EasyReader("croparea.txt");
// read the length and width of the field from the file
System.out.println("Enter the width of the field: ");
double width = fileInput.readDouble();
System.out.println("Enter the length of the field: ");
double length = fileInput.readDouble();
// compute the area
double area = width
*length;
// write the result
System.out.print("Your field has an area of ");
System.out.print(area);
System.out.println(" metres squared.");
}
}