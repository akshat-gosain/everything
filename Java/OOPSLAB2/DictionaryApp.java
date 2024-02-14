class DictionaryApp {
  
    public static void main(String args[]) {
        int size;
        int count;
        
        if(args.length < 2) {
            System.out.println("Please provide at least size and count as arguments.");
            return;
        }

        size = Integer.parseInt(args[0]);
        count = Integer.parseInt(args[1]);
        
        if(args.length < count + 2) {
            System.out.println("Please provide enough elements as per the count.");
            return;
        }

        System.out.println("Reading " + count + " elements into a dictionary of size " + size);
        
        MyDictionary d = new MyDictionary(size);
        
        String[] elems = java.util.Arrays.copyOfRange(args, 2, args.length);
        for(int i = 0; i < count; i++) {
            d.Insert(Integer.parseInt(elems[i]));
        }
        d.Show();
        
        
        d.delete();
        d.Show();

        
        d.replace();
        d.Show();
    }
}
