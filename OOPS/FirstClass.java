public class FirstClass {

}

class Pen{
    //Blueprint of pen

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths)/3;
    }
}
