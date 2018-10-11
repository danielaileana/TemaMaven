public class Expert extends Basic {

//    public Expert(int pointsFloating) {
////        super(pointsFloating);
//    }

    public int pow(int base, int exp) {
        int rez = 1;
        for (int i = 1; i < exp; i++) {
            rez = base * base;
        }
        if (exp == 0) {
            rez = 1;
        }
        return rez;
    }

    public float root(int number) {
        float root = 0.0f;
        float square = root;
        while (square < number) {
            root++;
            square = root * root;
        }
        return root;

    }

    public int factorial(int n) {
        int rez = 1;
        for (int i = 1; i <= n; i++) {
            rez = rez * i;
        }
        return rez;


    }

    public int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

}
