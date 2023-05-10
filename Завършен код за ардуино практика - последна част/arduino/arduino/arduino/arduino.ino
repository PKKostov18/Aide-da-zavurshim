int trigPin = 2;    // Trigger 

int echoPin = 3;    // Echo 

long duration, cm, inches; 

  

void setup() { 

  //Serial Port begin 

  Serial.begin (9600); 

  //Define inputs and outputs 

  pinMode(trigPin, OUTPUT); 

  pinMode(echoPin, INPUT); 

} 

  

void loop() { 

  // The sensor is triggered by a HIGH pulse of 10 or more microseconds. 

  // Give a short LOW pulse beforehand to ensure a clean HIGH pulse: 

  digitalWrite(trigPin, LOW); 

  delayMicroseconds(5); 

  digitalWrite(trigPin, HIGH); 

  delayMicroseconds(10); 

  digitalWrite(trigPin, LOW); 
  pinMode(echoPin, INPUT); 
  duration = pulseIn(echoPin, HIGH); 
  cm = (duration/2) / 29.1;
  inches = (duration/2) / 74; 
  Serial.print(inches); 
  Serial.print("in, "); 
  Serial.print(cm); 
  Serial.print("cm"); 
  Serial.println(); 
  delay(250); 
} 
