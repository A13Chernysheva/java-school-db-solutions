package matematik;

public enum Operation {
    PLUS {
        @Override
        public int compute(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int compute(int a, int b) {
            return a - b;
        }

    },
    MULTIPLE {
        @Override
        public int compute(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int compute(int a, int b) {
            return a / b;
        }
    };

    public abstract int compute(int a, int b);

    public static Operation[] getAll() {
        return values();
    }
}
