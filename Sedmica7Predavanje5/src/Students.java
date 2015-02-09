
import java.util.Random;





public class Students {


private String [] names = new String[] {

"Sanela",

"Jesenko",

"Emir",

"Davor",

"Adnan",

"Selma",

"Haris K",

"Gordan",

"Mirza",

"Nermin V",

"Vedad",

"Emina",

"Nedim",

"Hikmet",

"Edib",

"Mustafa",

"Nermin G",

"Neldin",

"Haris",

"Nedzad",

"Gorjan",

"Amra",


};


public String getRandomStudent(){

Random r = new Random();


return names[r.nextInt(names.length)];

}



}