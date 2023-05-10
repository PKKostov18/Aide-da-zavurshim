#include <OneWire.h>
#include <DallasTemperature.h>
#define WirePin 3

OneWire oneWire(WirePin);
DallasTemperature sensors(&oneWire);

void setup() {

Serial.begin(115200);
sensors.begin();

}
 
void loop() {

  sensors.requestTemperatures(); 
  Serial.print(" Celsius temperature: ");
  Serial.print(sensors.getTempCByIndex(0)); 
  delay(1000);

}
