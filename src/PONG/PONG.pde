PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
void setup(){
  size(800, 500);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("backgroundImage.jpg");

}
 int x=10;
  int y=250;
  int xspeed=8;
  int yspeed=8;
void draw(){
 image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
fill(0, 0, 0);
stroke(0, 0, 0);
ellipse(x, y, 15, 15);
 x+=xspeed;
 y+=yspeed;
 if(x>=width||x<=0){
   xspeed=-xspeed;
    sound.trigger();
 }
 if(y>=height||y<=0){
   yspeed=-yspeed;
   sound.trigger();
 }
int y2=mouseY;
fill(230, 1, 1);
rect(10, y2, 20, 85);
if(intersects(x, y, 10, y2, 20)==true){
   xspeed=-xspeed;
    sound.trigger();
    
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}