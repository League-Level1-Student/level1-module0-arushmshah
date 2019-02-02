import ddf.minim.*;  //at the very top of your sketch
PImage record;     //as member variable
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable

int angle=0;
void setup(){
size(600,600);     //in setup method  
record= loadImage("record.jpg");     //in setup method  
record.resize(height,width);     //in setup method
minim = new Minim(this);  //in the setup method
song = minim.loadFile("way up.mp3", 512);//in the setup method
}

void draw(){
  if(mousePressed){
  rotateImage(record, angle+=200);
image(record, 0, 0);     //in draw method
song.play();
  }
  else{
    song.pause();
}
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}