import java.util.Scanner;

public class game implements Igame{

    private nationStats ns;
    public game() {
        initiateGame();

    }

    public game(int id, Idb db){
        ns = new nationStats(1, db);
        db.loadNationStats(1, ns);
        initiateGame(ns);
    }

    private boolean initiateGame(nationStats ns) {
        System.out.println("welcome to VoterEdu, in this game you will be making decisions that will affect the below stats");
        System.out.println("Economy: " + ns.getEconomy());
        System.out.println("Citizen's overall happiness: " + ns.getCitizen_happiness());
        System.out.println("Education: " + ns.getEducation());
        System.out.println("Infrastructure: " + ns.getInfrastructure());
        System.out.println("Voter Awareness: " + ns.getVoter_awareness());
        System.out.println("Intertribal Relationship: " + ns.getIntertribal());
        System.out.println("Voter Apathy: " + ns.getVoterApathy());
        System.out.println("Rebellion: " + ns.getRebellion());
        System.out.println("\n\n");

        System.out.println("The above numbers increase or decrease based on your answers to the following questions\n");

        question1();
        return true;
    }

    public boolean question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you think your vote counts?");
        System.out.println("Type 1 for yes, Type 2 for no\n");
        Integer ans=sc.nextInt();

        if (checkAnswer(ans)){
            switch (ans){
                case 1:
                    System.out.println("Good job, the Elite political class likes to make people believe that it doesn't matter but we know a lot better than to believe that");
                    ns.setVoterApathy(ns.getVoterApathy()+5);
                    System.out.println("Voter Apathy: " + ns.getVoterApathy());
                    ns.setCitizen_happiness(ns.getCitizen_happiness()+5);
                    System.out.println("Citizen Happiness: " + ns.getCitizen_happiness());
                    ns.setVoter_awareness(ns.getVoter_awareness() + 5);
                    System.out.println("Voter Awareness: " + ns.getVoter_awareness()+ "\n");
                    break;
                case 2:
                    System.out.println("Hmmm hi there, i know the feedback you have gotten over the years makes you believe this, but it is the constitutional right of every citizen to vote and your vote counts");
                    ns.setVoter_awareness(ns.getVoter_awareness() - 5);
                    System.out.println("Voter Awareness: " + ns.getVoter_awareness());
                    ns.setCitizen_happiness(ns.getCitizen_happiness() - 5);
                    System.out.println("Citizen Happiness: " + ns.getCitizen_happiness());
                    ns.setInfrastructure(ns.getInfrastructure() - 5);
                    System.out.println("Infrastructure: " + ns.getInfrastructure()+ "\n");
                    break;
                default:
                    System.out.println("Error return to landing page");
                    break;
            }
            question2();
        }
        else
            System.out.println("Please participate genuinely");
        return true;
    }

    public boolean question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A man comes to you during election season, he offers you 10$ to vote for his candidate, do you accept the money and vote?");
        System.out.println("Type 1 for yes, Type 2 for no"+ "\n");
        Integer ans=sc.nextInt();

        if (checkAnswer(ans)){
            switch (ans){
                case 1:
                    System.out.println("Bad job, This is a crime, you and many others commit this crime therefore, electing a tyrant ");
                    ns.setEconomy(ns.getEconomy() - 7);
                    System.out.println("Economy: " + ns.getEconomy());
                    ns.setEducation(ns.getEducation() - 7);
                    System.out.println("Education: " + ns.getEducation());
                    ns.setIntertribal(ns.getIntertribal() - 4);
                    System.out.println("Inter-tribal Relationship: " + ns.getIntertribal());
                    ns.setRebellion(ns.getRebellion() + 5);
                    System.out.println("Rebellion: " + ns.getRebellion()+ "\n");
                    break;
                case 2:
                    System.out.println("Good job, you reported the man, he  was discovered and his candidate disqualified");
                    ns.setVoter_awareness(ns.getVoter_awareness() + 5);
                    System.out.println("Voter Awareness: " + ns.getVoter_awareness());
                    ns.setCitizen_happiness(20);
                    System.out.println("Citizen Happiness: " + ns.getCitizen_happiness());
                    ns.setInfrastructure(15);
                    System.out.println("Infrastructure: " + ns.getInfrastructure()+ "\n");
                    break;
                default:
                    System.out.println("Error return to landing page");
                    break;
            }
            question3();
        }
        else
            System.out.println("Please participate genuinely");
        return true;
    }

    public boolean question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your representative is misrepresenting you, you have the option of calling for a recall, this will make the representative to be witdrawn from office, do you join the petition?");
        System.out.println("Type 1 for yes, Type 2 for no"+ "\n");
        Integer ans=sc.nextInt();

        if (checkAnswer(ans)){
            switch (ans){
                case 1:
                    System.out.println("Good job, your petition recalls the representative  and sends a message to other politicians");
                    ns.setEconomy(ns.getEconomy() + 11);
                    System.out.println("Economy: " + ns.getEconomy());
                    ns.setEducation(ns.getEducation() - 7);
                    System.out.println("Education: " + ns.getEducation());
                    ns.setRebellion(ns.getRebellion() - 9);
                    System.out.println("Rebellion: " + ns.getRebellion());
                    break;
                case 2:
                    System.out.println("Bad job, politicians in the country are emboldened by your failure to call your representative together");
                    ns.setVoter_awareness(ns.getVoter_awareness() - 5);
                    System.out.println("Voter Awareness: " + ns.getVoter_awareness());
                    ns.setCitizen_happiness(8);
                    System.out.println("Citizen Happiness: " + ns.getCitizen_happiness());
                    ns.setInfrastructure(3);
                    System.out.println("Infrastructure: " + ns.getInfrastructure());
                    ns.setRebellion(ns.getRebellion() + 9);
                    System.out.println("Rebellion: " + ns.getRebellion());
                    break;
                default:
                    System.out.println("Error return to landing page");
                    break;
            }

            finalStage();
        }
        else
            System.out.println("Please participate genuinely");
        return true;
    }

    public boolean finalStage() {
        calculateRebellion();
        calculateApathy();

        return true;
    }

    public boolean initiateGame() {
        System.out.println("Database connection is currently down please try again in 5 minutes");


        return true;
    }


    @Override
    public void calculateRebellion() {
        int sum =ns.getCitizen_happiness()+ ns.getEconomy()+ ns.getEducation()+ns.getIntertribal()+ ns.getInfrastructure()+ns.getVoter_awareness();
        ns.setRebellion(ns.getRebellion() + (sum/6));
        System.out.println("Rebellion: " + ns.getRebellion());
        if(ns.getRebellion() <= 10){
            System.out.println("Rebellion is low, you made the right choices" );
        }
        else{
            System.out.println("Rebellion is high, your people are revolting!!!");
        }
    }

    @Override
    public void calculateApathy() {
        int sum =ns.getCitizen_happiness()+ ns.getEconomy()+ ns.getEducation()+ns.getIntertribal()+ ns.getInfrastructure()+ns.getVoter_awareness();
        ns.setVoterApathy(ns.getVoterApathy() + (sum/6));
        System.out.println("Voter Apathy: " + ns.getRebellion());
        if(ns.getRebellion() <= 10){
            System.out.println("Apathy is low, you made the right choices" );
        }
        else{
            System.out.println("Apathy is high, your people don't care!!!");
        }
    }

    public boolean checkAnswer(Integer i){
        if (i >= 3 && i == null){
            return false;
        }
        else
            return true;
    }


}
