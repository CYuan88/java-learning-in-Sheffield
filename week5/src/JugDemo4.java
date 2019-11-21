public class JugDemo4 {

    public static void main(String[] args) {

        // create a 3 litre and a 2 litre jug
        Jug jug5 = new Jug(5);
        Jug jug3 = new Jug(3);

        jug5.fill();
        jug5.pourInto(jug3);
        jug3.empty();
        jug5.pourInto(jug3);
        jug5.fill();
        jug5.pourInto(jug3);



        jug5.display();
    }

}
