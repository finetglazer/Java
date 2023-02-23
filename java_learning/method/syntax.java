public class syntax {
    public static void main(){

        syntax:
            public static int cal(int a,int b){
                return a+b;
            }
            public static : modifier
            int : type return 
            cal : name of method
            int a,int b: paramator

            1. modifier:
            + access modifiers: Access modifiers define the visibility of the method. For now, we're using a public access modifier,
             which means there are no restrictions for invoking the method even from other classes. 
            + non-access modifiers: Non-access modifiers provide information about the behavior of methods to JVM.
             The modifier static means that the method belongs to the class and it can be accessed without creating any object.
             This type of method is called a static method.
             If the method is declared without the static modifier, 
             it means that the method can be invoked only through or with an object or instance of this class.
              Such methods are called instance methods.
            2. parameter
            // As you know, there are also methods that don't have values passed to them. These methods are known as non-parameterized.
            3. body and return statement
                may be any type like: long, int, float, double, or reference type like String;
                or nothing using type void 
                in void type can use return; to out of the method
            4. What happens when we invoke a method
            When you pass a variable of a primitive type to a method, a copy of this variable is created with the same value. 
            Inside a method, only this copy is processed.
            Any changes to this copy will not affect the variable that was passed.
            
            Ex:
                main(){
                    k=5;
                    dm(k);
                    print(k)
                }
                dm void (int x){
                    x = x+5;
                    print(x)
                }
                -> 10 
                -> 5
            }
}
