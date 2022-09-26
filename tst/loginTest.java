public class loginTest {
    mockDatabase m = new mockDatabase();
    login login = new login(1, m);

//SigninTest
    public void checkLoginworks() {
        if (true == login.signin("YWRlQWRlQDEyNTA=")) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }
}


