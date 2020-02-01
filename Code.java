class Code
{
public static void main(String[] args)
{
int count=0;
for(int i=41;i<250;i++)
{
if(i%5==0)
{
count=count+i;
}
}
System.out.println("Sum of the no:"+count);
}
}