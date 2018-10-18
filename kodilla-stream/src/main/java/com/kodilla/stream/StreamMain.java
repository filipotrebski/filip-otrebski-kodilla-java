package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
      /*  Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is example text");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is example no2"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expresions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with methods references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);*/

        String poem = "This is text to decorate";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(poem, poem1 -> "ABC" + poem + "ABC");
        poemBeautifier.beautify(poem, poem1 -> poem.toUpperCase());
        poemBeautifier.beautify(poem, poem1 -> poem.replace("t", "X"));
        poemBeautifier.beautify(poem,poem1 -> poem.substring(4,15));
        poemBeautifier.beautify(poem, poem1 -> "\n******************************\n***" + poem.concat("***\n******************************"));


    }
}