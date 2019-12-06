import java.lang.Integer;
import java.io.PrintStream;;
import java.util.Random;

public class VSitesGen {

    public static void main( final String[] args ) {
        int numSites = Integer.parseInt(args[0]);
        int xMin = Integer.parseInt(args[1]);
        int xMax = Integer.parseInt(args[2]);
        int yMin = Integer.parseInt(args[3]);
        int yMax = Integer.parseInt(args[4]);
    
        System.out.println(numSites);
        System.out.println(xMin + " " + xMax + " " + yMin + " " + yMax);
        Random r = new Random();
        for (int i=0; i<numSites; i++) {
            // no sites on the edges or corners
            int x = xMin + 1 + r.nextInt(xMax - xMin - 1);
            int y = yMin + 1 + r.nextInt(yMax - yMin - 1);
            System.out.println(x + " " + y);
        }
    }
}