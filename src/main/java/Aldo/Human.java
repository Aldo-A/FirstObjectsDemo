package Aldo;


public class Human {
    
    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy=100;

    public Human(String first, String last, int energy){
        this.firstName=first;
        this.lastName=last;
        this.energy=energy;
    }

    public void eat(Fruit fruit){
        if(this.energy+fruit.getEnergy()<=maxEnergy){
            this.energy+=fruit.getEnergy();
        }else{
            this.energy=maxEnergy;
            System.out.println("MAX!");
        }
    }

    public void work(int hours){
        if(this.energy-(hours*10)<0){
            System.out.println("OVERLOAD");
        }else{
            this.energy-=hours*10;
        }

    }

    public int getEnergy(){
        return this.energy;
    }

    public String getFirst(){
        return this.firstName;
    }

    public String getLast(){
        return this.lastName;
    }
    
}