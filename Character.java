public class Character {
    private int health;
    private int stamina;
    private static final int MAXHEALTH = 100;
    private static final int MAXSTAMINA = 50;


    //Const
    public Character(){
        this.health = MAXHEALTH;
        this.stamina = MAXSTAMINA;
        System.out.printf("Character created with %d health and %d stamina\n",this.health, this.stamina);
    }

    //Getter
    public int getHealth(){
        return this.health;
    }

    public int getStamina(){
        return  this.stamina;
    }

    public void getInfo(){
        System.out.printf("Character's health: %d, stamina: %d.\n",this.health,this.stamina);
    }

    //Method

    public void swingsword(){
        if(this.stamina - 10 < 0){
            System.out.println("Your character needs to cool down.");
        }else{
            this.stamina = this.stamina - 10;
            System.out.printf("Character swings sword. Stamina is now %d.\n",this.stamina);
        }
    }

    public void takeDamage(int damageAmount){
        if(this.health - damageAmount <= 0){
            System.out.printf("Character takes %d damage. Health is now 0.\n",damageAmount);
            System.out.println("Character is dead.");
            this.health = 0;
        }else{
            this.health = this.health - damageAmount;
            System.out.printf("Character takes %d damage. Health is now %d.\n",damageAmount, this.health);
        }
    }

    public void rest(){
        this.health = MAXHEALTH;
        this.stamina = MAXSTAMINA;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
