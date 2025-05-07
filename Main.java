/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
      DACArecipient test = new DACArecipient();

      System.out.println("Test: " + test);

      DACArecipient test2 = new DACArecipient("Cooper", "Lizzie", "12-06-006", "US", 2415021,2415021,2415021,'F');

      System.out.println("Test: " + test2);

  }
}