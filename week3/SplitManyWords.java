import sheffield.*;

public class SplitManyWords {
    public static void main(String[] args) {

	// open a file
	EasyReader file = new EasyReader("manywords.txt");

	// process line by line
	while (!file.eof()) {

	    // read a string
	    String s = file.readString();

	    // CODE MISSING
		String s1 = s.replace(' ','\n');
		System.out.println(s1);

	}
    }
}