package tests;
import algorithms.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StackTests {

    @Test
    public void checkEmpty_ReturnsTrue(){
        //Arrange
        final boolean expected = true;
        final Stack stack = new Stack(1);

        //Act
        final boolean actual = stack.isEmpty();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkFull_ReturnsFalse(){
        //Arrange
        final boolean expected = false;
        final Stack stack = new Stack(1);

        //Act
        final boolean actual = stack.isFull();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add2Items_Peek_Returns3() {
        //Arrange
        final Object expected = 3;
        final Stack stack = new Stack(3);

        //Act
        stack.add(2);
        stack.add(3);
        final Object actual = stack.peek();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add2Items_Pop_Returns2(){
        //Arrange
        final Object expected = 2;
        final Stack stack = new Stack(3);

        //Act
        stack.add(2);
        stack.add(3);
        stack.pop();
        final Object actual = stack.peek();

        //Assert
        Assert.assertEquals(actual, expected);
    }
}
