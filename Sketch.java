import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Settings method, usually used to modify size of window.
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Setup method, usually used to modify things like backgroudn, stroke, fill, etc.
   */
  public void setup() {
    background(93, 138, 168);
  }

  /**
   * Draw method to continously call all the functions to draw the squares in each quadrant
   */
  public void draw() {
	  
    // Call the function to make the outlines between each quadrant
    draw_section_outlines();
    
    // Call all the functions that draw the squares in the quadrants
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
    
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * The bottom left section
   * White squares drawn in each column and row
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10; 
        intY = 300 + 3 + 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The bottom left middle section
   * White squares and black squares every other column
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 300 + 3 + intRow * 10; 
        intY = 300 + 3 + 3 + intColumn * 10;

        // If statement to see modulo of intColumn to select if it should be black or white
        if (intRow % 2 == 0) {
          fill(255);
        } else {
          fill(0);
        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The bottom right middle section
   * White squares and black squares every other row
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 600 + 3 + intRow * 10; 
        intY = 300 + 3 + 3 + intColumn * 10;

        // If statement to see modulo of intColumn to select if it should be black or white
        if (intColumn % 2 == 0) {
          fill(0); 
        } else {
          fill(255);
        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The bottom right section
   * Columns flickering down black and white and every other column black
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 900 + 3 + intRow * 10; 
        intY = 300 + 3 + 3 + intColumn * 10;

        // If statement to see modulo of intColumn to select if it should be black or white
        if (intColumn % 2 == 0) {
          fill(0); 
        } else {
          fill(intRow % 2 == 0 ? 0 : 255); // Alternate between black and white for rows
        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The top left section 
   * Ramp rising from left to right
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++){
      for (int intColumn = (30 - intRow); intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The top left middle section 
   * Ramp declining from left to right
   */
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++){
      for (int intColumn = (1 + intRow - 1); intColumn < 30; intColumn++) {
        intX = 300 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * The top right middle section 
   * Upside down ramp declining from left to right
   */
  public void draw_section7(){
    int intX = 0;
    int intY = 0;
    
    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 0; intRow < 30 - intColumn; intRow++) {
        intX = 600 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  /**
   * The top right section 
   * Upside down ramp rising from left to right
   */
  public void draw_section8(){
    int intX = 0;
    int intY = 0;
    
    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = (1 + intColumn - 1); intRow < 30; intRow++) {
        intX = 900 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

}
