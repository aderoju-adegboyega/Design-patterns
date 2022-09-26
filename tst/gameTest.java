public class gameTest {

    game game = new game();

    public void initiateGame() {
        if (game.initiateGame()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }
//test i made to check if db connects and have different scenarios for them
    public void whatIfNoDbConnectionOnInitiation() {
        if (game.initiateGame()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }
//shows the first question
    public void question1Test() {
        if (game.question1()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }

    public void question2Test() {
        if (game.question2()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }

    public void question3Test() {
        if (game.question3()) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }
    //checks the answer
    public void checkAnswerIfValid(){
        if (!game.checkAnswer(3)) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");


    }
    //checks the answer
    public void checkAnswerisNull(){
        if(!game.checkAnswer(null)){
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");


    }
    public void calculateSum(){

    }
}


