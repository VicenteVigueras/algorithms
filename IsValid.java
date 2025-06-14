class isValid {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        if (s.length() == 0 || s.length() == 1) {
            return false;
        }
        for (char current : s.toCharArray()) {
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty())
                    return false;
                if (current == '}' && stack.peek() == '{' ||
                        current == ']' && stack.peek() == '[' ||
                        current == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
