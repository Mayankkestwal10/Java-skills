class StringDemo{
    /**
     * @param mk
     */
    public static void main(String[] mk){
        String s1 = "This is an island";
        String [] strs = s1.split(" ",0);
        //for (String s: strs) {
          System.out.println(strs.length);
        //}
        /*System.out.println(s1);

        char [] ch = new char[8];
        s1.getChars(2,5,ch,2);
        for (int i=0; i<8; i++){

            System.out.println(ch[i]);

        }*/

        /*System.out.println(s1.indexOf("is"));

        System.out.println(s1.lastIndexOf("is",10));

        System.out.println(s1.lastIndexOf("is",11));
        */


    }
}