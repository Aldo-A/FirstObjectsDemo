package Aldo;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void ConstructorTest(){
        // Given
        String name="Bob";
        String last="Smith";
        int energy=50;

        // When
        Human test=new Human(name,last,energy);
        String actual=test.getFirst();
        String lastR=test.getLast();
        int energyR=test.getEnergy();

        // Then
        Assert.assertEquals(name, actual);
        Assert.assertEquals(last, lastR);
        Assert.assertEquals(energy, energyR);
    }

    @Test
    public void eatTest(){
        // Given
        Fruit apple=new Fruit("Apple", 30);
        int expected=60;
        Human bob=new Human("Bob","Smith", 30);

        // When
        bob.eat(apple);
        int actualEnergy=bob.getEnergy();


        // Then
        Assert.assertEquals(expected, actualEnergy);
    }

    @Test
    public void workTest(){
        // Given 
        Human bob=new Human("Bob","Smith", 60);
        int expectedEnergy=40;

        // When
        bob.work(2);
        int actualEnergy=bob.getEnergy();


        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        // Given
        Human bob=new Human("Bob","Smith", 60);
        Fruit apple=new Fruit("Apple", 30);
        Fruit mango=new Fruit("Mango", 50);
        Fruit grape=new Fruit("Grape", 10);
        Human.maxEnergy=100;

        // When
        bob.eat(apple);
        bob.eat(mango);
        bob.eat(grape);
        int actual=bob.getEnergy();

        // Then
        Assert.assertEquals(100, actual);
        
    }

    @Test
    public void workMin(){
        // Give
        Human bob=new Human("Bob","Smith", 60);

        // When
        bob.work(20);
        int actual=bob.getEnergy();


        // Then
        Assert.assertEquals(60, actual);

    }

    @Test
    public void maxEnergyChangeTest(){
        Human bob=new Human("Bob","Smith", 60);
        Fruit apple=new Fruit("Apple", 30);
        Fruit mango=new Fruit("Mango", 50);
        Fruit grape=new Fruit("Grape", 10);
        Human.maxEnergy=160;
        bob.eat(apple);
        bob.eat(mango);
        bob.eat(grape);
        int actual=bob.getEnergy();


        Assert.assertEquals(150,actual);

    }
    
}