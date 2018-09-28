import java.util.*;
import java.io.*;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNum = 1;
        while(in.hasNextDouble()) {
            double vol = in.nextDouble();
            if(vol == 0) break;
            System.out.println("Case #" + caseNum);
            //cube
            double cube = Math.pow(vol, 0.3333333333);
            System.out.print("Borg Cube: ");
            System.out.printf("%.2f",  cube);
            System.out.print("m length, ");
            System.out.printf("%.2f",  cube);
            System.out.print("m width ");
            System.out.printf("%.2f",  cube);
            System.out.println("m height");
            //cylinder
            double rCyl = vol / Math.PI / 2;
            rCyl = Math.pow(rCyl, 0.33333333333);
            double hCyl = rCyl * 2;
            System.out.print("Whale Cylinder: ");
            System.out.printf("%.2f",  hCyl);
            System.out.print("m height, ");
            System.out.printf("%.2f",  rCyl);
            System.out.println("m radius");
            //sphere
            double rSphere = vol * 3 / 4 / Math.PI;
            rSphere = Math.pow(rSphere, 0.33333333333);
            System.out.print("Tholian Sphere ");
            System.out.printf("%.2f",  rSphere);
            System.out.println("m radius, ");
            //cone
            double rCone = vol * 3 / 2 / Math.PI;
            rCone = Math.pow(rCone, 0.33333333333);
            double hCone = rCone * 2;
            System.out.print("Remulak Cone: ");
            System.out.printf("%.2f",  hCone);
            System.out.print("m height, ");
            System.out.printf("%.2f",  rCone);
            System.out.println("m radius");
            caseNum++;
            in.nextLine();
            
        }
    }
}