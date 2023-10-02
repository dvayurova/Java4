To build the application, follow these steps:

1. Compile the Java code:
javac -d ./target src/java/edu/school21/printer/*/*.java

2. Create the JAR file:
jar cmvf src/manifest.txt ./target/images-to-chars-printer.jar -C target/ edu -C src/ resources

3. Run the application:
java -jar target/images-to-chars-printer.jar . 0 (you can change last to characters "." or/and "0" to any other characters.
