public class Dog extends Sim{
        private int affectionLevel = 0;
        static int MaxAffectionLevel = 5;

        public void increaseAffectionLevel() {
            this.affectionLevel++;
        }

        @Override
        void println(){
            super.println();
            System.out.println("Sim's affection level: " + affectionLevel);
        }

        Dog(String name){
            super(name);
        }

}
