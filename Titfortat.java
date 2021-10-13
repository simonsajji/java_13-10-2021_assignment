package pkg;
// find the min and max occurence of characters
public class Titfortat {
	public static void main(String args[]) {
		String s="Tit for tat is a proverb";
		s=s.toLowerCase();
		int maxvalue=0;
		int minvalue=s.length();

		char ch=' ';
		char minch=' ';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) !=' ' ) {
				int count=1;
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j) && s.charAt(j)!=' ') {
						
						count=count+1;
					}
				}
				if(count>maxvalue) {
					maxvalue=count;
					ch=s.charAt(i);
				}
				else if(count<minvalue && count !=0) {
					minvalue=count;
					minch=s.charAt(i);
				}
				
			}
			
		}
		System.out.println(ch+" is the maimium value char occuring :"+maxvalue);
		System.out.println(minch+" is the minimium value char occuring :"+minvalue);
	}

}
