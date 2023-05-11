void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  while(!Serial) {
    delay(500);
  }  
}

void loop() {
  Serial.println(millis());
  delay(2000);
}
