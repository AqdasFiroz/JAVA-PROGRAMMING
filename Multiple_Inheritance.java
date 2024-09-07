public class Multiple_Inheritance {
    interface herbivore{
        public void veggie();

    }
    interface carnivore{
        public void non_veggie();
    }
    static class Bear implements herbivore, carnivore{
        @Override
        public void veggie() {
            System.out.println("I Eat Vegitables:");
        }

        @Override
        public void non_veggie() {
            System.out.println("I Eat Non-Veg");
        }
    }

    public static void main(String[] args) {
        Bear B=new Bear();
        B.veggie();
        B.non_veggie();
    }
}
