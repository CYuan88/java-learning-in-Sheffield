import sheffield.*;

public class ComplexPlane {
    static final double XSCALE = 100.0;
    static final double YSCALE = 100.0;
    static final double DECAY = 0.02;

    public static void main(String[] args) {
        EasyGraphics g = new EasyGraphics(250,250,125,125);
        //EasyGraphics g = new EasyGraphics(800,800,400,400);
        double p = 0.0;
        g.moveTo(XSCALE, 0);
        while (p<Math.PI*16.0) {
            Complex z = new Complex(Math.cos(p), Math.sin(2.0*p));
            Complex e = new Complex(Math.exp(-DECAY*p), 0.0);
            Complex a = new Complex(0.01*p, 0.0);

            // CODE MISSING
            Complex r = z.multiply(e).add(a);

            //System.out.print(r.angle());

            g.lineTo(r.realPart*100,r.imagPart*100);

            p += 0.05;
        }
    }
}
