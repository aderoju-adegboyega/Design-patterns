public class registrationTest {
    mockDatabase mdb = new mockDatabase();
    registration reg = new registration(1, mdb);

    public void checkUsernameLessThanThree(){
        if (reg.checkUser()){
                System.out.println("working as expected");
        }else
            System.out.println("test failed");
    }
/* used to check the length of the password
    refactored after use
    public void checkPasswordlengthStrong(){
        if (reg.checkPass() >= 6){
            System.out.println("working as expected");
        }
        else
            System.out.println("test failed");
    }
*/

    /* used to check if password contains numbers
    refactored after use
    public void checkPasswordContainNumber() {
        if (reg.checkPass) {
            System.out.println("working as expected");
        } else
            System.out.println("test failed");
    }
*/

    public void checkPasswordLengthAndContainNumber(){
        if (reg.checkPass()) {
            System.out.println("working as expected");
        } else
            System.out.println("test failed");
    }

    public void checkRegisterSuccessful(){
        if(reg.register()){
            System.out.println("working as expected");
        } else
            System.out.println("test failed");
    }

}


