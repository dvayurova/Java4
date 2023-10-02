To build the application, follow these steps:

1. Compile the Java code:
javac -d ./target src/java/edu/school21/printer/*/*.java

2. Copy resources to target:
cp -R src/resources target/

3. Create the JAR file:
jar --create --manifest=src/manifest.txt --file=target/images-to-chars-printer.jar  -C target .

4. Run the application:
java -cp target/images-to-chars-printer.jar edu.school21.printer.app.Main . 0 (you can change last to characters "." or/and "0" to any other characters.
