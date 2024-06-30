import java.util.Scanner;

class Voting{
    Scanner sc=new Scanner(System.in);

    private String name;
    private String cnic_no;
    private int age;
    private int vote;
    private int result;
    private static int ppp,pti,pmln,mqm,ind;

    //getter and setter for the class varibales;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCnic_no(String cnic_no){
        this.cnic_no=cnic_no;
    }
    public String getCnic_no(){
        return cnic_no;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setVote(int vote){
        this.vote=vote;
    }
    public int getVote(){
        return vote;
    }
    public void setResult(int result){
        this.result=result;
    }
    public int getResult(){
        return result;
    }
    //castvote method;
    public void CastVote(){

        System.out.println("Enter your name");
        setName(sc.nextLine());

        System.out.println("Enter your Cnic_no");
        setCnic_no(sc.nextLine());

        System.out.println("Enter your age");
        setAge(sc.nextInt());

        if(age<18){
            System.out.println("Sorry you are not able to vote because you are underage ");
            sc.nextLine(); //clear buffer
        }
        else{
            System.out.println("Enter your vote");
            System.out.println();
            System.out.println("1 : PPP");
            System.out.println("2 : PTI");
            System.out.println("3 : PMLN");
            System.out.println("4 : MQM");
            System.out.println("5 : IND");
            setVote(sc.nextInt());
            sc.nextLine(); //clear buffer

            switch (getVote()){
                case 1:
                    ppp++;
                    break;
                case 2:
                    pti++;
                    break;
                case 3:
                    pmln++;
                    break;
                case 4:
                    mqm++;
                    break;
                case 5:
                    ind++;
                    break;
                default:
                    System.out.println("invalid input");
                    sc.nextLine(); //clear buffer;
                    return; //Exit the method to prevent thanking for an invalid vote;
            }
            System.out.println();
            System.out.println("~Thank you for casting your vote~");
            System.out.println();
        }
    }
   // checkresult method;
    public void CheckResult(){

        System.out.println("______~check result~______");
        System.out.println();
        System.out.println("Enter your choice");
        System.out.println();
        System.out.println("1 : vote of PPP");
        System.out.println("2 : vote of PTI");
        System.out.println("3 : vote of PMLN");
        System.out.println("4 : vote of MQM");
        System.out.println("5 : vote of IND");
        System.out.println("6 : all of them");
        setResult(sc.nextInt());
        sc.nextLine();   //clear buffer;

        switch(getResult()){
            case 1:
                System.out.println("Vote of PPP is "+ppp);
                System.out.println();
                break;
            case 2:
                System.out.println("Vote of PTI is "+pti);
                System.out.println();
                break;
            case 3:
                System.out.println("Vote of PMLN is "+pmln);
                System.out.println();
                break;
            case 4:
                System.out.println("Vote of MQM is "+mqm);
                System.out.println();
                break;
            case 5:
                System.out.println("Vote of IND is "+ind);
                System.out.println();
                break;
            case 6:
                System.out.println("Vote of PPP is "+ppp);
                System.out.println("Vote of PTI is "+pti);
                System.out.println("Vote of PMLN is "+pmln);
                System.out.println("Vote of MQM is "+mqm);
                System.out.println("Vote of IND is "+ind);
                System.out.println();
        }
    }
}
public class OnlineVotingSystem {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Voting v1=new Voting();

        while(true){
            int choice;
            System.out.println("|________|~Online Voting System~|________|");
            System.out.println();
            System.out.println("1 : Cast Vote");
            System.out.println("2 : Check Result");
            System.out.println("3 : exit");

            System.out.println("Enter your Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    v1.CastVote();
                    break;

                case 2:
                    v1.CheckResult();
                    break;
                case 3:
                    sc.close(); // Close the scanner to prevent resource leak
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
