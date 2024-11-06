class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                switch (token) {
                    case "+" -> stack.push(firstOperand + secondOperand);
                    case "-" -> stack.push(firstOperand - secondOperand);
                    case "*" -> stack.push(firstOperand * secondOperand);
                    case "/" -> stack.push(firstOperand / secondOperand);
                }
                continue;
            }
            stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}