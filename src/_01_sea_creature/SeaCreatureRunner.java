package _01_sea_creature;

public class SeaCreatureRunner {

public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature squidward = new SeaCreature("Squidward");
String name1 =	spongebob.getName();
System.out.println(name1);
String name2 =	patrick.getName();
System.out.println(name2);
String name3 =	squidward.getName();
System.out.println(name3);
	spongebob.eat();
	patrick.eat();
	squidward.eat();
	spongebob.laugh();
	patrick.laugh();
	squidward.laugh();
	
}
}
