package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        public String getCountryCode(){
            String countryCode = "";

            for(Map.Entry<String,String> e : countries.entrySet()){
                if(e.getValue().equals(customer.getCountryName()))
                    countryCode = e.getKey();
            }
            return countryCode;
        }

        public String getCompany(){
            return customer.getCompanyName();
        }

        public String getContactFirstName(){
          String[] allName =   contact.getName().split(", ");
          return allName[1];
        }

        public String getContactLastName(){
            String[] allName =   contact.getName().split(", ");
            return allName[0];
        }

        public String getDialString(){
            String d = "callto://+";
            String n = contact.getPhoneNumber();
            for(char e : n.toCharArray()){
                if(Character.isDigit(e)){
                    d = d+e;
                }
            }
            return d;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}