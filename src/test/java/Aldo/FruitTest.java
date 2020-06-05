package Aldo;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {
    @Test
    public void ConstructorTest(){
        // Given
        String type="tomato";
        int energy=20;

        // When
        Fruit test= new Fruit(type,energy);
        String actualType=test.getType();
        int actualEnergy=test.getEnergy();


        // Then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);

    }
    
}