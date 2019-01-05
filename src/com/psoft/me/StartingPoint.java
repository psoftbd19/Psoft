package com.psoft.me;

public class StartingPoint {

    public static void main(String[] args) {
        // write your code here
/*
        for (String s:
             args) {
            System.out.println(s);
        }*/


      /*  person.firstName = "Muhammad";
        person.middleName = "Azharul";
        person.lastName = "Islam";*/

      Person person=new Person("Muhammad","Azharul","Islam");
      Person person1=new Person("Muhammad","Islam");

        String fullName = person.getFullName();
        String fullName1 = person1.getFullName();

       // System.out.println(fullName);
       // System.out.println(fullName1);

        //int,long,short,double,char,float,boolean
         //Number , Char, Boolean  ====>primitive type
        char c='j';//
        String charStr=Character.toString(c);
        System.out.println(charStr);
        short srt=389;
        int n=10;
        long l=100000;
        float fl=19f;
        double dl=23d;
        boolean isOk=false;
        float fl2=(float) dl;
        int n1=(int)fl;
       /* System.out.println(fl2);
        System.out.println(n1);
        System.out.println(fl);*/

        String s= new String("Psoft");
        String location="Topkhana";

        char[] locationChar=location.toCharArray();
        System.out.println(locationChar);
        char[] chars={'P','S','O','F','T'};
        String charString = new String(chars);
        System.out.println(charString);
    }
}
