void setup(){
  size(800, 500);
}
 int x=10;
  int y=250;
  int xspeed=5;
  int yspeed=5;
void draw(){
  background(2, 160, 175);
fill(255, 255, 255);
stroke(255, 255, 255);
ellipse(x, y, 15, 15);
 x+=xspeed;
 y+=yspeed;
 if(x>=width||x<=0){
   xspeed=-xspeed;
 }
 if(y>=height||y<=0){
   yspeed=-yspeed;
 }
}