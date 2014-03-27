public class FindTimeDiff	{
	public static void main(String[] args)	{
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 4000000; i++)	;
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}