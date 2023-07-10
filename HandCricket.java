import java.util.Scanner;
class HandCricket
{
    public static int toss;
    public static void Set_Of_Rules()
    {
        System.out.print(">>> HERE ARE SOME RULES OF THE GAME :-\n\n");
        System.out.print("#1 PLEASE ENTER THE CORRECT CHOICE AS PER THE INSTRUCTIONS.\n");
        System.out.print("#2 YOU WILL BE PROVIDED 5 CHANCES DURING THE TOSS IN CASE YOU HAVE ENTERED THE WRONG CHOICE.\n");
        System.out.print("#3 IN CASE YOU WIN THE TOSS AND YOU DID NOT CHOOSE THE CORRECT OPTION DISPLAYED BY THE DEVICE FOR BATTING AND BALLING THEN YOU WILL GET CHANCE\n");
        System.out.print("   TO RE-ENTER THE CHOICE ONLY 5 TIMES.\n");
        System.out.print("#4 IN CASE YOU HAVE ENTERED A NUMBER NOT IN THE RANGE[1-9] WHILE BATTING THEN IT WILL BE DECLARED AS LBW.SO BE VERY CAREFUL WHILE BATTING.\n");
        System.out.print("#5 IN CASE YOU HAVE ENTERED A NUMBER NOT IN THE RANGE[1-9] WHILE BALLING THEN IT WILL BE CONSIDERED AS A NO-BALL AND THE BATSMAN WILL BE\n");
        System.out.print("   AWARDED +1 RUN.SO BE VERY CAREFUL WHILE BALLING.\n");
        System.out.print("\n");
        System.out.print(">>> SO GET READY FOR THE MATCH WHILE THE DEVICE GETS READY..........\n");
        for (int j = 1 ; j <= 1000 ; j++)
        {
            for (int i = 1 ; i <= 10000000 ; i++)
            {
            }
        }
    }

