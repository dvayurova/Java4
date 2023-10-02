To build the application, follow these steps:

1. Create lib directory:
mkdir lib

2. Download libraries:
curl -o lib/jcommander-1.78.jar https://repo1.maven.org/maven2/com/beust/jcommander/1.78/jcommander-1.78.jar
curl -o lib/JCDP-2.0.1.jar https://repo1.maven.org/maven2/com/diogonunes/JCDP/2.0.1/JCDP-2.0.1.jar

3. Compile the Java code:
javac -d target -cp lib/jcommander-1.78.jar:lib/JCDP-2.0.1.jar src/java/edu/school21/printer/*/*.java

4. Copy resources to jar folder:
cp -R src/resources target/

5. Copy lib to target folder:
cp -R lib target 

6. Create the JAR file:
jar --create --manifest=src/manifest.txt --file=target/images-to-chars-printer.jar  -C target .

7. Run the application:
java -jar target/images-to-chars-printer.jar --white=RED --black=GREEN    
