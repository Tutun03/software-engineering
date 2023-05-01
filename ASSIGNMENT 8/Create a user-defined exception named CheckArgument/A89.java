
 class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }

    public static class A89 {
        public static void main(String[] args) {
            int sum = 0;
            try {
                if (args.length < 5) {
                    throw new CheckArgumentException("At least 5 arguments are required.");
                }
                for (String arg : args) {
                    sum += Integer.parseInt(arg);
                }
                System.out.println("Sum of arguments: " + sum);
            } catch (CheckArgumentException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("One or more arguments is not a valid integer.");
            }
        }
    }
}

