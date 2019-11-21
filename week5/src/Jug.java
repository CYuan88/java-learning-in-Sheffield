public class Jug {

    // private fields
    private int volume;
    private int contents;

    // create an empty jug of a given size
    Jug(int v) {
        volume = v;
        contents = 0;
    }

    // completely fill the jug
    public void fill() {
        // CODE MISSING

        contents = volume;

    }

    // completely empty the jug
    public void empty() {
        // CODE MISSING


        contents = 0;

    }

    // pour the contents of this jug into to_jug
    public void pourInto(Jug to_jug) {
        // CODE MISSING -- use the add(int v) method

        if(to_jug.add(contents) == 0){

            to_jug.contents = to_jug.contents + contents;
            contents = 0;

        }else{

            //to_jug.contents = to_jug.volume;
            contents = contents - (to_jug.volume - to_jug.contents);
            to_jug.contents = to_jug.volume;

        }

    }

    // display the volume and contents of the jug
    public void display() {
        System.out.println("The " + volume + "-litre jug contains " +
                contents + " litres.");
    }

    // add v litres to the contents of the jug
    private int add(int v) {
        // CODE MISSING
        // returns 0 if all v litres fit in the jug, else returns the number
        // of litres of v that are left over -- use the Math.min method
        // (eg) if a 5 litre jug contains 3 litres and we do jug.add(6) then
        // the jug will be completely filled (using 2 of the 6 litres) and
        // 4 will be returned;
        if(v > volume - contents){

            //this.contents = this.volume;
            return (v - volume + contents);

        }else{

            // this.contents = this.contents + v;
            return 0;

        }


    }



}