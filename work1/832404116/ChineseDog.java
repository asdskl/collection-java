package com.animals;


/*2. 中华田园犬类 (extends Animal)img

变量: isVaccineInjected(boolean 是否注射狂犬病疫苗)
价格100元*/
public class ChineseDog extends Animals {
    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }

    private boolean isVaccineInjected;

    public ChineseDog(String name, int age, String gender, double price, boolean isVaccineInjected) {
        super(name, age, gender, price);
        this.isVaccineInjected = isVaccineInjected;
    }


    @Override
    public String toString() {
        return "宠物名：" + getName() + " " + "年龄：" + getAge() + " " + "性别：" + getGender() + "售价：" + getPrice() + " " + "注射疫苗情况" + isVaccineInjected;
    }

}
