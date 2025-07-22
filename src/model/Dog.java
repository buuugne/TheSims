package model;

public class Dog extends Sim {
        private int happinessLevel = 0;
        static int MaxAffectionLevel = 5;

        public void increaseHappinessLevel() {
            this.happinessLevel++;
        }

        @Override
        public void println(){
            super.println();
            System.out.println("model.Sim's happiness level: " + happinessLevel);
        }

        public Dog(String name){
            super(name);
        }

}
