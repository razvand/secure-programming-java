public class Env {
    public static void main(String args[]) {
        String username = System.getenv("USER");
        if (username.equals("root"))
            System.out.println("Congratualations! You are root.");
        else
            System.out.println("You are just an average user. Boo!");
    }
}
