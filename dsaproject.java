import java.util.*;
    public class dsaproject
    {
        public static Queue<String> q1=new LinkedList<>();
        public static Queue<String> q2=new LinkedList<>();
        public static Queue<String> q3=new LinkedList<>();
        public static void initialize(String s[],int n)
        {
            int i;
            for(i=0;i<40;i++)
            {
                s[i]="null";
            }
        }
        public static void initialize3(String s[],int n)
        {
            for(int i=0;i<n;i++)
            s[i]="ayush";
            s[16]="raj";
        }
        public static int check_vacancy_bus(String s[])
        {
            int i,p=0;
            for(i=0;i<s.length;i++)
            {
                if(s[i].equalsIgnoreCase("null"))
                p++;
            }
            return p;
        }
        public static void display(String s[])
        {
            int count=0,i,j;
            for(i=0;i<10;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(s[count].equalsIgnoreCase("null"))
                    {
                        System.out.print((count+1)+") ------- \t");
                        count++;
                    }
                    else
                    {
                        System.out.print((count+1)+")  "+s[count]+" \t");
                        count++;
                    }
                }
                System.out.println();
            }
        }
        public static String call_waiting(int waiting)
        {
            if(waiting==1)
            {
                if(q1.size()==0)
                    return "null";
                String s=q1.remove();
                return s;
            }
            else if(waiting==2)
            {
                if(q2.size()==0)
                    return "null";
                String s=q2.remove();
                return s;
            }
            else
            {
                if(q3.size()==0)
                    return "null";
                String s=q3.remove();
                return s;
            }
        }
        public static void insert_at_bus1(String s[])
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your final destination for security purposes");
            String s1=in.next();
            String name;
            int ch;
            if(s1.equalsIgnoreCase("vishakhapatanam")||s1.equalsIgnoreCase("vellore")||s1.equalsIgnoreCase("chennai")||s1.equalsIgnoreCase("bangalore"))
            {
                display(s);
                System.out.println("Enter the seat number you want to sit at");
                ch=in.nextInt();
                System.out.println("Enter your name");
                name=in.next();
                if(s[ch-1].equalsIgnoreCase("null"))
                {
                    s[ch-1]=name;
                    System.out.println("Your response has been recorded Thank you");
                    System.out.println("check if your name is added into our list");
                }
                else
                    System.out.println("Oops!!It seems that the seat you have selected is already booked");
                System.out.println("/*****************************************************************************************************/");
                display(s);
                System.out.println("/*****************************************************************************************************/");
            }
            else
            {
                System.out.println("Sorry!!You have chosen a wrong bus");
                System.out.println("Process returned");
            }
        }
        public static void insert_at_bus2(String s[])
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your final destination for security purposes");
            String s1=in.next();
            String name;
            int ch;
            if(s1.equalsIgnoreCase("bhopal")||s1.equalsIgnoreCase("chennai")||s1.equalsIgnoreCase("jabalpur")||s1.equalsIgnoreCase("bangalore"))
            {
                display(s);
                System.out.println("Enter the seat number you want to sit at");
                ch=in.nextInt();
                System.out.println("Enter your name");
                name=in.next();
                if(s[ch-1].equalsIgnoreCase("null"))
                {
                    s[ch-1]=name;
                    System.out.println("Your response has been recorded Thank you");
                    System.out.println("check if your name is added into our list");
                }
                else
                    System.out.println("Oops!!It seems that the seat you have selected is already booked");
                System.out.println("/*****************************************************************************************************/");
                display(s);
                System.out.println("/*****************************************************************************************************/");
            }
            else
            {
                System.out.println("Sorry!!You have chosen a wrong bus");
                System.out.println("Process returned");
            }
        }
        public static void insert_at_bus3(String s[])
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your final destination for security purposes");
            String s1=in.next();
            String name;
                int ch;
            if(s1.equalsIgnoreCase("kolkata")||s1.equalsIgnoreCase("darjelling")||s1.equalsIgnoreCase("gangtok")||s1.equalsIgnoreCase("shillong"))
            {
                display(s);
                System.out.println("Enter the seat number you want to sit at");
                ch=in.nextInt();
                System.out.println("Enter your name");
                name=in.next();
                if(s[ch-1].equalsIgnoreCase("null"))
                {
                    s[ch-1]=name;
                    System.out.println("Your response has been recorded Thank you");
                    System.out.println("Check if your name is added into our list");
                }
                    else
                    System.out.println("Oops!!It seems that the seat you have selected is already booked");
                System.out.println("/*****************************************************************************************************/");
                display(s);
                System.out.println("/*****************************************************************************************************/");
            }
            else
            {
                System.out.println("Sorry!!You have chosen a wrong bus");
                System.out.println("Process returned");
            }
        }
        public static void delete_reservation(String s[],int waiting)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Please enter your name that you have chosen to reserve for our bus services");
            String name=in.nextLine();
            int vacancy=check_vacancy_bus(s);
            boolean found=false;
            if(vacancy==0)
            {
                String new_input=call_waiting(waiting);
                for(int i=0;i<s.length;i++)
                {
                    if(s[i].equalsIgnoreCase(name))
                    {
                        s[i]=new_input;
                        found=true;
                        System.out.println("The new changes have been recorded press dsplay to see the seats");
                        break;
                    }
                }
                System.out.println("/*****************************************************************************************************/");
                display(s);
                System.out.println("/*****************************************************************************************************/");
            }
            else if(vacancy>0)
            {
                String new_input="null";
                for(int i=0;i<s.length;i++)
                {
                    if(s[i].equalsIgnoreCase(name))
                    {
                        s[i]=new_input;
                        found=true;
                        System.out.println("The new changes have been recorded displaying the seats now");
                        break;
                    }
                }
                System.out.println("/*****************************************************************************************************/");
                display(s);
                System.out.println("/*****************************************************************************************************/");
            }
            if(found==false)
            {
                System.out.println("Your name was not found in this particular bus reassure your bus choice");
            }
        }
        public static void fillarray(String s[])
        {
            Scanner in=new Scanner(System.in);
            int count=check_vacancy_bus(s);
            int size=40-count;
            int adder=0;
            int arr[]=new int[size];
            for(int i=0;i<s.length;i++)
            {
                if(s[i].equalsIgnoreCase("null"))
                continue;
                else
                {
                    arr[adder++]=i+1;
                }
            }
            int do_choice;
            do
            {
                System.out.println("Enter the seat number u want to check who is sitting on");
                int seat_number=in.nextInt();
                int found=jumpsearch(arr,seat_number);
                if(found==-1)
                System.out.println("This seat is vacant");
                else if(found==-2)
                System.out.println("Invalid input");
                else
                {
                    System.out.println("The name of the person who is sitting in that location is:: "+s[found-1]);
                }
                System.out.println("Do you want to search again press 1 ");
                do_choice=in.nextInt();
            }while(do_choice==1);
        }
        public static int jumpsearch(int arr[], int x)
        {
            if(x<=0 || x>40)
            return -2;
            int n=arr.length;
            int step=(int)Math.floor(Math.sqrt(n));
            int prev=0;
            while(arr[Math.min(step,n)-1]<x)
            {
                prev=step;
                step+=(int)Math.floor(Math.sqrt(n));
                if(prev>=n)
                return -1;
            }
            while(arr[prev]<x)
            {
                prev++;
                if(prev==Math.min(step,n))
                return -1;
            }
            if(arr[prev]==x)
            return arr[prev];
            return -1;
        }
        public static void main()
        {
            Scanner in=new Scanner(System.in);
            int i,time=0,choice,ll=1;
            char ch;
            String s;
            System.out.println("Welcome to our bus reservation portal !!!!!");
            String b1[]=new String[40];
            String b2[]=new String[40];
            String b3[]=new String[40];
            initialize(b1,40);
            initialize(b2,40);
            initialize(b3,40);
            do
            {
                System.out.println("1) For booking a seat into the busses");
                System.out.println("2) For deleting your reserved seat from bus");
                System.out.println("3) For searching the candidate sitting at a desired location");
                System.out.println("Enter choice");
                int overall_choice=in.nextInt();
                switch(overall_choice)
                {
                    case 1:
                        System.out.println("Our busses have the accessibility to these following cities\n Please have a look:"); 
                        System.out.println("1)Jamshedpur\t->Vishakhapatanam\t->Vellore\t->Chennai\t->Bangalore");
                        System.out.println("2)Jamshedpur\t->Bhopal\t->Jabalpur\t->Chennai\t->Bangalore"); 
                        System.out.println("3)Jamshedpur\t->Kolkata\t->Darjelling\t->Gangtok\t->Shillong");
                        System.out.println("/*****************************************************************************************************/");
                        System.out.println("Enter your desired destination");
                        s=in.next();
                        String s1[]={"jamshedpur","vishakhapatanam","vellore","chennai","bangalore"};
                        int a1[]={0,5,6,2,4};
                        String s2[]={"jamshedpur","bhopal","jabalpur","chennai","bangalore"};
                        int a2[]={0,8,4,4,3};
                        String s3[]={"jamshedpur","kolkata","darjelling","gangtok","shillong"};
                        int a3[]={0,4,4,3,4};
                        time=0;
                        if(s.equalsIgnoreCase("vishakhapatanam")||s.equalsIgnoreCase("vellore"))
                        {
                            for(i=0;i<s1.length;i++)
                            {
                                time=time+a1[i];
                                if(s.equalsIgnoreCase(s1[i]))
                                break;
                            }
                            System.out.println("Preffered bus is bus 1 and other busses will not visit them. Total time required for the journey is: "+time+" hours");
                        }
                        if(s.equalsIgnoreCase("bhopal"))
                        {
                            System.out.println("Preffered bus is bus 2 and other busses will not visit them. Total time required for the journey is: "+8+" hours");
                        }
                        if(s.equalsIgnoreCase("kolkata")||s.equalsIgnoreCase("darjelling")||s.equalsIgnoreCase("gangtok")||s.equalsIgnoreCase("shillong"))
                        {
                            for(i=0;i<s3.length;i++)
                            {
                                time=time+a3[i];
                                if(s.equalsIgnoreCase(s3[i]))
                                break;
                            }
                            System.out.println("Preffered bus is bus 3 and other busses will not visit them. Total time required for the journey is: "+time+" hours");
                        }
                        if(s.equalsIgnoreCase("jabalpur"))
                        {
                            System.out.println("Preffered bus is bus 2 and other busses will not visit them. Total time required for the journey is: "+12+" hours");
                        }
                        if(s.equalsIgnoreCase("chennai"))
                        {
                            for(i=0;i<a1.length;i++)
                            {
                                time=time+a1[i];
                                if(s.equalsIgnoreCase(s1[i]))
                                break;
                            }
                            System.out.println("Bus 1 will take time as "+time+" hours");
                            time=0;
                            for(i=0;i<a2.length;i++)
                            {
                                time=time+a2[i];
                                if(s.equalsIgnoreCase(s2[i]))
                                break;
                            }
                            System.out.println("Bus 2 will take time as "+time+" hours");
                            System.out.println("More preffered bus is Bus 1 still u can choose any 1");
                            int vacant1=check_vacancy_bus(b1);
                            int vacant2=check_vacancy_bus(b2);
                            if(vacant1==0 && vacant2!=0)
                            System.out.println("It was found that all the seats of bus 1 was full please go for bus 2");
                            if(vacant1==0 && vacant2==0)
                            {
                                 System.out.println("It was found that all the seats of bus 1 and 2 are full");
                                 int q_size1=q1.size();
                                 int q_size2=q2.size();
                                 if(q_size1>q_size2)
                                 System.out.println("Preffered waiting list is of bus1");
                                 else if(q_size1<q_size2)
                                 System.out.println("Preffered waiting list is of bus2");
                                 else
                                 System.out.println("Preffered waiting list is of bus1");
                            }
                        }
                        if(s.equalsIgnoreCase("bangalore"))
                        {
                            for(i=0;i<a1.length;i++)
                            {
                                time=time+a1[i];
                            }
                            System.out.println("Bus 1 will take time as "+time+" hours");
                            time=0;
                            for(i=0;i<a2.length;i++)
                            {
                                time=time+a2[i];
                            }
                            System.out.println("Bus 2 will take time as "+time+" hours");
                            System.out.println("More preffered bus is Bus 1 still u can choose any 1");
                            int vacant1=check_vacancy_bus(b1);
                            int vacant2=check_vacancy_bus(b2);
                            if(vacant1==0 && vacant2!=0)
                            System.out.println("It was found that all the seats of bus 1 was full please go for bus 2");
                            if(vacant1==0 && vacant2==0)
                            {
                                 System.out.println("It was found that all the seats of bus 1 and 2 are full");
                                 int q_size1=q1.size();
                                 int q_size2=q2.size();
                                 if(q_size1>q_size2)
                                 System.out.println("Preffered waiting list is of bus1");
                                 else if(q_size1<q_size2)
                                 System.out.println("Preffered waiting list is of bus2");
                                 else
                                 System.out.println("Preffered waiting list is of bus1");
                            }
                        }
                        System.out.println("1) To choose bus 1");
                        System.out.println("2) To choose bus 2");
                        System.out.println("3) To choose bus 3");
                        System.out.println("Enter choice");
                        choice=in.nextInt();
                        switch(choice)
                        {
                            case 1:
                                int p=check_vacancy_bus(b1);
                                if(p==0)
                                {
                                    System.out.println("We are sorry to inform you that there are no seats left will you reserve in waiting list");
                                    char ch2=in.next().charAt(0);
                                    in.nextLine();
                                    if(ch2=='y'||ch2=='Y')
                                     {
                                         System.out.println("Please enter your name");
                                         String name3=in.nextLine();
                                         q1.add(name3);
                                     }
                                }
                                else
                                {
                                    insert_at_bus1(b1);
                                }
                                break;
                            case 2:
                                int p1=check_vacancy_bus(b2);
                                if(p1==0)
                                {
                                    System.out.println("We are sorry to inform you that there are no seats left will you reserve in waiting list");
                                    char ch3=in.next().charAt(0);
                                    in.nextLine();
                                    if(ch3=='y'||ch3=='Y')
                                     {
                                         System.out.println("Please enter your name");
                                         String name3=in.nextLine();
                                         q2.add(name3);
                                     }
                                }
                                else
                                {
                                    insert_at_bus2(b2);
                                }
                                break;
                            case 3:
                                int p2=check_vacancy_bus(b3);
                                if(p2==0)
                                {
                                    System.out.println("We are sorry to inform you that there are no seats left will you reserve in waiting list");
                                    char ch4=in.next().charAt(0);
                                    in.nextLine();
                                    if(ch4=='y'||ch4=='Y')
                                    {
                                        System.out.println("Please enter your name");
                                        String name3=in.nextLine();
                                        q3.add(name3);
                                    }
                                }
                                else
                                {
                                    insert_at_bus3(b3);
                                }
                                break;
                            default:
                                System.out.println("Wrong choice");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("This is the section to cancel your reservation");
                        System.out.println("Please enter the bus number you have chosen for your reservation");
                        int bus_choice=in.nextInt();
                        if(bus_choice==1)
                        {
                            delete_reservation(b1,1);
                        }
                        else if(bus_choice==2)
                        {
                            delete_reservation(b2,2);
                        }
                        else if(bus_choice==3)
                        {
                            delete_reservation(b3,3);
                        }
                        else
                        {
                            System.out.println("You have chosen a wrong bus please re-enter your bus number");
                        }
                        break;
                    case 3:
                        System.out.println("1) To search seat number for checking id for bus1");
                        System.out.println("2) To search seat number for checking id for bus2");
                        System.out.println("3) To search seat number for checking id for bus3");
                        System.out.println("Enter your choice");
                        int search_choice=in.nextInt();
                        switch(search_choice)
                        {
                            case 1:
                                fillarray(b1);
                                break;
                            case 2:
                                fillarray(b2);
                                break;
                            case 3:
                                fillarray(b3);
                                break;
                            default:
                                System.out.println("Wrong choice");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Wrong choice");
                        break;
                }
                System.out.println("making the system ready for the next user");
                System.out.println("do you want to continue press 1");
                ll=in.nextInt();
            }while(ll==1);
        }
    }