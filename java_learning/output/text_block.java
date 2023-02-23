public class text_block {
    public static void main(String[] args) {
        // if u want to print string with many lines 
        // 1: use /n;
        // 2: use """
        //         fdjfkdjkfj
        //         """; is called text block
        String nameAnimal = "Pencil";
        String typeAnimal = "Cat";

        String firstAnimal = """
            name: %s
            type: %s
            """.formatted(nameAnimal, typeAnimal); 

        String secondAnimal = String.format("name: %s\ntype: %s", nameAnimal, typeAnimal);
        System.out.print(firstAnimal);
        System.out.print(secondAnimal);
    }
}
