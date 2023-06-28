        package Tasks;

		import java.util.Scanner;
		class reg
		{
		    Scanner input= new Scanner(System.in);
		    menu mm = new menu();
		    void r1()
		    {
		        System.out.println("\n Enter Your Name : ");
		        String name = input.next();
		        System.out.println("\nEnter your Mail: ");
		        String mail = input.next();
		        System.out.println("\n Enter Your Password: ");
		        int pwd = input.nextInt();
		        System.out.println("================================");
		        System.out.println("\n   Registration Successful !! ");
		        System.out.println("================================");
		        System.out.println("================================");
		        System.out.println("\n ----------Login--------------");
		        System.out.println("================================");
		        while (true)
		        {

		            System.out.println("Enter Your Mail");
		            String s = input.next();
		            System.out.println("Enter Your Password ");
		            int ps =input.nextInt();
		            if(s.equals(mail) && ps == pwd)
		            {
		                mm.m2();
		                break;
		            }
		            else
		            {
		                System.out.println("You Entered Mail or Password are incorrect");
		            }
		        }
		    }
		}
		class abt
		{
		    void display()
		    {
		        System.out.println("Name : T.Madhu Goud");
		        System.out.println("Mail : T21215A1103@bvrit.ac.in ");
		    }
		}
		class menu
		{
		    sci scn = new sci();
		    eng e = new eng();
		    mat m = new mat();
		    abt h = new abt();
		    Scanner input = new Scanner(System.in);
		    public void m2()
		    {
		        System.out.println("==================");
		        System.out.println("\nLogin Successful");
		        System.out.println("==================");
		        while(true)
		        {
		            System.out.println("\n1.My Account \n2.Exam \n3.About \n4.Exit ");
		            System.out.println("Enter Your choice");
		            int o = input.nextInt();
		            if(o==1)
		            {
		                System.out.println("\n1.Back        2.Exit ");
		                int g1 = input.nextInt();
		                if(g1==1)
		                {
		                    System.out.println("\n");
		                }
		                else
		                {
		                    break;
		                }
		            }
		            else if(o==2)
		            {
		                System.out.println("\n1.Science\n2.English\n3.maths");
		                System.out.println("\n Select the subject");
		                int tu = input.nextInt();
		                if(tu==1)
		                {
		                    scn.s1();
		                }
		                else if(tu==2)
		                {
		                    e.e1();
		                }
		                else if(tu==3)
		                {
		                    m.mat1();
		                }
		                else
		                {
		                  System.out.println("Choose the correct choice ");
		                }
		                System.out.println("\n1.Back    2.Exit ");
		                int g2 = input.nextInt();
		                if(g2==1)
		                {
		                    System.out.println("\n");
		                }
		                else
		                {
		                    break;
		                }
		            }
		            else if(o==3)
		            {
		                System.out.println("\n--Online examination portal--");
		                System.out.println("\n Designed by: \nT.MadhuGoud");
		                System.out.println("\n 1.Back       2.Exit");
		                int g3 = input.nextInt();
		                if(g3==1)
		                {
		                    System.out.println("\n");
		                }
		                else
		                {
		                    break;
		                }
		            }
		            else if(0==4)
		            {
		                break;
		            }
		            else
		            {
		                System.out.println("Choose the correct");
		            }
		        }
		    }
		}
		class logA
		{
		    Scanner input = new Scanner(System.in);
		    public void m1()

		    {
		        menu m = new menu();
		        int pswd =9999;
		        System.out.println("Enter Your Mail");
		        String s = input.next();
		        while(true)
		        {
		            System.out.println("Enter Your Password");
		            int p = input.nextInt();
		            if(p==pswd)
		            {
		                m.m2();
		                break;
		            }
		            else
		            {
		               System.out.println("Your Entered Mail or Password are incorrect");
		            }
		        }
		    }
		}
		class sci
		{
		    Scanner input = new Scanner (System.in);
		    void s1()
		    {
		        int count = 0;
		        System.out.println("\n There are 5 questions each carries 3 marks");
		        System.out.println("\n Question No.1 : ");
		        System.out.println("\n What is the Scientific name of water ?");
		        System.out.println("1.H20");
		        System.out.println("2.H2O2");
		        System.out.println("3.H02");
		        System.out.println("4.HO\n");
		        int u1= input.nextInt();
		        if(u1==1)
		        {
		            count++;
		        }
		        else
		        {
		            count=count;
		        }
		        System.out.println("\nQuestion No.2  :");
		        System.out.println("\n Find the odd of the following ?");
		        System.out.println("\n1.Rabbit");
		        System.out.println("2.Goat");
		        System.out.println("3.Buffalo");
		        System.out.println("4.Lion\n");
		        int u2=input.nextInt();
		        if(u2==4)
		        {
		            count++;
		        }
		        else
		        {
		           count=count;
		        }
		        System.out.println("\nQuestion No.3  : ");
		        System.out.println("\nWhat do animals have in regular");
		        System.out.println("\n1.water, air,steel");
		        System.out.println("2.chocolates,brain,aluminum");
		        System.out.println("3.cake,fruits,oxygen");
		        System.out.println("4.food,oxygen,water\n");
		        int u3= input.nextInt();
		        if(u3==4)
		        {
		            count++;
		        }
		        else
		        {
		            count=count ;
		        }
		        System.out.println("\nQuestion No.4  : ");
		        System.out.println("\n Green pigments in plant leaves called as ? ");
		        System.out.println("\n1.Chloroplast");
		        System.out.println("2.lisosomes");
		        System.out.println("3.Nucleus");
		        System.out.println("4.Ribosomes\n");
		        int u4= input.nextInt();
		        if(u4==1)
		        {
		            count++;
		        }
		        else
		        {
		            count =count;
		        }
		        System.out.println("\nQuestion No.5  :");
		        System.out.println("\nWhich organ will give oxygen supply to body ?");
		        System.out.println("\n1.kidney");
		        System.out.println("2.lungs");
		        System.out.println("3.heart");
		        System.out.println("4.liver");
		        int u5 = input.nextInt();
		        if(u5==2)
		        {
		            count++;
		        }
		        else
		        {
		            count = count;
		        }
		        if(count > 8 && count<15)
		        {
		            System.out.println("\nYour performance is good..");
		        }
		        else if(count>4 && count<9)
		        {
		            System.out.println("\nYour performance is better. Do better next time");
		        }
		        else
		        {
		            System.out.println("\nYour performance is poor");
		        }
		        System.out.println("\n===========================");
		        System.out.println("Your total score is :"+count*3);
		        System.out.println("\nNo.of questions you did correct are:"+count);
		        System.out.println("\nSummary of your Exam");
		        System.out.println("\nQ1.option: "+u1+"\nActual answer is: 1\nQ2.option: "+u2+"\nActual answer is: 4 \nQ3.option: "+u3+"\nActual answer is: 4\nQ4.option: "+u4+"\nActual answer is: 1\nQ5.option: "+u5+"\nActual answer is: 2");
		        System.out.println("\n===========================");
		    }
		}
		class mat
		{
		    Scanner input = new Scanner (System.in);
		    void mat1()
		    {
		        int count = 0;
		        System.out.println("\n There are 5 questions each carries 3 marks");
		        System.out.println("\n Question No.1 : ");
		        System.out.println("\n who is the famous Indian mathematician discovered 'zero'?");
		        System.out.println("1.aryabhatta");
		        System.out.println("2.Kho");
		        System.out.println("3.Brahmagupta");
		        System.out.println("4.Bhaskara\n");
		        int u1= input.nextInt();
		        if(u1==1)
		        {
		            count++;
		        }
		        else
		        {
		            count=count;
		        }
		        System.out.println("\nQuestion No.2  :");
		        System.out.println("\n Find the odd number of the following ?");
		        System.out.println("\n1.56");
		        System.out.println("2.66");
		        System.out.println("3.98");
		        System.out.println("4.99\n");
		        int u2=input.nextInt();
		        if(u2==4)
		        {
		            count++;
		        }
		        else
		        {
		            count=count;
		        }
		        System.out.println("\nQuestion No.3  : ");
		        System.out.println("\nwhich are multiples of 3");
		        System.out.println("\n1.3,6,9,10");
		        System.out.println("2.9,8,7,6,5");
		        System.out.println("3.88,8,99,9");
		        System.out.println("4.99,12,15,9\n");
		        int u3= input.nextInt();
		        if(u3==4)
		        {
		            count++;
		        }
		        else
		        {
		            count=count ;
		        }
		        System.out.println("\nQuestion No.4  : ");
		        System.out.println("\n multiple of 55*55 ? ");
		        System.out.println("\n1.3025");
		        System.out.println("2.3000");
		        System.out.println("3.2525");
		        System.out.println("4.3625\n");
		        int u4= input.nextInt();
		        if(u4==1)
		        {
		            count++;
		        }
		        else
		        {
		            count =count;
		        }
		        System.out.println("\nQuestion No.5  :");
		        System.out.println("\nmultiple of 95*95 ?");
		        System.out.println("\n1.10000");
		        System.out.println("2.9025");
		        System.out.println("3.9000");
		        System.out.println("4.9095\n");
		        int u5 = input.nextInt();
		        if(u5==2)
		        {
		            count++;
		        }
		        else
		        {
		            count = count;
		        }
		        if(count > 9 && count <15)
		        {
		            System.out.println("\nYour performance is good..");
		        }
		        else if(count>4 && count<9)
		        {
		            System.out.println("\nYour performance is better. Do better next time");
		        }
		        else
		        {
		            System.out.println("\n===========================");
		            System.out.println("\nYour performance is poor");
		        }
		        System.out.println("\n===========================");
		        System.out.println("Your total score is :"+count*3);
		        System.out.println("\nNo.of questions you did correct are:"+count);
		        System.out.println("\nSummary of your Exam");
		        System.out.println("\nQ1.option: "+u1+"\nActual answer is: 1\nQ2.option: "+u2+"\nActual answer is: 4 \nQ3.option: "+u3+"\nActual answer is: 4\nQ4.option: "+u4+"\nActual answer is: 1\nQ5.option: "+u5+"\nActual answer is: 2");
		        System.out.println("\n===========================");
		    }

		    public void eng() {
		    }
		}
		class eng
		{
		    Scanner input = new Scanner (System.in);
		    void e1()
		    {
		        int count = 0;
		        System.out.println("\n There are 5 questions each carries 3 marks");
		        System.out.println("\n Question No.1 : ");
		        System.out.println("\n What is the vowel in water ?");
		        System.out.println("1.a,e");
		        System.out.println("2.w,a");
		        System.out.println("3.t,e");
		        System.out.println("4.r,w\n");
		        int u1= input.nextInt();
		        if(u1==1)
		        {
		            count++;
		        }
		        else
		        {
		            count=count;
		        }
		        System.out.println("\nQuestion No.2  :");
		        System.out.println("\n parrot is flying, what is verb ?");
		        System.out.println("\n1.parrot");
		        System.out.println("2.is");
		        System.out.println("3.air");
		        System.out.println("4.flying\n");
		        int u2=input.nextInt();
		        if(u2==4)
		        {
		            count++;
		        }
		        else
		        {
		            count=count;
		        }
		        System.out.println("\nQuestion No.3  : ");
		        System.out.println("\nWhat do animals have in regular, what does have mean");
		        System.out.println("\n1.to go");
		        System.out.println("2.walk");
		        System.out.println("3.ready ");
		        System.out.println("4.to eat\n");
		        int u3= input.nextInt();
		        if(u3==4)
		        {
		            count++;
		        }
		        else
		        {
		            count=count ;
		        }
		        System.out.println("\nQuestion No.4  : ");
		        System.out.println("\n a college requires a ____ student ? ");
		        System.out.println("\n1.good");
		        System.out.println("2.bad");
		        System.out.println("3.unpunctual");
		        System.out.println("4.irregular\n");
		        int u4= input.nextInt();
		        if(u4==1)
		        {
		            count++;
		        }
		        else
		        {
		            count =count;
		        }
		        System.out.println("\nQuestion No.5  :");
		        System.out.println("\nWhich of the following is correct ?");
		        System.out.println("\n1.red is black");
		        System.out.println("2.black is a color");
		        System.out.println("3.whale is small in size");
		        System.out.println("4.humans are generated");
		        int u5 = input.nextInt();
		        if(u5==2)
		        {
		            count++;
		        }
		        else
		        {
		            count = count;
		        }
		        if(count> 8 && count<15)
		        {
		            System.out.println("\nYour performance is good..");
		        }
		        else if(count>4 && count<9)
		        {
		            System.out.println("\nYour performance is better. Do better next time");
		        }
		        else
		        {
		            System.out.println("\n===========================");
		            System.out.println("\nYour performance is poor");
		        }
		        System.out.println("\n===========================");
		        System.out.println("Your total score is :"+count*3);
		        System.out.println("\nNo.of questions you did correct are:"+count);
		        System.out.println("\nSummary of your Exam");
		        System.out.println("\nQ1.option: "+u1+"\nActual answer is: 1\nQ2.option: "+u2+"\nActual answer is: 4 \nQ3.option: "+u3+"\nActual answer is: 4\nQ4.option: "+u4+"\nActual answer is: 1\nQ5.option: "+u5+"\nActual answer is: 2");
		        System.out.println("\n===========================");
		    }
		}
		public class Online_Examination {
		    public static void main(String[] args) {
		        logA L1 = new logA();
		        reg rr = new reg();
		        Scanner input = new Scanner(System.in);
		        System.out.println("\nWelcome to online examination portal !!");
		        System.out.println("\n1.Login\n2.SignUp");
		        System.out.println("\nEnter your choices");
		        int r = input.nextInt();
		        if (r == 1) {
		            System.out.println("\n-----Login-----");
		            L1.m1();
		        } else {
		            System.out.println("---------SignUp------");
		            rr.r1();
		        }
		    }
		}