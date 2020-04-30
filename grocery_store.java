

import java.io.*;
public class grocery_store
{
    public static void main(String args[])throws IOException
    {
        int n=1,i=0;
        double total=0;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("                                                                                 WELCOME TO SHEFF'S GROCERY STORE");
        System.out.println("                                                 __________________________________________________________________________________________________");
        System.out.println("                                                  Enter your name please.....");
        System.out.print("                                                    Customer name:");
        String o=(in.readLine());
        System.out.println("                                                  Oh! you have a beautiful name .....");
        System.out.print("                                                                                     Please type [q] to proceed:");
        String u=(in.readLine());
        if(u.equals("q"))
        {
            System.out.println("\f");
           
        System.out.println("                                                                                          SHEFF'S GROCERY STORE");
        System.out.println("                                                  __________________________________________________________________________________________________");
        System.out.println("                              Welcome to my grocery store. First of all let me introduce my store to you. This grocery store was established in 1989 when I  ");
        System.out.println("                        was not yet born. This grocery store was set up by my great grandfather.This grocery store is one of it's kind in  ");
        System.out.println("                        providing great hospitality and prompt service to it's customers. Today this store has developed into a ultra-modern hi-tech store." );
      
        System.out.println("                              As the manager I welcome you to my store and would like you to have a glance at the grocery items on display....");
        System.out.print("                                                                                          Please type [p] to procced:");
        String f=(in.readLine());
        if(f.equals("p"))
        {
        System.out.println("\f");
        if(n==0)
        {
            System.exit(0);
            System.out.println("thank you.....");
        }
        while(n!=0)
        {
            System.out.println("                                                   _________________ !!!!  Welcome to Sheff's Groceery Store  !!!!_______________________");
            System.out.println("                                                   ______________________________________________________________________________________");

            System.out.println("                                             -_-_-_-_-_-_-_-_-_-_-_-_-_-_   ITEMS PRESENT IN OUR STORE TODAY  -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            
            
            System.out.println("                                                                             1.BISCUITS          8.COLD DRINKS     ");
            System.out.println("                                                                             2.SOAP              9.BREAD           ");
            System.out.println("                                                                             3.RICE             10.SHAMPOO       ");
            System.out.println("                                                                             4.WASHING POWDER   11.TOOTHPASTES");
            System.out.println("                                                                             5.DEODERANTS       12.TEA POWDER");
            System.out.println("                                                                             6.OIL              13.EXIT");
            System.out.println("                                                                             7.SOUP              ");

            System.out.println("                                                  _______________________________________________________________________________________");
            System.out.print("                                                                                     Enter your choice[1-13]:");
            int c=Integer.parseInt(in.readLine());
                      
            System.out.println("                                             - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("                                            |                                                                                                 |");
            System.out.println("                                            |         SHOP ABOVE Rs.5000 AND GET A DISCOUNT OF 10% ON THE TOTAL AND 1KG OF SUGAR FREE         |");
            System.out.println("                                            |                                                                                                 |");
            System.out.println("                                             - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            
            switch(c)
            {
                case 1:
                System.out.println("Select the biscuit brand:");
                System.out.println("1.GOOD-DAY-Rs.20       3.OREO-Rs.30");
                System.out.println("2.DARK FANTASY-Rs.60   4.50-50-Rs.30");
                System.out.print("Enter your choice[1-4]:");
                int biscuit=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of biscuit packets you would like to buy:");
                int no_of_biscuits=Integer.parseInt(in.readLine());

                if(biscuit==1)
                {
                    System.out.println("Biscuit brand:GOOD-DAY");
                    System.out.println("No of biscuits:"+no_of_biscuits);
                    System.out.println("Price:"+(no_of_biscuits*20)); i++; total =total+(no_of_biscuits*20);
                }
                if(biscuit==2)
                {
                    System.out.println("Biscuit brand:DARK FANTASY");
                    System.out.println("No of biscuits:"+no_of_biscuits);
                    System.out.println("Price:"+(no_of_biscuits*60));i++; total =total+(no_of_biscuits*60);
                }
                if(biscuit==3)
                {
                    System.out.println("Biscuit brand:OREO");
                    System.out.println("No of biscuits:"+no_of_biscuits);
                    System.out.println("Price:"+(no_of_biscuits*30));i++; total =total+(no_of_biscuits*30);
                }
                if(biscuit==4)
                {
                    System.out.println("Biscuit brand:50-50");
                    System.out.println("No of biscuits:"+no_of_biscuits);
                    System.out.println("Price:"+(no_of_biscuits*30));i++; total =total+(no_of_biscuits*30);
                }

                break;
                case 2:
                System.out.println("Select the soap brand:");
                System.out.println("1.SANTOOR-Rs.20       3.DOVE-Rs.30");
                System.out.println("2.LIFE BOY-Rs.60   4.CINTHOL-Rs.30");
                System.out.print("Enter your choice[1-4]:");
                int soap=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of soap packets you would like to buy:");
                int no_of_soaps=Integer.parseInt(in.readLine());
                if(soap==1)
                {
                    System.out.println("Soap brand:SANTOOR");
                    System.out.println("No of soaps:"+no_of_soaps);
                    System.out.println("Price:"+(no_of_soaps*20));i++; total =total+(no_of_soaps*20);
                }
                if(soap==2)
                {
                    System.out.println("Soap brand:LIFE BOY");
                    System.out.println("No of soaps:"+no_of_soaps);
                    System.out.println("Price:"+(no_of_soaps*60));i++; total =total+(no_of_soaps*60);
                }
                if(soap==3)
                {
                    System.out.println("Soap brand:DOVE");
                    System.out.println("No of soaps:"+no_of_soaps);
                    System.out.println("Price:"+(no_of_soaps*30));i++; total =total+(no_of_soaps*30);
                }
                if(soap==4)
                {
                    System.out.println("Soap brand:CINTHOL");
                    System.out.println("No of soaps:"+no_of_soaps);
                    System.out.println("Price:"+(no_of_soaps*30));i++; total =total+(no_of_soaps*30);
                }

                break;
                case 3:
                System.out.println("Select the rice brand:");
                System.out.println("1.INDIA GATE-Rs.250       3.BHOG-Rs.200");
                System.out.println("2.KOHINOOR RICE-Rs.199   4.LAL KILA-Rs.189");
                System.out.print("Enter your choice[1-4]:");
                int rice=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of rice packets you would like to buy:");
                int no_of_rp=Integer.parseInt(in.readLine());
                if(rice==1)
                {
                    System.out.println("Rice brand:INDIA GATE");
                    System.out.println("No of rice packets:"+no_of_rp);
                    System.out.println("Price:"+(no_of_rp*250));i++; total =total+(no_of_rp*250);
                }
                if(rice==2)
                {
                    System.out.println("Rice brand:KOHINOOR");
                    System.out.println("No of rice packets:"+no_of_rp);
                    System.out.println("Price:"+(no_of_rp*199));i++; total =total+(no_of_rp*199);
                }
                if(rice==3)
                {
                    System.out.println("Rice brand:BHOG");
                    System.out.println("No of rice packets:"+no_of_rp);
                    System.out.println("Price:"+(no_of_rp*200));i++; total =total+(no_of_rp*200);
                }
                if(rice==4)
                {
                    System.out.println("Rice brand:LAL KILA");
                    System.out.println("No of rice packets:"+no_of_rp);
                    System.out.println("Price:"+(no_of_rp*189));i++; total =total+(no_of_rp*189);
                }

                break;
                case 4:
                System.out.println("Select the washing powder brand:");
                System.out.println("1.SURF EXCEL-Rs.80       3.VANISH-Rs.90");
                System.out.println("2.RIN-Rs.60   ");
                System.out.print("Enter your choice[1-3]:");
                int wp=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of washing powder packets you would like to buy:");
                int no_of_wpp=Integer.parseInt(in.readLine());
                if(wp==1)
                {
                    System.out.println("Washing powder brand:SURF EXCEL");
                    System.out.println("No of washing powder packets:"+no_of_wpp);
                    System.out.println("Price:"+(no_of_wpp*80));i++; total =total+(no_of_wpp*80);
                }
                if(wp==2)
                {
                    System.out.println("Washing powder brand:RIN");
                    System.out.println("No of washing powder packets:"+no_of_wpp);
                    System.out.println("Price:"+(no_of_wpp*60));i++; total =total+(no_of_wpp*60);
                }
                if(wp==3)
                {
                    System.out.println("Washing powder brand:VANISH");
                    System.out.println("No of washing powder packets:"+no_of_wpp);
                    System.out.println("Price:"+(no_of_wpp*90));i++; total =total+(no_of_wpp*90);
                }


                break;
                case 5:
                System.out.println("Select the deoderant:");
                System.out.println("1.AXE BLAST-Rs.180       3.FOGG-Rs.210");
                System.out.println("2.ENGAGE-Rs.190   ");
                System.out.print("Enter your choice[1-3]:");
                int d=Integer.parseInt(in.readLine());
                System.out.print("Enter the number you would like to buy:");
                int no_of_d=Integer.parseInt(in.readLine());
                if(d==1)
                {
                    System.out.println("Deoderant:AXE BLAST");
                    System.out.println("Number:"+no_of_d);
                    System.out.println("Price:"+(no_of_d*180));i++; total =total+(no_of_d*180);
                }
                if(d==3)
                {
                    System.out.println("Deoderant:FOGG");
                    System.out.println("Number:"+no_of_d);
                    System.out.println("Price:"+(no_of_d*210));i++; total =total+(no_of_d*210);
                }
                if(d==2)
                {
                    System.out.println("Deoderant:ENGAGE");
                    System.out.println("Number:"+no_of_d);
                    System.out.println("Price:"+(no_of_d*190));i++; total =total+(no_of_d*190);
                }
                            
                break;
                case 6:
                System.out.println("Select the brand of oil:");
                System.out.println("1.SUNDROP-Rs.150       3.SAFFOLA-Rs.150");
                System.out.println("2.GOLD WINNER-Rs.160   ");
                System.out.print("Enter your choice[1-3]:");
                int bo=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of packets you would like to buy:");
                int no_of_bo=Integer.parseInt(in.readLine());
                if(bo==1)
                {
                    System.out.println("Oil Brand:SUNDROP");
                    System.out.println("Number of packets:"+no_of_bo);
                    System.out.println("Price:"+(no_of_bo*150));i++; total =total+(no_of_bo*150);
                }
                if(bo==2)
                {
                    System.out.println("Oil Brand:GOLD WINNER");
                    System.out.println("Number of packets:"+no_of_bo);
                    System.out.println("Price:"+(no_of_bo*160));i++; total =total+(no_of_bo*160);
                }
                if(bo==3)
                {
                    System.out.println("Oil Brand:SAFFOLA");
                    System.out.println("Number of packets:"+no_of_bo);
                    System.out.println("Price:"+(no_of_bo*150));i++; total =total+(no_of_bo*150);
                }
                break;
                case 7:
                System.out.println("Select the brand of soup [available in a pack of 3 types]:");
                System.out.println("1.KNORR-Rs.120       3.CHINGS-Rs.150");
                System.out.println("2.MAGGI-Rs.150   ");
                System.out.print("Enter your choice[1-3]:");
                int bs=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of packets you would like to buy:");
                int no_of_bs=Integer.parseInt(in.readLine());
                if(bs==1)
                {
                    System.out.println("Soup Brand:KNORR");
                    System.out.println("Number of packets:"+no_of_bs);
                    System.out.println("Price:"+(no_of_bs*120));i++; total =total+(no_of_bs*120);
                }
                if(bs==2)
                {
                    System.out.println("Soup Brand:MAGGI");
                    System.out.println("Number of packets:"+no_of_bs);
                    System.out.println("Price:"+(no_of_bs*150));i++; total =total+(no_of_bs*150);
                }
                if(bs==3)
                {
                    System.out.println("Soup Brand:CHINGS");
                    System.out.println("Number of packets:"+no_of_bs);
                    System.out.println("Price:"+(no_of_bs*150));i++; total =total+(no_of_bs*150);
                }
                
                break;
                case 8:
                System.out.println("Select the cold drink brand:");
                System.out.println("1.PEPSI-Rs.20       3.LIMCA-Rs.20     5.SLICE-Rs.25");
                System.out.println("2.COCOCOLA-Rs.20   4.MAAZA-Rs.20");
                System.out.print("Enter your choice[1-5]:");
                int cd=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of cold drink bottles you would like to buy:");
                int no_of_cdb=Integer.parseInt(in.readLine());
                if(cd==1)
                {
                    System.out.println("Cold drink brand:PEPSI");
                    System.out.println("No of cold drink bottles:"+no_of_cdb);
                    System.out.println("Price:"+(no_of_cdb*20));i++; total =total+(no_of_cdb*20);
                }
                if(cd==2)
                {
                    System.out.println("Cold drink brand:COCOCOLA");
                    System.out.println("No of cold drink bottles:"+no_of_cdb);
                    System.out.println("Price:"+(no_of_cdb*20));i++; total =total+(no_of_cdb*20);
                }
                if(cd==3)
                {
                    System.out.println("Cold drink brand:LIMCA");
                    System.out.println("No of cold drink bottles:"+no_of_cdb);
                    System.out.println("Price:"+(no_of_cdb*20));i++; total =total+(no_of_cdb*20);
                }
                if(cd==4)
                {
                    System.out.println("Cold drink brand:MAAZA");
                    System.out.println("No of cold drink bottles:"+no_of_cdb);
                    System.out.println("Price:"+(no_of_cdb*20));i++; total =total+(no_of_cdb*20);
                }
                if(cd==5)
                {
                    System.out.println("Cold drink brand:SLICE");
                    System.out.println("No of cold drink bottles:"+no_of_cdb);
                    System.out.println("Price:"+(no_of_cdb*25));i++; total =total+(no_of_cdb*25);
                }

                break;
                case 9:
                System.out.println("Select the bread brand:");
                System.out.println("1.WIBS-Rs.20       3.NATURE FRESH-Rs.30");
                System.out.println("2.BRITANNIA-Rs.25   ");
                System.out.print("Enter your choice[1-3]:");
                int bread=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of bread packets you would like to buy:");
                int no_of_bp=Integer.parseInt(in.readLine());
                if(bread==1)
                {
                    System.out.println("Bread brand:WIBS");
                    System.out.println("No of biscuit packets:"+no_of_bp);
                    System.out.println("Price:"+(no_of_bp*20));i++; total =total+(no_of_bp*20);
                }
                if(bread==2)
                {
                    System.out.println("Bread brand:BRITANNIA");
                    System.out.println("No of bread packets:"+no_of_bp);
                    System.out.println("Price:"+(no_of_bp*25));i++; total =total+(no_of_bp*25);
                }
                if(bread==3)
                {
                    System.out.println("Bread brand:NATURE FRESH");
                    System.out.println("No of bread packets:"+no_of_bp);
                    System.out.println("Price:"+(no_of_bp*30));i++; total =total+(no_of_bp*30);
                }

                break;
                case 10:
                System.out.println("Select the shampoo brand:");
                System.out.println("1.CLEAN AND CLEAR-Rs.50       3.GARNIER-Rs.85");
                System.out.println("2.CLINIC PLUS-Rs.70   4.SUNSILK-Rs.150");
                System.out.print("Enter your choice[1-4]:");
                int shampoo=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of shampoo bottles you would like to buy:");
                int no_of_sb=Integer.parseInt(in.readLine());
                if(shampoo==1)
                {
                    System.out.println("Shampoo brand:CLEAN AND CLEAR");
                    System.out.println("No of shampoo bottles:"+no_of_sb);
                    System.out.println("Price:"+(no_of_sb*50));i++; total =total+(no_of_sb*50);
                }
                if(shampoo==2)
                {
                    System.out.println("Shampoo brand:CLINIC PLUS");
                    System.out.println("No of shampoo bottles:"+no_of_sb);
                    System.out.println("Price:"+(no_of_sb*70));i++; total =total+(no_of_sb*70);
                }
                if(shampoo==3)
                {
                    System.out.println("Shampoo brand:GARNIER");
                    System.out.println("No of shampoo bottles:"+no_of_sb);
                    System.out.println("Price:"+(no_of_sb*85));i++; total =total+(no_of_sb*85);
                }
                if(shampoo==4)
                {
                    System.out.println("Shampoo brand:SUNSILK");
                    System.out.println("No of shampoo bottles:"+no_of_sb);
                    System.out.println("Price:"+(no_of_sb*150));i++; total =total+(no_of_sb*150);
                }

                break;
                case 11:
                System.out.println("Select the toothpaste:");
                System.out.println("1.COLGATE-Rs.90       3.PEPSODENT-Rs.95");
                System.out.println("2.CLOSE UP-Rs.85  " );
                System.out.print("Enter your choice[1-3]:");
                int t=Integer.parseInt(in.readLine());
                System.out.print("Enter the number you would like to buy:");
                int no_of_t=Integer.parseInt(in.readLine());
                if(t==1)
                {
                    System.out.println("Toothpaste:COLGATE");
                    System.out.println("NUMBER:"+no_of_t);
                    System.out.println("Price:"+(no_of_t*90));i++; total =total+(no_of_t*90);
                }
                if(t==2)
                {
                    System.out.println("Toothpaste:CLOSE UP");
                    System.out.println("NUMBER:"+no_of_t);
                    System.out.println("Price:"+(no_of_t*85));i++; total =total+(no_of_t*85);
                }
                if(t==3)
                {
                    System.out.println("Toothpaste:PEPSODENT");
                    System.out.println("NUMBER:"+no_of_t);
                    System.out.println("Price:"+(no_of_t*95));i++; total =total+(no_of_t*95);
                }
                
                break;
                case 12:
                System.out.println("Select the brand  of tea powder:");
                System.out.println("1.SOCIETY-Rs.110       3.RED LABEL-Rs.95");
                System.out.println("2.BRU-Rs.100  " );
                System.out.print("Enter your choice[1-3]:");
                int tp=Integer.parseInt(in.readLine());
                System.out.print("Enter the number of packets you would like to buy:");
                int no_of_tp=Integer.parseInt(in.readLine());
                if(tp==1)
                {
                    System.out.println("Tea Powder:SOCIETY");
                    System.out.println("NUMBER:"+no_of_tp);
                    System.out.println("Price:"+(no_of_tp*110));i++; total =total+(no_of_tp*110);
                }
                if(tp==2)
                {
                    System.out.println("Tea Powder:BRU");
                    System.out.println("NUMBER:"+no_of_tp);
                    System.out.println("Price:"+(no_of_tp*100));i++; total =total+(no_of_tp*100);
                }
                if(tp==3)
                {
                    System.out.println("Tea Powder:RED LABEL");
                    System.out.println("NUMBER:"+no_of_tp);
                    System.out.println("Price:"+(no_of_tp*95));i++; total =total+(no_of_tp*95);
                }
                
                break;
                case 13:
                System.exit(0);
                break;

                default:
                System.out.println("Oops!Wrong Choice");
                System.out.println("Thank You For Visiting");
            }
            System.out.println("Type [1] to buy anything more..");
            System.out.println("Type [0] to get your bill...");
            n= Integer.parseInt(in.readLine());
            if(n==0)
            {

                System.out.println("\f");
                 System.out.println("                                             ____________________________________________________________________________________________________");
                System.out.println("                                                                                      Sheff's Grocery Store         ");
                System.out.println("                                               _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ ");
                System.out.println("                                              ____________________________________________________________________________________________________");
                System.out.println("                                                    Total items purchsed:"+i);
                System.out.println("                                               _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- ");
                 System.out.println("                                            _____________________________________________________________________________________________________");
                System.out.println("                                                    Total amount:Rs."+total);
                System.out.println("                                               _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- ");
                 
                System.out.println("                                            _____________________________________________________________________________________________________");
                System.out.println("The total amount you have to pay is:"+total);
                System.out.print ("Enter the amount of cash you are paying:");
                double amount=Double.parseDouble(in.readLine());
                double balance=total-amount;
               
                
                if(amount<total)
                {
                     System.out.println("The amount you entered is not enough.... You are requested to enter the amount again:");
                     double amount2=Double.parseDouble(in.readLine());
                     if(amount2<total)
                     {
                         System.out.println("I am sorry this was your last chance...... I cannot allow you to buy grocery from here !!");
                         System.exit(0);
                        }
                        else
                        {
                            System.out.println("Your balance:"+(amount2-total));
                        }
                    }
                    else
                    {
                        System.out.println("the balance:"+balance);
                    }
                    
                    
                        
                            
         if(total>5000)
                {
                     System.out.println("You get a 10% DISCOUNT and 1KG SUGAR FREE ");
                     double nt=total-(total*10/100);
                     System.out.println("The final amount you have to pay is:"+nt);
                     System.out.println("Enter the amount of cash you are paying.....:");
                 double amt=Double.parseDouble(in.readLine());
                 
                 if(nt>amt)
                 {
                     System.out.println("The amount you entered is not enough.... You are requested to enter the amount again:");
                     double amt2=Double.parseDouble(in.readLine());
                     if(amt2<nt)
                     {
                         System.out.println("I am sorry this was your last chance...... I cannot allow you to buy grossary from here !!");
                         System.exit(0);
                        }
                    
                    if(nt<amt)
                    {
                         double bal=nt-amt; 
                         System.out.println("Your balance...:"+bal);
                         
                    }
                }
            }
                else
                {
                    System.out.println("You don't get a 10% DISCOUNT on the total and IKG SUGAR FREE , as your total is below Rs.5000");
                   
            }
            
               
                   
                
                
                    
                       
                System.out.print("Please type [1] to proceed:");
                int p=Integer.parseInt(in.readLine());
                if(p==1)
                {
                    System.out.print("I kindly request you to comment on my grocery strore...[y/n]:");
                    String ch=(in.readLine());
                   
                    if(ch.equals("y"))
                    {
                        System.out.println("                                                                                   Comments:");
                         System.out.println("                                    ____________________________________________________________________________________________________");
                          System.out.println("                                   ____________________________________________________________________________________________________");
                        System.out.println("                                                                1.Amazing                    3.Satisfactory");
                        System.out.println("                                                                2.I'll never come again      ");
                         System.out.println("                                    _____________________________________________________________________________________________________");
                          System.out.println("                                   _____________________________________________________________________________________________________");
                        System.out.print("                                                                              Enter your choice...[1-3]:");   
                        int d=Integer.parseInt(in.readLine());
                        switch(d)
                        {
                            case 1:
                            System.out.println("Thank for your compliment....");
                            break;
                            case 2:
                            System.out.println("Sorry for the inconvenience......I'll look forward to impress you next time.....");
                            break;
                            case 3:
                            System.out.println("Okay...Thank you...");
                            break;
                            default:
                            System.out.println("Oops!Wrong choice...");
                        }
                        System.out.println("Thank you for visiting....."+o);
                    }

                     else
                      {
                       System.out.println("Ok. Thank you for visiting.....");
                       System.out.print("Type [e] to exit:");
                       char e=(char)(in.read());
                       if(e=='e')
                    {
                        System.exit(0);
                    }
                     
                }   
                    System.out.print("Type [e] to exit:");
                    char e=(char)(in.read());
                    if(e=='e')
                    {
                        System.exit(0);
                    }

                }
                else
                {
                    System.exit(0);
            }
        }
    }
    

   
}
}
}
}







