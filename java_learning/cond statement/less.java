public class less {
    public static void main(String[] args){
        // they are the same c++ but the clean code is diff
        // if (expression) {    
            // do something
        // } else {
            // do something else
        // } 

        // TERNARY OPERATOR
        // result = condition ? trueCase : elseCase;
        int a= 5;
        String ans = a>3 ? "more" : "less";
        String key = a> 6 ? "more 6" : a>4 ? "more 4" : "less 4";
        System.out.println(ans);
        System.out.println(key);
    }
}
