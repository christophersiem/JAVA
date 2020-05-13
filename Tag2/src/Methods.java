public class Methods{
    public static void main(String[] args) {


        String myName = "Christopher";
        int stringLength = myName.length();
        System.out.println("The name " + myName + " contains " + stringLength + " letters.");

        boolean fancy= isFancy(myName);
        System.out.println("It is " +fancy+ " that my name contains the word 'fancy'");
    }
    public static boolean isFancy (String myName){
        return myName.contains("fancy");


    }

}

