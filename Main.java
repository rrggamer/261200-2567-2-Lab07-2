public class Main {
    public static void main(String[] args) {


       Character player1 = new Character();


       player1.swingsword();
       player1.swingsword();
       player1.swingsword();
       player1.swingsword();
       player1.swingsword();
       player1.swingsword();

       player1.takeDamage(30);
       player1.takeDamage(50);
       player1.takeDamage(20);

       player1.rest();

       player1.getInfo();

//       System.out.println(player1.getHealth());
//       System.out.println(player1.getStamina());

    }
}