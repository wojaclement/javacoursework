package com.packages;

public class mydemo4 {

    public static class Student {
        public static void main(String[] args) {
            String address = "kampala, uganda";

            if(address.endsWith("uganda")) {
                if(address.contains("Kampala")) {
                    System.out.println("Your city is kampala");
                }else if(address.contains("sudan")) {
                    System.out.println("Your city is juba");
                }else {
                    System.out.println(address.split(",")[0]);
                }
            }else {
                System.out.println("You are not living in uganda");
            }
        }
    }






}
