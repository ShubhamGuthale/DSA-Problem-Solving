//solid rectangle pattern
/* 

 * * * * *
 * * * * *
 * * * * *
 
 */
public class dsa91 {
  public static void main(String args[])
  {
    int n=3;
    //outer loop
    for(int row=1;row<=n;row++)
    {
      //for 5 columns
      for(int col=1;col<=5;col++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
