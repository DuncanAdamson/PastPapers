public class problems {
	
	
	public boolean primality(int n){
		if(n == 1){
			return false;
		}
		if(n == 2){
			return true;
		}
		for(int i = 1; i*i <= n; i ++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public int gcd(int a, int b){
		int n1 = a;
		int n2 = b;
		int n3 = 0;
		int k = a/b;
		n3 = n1 - n2*k;
		while(n3 != 0){
			n1 = n2;
			n2 = n3;
			k = n1/n2;
			n3 = n1 - n2*k;
		}
		return n2;
	}
	public boolean isMember(Object[] set1, Object[] set2){ // is set2 a member of set1
		for(Object o1; set2){
			boolean found = false;
			for(Object o2; set1){
				if(o1 == o2){
					found = true;
					break;
				}
			}
			if(!found){
				return false;
			}
		}
		return true;
	}
	
	public Object[] union(Object[] set1, Object[] set2){ // is set2 a member of set1
		ArrayList<Object> union = new ArrayList<Objects>();
		for(Object o1 : set2){
			union.appned(o1);
		}
		for(Object o : set1){
			boolean found = false;
			for(Object o2 : union){
				if(o == o2){
					found = true;
					break;
				}
			}
			if(!found){
				union.append(o)
			}
		}
		return union.toArray();
	}
	public Object[] intersection(Object[] set1, Object[] set2){
		ArrayList<Object> intersect = new ArrayList<Object>();
		for(Object o1 : set1){
			for(Object o2 : set2){
				if(o1 == o2){
					intersect.append(o1);
					break;
				}
			}
		}
		return intersect.toArray();
	}
	public
}
