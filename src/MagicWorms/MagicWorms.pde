void setup(){
  size(800, 800);
background(48, 192, 211);
}
float x=10;
float y=10;
void draw(){
  makeMagical();
  for(int i=0; i<300; i++){
fill(215, 252, 0);
  ellipse(getWormX(i), getWormY(i), 50, 50);
  x=random(800);
  y=random(800);
}
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}