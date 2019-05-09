package tests;
import algorithms.Queue;
import org.testng.Assert;
import org.testng.annotations.Test;


public class QueueTests {

    @Test
    public void checkEmpty_ReturnsTrue(){
        //Arrange
        final boolean expected = true;

        //Act
        final Queue queue = new Queue(1);
        final boolean actual = queue.isEmpty();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add_Object_CheckEmpty_ReturnsFalse(){
        //Arrange
        final boolean expected = false;

        //Act
        final Queue queue = new Queue(2);
        queue.add("Hello World");
        boolean actual = queue.isEmpty();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addObject_CheckFull_ReturnsTrue(){
        //Arrange
        final boolean expected = true;

        //Act
        final Queue queue = new Queue(1);
        queue.add("Hello World");
        final boolean actual = queue.isFull();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addTwoObjects_RemoveOneObjectAndPeek_Returns2(){
        //Arrange
        final Object expected = 2;

        //Act
        final Queue queue = new Queue(2);
        queue.add("Hello World");
        queue.add(2);
        queue.remove();
        final Object actual = queue.peek();

        //Assert
        Assert.assertEquals(actual, expected);
    }
}
