package fcu.iecs.oop.tiida;

public class NissanTiida {
	
	private int callCount = 1;
	public void tiida()
	{
		int i,j;
		for(i=0;i<callCount;i++)
		{
			for (j=0;j<callCount;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		callCount++;
	}
}
