public class StockCode {

    private String value;
    public StockCode(){

        value = null;

    }
    public StockCode(String value){

        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid() {
        boolean flag = false;
        if (value.length()==10) {
            flag = true;
            String dash = "-";
            for (int i=0; i<10; i++) {
                boolean test = false;
                switch(i) {
                    case 0:
                    case 1:
                    case 2:
                        char a = value.charAt(i);
                        test = Character.isUpperCase(a);
                        break;
                    case 3:
                    case 5:
                        String b = value.substring(i, i+1);
                        test = dash.equals(b);
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        char c = value.charAt(i);
                        test = Character.isDigit(c);
                        break;
                }
                flag = flag && test;
            }
        }
        return(flag);
    }




}
