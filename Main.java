public class Main {

    public static void main(String[] args) {
        /*byte age = 20;
        int phone = 856523234;
        long phone2 = 85652323445353L;
        float pi = 3.14F;
        System.out.println(name);*/

        //Non premitive types
        String fname = "Virender";
        String lname = new String("Singh");

        String fullName = fname + " " + lname;

        System.out.println(fullName);
        System.out.println(fullName.charAt(4));

        String replaceName = fullName.replace('e', 'a');
        System.out.println(replaceName);
    }
}
