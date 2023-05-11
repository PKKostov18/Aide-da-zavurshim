int Number = 0;

int _R = 9;
int _G = 10;
int _B = 11;

int A = 12;
int B = A3;
int C = A0;
int D = 8;
int E = 7;
int F = 6;
int G = 5;
int DP = 4;

void setup(void) {
  Serial.begin(9600);

  pinMode(_R, OUTPUT);
  pinMode(_G, OUTPUT);
  pinMode(_B, OUTPUT);

  pinMode(A, OUTPUT);
  pinMode(B, OUTPUT);
  pinMode(C, OUTPUT);
  pinMode(D, OUTPUT);
  pinMode(E, OUTPUT);
  pinMode(F, OUTPUT);
  pinMode(G, OUTPUT);
  pinMode(DP, OUTPUT);
}

void ChangeNumber() {
  Number = rand() % 9;
  UpdateNumber();
}

void loop() {
  ChangeNumber();
  delay(1000);
}

void UpdateNumber() {
  if(Number == 0) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, LOW);
    digitalWrite(_R, 255 * 50 / 100);
    digitalWrite(_G, 255 * 50 / 100);
    digitalWrite(_B, 255 * 50 / 100);
  } else if(Number == 1) {
    digitalWrite(A, LOW);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, LOW);
    digitalWrite(_R, 255);
    digitalWrite(_G, 0);
    digitalWrite(_B, 0);
  } else if(Number == 2) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, LOW);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, LOW);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 0);
    digitalWrite(_G, 255);
    digitalWrite(_B, 0);
  } else if(Number == 3) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 0);
    digitalWrite(_G, 0);
    digitalWrite(_B, 255);
  } else if(Number == 4) {
    digitalWrite(A, LOW);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 255 * 50 / 100);
    digitalWrite(_G, 255 * 50 / 100);
    digitalWrite(_B, 0);
  } else if(Number == 5) {
    digitalWrite(A, HIGH);
    digitalWrite(B, LOW);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 0);
    digitalWrite(_G, 255 * 50 / 100);
    digitalWrite(_B, 255 * 50 / 100);
  } else if(Number == 6) {
    digitalWrite(A, HIGH);
    digitalWrite(B, LOW);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 255 * 50 / 100);
    digitalWrite(_G, 0);
    digitalWrite(_B, 255 * 50 / 100);
  } else if(Number == 7) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, LOW);
    digitalWrite(E, LOW);
    digitalWrite(F, LOW);
    digitalWrite(G, LOW);
    digitalWrite(_R, 255 * 60 / 100);
    digitalWrite(_G, 255 * 60 / 100);
    digitalWrite(_B, 255 * 10 / 100);
  } else if(Number == 8) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, HIGH);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 255 * 10 / 100);
    digitalWrite(_G, 255 * 60 / 100);
    digitalWrite(_B, 255 * 60 / 100);
  } else if(Number == 9) {
    digitalWrite(A, HIGH);
    digitalWrite(B, HIGH);
    digitalWrite(C, HIGH);
    digitalWrite(D, HIGH);
    digitalWrite(E, LOW);
    digitalWrite(F, HIGH);
    digitalWrite(G, HIGH);
    digitalWrite(_R, 255 * 60 / 100);
    digitalWrite(_G, 255 * 10 / 100);
    digitalWrite(_B, 255 * 60 / 100);
  }
}
