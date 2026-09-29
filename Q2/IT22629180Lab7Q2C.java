public class IT22629180Lab7Q2C {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            StringBuilder sb = new StringBuilder();
            for (int col = 1; col <= row; col++) {
                sb.append(row);
            }
            System.out.println(sb.toString());
        }
    }
}
