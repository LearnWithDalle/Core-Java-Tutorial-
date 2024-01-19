class argg {
    static int sum(int... argg) {
        int ok = 0;
        for (int num : argg) {
            ok += num;
        }
        return ok;
    }

    public static void main(String[] args) {

        // System.out.println("the sum of : " + sum(25,6,54,6,4,26,65));

        int x = 15;
        int y = 65;
        int z = 45;
        int f = 56;
        int ok = sum(x, y, z, f, 5465, 54);
        System.out.println(ok);
    }

}