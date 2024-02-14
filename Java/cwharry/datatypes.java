public class datatypes {
    public static void main(String[] args){
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);
        System.out.println();

        //Increment and decrement operators
        int i = 56;
        int c = i++; //first c is assigned i then i is incremented
        System.out.printf("c = %d\n", c);
        System.out.printf("i = %d\n\n", i);
        int j = 67;
        int d = ++j; //first j is incremented then d is assigned j
        System.out.printf("c = %d\n", d);
        System.out.printf("j = %d\n", j);
    }
}
