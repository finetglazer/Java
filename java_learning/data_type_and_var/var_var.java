
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
        double pi = 3.1415;
        float e = 2.71828f;// must has f at the last
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
        // implicit casting (gan du lieu tu dong)
        // from the wider into the smaller
        // int to long 
        int num = 100;
        long bigNum1 = num; // 100L  
        // from long to double:
        long bigNum = 100_000_000L;
        double bigFraction = bigNum; // 100000000.0
        // from short to int:
        short shortNum = 100;
        int num = shortNum; // 100
        // from char to int:
        char ch = '?';
        int code = ch; // 63

        // explicit casting 
        // from the smaller to be the wider nee the explicit casting
        //  double > float > long > int == char 
        double d = 2.00003;

        // it loses the fractional part
        long l =  (long) d; // 2

        // requires explicit casting because long is wider than int
        int i = (int) l; // 2 

        // requires explicit casting because the result is long (indicated by L)
        int val = (int) (3 + 2L); // 5

        // casting from a long literal to char
        char ch = (char) 55L; // '7'

        long bigNum2 = 100_000_000_000_000L;
        int n = (int) bigNum; // 276447232
    }

}
