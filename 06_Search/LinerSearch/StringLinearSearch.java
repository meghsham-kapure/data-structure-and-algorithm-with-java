package LinerSearch;
// Find the char in given String

class ArrayLinerSearch {
    public static void main(String[] args) {
        String str = "Edwin Jarvis";

        char target = 'z';

        int result = linearSearch(str, target);

        if (result != -1) {
            System.out.println("Found " + target + " character in string " + str);
        } else {
            System.out.println("Found Not \'" + target + "\' character in string " + str);
        }

    }

    public static int linearSearch(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }
}