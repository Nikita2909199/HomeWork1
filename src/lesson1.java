public class lesson1 {
    public class mein {
        public mein() {
        }
        public class ThreeWords {
            public ThreeWords(mein this$0) {
            }
            public static void main(String[] args) {
                System.out.println("Banana!");
                System.out.println("Apple");
                System.out.println("Orange");
            }
        }
        public class printColor {
            public printColor(mein this$0) {
            }

            public static void main(String[] args) {
                int value = 50;
                if (value >= 0) {
                    System.out.println("Красный");
                }
                if (value <= 100) {
                    System.out.println("Желтый");
                }
                if (value > 100) {
                    System.out.println("Зелёный");
                }
            }
        }
        public class compareNumbers {
            public compareNumbers(mein this$0) {
            }
            public static void main(String[] args) {
                int a = 0;
                int b = 10;
                if (a >= b) {
                    System.out.println("a>= b");
                }
                if (a <= b) {
                    System.out.println("a<b");
                }
            }
        }
        public class checkSumSign {
            public checkSumSign(mein this$0) {
            }

            public static void main(String[] args) {
                int a = 10;
                float b = 5.0F;
                int c = (int)((float)a + b);
                System.out.println("c = " + c);
                if (c >= 0) {
                    System.out.println("сумма положительная");
                }
            }
        }
    }
}
