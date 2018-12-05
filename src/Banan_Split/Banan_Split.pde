int big = 10;
int oof = 10;
void draw(){
  for(int i = 0; i <6; i ++){
    if(i == 3){
    text("Banana", big, oof);}
    else{
text("ice cream", big, oof);
    }
    big+=10;
    oof+=10;
  }
}