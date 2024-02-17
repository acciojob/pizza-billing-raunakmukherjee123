package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int f1=0,f2=0,f3=0,baseprice=300,extracheese=80,extratopping=70;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price=300;
        }
        else {
            price=400;
        }
    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese(){
       // System.out.print("Extra Cheese added: 80");
        f1=1;
        this.price+=80;
    }

    public void addExtraToppings(){
        f2=1;
        if(isVeg)
        {
           // System.out.print("Extra Toppings added: 70");
            price+=70;
        }
        else {
           // System.out.print("Extra Toppings added: 120");
            price+=120;
        }
    }

    public void addTakeaway(){
        f3=1;
        price+=20;
    }

    public String getBill(){
        if(isVeg) {
            bill += "Base Price Of The Pizza: " + baseprice + "\n";
        }
        else {
            int p=baseprice+100;
            bill += "Base Price Of The Pizza: " + p + "\n";
        }
        if(f1==1)
        {
            bill+="Extra Cheese Added: 80"+"\n";
        }
         if(f2==1 && this.isVeg==true)
        {
            bill+="Extra Toppings Added: 70"+"\n";
        }
         else if(f2==1 && !this.isVeg)
         {
             bill+="Extra Toppings Added: 120"+"\n";
         }
         if(f3==1)
         {
             bill+="Paperbag Added: 20"+"\n";
         }
         bill+="Total Price: "+this.price;
        return this.bill;
    }
}
