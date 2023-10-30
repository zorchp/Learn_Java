public class GetArgsFromCommand {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calc op1 op op2");
            System.exit(1);
        }
        int ans = 0;
        switch (args[1].charAt(0)) {
            case '+':
                ans = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                ans = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                ans = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                ans = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + ans);
    }
}
