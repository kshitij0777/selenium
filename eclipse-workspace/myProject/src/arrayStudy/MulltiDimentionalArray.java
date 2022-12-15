package arrayStudy;

public class MulltiDimentionalArray {

	public static void main(String[] args) 
	{
		//Arrays declaration
		
		int rollNum[][]=new int[2][2];
		
		//2 Array intilization or  value assign
		 rollNum[0][0]=10;
		 rollNum[0][1]=20;
		 rollNum[1][0]=30;
		 rollNum[1][1]=40;
		 
		 //Use
		 System.out.println("============================================================");
		 System.out.println(rollNum[0][0]);
		 System.out.println(rollNum[0][1]);// regular print
		 System.out.println(rollNum[1][0]);
		 System.out.println(rollNum[1][1]);
		 
		 System.out.println("============================================================");
		 System.out.print(rollNum[0][0]+"  ");
		 System.out.println(rollNum[0][1]);// matrix from print
		 System.out.print(rollNum[1][0]+"  ");
		 System.out.println(rollNum[1][1]);
		 
		 System.out.println("============================================================");
		 //for loop
		 //outer for loop----->rows
		 for (int k=0;k<=rollNum.length-1;k++)
		 { 
		 
		  for (int j=0;j<=rollNum.length-1;j++)
		  {
			  System.out.print(rollNum[k] [j]+"  ");
		  }
		  System.out.println();
		 }


		 }
	}


