package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.5, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testSquareFactory() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //Then
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(28.0, square.getCircumference(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

    @Test
    public void testRectangleFactory() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
    }
}