    public static int Toss_Choice_User()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("PRESS 1 FOR ODD AND AND 2 FOR IF :-\n");
        int toss = obj.nextInt();
        if (toss == 1 || toss == 2)
            return toss;
        else
        {
            int num_toss = 1;
            while (toss != 1 && toss != 2)
            {
                System.out.print("WRONG CHOICE ENTERED FOR THE TOSS.PLEASE RE-ENTER THE CORRECT CHOICE:-\n");
                toss = obj.nextInt();
                num_toss += 1;
                if (num_toss == 5)
                    break;
            }
            if (num_toss == 5)
                return 0;
            else
                return toss;
        }
    }

    public static int Device_Batting()
    {
        int x = (int)((Math.random())*10);
        while (x <= 0 || x >= 10)
        {
            x = (int)((Math.random()*10));
        }
        return x;
    }

    public static int Device_Balling()
    {
        int x = (int)((Math.random()*10));
        while (x <= 0 || x >= 10)
        {
            x = (int)((Math.random()*10));
        }
        return x;
    }

    public static int Players_Balling()
    {
        Scanner obj = new Scanner(System.in);
        int players_ball = obj.nextInt();
        if (players_ball <= 0 || players_ball >= 10)
            return 0;
        else
            return players_ball;
    }

    public static int Players_Batting()
    {
        Scanner obj = new Scanner(System.in);
        int players_bat = obj.nextInt();
        if (players_bat <= 0 || players_bat >= 10)
            return 0;
        else
            return players_bat;
    }

    public static int Cons_Num_Generator()
    {
        int cons_num_generator = (int)(Math.random()*10);
        while (cons_num_generator < 1)
        {
            cons_num_generator = (int)(Math.random()*10);
        }
        return cons_num_generator;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\"WELCOME TO THE GAME OF HAND-CRICKET\"\n\n");
        Set_Of_Rules();
        System.out.print("\n");
        System.out.print("ENTER THE NUMBER OF MATCHES YOU WANT TO HAVE WITH THE DEVICE :-\n");
        int n = in.nextInt();
        System.out.print("\n");
        int num_matches_won = 0;
        int num_matches_lost = 0;
        int num_matches_tie = 0;
        for (int i = 1 ; i <= n ; i++)
        {
            System.out.print("ROUND-"+i+"\n\n");
            System.out.print("GET READY FOR THE TOSS...\n");
            int user_toss_choice = Toss_Choice_User();
            if (user_toss_choice != 1 && user_toss_choice != 2)
            {
                System.out.print("IT SEEMS THAT YOU ARE NOT INTERESTED IN HAVING A MATCH.\nMATCH OVER.\n");
                System.out.print("IT\'S A TIE.KEEP IT UP!\n");
                num_matches_tie += 1;
            }
            else
            {
                System.out.print("ENTER A NUMBER FOR THE TOSS :-\n");
                int players_num = in.nextInt();
                int cons_num = Cons_Num_Generator();
                int toss_winner = cons_num+players_num;
                int sc = 0;
                int choice = 0;
                int players_batting_score = 0;
                int consoles_batting_score = 0;
                int device_batting,device_balling,players_batting,players_balling;
                if (toss_winner%2 == 0 && user_toss_choice == 2)
                    sc = 1;
                else if (toss_winner%2 == 1 && user_toss_choice == 1)
                    sc = 1;
                else
                    sc = 2;
                switch(sc)
                {
                    case 1 : System.out.print("CONGRATULATIONS!YOU HAVE WON THE TOSS.\n");
                    break;
                    case 2 : System.out.print("YOU LOST THE TOSS.\n");
                    break;
                }
                switch(sc)
                {
                    case 1 : System.out.print("ENTER 1 FOR BATTING OR 2 FOR BALLING :-\n");
                    choice = in.nextInt();
                    int num_choices = 1;
                    while (choice != 1 && choice != 2)
                    {
                        System.out.print("INVALID CHOICE.PLEASE RE-ENTER YOUR CHOICE :-\n");
                        choice = in.nextInt();
                        num_choices += 1;
                        if (num_choices == 5)
                            break;
                    }
                    if (num_choices == 5)
                    {
                        System.out.print("IT SEEMS THAT YOU ARE NOT INTERESTED IN PLAYING.\nMATCH OVER.\n");
                        choice = 4;
                    }
                    break;
                    case 2 : choice = 3;
                    break;
                }
                switch(choice)
                {
                    case 1 : System.out.print("GET READY TO BAT.\nSTART BATTING...\n");
                    device_balling = Device_Balling();
                    players_batting = Players_Batting();
                    while (device_balling != players_batting && players_batting != 0)
                    {
                        players_batting_score += players_batting;
                        device_balling = Device_Balling();
                        players_batting = Players_Batting();
                    }
                    System.out.print("YOUR BATTING SCORE IS :- "+players_batting_score+" RUNS\n");
                    break;
                    case 2 : System.out.print("GET READY TO BALL.\nSTART BALLING...\n");
                    device_batting = Device_Batting();
                    players_balling = Players_Balling();
                    if (players_balling == 0)
                        consoles_batting_score += 1;
                    while (device_batting != players_balling)
                    {
                        consoles_batting_score += device_batting;
                        device_batting = Device_Batting();
                        players_balling = Players_Balling();
                        if (players_balling == 0)
                            consoles_batting_score += 1;
                    }
                    System.out.print("DEVICE BATTING SCORE IS :- "+consoles_batting_score+" RUNS\n");
                    break;
                    case 3 : System.out.print("GET READY TO BALL.\nSTART BALLING...\n");
                    device_batting = Device_Batting();
                    players_balling = Players_Balling();
                    if (players_balling == 0)
                        consoles_batting_score += 1;
                    while (device_batting != players_balling)
                    {
                        consoles_batting_score += device_batting;
                        device_batting = Device_Batting();
                        players_balling = Players_Balling();
                        if (players_balling == 0)
                            consoles_batting_score += 1;
                    }
                    System.out.print("DEVICE BATTING SCORE IS :- "+consoles_batting_score+" RUNS\n");
                    break;
                }
                switch(choice)
                {
                    case 1 : System.out.print("GET READY TO BALL.\nSTART BALLING...\n");
                    device_batting = Device_Batting();
                    players_balling = Players_Balling();
                    if (players_balling == 0)
                        consoles_batting_score += 1;
                    while (device_batting != players_balling)
                    {
                        consoles_batting_score += device_batting;
                        device_batting = Device_Batting();
                        players_balling = Players_Balling();
                        if (players_balling == 0)
                            consoles_batting_score += 1;
                    }
                    System.out.print("DEVICE BATTING SCORE IS :- "+consoles_batting_score+" RUNS\n");
                    break;
                    case 2 : System.out.print("GET READY TO BAT.\nSTART BATTING...\n");
                    device_balling = Device_Balling();
                    players_batting = Players_Batting();
                    while (device_balling != players_batting && players_batting != 0)
                    {
                        players_batting_score += players_batting;
                        device_balling = Device_Balling();
                        players_batting = Players_Batting();
                    }
                    System.out.print("YOUR BATTING SCORE IS :- "+players_batting_score+" RUNS\n");
                    break;
                    case 3 : System.out.print("GET READY TO BAT.\nSTART BATTING...\n");
                    device_balling = Device_Balling();
                    players_batting = Players_Batting();
                    while (device_balling != players_batting && players_batting != 0)
                    {
                        players_batting_score += players_batting;
                        device_balling = Device_Balling();
                        players_batting = Players_Batting();
                    }
                    System.out.print("YOUR BATTING SCORE IS :- "+players_batting_score+" RUNS\n");
                    break;
                }
                if (consoles_batting_score > players_batting_score)
                {
                    System.out.print("YOU LOST THE MATCH BY :- "+(consoles_batting_score - players_batting_score)+" RUNS.\n");
                    num_matches_lost += 1;
                }
                else if (consoles_batting_score < players_batting_score)
                {
                    System.out.print("CONGRATULATIONS!YOU WON THE MATCH BY :- "+(players_batting_score - consoles_batting_score)+" RUNS.\n");
                    num_matches_won += 1;
                }
                else
                {
                    System.out.print("IT\'S A TIE.KEEP IT UP!\n");
                    num_matches_tie += 1;
                }
            }
            System.out.print("\n");
        }
        System.out.print("YOU WON :- "+num_matches_won+" MATCHES.\n");
        System.out.print("YOU LOST :- "+num_matches_lost+" MATCHES.\n");
        System.out.print("NUMBER OF TIE MATCHES :- "+num_matches_tie+" MATCHES.\n");
    }
}