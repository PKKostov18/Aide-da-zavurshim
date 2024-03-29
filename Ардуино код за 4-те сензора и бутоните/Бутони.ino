int A = 12;
int B = A3; 
int C = A0;
int D = 8; 
int E = 7; 
int F = 6; 
int G = 5;
int r = 9;
int g = 10;
int b = 11;
 
int switchUpPin = 2;
int switchDownPin = 3;
int counter = 0;
int buttonUpState = 0;
int lastButtonUpState = 0;
int buttonDownState = 0;
int lastButtonDownState = 0; 
 
void setup() { 
  //Serial Port begin 
  Serial.begin (9600); 
  pinMode(A, OUTPUT); 
  pinMode(B, OUTPUT); 
  pinMode(C, OUTPUT);
  pinMode(D, OUTPUT); 
  pinMode(E, OUTPUT); 
  pinMode(F, OUTPUT); 
  pinMode(G, OUTPUT); 
  pinMode(r, OUTPUT);
  pinMode(g, OUTPUT);
  pinMode(b, OUTPUT);
   pinMode(switchUpPin, INPUT_PULLUP);
    pinMode(switchDownPin, INPUT_PULLUP);
} 
 
void loop() { 
buttonUpState = !digitalRead(switchUpPin); 
  buttonDownState = !digitalRead(switchDownPin);
  Serial.println(buttonUpState);
  if (buttonUpState != lastButtonUpState) {
    lastButtonUpState = buttonUpState;
    if (buttonUpState == HIGH) {
      if(counter < 9) {
        counter++;
        Serial.println(counter);       
        changeNumber(counter);       
      } 
 
    } else { 
      Serial.println("OFF"); 
    } 
    delay(50); 
  }
  if (buttonDownState != lastButtonDownState) {
    lastButtonDownState = buttonDownState;
    if (buttonDownState == HIGH) {
      if(counter > 0) {
        counter--;
        Serial.println(counter);       
        changeNumber(counter);       
      } 
 
    } else { 
      Serial.println("OFF"); 
    } 
    delay(50); 
  }
  changeNumber(counter);
} 
 
void changeNumber(int buttonPress) {
 
  switch (buttonPress) {
    case 0: 
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, LOW);
    break;
    case 1: 
    digitalWrite(A, LOW);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, LOW);
    break; 
    case 2:
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, LOW);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, LOW);
    digitalWrite(G, HIGH);
    break; 
    case 3:
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, HIGH);
    break; 
    case 4:
    digitalWrite(A, LOW);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    break; 
    case 5: 
    digitalWrite(A, HIGH);
    digitalWrite(B, LOW);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    break; 
    case 6: 
    digitalWrite(A, HIGH);
    digitalWrite(B, LOW);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    break; 
    case 7:
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, LOW);
    break; 
    case 8: 
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    break; 
    case 9: 
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    break;
  }
}
