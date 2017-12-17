import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList <Animal> farm = new ArrayList <Animal>();
	farm.add(new Pig());
	farm.add(new Horse());
	farm.add(new Cow());
	farm.add(new Chicken());
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).Eats();
		System.out.println(farm.get(i).makeNoise());
		System.out.println(farm.get(i).Eats());
	}
}
}
