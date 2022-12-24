public class SearchDuplicateCharacters {

    static String searchDuplicateCharacters(String str) {
        String[] array = str.split("");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i].equals(array[j])) {

                    return array[j];
                }
            }
        }

        return "No repeated symbols were found";
    }

    public static void main(String[] args) {
        System.out.println("Repeated characters: " + searchDuplicateCharacters("Hello"));
        System.out.println("Repeated characters: " + searchDuplicateCharacters("Helo"));
    }
}
