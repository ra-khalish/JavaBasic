package algoritmastrukturdata.bresenham;

public class PlotLine {
    public static void main(String[] args){
        int[] P1 = {20,10};
        int[] P2 = {30,18};

        int Pk, Dy, Dx, x, y = 0;

        Dx = P2[0] - P1[0];
        Dy = P2[1] - P1[1];
        x = P1[0];
        y = P1[1];
        Pk = 2*Dy-Dx;

        while (x<P2[0]){
            if (Pk >= 0){
                x=x+1;
                y=y+1;
                Pk=Pk + 2*Dy - 2*Dx;
                System.out.println(Pk + " | " + x + " | " + y + " | ");
            } else {
                x=x+1;
                Pk=Pk + 2*Dy;
                System.out.println(Pk + " | " + x + " | " + y + " | ");
            }
        }
    }
}
