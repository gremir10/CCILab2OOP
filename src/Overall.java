public class Overall {
    public static void main(String[] args) {

        //creating objects of name + fruit
        Name name = new Name("Blorgo");
        Fruit fruit = new Fruit("tomatoes");
        //print name + fruit
        System.out.println(name.getTheirName() + "'s" + " favorite fruit is " + fruit.getFavoriteFruit());

    }
}