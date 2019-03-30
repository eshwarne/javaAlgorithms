class KLinkedListMerge{
public static ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i=0,j =0;
		while(i<arr1.size() && j<arr2.size()) {
			if(arr1.get(i)<arr2.get(j)) {
				al.add(arr1.get(i));
				i++;
			}
			else if(arr1.get(i)==arr2.get(j)) {
				al.add(arr1.get(i));
				al.add(arr1.get(i));
				i++;
				j++;
			}
			else {
				al.add(arr2.get(j));
				j++;
			}}
			if(i!=arr1.size()-1) {
				while(i<arr1.size()) {
					al.add(arr1.get(i));
					i++;
				}
			}
			else {
				while(j<arr2.size()-1) {
					al.add(arr2.get(j));
					j++;
				}
			}
		
		System.out.println(al);
		return al;
		
	}
	public static void mergeKLists(ArrayList<ArrayList<Integer>> arr) {
		ArrayList<Integer> temp;
		int count = arr.size();
		int now=0;
		while(count!=1) {
			now=0;
			for(int i=0;i<count;i+=2) {
				
				try {
					temp=merge(arr.get(i),arr.get(i+1));
					arr.set(now,temp);
					now++;
				}
				catch(Exception e) {
					temp = arr.get(i);
					arr.set(now, temp);
					now++;
					continue;
				}
				
			}
			count = count%2==0?(count/2):(count+1)/2;
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k=5;
		int n=3;
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<k;i++) {
			al.add(new ArrayList<Integer>());
			for(int j=0;j<n;j++) {
				int b=in.nextInt();
				al.get(i).add(b);
			}
			System.out.println("next");
		}
		mergeKLists(al);
}

}