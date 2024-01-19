package paramiter;

class calculater {
    // add
    int sum(int a, int b) {
        return a + b;
    }

    // sub
    int sub(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    // mul
    int mul(int a, int b) {
        return a * b;
    }

    // div
    int div(int a, int b) {
        return a / b;
    }

    int add(int... args) {
        int ok = 0;
        for (int i : args) {
            ok =+ i;
        }
        return ok;
    }

}
