public class TestArrayExpressions {
public static void main (String[] args) {
int x=1, y=10;
int[] dataItem = new int[5];
dataItem[2] = 5;
dataItem[0] = dataItem[2]*2;
dataItem[x+2] = 3*4;
dataItem[3-2] = 65;
dataItem[2+(x*6+98)/52] = 2+x+y;
for (int i=0; i<5; i++)
System.out.println(dataItem[i]);
}
}