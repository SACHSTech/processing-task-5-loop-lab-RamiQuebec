import processing.core.PApplet;

/**
 * Quadrant based drawing that manipulates squares in corresponding ways
 * @author Rami Kabak
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}