// Java program to illustrate Constructor Overloading
class Box {
    double width, height, depth;

    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    Box() { width = height = depth = 0; }

    Box(double len) { width = height = depth = len; }

    double volume() { return width * height * depth; }
    double volume(double len) { return len*len*len; };
}

// Driver code
public class Prog1a
 {
    public static void main(String args[])
    {
        // create boxes using the various
        // constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
	Box mybox4 = new Box(11);

        double vol;

        vol = mybox1.volume();
	System.out.println("Box-1 Dimensions : "+"Width = "+mybox1.width+" Height = "+mybox1.height+" Depth = "+mybox1.depth);
        System.out.println("Volume of mybox1 is " + vol);

        System.out.println("Box-2 Dimensions : "+"Width = "+mybox2.width+" Height = "+mybox2.height+" Depth = "+mybox2.depth);
        System.out.println("Volume of mybox2 is " +mybox2.volume());

        System.out.println("Box-3 Dimensions : "+"Width = "+mybox3.width+" Height = "+mybox3.height+" Depth = "+mybox3.depth);
        System.out.println("Volume of mybox3 is " +mybox3.volume());

   	System.out.println("Box-3 Dimensions : "+"Width = "+mybox4.width+" Height = "+mybox4.height+" Depth = "+mybox4.depth);
        System.out.println("Volume of mybox4 is " +mybox4.volume(11));

    }
}
