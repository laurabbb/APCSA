public class monsterRunner
{
   public static void main (String args[])
   {
   Monster frankenstein = new Monster ("Tom",20);
   Monster dracula = new Monster ("Frank", 1 );
   System.out.println(frankenstein.isBigger(dracula));
   }
}