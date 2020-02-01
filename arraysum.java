class Array
	{
		public static void main(String args[])
		{
			int[] arr;
			int sum = 0;
			arr = new int[10];
			for (int i=0; i<10; i++){
				arr[i] = Integer.parseInt(args[i]);}
			for(int i=0;i<10;i++){
				System.out.print(arr[i]*arr[i]+",");
				sum+=(arr[i]*arr[i]);
						}
			System.out.println("\n");
			System.out.println("Total sum:"+sum);
		}





	}