//*************************************************************
// Author: Arturo Negrette
// Project Name: TyrianTales
// Name: TT_Logic.java
// Date: 9/21/18 | 2:06 PM
// Description: Battle logic used during combat
//
//
//*************************************************************
public class TT_Logic
{

    public int EHP; //Enemy Health Level
    public int EDMG; //Enemy Damage
    public String Name;  //Enemy name
    public int HP;  //User HP
    public int DMG; //User Damage
    public int HL;  //User Healing

    //Basic Enemies
      public class GrnSlime
        {
            int EHP = 5;
            int EDMG = 3;
            String Name = "Green Slime";

        }

      public class RedSlime
        {
            int EHP = 15;
            int EDMG = 10;
            String Name = "Red Slime";

        }
      public class BluSlime
        {
            int EHP = 30;
            int EDMG = 15;
            String Name = "Blue Slime";

        }
       public class KingSlime
        {
           int EHP = 50;
           int EDMG = 30;
           String Name = "King Slime";

        }

    //Basic Characters

      


}
