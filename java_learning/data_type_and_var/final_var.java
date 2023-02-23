public class final_var {
    final var is constant var 
    it must be assigned before print 
    khi quen k gan gia tri cho final var no se ko co loi cho den tan khi print hay b= final_var + x goi la
    truy cap no
    2. final reference
    Note, that it is always possible to change the internal state of an object pointed at by a final reference variable, i.e.
     the constant is only the variable itself (the reference), not the object to which it refers.
     khi thay doi tham chieu ma no tro den thi thay the the internal state.
     final StringBuilder builder = new StringBuilder(); // ""
    builder.append("Hello!"); // it works
    System.out.println(builder.toString()); // Hello!
}
