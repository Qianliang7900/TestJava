public class DogBean {
   static  class Dog {
        public void eat() {
            System.out.println("吃肉");
        }

        public void speak() {
            System.out.println("汪汪！");
        }
    }


    static class smallDog extends Dog {
        @Override
        public void eat() {
            System.out.println("吃狗粮");
        }

        @Override
        public void speak() {
            System.out.println("哇哇哇");
        }
    }
    static class ssdog extends smallDog {
        @Override
        public void speak() {

        }
    }
    static class wolfDog extends Dog{
        @Override
        public void speak() {
            System.out.println("狼嚎");
        }
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        a.speak();
        a= new wolfDog();
        a.speak();
        a=new ssdog();
        a.speak();


    }
}