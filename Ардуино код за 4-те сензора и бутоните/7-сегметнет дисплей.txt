// DP, G, F, E, D, A, C, B
 int digits[][8]={    
   {0,0,1,1,1,1,1,1}, //0
   {0,0,0,0,0,0,1,1}, //1
   {0,1,0,1,1,1,0,1}, //2
   {0,1,0,0,1,1,1,1}, //3
   {0,1,1,0,0,0,1,1}, //4
   {0,1,1,0,1,1,1,0}, //5
   {0,1,1,1,1,1,1,0}, //6
   {0,0,0,0,0,1,1,1}, //7
   {0,1,1,1,1,1,1,1}, //8
   {0,1,1,0,1,1,1,1}  //9
};

int portSequence[8] = { 4, 5, 6, 7, 8, 12, 14, 17 };

void setup() {
   for(int i=0; i<9; i++) {
     pinMode(portSequence[i], OUTPUT); 
   } 
 }

void printNumber(int number) {
   for(int i=0; i<9; i++) {
     digitalWrite(portSequence[i], digits[number][i]); 
   } 
 }
 
void loop() {
  for(int i=0; i<=9; i++){
    printNumber(i);
    delay(1000);
  }
}
