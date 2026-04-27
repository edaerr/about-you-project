import java.util.Scanner;

class ImageDisplay {
    public static void display(String imagePath) {
        System.out.println("[Image: " + imagePath + "]");
    }
}

public class AboutMe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== ABOUT ME MENU ===");
            System.out.println("1. About Me");
            System.out.println("2. School");
            System.out.println("3. Favorite Place");
            System.out.println("4. Favorite Thing");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();
            input.nextLine(); // buffer temizleme

            switch (choice) {

                case 1:
                    ImageDisplay.display("me.jpg");
                    System.out.println("Hi, I'm Eda. I'm a CSD student and I enjoy learning new things.");
                    waitEnter(input);
                    break;

                case 2:
                    ImageDisplay.display("school.jpg");
                    System.out.println("This is my school life. I study Computer Software Development at LWTech.");
                    System.out.println("After finishing this program, I’m planning to continue at UW and study engineering.");
                    waitEnter(input);
                    break;

                case 3:
                    ImageDisplay.display("place.jpg");
                    System.out.println("I really enjoy being in nature and exploring places like this.");
                    waitEnter(input);
                    break;

                case 4:
                    ImageDisplay.display("fav.jpg");
                    System.out.println("This is one of my favorite moments. I love spending time with my dog.");
                    waitEnter(input);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }

    public static void waitEnter(Scanner input) {
        System.out.println("Press Enter to continue...");
        input.nextLine();
    }
}