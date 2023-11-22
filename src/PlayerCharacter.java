public class PlayerCharacter {

    private int fruit;
    private int water;
    private int thirst;
    private int hunger;
    private String name;
    private int hp;
    private int goodness;
    private int notchApple;
    private String debugPassword = "password123";
    public void characterCreator(String inputName){
        name = inputName;
        hp = (int) ((Math.random()*110)+90);
        goodness = 0;
        thirst = 100;
        hunger = 120;
    }

    public void playerInventory(){
        fruit = 10;
        water = 5;
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }

    public int getGoodness(){
        return goodness;
    }
    public void setHp(int newHP){
        hp = newHP;
    }

    public void setFruit(int newFruit){
        fruit = newFruit;
    }
    public void setWater(int newWater){
        water = newWater;
    }
    public void setThirst(int setThirst){
        thirst = setThirst;
    }

    public void setHunger(int setHunger){
        hunger = setHunger;
    }
    public int getFruit(){
        return fruit;
    }

    public int getNotchApple() {
        return notchApple;
    }
    public int setNotchApple(int amount){
        notchApple = amount;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWater() {
        return water;
    }
    public void setGoodness(int deed){
        goodness += deed;
    }




}
