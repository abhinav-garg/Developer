public class PermuteString {
	public String recurPermute(String s) {
		int len, i;
		String start, remainingString, permutedString;
		len = s.length();	// Get length of input string
		for(i = 0; i < len; i++) {
			// StringBuilder sb = new StringBuilder(s);	// String is immutable - StringBuilder is mutable
			start = s.substring(i,i+1);		// Start of the permuted String
			System.out.println(i + start);
			// remainingString = sb.deleteCharAt(i).toString();	// Eliminate the starting character from the remaining string
			remainingString = s.substring(0, i) + s.substring(i+1, len);
			if(remainingString.length() <= 0) {
				return start;		// The boundary case, which breaks the recursion
			}
			System.out.println(remainingString);
			permutedString = start + recurPermute(remainingString);
			// System.out.println(permutedString);
			// return permutedString;
		}
		return "";
	}
	public static void main(String args[]) {
		PermuteString p = new PermuteString();
		p.recurPermute("abcd");
	}
}