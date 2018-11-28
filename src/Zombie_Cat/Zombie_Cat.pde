void setup(){
size(500, 500);
}
void draw(){
PImage face = loadImage("Baddabook.jpg");
face.resize(500, 500);
image(face, 0, 0);
//if(mouseMove){
//fill(200, 22, 120);
//}
//else if (mouseX == 0 || mouseY == 0){}
int boi = 0;
int boy = 0;
//350, 275, 225
ellipse(350, 225, 25, 40);
ellipse(275, 225, 25, 40);
fill(#FFFFFF);
if(mouseX <= 350 && mouseY <= 225){
ellipse(mouseX, mouseY, 10, 10);
}
else{ellipse(350, 225, 10, 10);}
if(mouseY <= 225 && mouseX <= 275 ){
ellipse(mouseX, mouseY, 10, 10);}
else{ellipse(275, 225, 10, 10);}
fill(100, 100, 100);
}
void mouseMoved(){
fill(200, 75, 63);

}