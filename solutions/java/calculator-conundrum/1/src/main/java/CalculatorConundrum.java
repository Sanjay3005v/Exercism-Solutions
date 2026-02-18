class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        validateOperation(operation);
        int result = 0;

        switch (operation) {
            case "+":
                result = addition(operand1, operand2);
                break;
            case "*":
                result = multiplication(operand1, operand2);
                break;
            case "/":
                result = division(operand1, operand2);
                break;
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }

    private void validateOperation(String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }

    private int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }

    private int multiplication(int operand1, int operand2) {
        return operand1 * operand2;
    }

    private int division(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

}
