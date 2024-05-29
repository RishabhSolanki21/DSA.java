package code.dsa;
public class Library {
    public static void main(String[] args) {
        // Define the genres and book names
        String[][] library = {
                {"Fiction", "Pride and Prejudice", "To Kill a Mockingbird", "1984"},
                {"Mystery", "Sherlock Holmes", "Gone Girl", "The Da Vinci Code"},
                {"Science Fiction", "Dune", "Ender's Game", "The Martian"},
                {"Fantasy", "The Lord of the Rings", "Harry Potter", "A Song of Ice and Fire"}
        };

        // Print the library
        System.out.println("BOOK LIBRARY:");
        for (int i = 0; i < library.length; i++) {
            System.out.print(library[i][0] + ": ");
            for (int j = 0; j < library[i].length; j++) {
                System.out.print(library[i][j]);
                if (j < library[i].length - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}
