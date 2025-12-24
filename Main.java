class Main {

 public static void main(String[] args)
    {
       // Construct 2 objects of your class using the constructor with different values
        walkers w1 = new walkers (11, 4, 7);
        walkers w2 = new walkers (10, 3.5, 2);

       // call all of the objects methods to test them
        w1.print();
        w2.print();
    }
}
