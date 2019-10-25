/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-27
 * JDK 1.8.0 / NetBeans 8.2
 * This class creates arrays and copies the array location.
 */

public class WrapperShallow {

    public int[] a = new int[3];

    public WrapperShallow(int x, int y, int z) {
        a[0] = x;
        a[1] = y;
        a[2] = z;
    }

    public void setArray(int x, int y, int z) {
        a[0] = x;
        a[1] = y;
        a[2] = z;
    }

    @Override
    public String toString() {
        return a[0] + " " + a[1] + " " + a[2];
    }

    public boolean equals(WrapperShallow ws) {
        if (a[0] == ws.a[0] && a[1] == ws.a[1] && a[2] == ws.a[2]) {
            return true;
        } else {
            return false;
        }
    }

    //invalid copy constructor
    public WrapperShallow(WrapperShallow ws) {
        a = ws.a;
    }
}
