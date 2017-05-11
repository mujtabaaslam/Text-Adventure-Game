public class Rope implements Items {
 private String name;
 
 public Rope(){
  this.name="rope";
 }
 @Override
 public void use() {
  System.out.println("You tie the rope around  and use it to pull");
  
 }
 @Override
 public String description() {
  return "A thick black rope. It looks millitary grade. The guy in the elevator"
    + "must have dropped it or maybe the person who did him in, either way you don't care";
 }
 @Override
 public String getName() {
  return this.name;
 }
 @Override
 public void pickup() {
  System.out.println("Slowly but with great effort you wind the rope tightly around your waist. It wil"
    + "l probably come in handy later. It smells vaguely like mold and liqor, what on"
    + "earth were the people at the 7th arm using it for?");
 }
 @Override
 public void drop() {
  System.out.println("You let the rope go. You don't need it anymore and of all the items"
    + "you have found so far, it was the most bulky");
 }
}