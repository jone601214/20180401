public class Main {

   public class person{
       public String name,sex,attack,property;
       public person(String name1,String sex1,String attack1,String property1){
           this.setName(name1);
           this.setSex(sex1);
           this.setAttack(attack1);
           this.setProperty(property1);
       }
public void setName(String name){
           this.name=name;
}
       public String getName() {
           return name;
       }
  public void setSex(String sex){
    this.sex=sex;
  }
       public String getSex() {
           return sex;
       }
       public void setAttack(String attack){
      this.attack=attack;
       }
       public String getAttack() {
           return attack;
       }
       public void setProperty(String property){
           this.property=property;
       }

       public String getProperty() {
           return property;
       }
   }
}
