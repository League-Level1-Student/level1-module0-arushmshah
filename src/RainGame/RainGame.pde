int score = 0;

void checkCatch(int x){
     if (x > mouseX && x < mouseX+450)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }

void setup(){
  size(600, 600);
}
int y=10;
int randomNumber;
void draw(){
    
background(1, 155, 170);
textSize(16);
text("Score: " + score, 20, 20);
fill(186, 233, 242);
stroke(186, 233, 242);
ellipse(randomNumber, y, 25, 37);
   fill(200, 5, 5);
   rect(mouseX, 500, 80, 180);
y+=5;
if(y>=600){
  y=10;
   randomNumber = (int) random(600);
   fill(0, 0, 0);
checkCatch(randomNumber);   

}
}