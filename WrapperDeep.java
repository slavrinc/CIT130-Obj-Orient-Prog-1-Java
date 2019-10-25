/*
 * Samantha Lavrinc
 * CIT 130-702B / 2019-09-27
 * JDK 1.8.0 / NetBeans 8.2
 * This class creates arrays and copies the values found within the array.
 */

public class WrapperDeep {

    public int[] a = new int[3];

    public WrapperDeep(int x, int y, int z) {
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

    public boolean equals(WrapperDeep wd) {
        if (a[0] == wd.a[0] && a[1] == wd.a[1] && a[2] == wd.a[2]) {
            return true;
        } else {
            return false;
        }
    }

    //valid copy constructor
    public WrapperDeep(WrapperDeep wd) {
        a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = wd.a[i];
        }
    }
}
