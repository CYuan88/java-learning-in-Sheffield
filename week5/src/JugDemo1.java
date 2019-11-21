/*
  Measuring 1 litre using a 3 litre and a 2 litre jug
  Cleaned up: 15/09/06 by YG
*/

class JugDemo1 {
    public static void main(String[] args) {

        // create a 3 litre and a 2 litre jug
        Jug jug3 = new Jug(3);
        Jug jug2 = new Jug(2);
        jug3.display();
        // measure 1 litre
        jug3.fill();
        jug3.display();
        jug3.pourInto(jug2);

        // display the contents of the jug
        jug3.display();
    }
}