import java.util.Scanner;
/**
 * @author: Chuanyu Yuan
 */


public class StockCode {

    private String code;

    public StockCode() {

        // CODE MISSING
        code = "UUU-0-0000";

    }

    public StockCode(String s) {

        // CODE MISSING
        code = s;

    }

    public void setCode(String s) {

        // CODE MISSING
        code = s;

    }

    public String getCode() {

        // CODE MISSING
        return code;

    }

    public boolean equals(StockCode c) {

        // CODE MISSING
        if(c.code.equals(this.code)){

            return true;

        }else{

            return false;

        }

    }

    public boolean isValid() {
        boolean flag = false;
        if (code.length()==10) {
            flag = true;
            String dash = "-";
            for (int i=0; i<10; i++) {
                boolean test = false;
                switch(i) {
                    case 0:
                    case 1:
                    case 2:
                        char a = code.charAt(i);
                        test = Character.isUpperCase(a);
                        break;
                    case 3:
                    case 5:
                        String b = code.substring(i, i+1);
                        test = dash.equals(b);
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        char c = code.charAt(i);
                        test = Character.isDigit(c);
                        break;
                }
                flag = flag && test;
            }
        }
        return(flag);
    }

    public String toString() {

        // CODE MISSING
        return code;

    }

    public static void main(String[] args) {

        // CODE MISSING
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StockCode aa = new StockCode(a);
        System.out.println(aa.isValid());


    }

}