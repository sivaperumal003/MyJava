package colectionPro;

public class Readingnumbers {

    public static void main(String[] args) {
        int n = 5;
        String s = "1";

        for (int i = 0; i < n; i++) {
            StringBuilder s1 = new StringBuilder();
            int count = 1;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    s1.append(count);
                    s1.append(s.charAt(j - 1));
                    count = 1;
                }
            }

            
            s1.append(count);
            s1.append(s.charAt(s.length() - 1));

            s = s1.toString();
            System.out.println(s);
        }
    }
}
