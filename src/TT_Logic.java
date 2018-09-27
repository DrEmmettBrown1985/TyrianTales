//*************************************************************
// Author: Arturo Negrette
// Project Name: TyrianTales
// Name: TT_Logic.java
// Date: 9/21/18 | 2:06 PM
// Description: Battle logic used during combat
//
//
//*************************************************************
import javax.swing.*;
import java.io.*;
public class TT_Logic
{



    public int EHP; //Enemy Health Level
    public int EDMG; //Enemy Damage
    public String Name;  //Enemy name
    public int HP;  //User HP
    public int DMG; //User Damage
    public int HL;  //User Healing
    public String logic;//Stuff thats output


    //Basic Enemies
    private class GrnSlime
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




    public static void main(String[] args) throws InterruptedException
    {


        TT_Logic UserStats = new TT_Logic();
        int UserHP = UserStats.HP;
        int EnemyHP = 3;

        int EnemyDMG = 3;
        int UserDMG = UserStats.DMG;
        boolean Test = true;


        EnemyHP = 60;
        UserHP = 90;

        System.out.println("Current enemy name: ");
        int cycles = 0;
        while (Test = true)
        {
            if (EnemyHP>0)
            {

                UserHP -= EnemyDMG;
                EnemyHP -= UserDMG;

                cycles++;
                String logic =("\nCurrent HP level " +UserHP +"\nCurrent Enemy HP level " +EnemyHP +"\nAttacks so far " +cycles);
                System.out.println(logic);



                Thread.sleep(1500);
            }
            else
            {
                EnemyHP = 60;
            }

        }



    }

}





