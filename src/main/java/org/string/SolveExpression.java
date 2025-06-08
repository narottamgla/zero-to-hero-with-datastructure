package org.string;

public class SolveExpression {
    public static void main(String[] args) {
        String equation = "2+2-4";
        System.out.println(getExpressionOutput(equation));
    }

    private static int getExpressionOutput(String equation) {

        int result = 0;
        int currentNumber = 0;
        char operation = '+'; // Start with addition

        for (int i = 0; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            // If we reach an operator or the end of the string, we process the last number
            if (!Character.isDigit(currentChar) || i == equation.length() - 1) {
                switch (operation) {
                    case '+':
                        result += currentNumber;
                        break;
                    case '-':
                        result -= currentNumber;
                        break;
                }
                operation = currentChar; // Update the operation
                currentNumber = 0; // Reset for the next number
            }
        }
        return result;
    }


}
