public class Monster
{
   private String name; int howBig;
   
   Monster()
   {
      name = "no name";
      howBig = 0;
   }
   
   Monster (String n, int size)
   {
      name = n;
      howBig = size;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getHowBig()
   {
      return howBig;
   }
   
   void setName(String newName)
   {
      name = newName;
   }
   
   void setHowBig (int size)
   {
      howBig = size;
   }

   boolean isBigger (Monster other)
   {
      if(howBig > other.howBig)
         return true;
      else
         return false;
   }
}