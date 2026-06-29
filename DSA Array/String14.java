class String14
{
	public static void main(String x[])
	{
		String str="good morning india good morning pune";
		int index = str.indexOf("morning");
		if(index!=-1)
		{
			System.out.println("Data found "+index);
		}
		else
		{
			System.out.println("Data not found");
		}
	}
}