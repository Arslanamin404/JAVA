public class CommandLineArgs{
    public static void main(String args[]){
        if(args.length>0){
            for(int i=0;i<args.length;i++){
                System.out.println("Assalamualikusm "+args[i]+", welcome to this Java Program!");
            }
        }
        else{
            System.out.println("Please enter 1 or more names as command line args!");
        }
    }
}