
class var_var {
    public static void main(String[] args) {
        int a = 100;
        int b = 12;
        int c = a + b;
        // #long must have the l or L at the last digit
        long bignums = 1222l;
        String s = "hello bro";
        System.out.println(a);
        System.out.println(c);
        System.out.println(s);
        String k = s + "as";
        System.out.println(k);
        boolean check = true;
        System.out.println(check);
        // Important, you cannot assign an integer value to a boolean variable. In Java,
        // 0 is not the same as false

        // XOR
        boolean b1 = false ^ false; // false
        boolean b2 = false ^ true; // true
        boolean b3 = true ^ false; // true
        boolean b4 = true ^ true; // false
        boolean b5 = 5==6;
        System.out.println(b5);
        // order by decreasing of the logical operator: ! (NOT), ^ (XOR), && (AND), || (OR)

    }

}
