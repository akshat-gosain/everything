
public class TestDictionary {

	public static void main(String[] args) {
		
		int size=Math.round((float)(100*Math.random()));
			// Take a random 1-to-100 size
		
		if(args.length>0) size=Integer.valueOf(args[0]).intValue();
			// If provided, take it from the command line arguments
		
		int count=Math.round((float)(size*(0.5+0.5*Math.random())));
			// Take a random 1-to-100 length

		if(args.length>1) count=Integer.valueOf(args[1]).intValue();
			// If provided, take it from the command line arguments
		
		HeterogeneousDictionary dictionary=new HeterogeneousDictionary(size);
		System.out.println("Reading "+count+" elements into a dictionary of size "+size);
		
		for (int i=0; i<count; i++) {
			Double f=Double.valueOf(Integer.MAX_VALUE*Math.random());
				// Interger.MAX_VALUE is a BIIG number.
				// This ensures that our small number of elements are all unique.
				// Change it to something small, or to size itself, and see how many keys are equal.
				// Double f=Double.valueOf(size*Math.random());
			Long l=Long.valueOf(Math.round(f.doubleValue()));
				// Both taken as non-primitive types, so that they fit into the Object hierarchy
				Record rec = Math.random()<=0.5?new Record(l,f):new Record(f,l);
			dictionary.put(rec);
		}
		System.out.print(dictionary);
		
		int[] greater = new int[count];
		int[] smaller = new int[count];
		int totalInversions = 0;
		System.out.println("Inversions of each element:");
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) { // Why count instead of dictionary.getLength()?
				if(dictionary.getByIndex(i).compare(dictionary.getByIndex(j))==Comparison.SUCCESSOR) {
					// Why only ==successor test?
					smaller[i]++;
					greater[j]++;
				}
			}
			System.out.println("Latter elements smaller than"+ (i+1) +"th : "+smaller[i]+"; former elements greater than it :"+greater[i]);
			totalInversions += smaller[i];
		}
		System.out.println("Latter elements smaller than"+ count +"th : "+smaller[count-1]+"; former elements greater than it :"+greater[count-1]);
		for (int i = 0; i < count; i++) totalInversions += greater[i];
		System.out.println("Total mean inversions: "+totalInversions/(count*2));
			// Is this final number dependent on the size, count, or otherwise predictable? Or just random?
	}
}
// Test this in the shell with
// for ((i=1; i<=10; i++)) ; do ((size=50+$RANDOM%5)) ; ((count=size*4/5)) ; echo java TestDictionary $size $count ; java TestDictionary $size $random | grep Total ; done
// or
// for ((i=1; i<=10; i++)) ; do ((size=100)) ; ((count=size*4/5)) ; echo java TestDictionary $size $count ; java TestDictionary $size $random | grep Total ; done
// -- in order to observe a pattern in the total mean inversions, if any 
