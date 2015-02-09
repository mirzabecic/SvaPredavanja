
public class Zombi extends Character {
private int josJedanParametar;
public Zombi(String name, double hp, double dex, Weapon wpn, double strenght, double speed, int josJedanParametar){
	super(name,  hp, dex, wpn, strenght,  speed);
	this.josJedanParametar=
}
public Zombi(String name, double hp, double dex,  double strenght, double speed){
	super(name, hp, dex, strenght, speed);
}

public Zombi() {
	super(name, hp, dex,wpn,strenht,speed);
}

}