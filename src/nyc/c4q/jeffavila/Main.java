package nyc.c4q.jeffavila;

public class Main {

    public static void main(String[] args) {
	 Student jeff = new Student("Jeff", "Avila", 3314, "Steak");
     Student leigh = new Student("Leigh", "Douglas", 2, "sushi");
        //leigh.checkSameFavoriteFood(jeff, leigh);
        System.out.println(Student.checkSameFavoriteFood(jeff, leigh));

    }
}
