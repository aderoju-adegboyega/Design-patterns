public class userTest {
    mockDatabase mdb = new mockDatabase();
    User user = new User(1, mdb);

    public void getUsername(){

        //checks if mock data is fed into the user object
        if ("ade" != user.getUsername()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }

    public void credEncode(){
//checks if the data is encoded properly
        if ("YWRlM0FkZUAxMjUw" != user.credEncode()){
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }
    public void loginOneNull(){
        if (true == user.credCheck()){
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }

    public void clearUser(){
        user.clearUser();
        if (user.getUsername() == null){
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
        }


}
