import java.util.Scanner;

public class VoterEdu {
    public static void main(String[] args) {

        System.out.println("Welcome to Voter Education, Here we will simulate the choices you make and teach you how to be a better informed voter");
        System.out.println("Sign in with username: ade, Password: Ade@1250");

        User u = new User();
        landingPage(u);
        /*
        userTest ut = new userTest();
        ut.getUsername();
        ut.credEncode();
        ut.clearUser();
        ut.loginOneNull();

        gameTest gt =new gameTest();
        gt.calculateSum();
        gt.initiateGame();
        gt.checkAnswerisNull();
        gt.question1Test();
        gt.question2Test();
        gt.question3Test();
        gt.whatIfNoDbConnectionOnInitiation();
        gt.checkAnswerIfValid();

        loginTest lt = new loginTest();
        lt.checkLoginworks();
        */

    }

    private static void landingPage(User user) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Register");
        System.out.println("2: Login");
        System.out.println("3: Exit");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                registerUser(user);
                break;

            case 2:
                loginUser(user);
                break;

            case 3:
                break;

            default:
                System.out.println("Invalid selection");
                break;
        }
    }

    private static void loginUser(User user) {
        login l = new login(1, new mockDatabase());
        Scanner sc = new Scanner(System.in);
        String uName = "";
        System.out.println("Enter your username");
        uName=sc.nextLine();
        System.out.println("Enter your passcode");
        String upass = sc.nextLine();
        user.setuserName(uName);
        user.setPasscode(upass);
        if (!l.signin(user.credEncode()))
        {
            loadGame();
        }
        else {
            user.setuserName("");
            user.setPasscode("");
            landingPage(user);
        }
    }

    private static void loadGame() {
        game game = new game(1, new mockDatabase());
    }

    private static void registerUser(User user) {
        registration reg = new registration();
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Enter your name");
        name=sc.nextLine();
        user.setuserName(name);
        System.out.println("Enter your passcode");
        String upass = sc.nextLine();
        user.setPasscode(upass);
        if(reg.checkPass() && reg.checkUser()){
            reg.register();
            System.out.println("Successfully registered, please sign in");
            landingPage(user);
        }
        else
            if (!reg.checkPass()){
                System.out.println("Ensure your password is more than 6 characters and contains Alphanumeric characters");
            }
            if(!reg.checkUser()){
                System.out.println("Ensure your username is not more than 3 characters");
            }
    }


}
