package string;

public class string2 {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String firstName = "Ankit";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        printLetter(fullName);

    }

}
