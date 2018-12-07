package week5.exc5;

public class Joker implements Villain {

    private Integer lives = new Integer(10);

    @Override
    public void weaken(String name) {

        System.out.println("Damn you," + name + "! " + "You managed to weaken me!");
        lives = (lives - 1);

        if (lives == 0) {
            System.out.println("You all defeated me! But I will be back!");
        }// else {
           // return "Damn you," + name + "! " + "You managed to weaken me!";
       // }


        // for (int times = lives; times < 11 ; times=(-1)) {
        //   if(lives==0){
        // System.out.println("You all defeated me! But I will be back!");}
    //}
        //return "Damn you," + name + "!" + "You managed to weaken me!";
    }
}
